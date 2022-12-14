package com.lurenman.readphone;

import android.text.TextUtils;
import android.util.Log;

/**
 * @Author yang.bai.
 * Date: 2022/12/12
 */
public class ReadPhoneUtil {
    private static final String TAG = "ReadPhoneUtil";

    public static String reverse(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static void readphone_log() {
        Log.d(TAG, "readphone_log: ----");
    }
}
