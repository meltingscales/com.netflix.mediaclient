package o;

import android.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: o.deh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8137deh {
    private static final int[] a = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};

    public static String e(String str) {
        return c(str.getBytes());
    }

    public static String b(String str) {
        return new String(d(str));
    }

    public static byte[] d(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            b(sb, b);
        }
        return sb.toString();
    }

    private static void b(StringBuilder sb, byte b) {
        sb.append("0123456789ABCDEF".charAt((b >> 4) & 15));
        sb.append("0123456789ABCDEF".charAt(b & 15));
    }

    public static String a(byte[] bArr, String str) {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(str.getBytes("UTF-8"), "HmacSHA256"));
        return c(mac.doFinal(bArr));
    }

    public static byte[] b(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("Input array is null!");
        }
        C1044Mm.e("nf_crypto", "Array size: " + bArr.length);
        C1044Mm.e("nf_crypto", "Block size: " + i);
        byte length = (byte) (i - (bArr.length % i));
        C1044Mm.e("nf_crypto", "Padding: " + ((int) length));
        byte[] bArr2 = new byte[bArr.length + length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = bArr[i2];
        }
        for (int i3 = 0; i3 < length; i3++) {
            bArr2[bArr.length + i3] = length;
        }
        return bArr2;
    }

    public static byte[] e(byte[] bArr, int i) {
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("Input array is null or 0!");
        }
        int length = bArr.length - bArr[bArr.length - 1];
        byte[] bArr2 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = bArr[i2];
        }
        return bArr2;
    }

    public static byte[] c(String str) {
        return Base64.decode(str, 0);
    }

    public static String e(byte[] bArr) {
        return bArr == null ? "" : Base64.encodeToString(bArr, 2);
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }
}
