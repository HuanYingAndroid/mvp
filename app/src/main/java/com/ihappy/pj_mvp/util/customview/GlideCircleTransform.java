package com.ihappy.pj_mvp.util.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

/**
 * Created by liuhuan-mac on 16/2/2.
 */
public class GlideCircleTransform extends BitmapTransformation {

    public GlideCircleTransform(Context context) {
        super(context);
    }

    @Override
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        return circleCrop(pool,toTransform);
    }

    public Bitmap circleCrop(BitmapPool pool, Bitmap source){
        if(source == null) return null;
        int size = Math.min(source.getWidth(),source.getHeight());
        int x = (source.getWidth() - size) / 2;//剪裁x方向的起始位置
        int y = (source.getHeight() - size) / 2;//剪裁x方向的起始位置
        Bitmap squared = Bitmap.createBitmap(source,x,y,size,size);
        Bitmap result = pool.get(size,size, Bitmap.Config.ARGB_8888);
        if(result == null){
            result = Bitmap.createBitmap(size,size, Bitmap.Config.ARGB_8888);
        }

        Canvas canvas = new Canvas(result);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(squared, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint.setAntiAlias(true);
        float radius = size / 2f;
        canvas.drawCircle(radius,radius,radius,paint);
        return result;
    }


    @Override
    public String getId() {
        return getClass().getName();
    }
}
