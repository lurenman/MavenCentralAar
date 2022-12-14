package com.lurenman.packagelist;

import android.util.Log;

/**
 * @Author yang.bai.
 * Date: 2022/12/12
 */
public class PackageListUtil {
    private static final String TAG = "PackageListUtil";

    public static boolean isEmpty(String str) {
        return ((str == null) || ("".equals(str.trim()) || str.length() == 0));
    }

    public static void package_log() {
        Log.d(TAG, "package_log: ----");
    }
}
