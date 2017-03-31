package cn.capcy.barcode;

import android.content.Context;

public class barcodecls {
    public native int deinitialize();

    public native int initialize(Context context);

    public native int recognisefile(String str, byte[] bArr);

    public native int recogniseimagebuff(byte[] bArr, int i, int i2, byte[] bArr2);

    public barcodecls() {
        System.loadLibrary("Barcode");
    }

    public int barcode_init(Context context) {
        return initialize(context);
    }

    public int barcode_file(String str, byte[] bArr) {
        return recognisefile(str, bArr);
    }

    public int barcode_buff(byte[] bArr, int i, int i2, byte[] bArr2) {
        return recogniseimagebuff(bArr, i, i2, bArr2);
    }

    public int barcode_deinitialize() {
        return deinitialize();
    }
}
