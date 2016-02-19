package com.ihappy.pj_mvp.rest;
import android.util.Log;

import com.google.gson.Gson;
import com.ihappy.pj_mvp.Constant;
import com.ihappy.pj_mvp.util.MimeType;
import com.squareup.okhttp.OkHttpClient;

import java.security.cert.CertificateException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import retrofit.ErrorHandler;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
 * Created by liuhuan-mac on 16/2/1.
 */
public class RestPool {
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String USER_AGENT = "User-Agent";
    public static RestService init() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Constant.BASE_URL)
                .setConverter(new GsonConverter(new Gson()))
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
//                        request.addHeader(USER_AGENT,Constant.USER_AGENT);
                        request.addHeader(CONTENT_TYPE, MimeType.APPLICATION_JSON);
                    }
                })
                .setErrorHandler(new RetrofitErrorHandler())
                .setClient(new OkClient(getUnsafeOkHttpClient()))
                .build();
            restAdapter.setLogLevel(RestAdapter.LogLevel.FULL);
        return restAdapter.create(RestService.class);
    }

    /**
     * 获取不带安全证书的的client
     *
     * @return
     */
    private static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient okHttpClient = new OkHttpClient();
            okHttpClient.setSslSocketFactory(sslSocketFactory);
            okHttpClient.setHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            return okHttpClient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 统一的请求错误处理
     */
    private static class RetrofitErrorHandler implements ErrorHandler {

        @Override
        public Throwable handleError(RetrofitError error) {
            if (error != null && error.getResponse() != null) {
                Log.d("RetrofitErrorHandler", "调用了RestPool的错误处理!");
                switch (error.getResponse().getStatus()) {
                    case 301:
                        // 永久跳转
                        break;
                    case 302:
                    case 307:
                        // 临时跳转
                        break;
                    case 400:
                        Log.e("RetrofitError", "Bad Request:错误的Json格式或类型!");
                        break;
                    case 401:
                        Log.e("RetrofitError", "Unauthorized:认证失败!");
                        break;
                    case 403:
                        Log.e("RetrofitError", "Forbidden:尝试登录失败,请稍后重试!");
                        break;
                    case 422:
                        Log.e("RetrofitError", "Unprocessable Entity:非法的字段!");
                        break;
                }
            }
            return error;
        }
    }
}
