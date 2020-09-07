package com.nokhyun.nokhyunlib;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

/**
*  2020-09-07 Nokhyun Utils
*
* */
public class Utils {
    public static void showToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void showKeyboard(InputMethodManager imm, View view){
        if(imm != null && view != null) imm.showSoftInput(view, 0);
    }

    public static void hideKeyboard(InputMethodManager imm, View view){
        if(imm != null && view != null) imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    // 글꼴수정
    public static Typeface setTypeFace(Context context, String fontPath) {
        return Typeface.createFromAsset(context.getAssets(), fontPath);
    }

    // 텍스트중간 색상 변경
    public static SpannableStringBuilder setSectionTextColor(String str, int color) {
        SpannableStringBuilder builder = new SpannableStringBuilder(str);
        builder.setSpan(new ForegroundColorSpan(color), 0, str.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return builder;
    }

}
