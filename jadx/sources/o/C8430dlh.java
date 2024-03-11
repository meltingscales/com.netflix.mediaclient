package o;

import java.nio.charset.StandardCharsets;
import o.C8427dle;

/* renamed from: o.dlh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8430dlh implements C8427dle.b {
    private static final char[] a = d();
    private static final byte[] c = b();

    private static char[] d() {
        int i;
        int i2;
        char[] cArr = new char[64];
        int i3 = 0;
        while (true) {
            i = 26;
            if (i3 >= 26) {
                break;
            }
            cArr[i3] = (char) (i3 + 65);
            i3++;
        }
        while (true) {
            if (i >= 52) {
                break;
            }
            cArr[i] = (char) (i + 71);
            i++;
        }
        for (i2 = 52; i2 < 62; i2++) {
            cArr[i2] = (char) (i2 - 4);
        }
        cArr[62] = '+';
        cArr[63] = '/';
        return cArr;
    }

    private static byte[] b() {
        byte[] bArr = new byte[128];
        for (int i = 0; i < 128; i++) {
            bArr[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            bArr[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            bArr[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            bArr[i4] = (byte) (i4 + 4);
        }
        bArr[43] = 62;
        bArr[47] = 63;
        bArr[61] = Byte.MAX_VALUE;
        return bArr;
    }

    private static char a(int i) {
        return a[i & 63];
    }

    @Override // o.C8427dle.b
    public String a(byte[] bArr) {
        char[] cArr = new char[((bArr.length + 2) / 3) * 4];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (length >= 3) {
            cArr[i] = a(bArr[i2] >> 2);
            int i3 = i2 + 1;
            cArr[i + 1] = a(((bArr[i2] & 3) << 4) | ((bArr[i3] >> 4) & 15));
            byte b = bArr[i3];
            int i4 = i2 + 2;
            cArr[i + 2] = a(((b & 15) << 2) | ((bArr[i4] >> 6) & 3));
            cArr[i + 3] = a(bArr[i4] & 63);
            length -= 3;
            i2 += 3;
            i += 4;
        }
        if (length == 1) {
            cArr[i] = a(bArr[i2] >> 2);
            cArr[i + 1] = a((bArr[i2] & 3) << 4);
            cArr[i + 2] = '=';
            cArr[i + 3] = '=';
        } else if (length == 2) {
            cArr[i] = a(bArr[i2] >> 2);
            byte b2 = bArr[i2];
            int i5 = i2 + 1;
            cArr[i + 1] = a(((b2 & 3) << 4) | ((bArr[i5] >> 4) & 15));
            cArr[i + 2] = a((bArr[i5] & 15) << 2);
            cArr[i + 3] = '=';
        }
        return new String(cArr);
    }

    @Override // o.C8427dle.b
    public byte[] a(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        byte[] bArr = new byte[(bytes.length * 3) / 4];
        byte[] bArr2 = new byte[4];
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        for (byte b : bytes) {
            if (b >= 0) {
                byte b2 = c[b];
                if (b2 != -1) {
                    if (z2) {
                        z = true;
                    }
                    int i3 = i + 1;
                    bArr2[i] = b2;
                    if (i3 == 4) {
                        byte b3 = bArr2[0];
                        z = (b3 == Byte.MAX_VALUE || bArr2[1] == Byte.MAX_VALUE) ? true : true;
                        z2 = (bArr2[2] == Byte.MAX_VALUE || bArr2[3] == Byte.MAX_VALUE) ? true : true;
                        int i4 = i2 + 1;
                        bArr[i2] = (byte) ((b3 << 2) | (bArr2[1] >> 4));
                        byte b4 = bArr2[2];
                        if (b4 != Byte.MAX_VALUE) {
                            bArr[i4] = (byte) ((b4 >> 2) | (bArr2[1] << 4));
                            i4 = i2 + 2;
                        }
                        byte b5 = bArr2[3];
                        if (b5 != Byte.MAX_VALUE) {
                            i2 = i4 + 1;
                            bArr[i4] = (byte) (b5 | (bArr2[2] << 6));
                        } else {
                            i2 = i4;
                        }
                        i = 0;
                    } else {
                        i = i3;
                    }
                } else if (b != 32) {
                    if (b != 9) {
                        if (b != 10) {
                            if (b == 13) {
                            }
                        }
                    }
                }
            }
            z = true;
        }
        if (i != 0 || z) {
            throw new IllegalArgumentException("Invalid Base64 encoded string: " + str);
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, 0, bArr3, 0, i2);
        return bArr3;
    }
}
