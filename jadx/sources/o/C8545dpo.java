package o;

import com.netflix.android.org.json.zip.JSONzip;
import java.util.Arrays;

/* renamed from: o.dpo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8545dpo {

    /* renamed from: o.dpo$c */
    /* loaded from: classes6.dex */
    public static class c {
        private static final int[] a;
        static final c b;
        private static final int[] c;
        static final c d;
        static final c e;
        private final boolean h;
        private final boolean i;

        static {
            int[] iArr = new int[JSONzip.end];
            c = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < e.a.length; i++) {
                c[e.a[i]] = i;
            }
            c[61] = -2;
            int[] iArr2 = new int[JSONzip.end];
            a = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < e.h.length; i2++) {
                a[e.h[i2]] = i2;
            }
            a[61] = -2;
            b = new c(false, false);
            e = new c(true, false);
            d = new c(false, true);
        }

        private c(boolean z, boolean z2) {
            this.h = z;
            this.i = z2;
        }

        private int b(byte[] bArr, int i, int i2) {
            int i3;
            int[] iArr = this.h ? a : c;
            int i4 = i2 - i;
            int i5 = 0;
            if (i4 == 0) {
                return 0;
            }
            if (i4 < 2) {
                if (this.i && iArr[0] == -1) {
                    return 0;
                }
                throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
            }
            if (this.i) {
                int i6 = 0;
                while (true) {
                    if (i >= i2) {
                        break;
                    }
                    int i7 = i + 1;
                    int i8 = bArr[i] & 255;
                    if (i8 == 61) {
                        i4 -= (i2 - i7) + 1;
                        break;
                    }
                    if (iArr[i8] == -1) {
                        i6++;
                    }
                    i = i7;
                }
                i4 -= i6;
            } else if (bArr[i2 - 1] == 61) {
                i5 = bArr[i2 - 2] == 61 ? 2 : 1;
            }
            if (i5 == 0 && (i3 = i4 & 3) != 0) {
                i5 = 4 - i3;
            }
            return (((i4 + 3) / 4) * 3) - i5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
            if (r18[r11] == 61) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
            if (r7 != 18) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
            if (r7 != 6) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
            r21[r6] = (byte) (r8 >> 16);
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
            if (r7 != 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
            r21[r6] = (byte) (r8 >> 16);
            r21[r6 + 1] = (byte) (r8 >> 8);
            r6 = r6 + 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
            if (r7 == 12) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
            if (r5 >= r20) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
            if (r17.i == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
            r3 = r2[r18[r5] & 255];
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
            if (r3 >= 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0121, code lost:
            throw new java.lang.IllegalArgumentException("Input byte array has incorrect ending byte at " + r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
            throw new java.lang.IllegalArgumentException("Last unit does not have enough valid bits");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private int d(byte[] r18, int r19, int r20, byte[] r21) {
            /*
                Method dump skipped, instructions count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C8545dpo.c.d(byte[], int, int, byte[]):int");
        }

        public byte[] a(String str) {
            return a(str.getBytes(C8508doe.e));
        }

        public byte[] a(byte[] bArr) {
            int b2 = b(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[b2];
            int d2 = d(bArr, 0, bArr.length, bArr2);
            return d2 != b2 ? Arrays.copyOf(bArr2, d2) : bArr2;
        }
    }

    /* renamed from: o.dpo$e */
    /* loaded from: classes5.dex */
    public static class e {
        private static final byte[] b;
        static final e e;
        private final boolean f;
        private final byte[] g;
        private final boolean i;
        private final int j;
        private static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        private static final char[] h = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        static final e c = new e(false, null, -1, true);
        static final e d = new e(true, null, -1, true);

        static {
            byte[] bArr = {13, 10};
            b = bArr;
            e = new e(false, bArr, 76, true);
        }

        private e(boolean z, byte[] bArr, int i, boolean z2) {
            this.f = z;
            this.g = bArr;
            this.j = i;
            this.i = z2;
        }

        private void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, boolean z) {
            char[] cArr = z ? h : a;
            while (i < i2) {
                int i4 = i + 3;
                int i5 = (bArr[i + 2] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
                bArr2[i3] = (byte) cArr[(i5 >>> 18) & 63];
                bArr2[i3 + 1] = (byte) cArr[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = (byte) cArr[(i5 >>> 6) & 63];
                bArr2[i3 + 3] = (byte) cArr[i5 & 63];
                i3 += 4;
                i = i4;
            }
        }

        private final int c(int i) {
            int i2;
            if (this.i) {
                i2 = ((i + 2) / 3) * 4;
            } else {
                int i3 = i % 3;
                i2 = ((i / 3) * 4) + (i3 == 0 ? 0 : i3 + 1);
            }
            int i4 = this.j;
            return i4 > 0 ? i2 + (((i2 - 1) / i4) * this.g.length) : i2;
        }

        private int c(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3;
            char[] cArr = this.f ? h : a;
            int i4 = ((i2 - i) / 3) * 3;
            int i5 = i + i4;
            int i6 = this.j;
            int i7 = (i6 <= 0 || i4 <= (i3 = (i6 / 4) * 3)) ? i4 : i3;
            int i8 = i;
            int i9 = 0;
            while (i8 < i5) {
                int min = Math.min(i8 + i7, i5);
                a(bArr, i8, min, bArr2, i9, this.f);
                int i10 = ((min - i8) / 3) * 4;
                i9 += i10;
                if (i10 == this.j && min < i2) {
                    byte[] bArr3 = this.g;
                    int length = bArr3.length;
                    int i11 = 0;
                    while (i11 < length) {
                        bArr2[i9] = bArr3[i11];
                        i11++;
                        i9++;
                    }
                }
                i8 = min;
            }
            if (i8 < i2) {
                int i12 = i8 + 1;
                int i13 = bArr[i8] & 255;
                int i14 = i9 + 1;
                bArr2[i9] = (byte) cArr[i13 >> 2];
                if (i12 == i2) {
                    int i15 = i9 + 2;
                    bArr2[i14] = (byte) cArr[(i13 << 4) & 63];
                    if (this.i) {
                        bArr2[i15] = 61;
                        i15 = i9 + 4;
                        bArr2[i9 + 3] = 61;
                    }
                    return i15;
                }
                int i16 = bArr[i12] & 255;
                bArr2[i14] = (byte) cArr[((i13 << 4) & 63) | (i16 >> 4)];
                int i17 = i9 + 3;
                bArr2[i9 + 2] = (byte) cArr[(i16 << 2) & 63];
                if (this.i) {
                    int i18 = i9 + 4;
                    bArr2[i17] = 61;
                    return i18;
                }
                return i17;
            }
            return i9;
        }

        public e c() {
            return !this.i ? this : new e(this.f, this.g, this.j, false);
        }

        public String d(byte[] bArr) {
            byte[] e2 = e(bArr);
            return new String(e2, 0, 0, e2.length);
        }

        public byte[] e(byte[] bArr) {
            int c2 = c(bArr.length);
            byte[] bArr2 = new byte[c2];
            int c3 = c(bArr, 0, bArr.length, bArr2);
            return c3 != c2 ? Arrays.copyOf(bArr2, c3) : bArr2;
        }
    }

    public static e b() {
        return e.d;
    }

    public static c c() {
        return c.e;
    }

    public static e d() {
        return e.c;
    }
}
