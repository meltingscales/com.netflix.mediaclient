package org.xbill.DNS.utils;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class base64 {
    public static String toString(byte[] bArr) {
        return toString(bArr, false);
    }

    public static String toString(byte[] bArr, boolean z) {
        String str = z ? "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_" : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < (bArr.length + 2) / 3; i++) {
            short[] sArr = new short[3];
            short[] sArr2 = new short[4];
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = (i * 3) + i2;
                if (i3 < bArr.length) {
                    sArr[i2] = (short) (bArr[i3] & 255);
                } else {
                    sArr[i2] = -1;
                }
            }
            sArr2[0] = (short) (sArr[0] >> 2);
            short s = sArr[1];
            if (s == -1) {
                sArr2[1] = (short) ((sArr[0] & 3) << 4);
            } else {
                sArr2[1] = (short) (((sArr[0] & 3) << 4) + (s >> 4));
            }
            short s2 = sArr[1];
            if (s2 == -1) {
                sArr2[3] = 64;
                sArr2[2] = 64;
            } else {
                short s3 = sArr[2];
                if (s3 == -1) {
                    sArr2[2] = (short) ((s2 & 15) << 2);
                    sArr2[3] = 64;
                } else {
                    sArr2[2] = (short) (((s2 & 15) << 2) + (s3 >> 6));
                    sArr2[3] = (short) (sArr[2] & 63);
                }
            }
            for (int i4 = 0; i4 < 4; i4++) {
                short s4 = sArr2[i4];
                if (s4 != 64 || !z) {
                    byteArrayOutputStream.write(str.charAt(s4));
                }
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public static String formatString(byte[] bArr, int i, String str, boolean z) {
        String base64Var = toString(bArr);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < base64Var.length()) {
            sb.append(str);
            int i3 = i2 + i;
            if (i3 >= base64Var.length()) {
                sb.append(base64Var.substring(i2));
                if (z) {
                    sb.append(" )");
                }
            } else {
                sb.append((CharSequence) base64Var, i2, i3);
                sb.append("\n");
            }
            i2 = i3;
        }
        return sb.toString();
    }
}