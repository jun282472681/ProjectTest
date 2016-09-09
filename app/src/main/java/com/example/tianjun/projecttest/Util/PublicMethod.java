package com.example.tianjun.projecttest.Util;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by xx on 2016/9/7.
 */
public class PublicMethod {
    public static int formatDIP(int num, Context context){
       return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, num, context.getResources().getDisplayMetrics());
    }

    public static float getScaleByScreenWidth(Context context,String width){
        int screenWidth = context.getResources().getDisplayMetrics().widthPixels / 2;
        float mScale = screenWidth/Float.parseFloat(width);
        return mScale;
    }
}