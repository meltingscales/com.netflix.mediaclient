package o;

import com.netflix.android.org.json.zip.JSONzip;
import java.util.Arrays;

/* renamed from: o.mT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9271mT {
    private static final int[] b;
    private static final char[] c;
    private static final byte[] d;
    private static final byte[] e;

    AbstractC9271mT() {
    }

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        c = charArray;
        int[] iArr = new int[JSONzip.end];
        b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            b[c[i]] = i;
        }
        b[61] = 0;
        d = new byte[c.length];
        int i2 = 0;
        while (true) {
            char[] cArr = c;
            if (i2 >= cArr.length) {
                e = new byte[0];
                return;
            } else {
                d[i2] = (byte) cArr[i2];
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr.length;
        int i2 = (length / 3) * 3;
        int i3 = length - 1;
        int i4 = ((i3 / 3) + 1) << 2;
        int i5 = i;
        int i6 = 0;
        while (i6 < i2) {
            int i7 = i6 + 3;
            int i8 = (bArr[i6 + 2] & 255) | ((bArr[i6] & 255) << 16) | ((bArr[i6 + 1] & 255) << 8);
            byte[] bArr3 = d;
            bArr2[i5] = bArr3[(i8 >>> 18) & 63];
            bArr2[i5 + 1] = bArr3[(i8 >>> 12) & 63];
            bArr2[i5 + 2] = bArr3[(i8 >>> 6) & 63];
            bArr2[i5 + 3] = bArr3[i8 & 63];
            i5 += 4;
            i6 = i7;
        }
        int i9 = length - i2;
        if (i9 > 0) {
            int i10 = ((bArr[i2] & 255) << 10) | (i9 == 2 ? (bArr[i3] & 255) << 2 : 0);
            int i11 = i + i4;
            byte[] bArr4 = d;
            bArr2[i11 - 4] = bArr4[i10 >> 12];
            bArr2[i11 - 3] = bArr4[(i10 >>> 6) & 63];
            bArr2[i11 - 2] = i9 == 2 ? bArr4[i10 & 63] : (byte) 61;
            bArr2[i11 - 1] = 61;
        }
        return i4;
    }

    public static int e(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (b[bArr[i] & 255] < 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static byte[] e(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        if (i4 == 0) {
            return e;
        }
        int i5 = i2 - 1;
        int i6 = i;
        while (i6 < i5 && b[bArr[i6] & 255] < 0) {
            i6++;
        }
        while (i5 > 0 && b[bArr[i5] & 255] < 0) {
            i5--;
        }
        int i7 = 0;
        int i8 = bArr[i5] == 61 ? bArr[i5 + (-1)] == 61 ? 2 : 1 : 0;
        int i9 = (i5 - i6) + 1;
        if (i4 > 76) {
            i3 = (bArr[76] == 13 ? i9 / 78 : 0) << 1;
        } else {
            i3 = 0;
        }
        int i10 = (((i9 - i3) * 6) >> 3) - i8;
        byte[] bArr2 = new byte[i10];
        int i11 = i10 / 3;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11 * 3) {
            int[] iArr = b;
            int i14 = iArr[bArr[i6 + 3]] | (iArr[bArr[i6]] << 18) | (iArr[bArr[i6 + 1]] << 12) | (iArr[bArr[i6 + 2]] << 6);
            bArr2[i12] = (byte) (i14 >> 16);
            bArr2[i12 + 1] = (byte) (i14 >> 8);
            int i15 = i12 + 3;
            bArr2[i12 + 2] = (byte) i14;
            if (i3 <= 0 || (i13 = i13 + 1) != 19) {
                i6 += 4;
            } else {
                i6 += 6;
                i13 = 0;
            }
            i12 = i15;
        }
        if (i12 < i10) {
            int i16 = 0;
            while (i6 <= i5 - i8) {
                i7 |= b[bArr[i6]] << (18 - (i16 * 6));
                i16++;
                i6++;
            }
            int i17 = 16;
            while (i12 < i10) {
                bArr2[i12] = (byte) (i7 >> i17);
                i17 -= 8;
                i12++;
            }
        }
        return bArr2;
    }
}
