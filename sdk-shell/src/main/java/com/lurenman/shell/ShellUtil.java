package com.lurenman.shell;

import android.util.Log;

/**
 * @Author yang.bai.
 * Date: 2022/12/12
 */
public class ShellUtil {
    private static final String TAG = "ShellUtil";

    public static boolean isEmpty(String... strs) {
        if (strs == null) return true;
        for (String str : strs) {
            if (str != null && !"".equals(str) && str.length() > 0) {
                return false;
            }
        }
        return true;
    }

    public static void shell_log() {
        Log.d(TAG, "shell_log: ----");
    }
}
