package cn.capcy.barcode;

import android.content.Context;

public class LargeCode {
    public static native int initialize(Context context);

    public static native String regDev(Context context, String str, String str2);

    static {
        System.loadLibrary("LargeCode");
    }
}
