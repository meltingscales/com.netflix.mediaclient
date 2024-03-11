package o;

import java.util.Arrays;
import okio.ByteString;

/* renamed from: o.dIh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7867dIh {
    private static final byte[] a;
    private static final byte[] d;

    static {
        ByteString.b bVar = ByteString.c;
        d = bVar.e("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").c();
        a = bVar.e("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").c();
    }

    public static final byte[] e(String str) {
        int i;
        char charAt;
        C8632dsu.c((Object) str, "");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                bArr[i5] = (byte) (i4 >> 16);
                bArr[i5 + 1] = (byte) (i4 >> 8);
                bArr[i5 + 2] = (byte) i4;
                i5 += 3;
            }
        }
        int i7 = i3 % 4;
        if (i7 != 1) {
            if (i7 == 2) {
                bArr[i5] = (byte) ((i4 << 12) >> 16);
                i5++;
            } else if (i7 == 3) {
                int i8 = i4 << 6;
                bArr[i5] = (byte) (i8 >> 16);
                bArr[i5 + 1] = (byte) (i8 >> 8);
                i5 += 2;
            }
            if (i5 == i2) {
                return bArr;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i5);
            C8632dsu.a(copyOf, "");
            return copyOf;
        }
        return null;
    }

    public static /* synthetic */ String e(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = d;
        }
        return c(bArr, bArr2);
    }

    public static final String c(byte[] bArr, byte[] bArr2) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            int i3 = i + 3;
            byte b3 = bArr[i + 2];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            bArr3[i2 + 3] = bArr2[b3 & 63];
            i2 += 4;
            i = i3;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i2 + 2] = b5;
            bArr3[i2 + 3] = b5;
        } else if (length2 == 2) {
            byte b6 = bArr[i];
            byte b7 = bArr[i + 1];
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b7 & 15) << 2];
            bArr3[i2 + 3] = (byte) 61;
        }
        return dIl.a(bArr3);
    }
}
