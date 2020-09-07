package com.nokhyun.nokhyunlib;

import android.util.Log;

/**
 *  2020-09-07 Nokhyun Log Custom (수정예정)
 *
 * */
public final class NokhyunLog{
    private final boolean isShowing;
    private final String TAG;

    public NokhyunLog(boolean isShowing, String tag){
        this.isShowing = isShowing;
        this.TAG = tag;
    }

    // Holder패턴을 사용하여 생성.
//    private static class NokhyunLogHolder{
//        public final static NokhyunLog INSTANCE = new NokhyunLog();
//    }

//    public static NokhyunLog getInstance(){
//        return NokhyunLogHolder.INSTANCE;
//    }

    public void d(String msg){
        if(isShowing) Log.d(TAG, msg);
    }

    public void e(String msg){
        if(isShowing) Log.d(TAG, msg);
    }


}
