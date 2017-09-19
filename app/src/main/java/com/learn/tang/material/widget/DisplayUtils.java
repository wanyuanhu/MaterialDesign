package com.learn.tang.material.widget;

import android.content.Context;

/**
 * Created by Tang on 2017/9/18.
 */

public class DisplayUtils {
    public static int dp2px(Context context, float dpValue)
    {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

}
