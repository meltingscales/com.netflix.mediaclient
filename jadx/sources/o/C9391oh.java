package o;

import com.netflix.android.org.json.zip.JSONzip;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.oh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9391oh {
    protected static final char[] a;
    protected static final byte[] b;
    protected static final int[] c;
    protected static final byte[] d;
    protected static final char[] e;
    protected static final int[] f;
    protected static final int[] g;
    protected static final int[] h;
    protected static final int[] i;
    protected static final int[] j;
    protected static final int[] k;
    protected static final int[] n;

    public static int[] a() {
        return f;
    }

    public static int[] b() {
        return g;
    }

    public static int[] c() {
        return h;
    }

    public static int[] d() {
        return i;
    }

    public static int[] e() {
        return k;
    }

    public static int[] f() {
        return j;
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        e = charArray;
        a = "0123456789abcdef".toCharArray();
        int length = charArray.length;
        b = new byte[length];
        d = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            b[i2] = (byte) e[i2];
            d[i2] = (byte) a[i2];
        }
        int[] iArr = new int[JSONzip.end];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f = iArr;
        int[] iArr2 = new int[JSONzip.end];
        System.arraycopy(iArr, 0, iArr2, 0, JSONzip.end);
        for (int i4 = 128; i4 < 256; i4++) {
            iArr2[i4] = (i4 & 224) == 192 ? 2 : (i4 & 240) == 224 ? 3 : (i4 & 248) == 240 ? 4 : -1;
        }
        i = iArr2;
        int[] iArr3 = new int[JSONzip.end];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        h = iArr3;
        int[] iArr4 = new int[JSONzip.end];
        System.arraycopy(iArr3, 0, iArr4, 0, JSONzip.end);
        Arrays.fill(iArr4, 128, 128, 0);
        j = iArr4;
        int[] iArr5 = new int[JSONzip.end];
        int[] iArr6 = i;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        g = iArr5;
        int[] iArr7 = new int[JSONzip.end];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        n = iArr7;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        k = iArr8;
        int[] iArr9 = new int[JSONzip.end];
        c = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            c[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr10 = c;
            int i9 = i8 + 10;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }

    public static int[] c(int i2) {
        return i2 == 34 ? k : b.b.c(i2);
    }

    public static int e(int i2) {
        return c[i2 & PrivateKeyType.INVALID];
    }

    public static char d(int i2) {
        return e[i2];
    }

    public static void d(StringBuilder sb, String str) {
        int[] iArr = k;
        int length = iArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append('\\');
                int i3 = iArr[charAt];
                if (i3 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = e;
                    sb.append(cArr[charAt >> 4]);
                    sb.append(cArr[charAt & 15]);
                } else {
                    sb.append((char) i3);
                }
            }
        }
    }

    public static char[] a(boolean z) {
        return (char[]) (z ? e.clone() : a.clone());
    }

    public static byte[] b(boolean z) {
        return (byte[]) (z ? b.clone() : d.clone());
    }

    /* renamed from: o.oh$b */
    /* loaded from: classes2.dex */
    static class b {
        public static final b b = new b();
        private int[][] a = new int[128];

        private b() {
        }

        public int[] c(int i) {
            int[] iArr = this.a[i];
            if (iArr == null) {
                iArr = Arrays.copyOf(C9391oh.k, 128);
                if (iArr[i] == 0) {
                    iArr[i] = -1;
                }
                this.a[i] = iArr;
            }
            return iArr;
        }
    }
}
