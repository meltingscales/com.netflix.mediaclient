package o;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class dIP {
    public static final byte[] a(String str) {
        int i;
        int i2;
        char charAt;
        C8632dsu.c((Object) str, "");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt2 = str.charAt(i3);
            if (C8632dsu.d(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i4 = i3;
                while (i3 < length2) {
                    char charAt3 = str.charAt(i3);
                    if (C8632dsu.d(charAt3, 128) < 0) {
                        bArr[i4] = (byte) charAt3;
                        i3++;
                        i4++;
                        while (i3 < length2 && C8632dsu.d(str.charAt(i3), 128) < 0) {
                            bArr[i4] = (byte) str.charAt(i3);
                            i3++;
                            i4++;
                        }
                    } else {
                        if (C8632dsu.d(charAt3, 2048) < 0) {
                            bArr[i4] = (byte) ((charAt3 >> 6) | 192);
                            i = i4 + 2;
                            bArr[i4 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || 57343 < charAt3) {
                            bArr[i4] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i4 + 1] = (byte) ((63 & (charAt3 >> 6)) | 128);
                            i = i4 + 3;
                            bArr[i4 + 2] = (byte) ((charAt3 & '?') | 128);
                        } else if (C8632dsu.d(charAt3, 56319) > 0 || length2 <= (i2 = i3 + 1) || 56320 > (charAt = str.charAt(i2)) || 57343 < charAt) {
                            bArr[i4] = 63;
                            i3++;
                            i4++;
                        } else {
                            int charAt4 = ((charAt3 << '\n') + str.charAt(i2)) - 56613888;
                            bArr[i4] = (byte) ((charAt4 >> 18) | 240);
                            bArr[i4 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                            bArr[i4 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                            bArr[i4 + 3] = (byte) ((charAt4 & 63) | 128);
                            i3 += 2;
                            i4 += 4;
                        }
                        i4 = i;
                        i3++;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i4);
                C8632dsu.a(copyOf, "");
                return copyOf;
            }
            bArr[i3] = (byte) charAt2;
            i3++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        C8632dsu.a(copyOf2, "");
        return copyOf2;
    }
}
