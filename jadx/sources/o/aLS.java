package o;

import com.netflix.mediaclient.android.widget.NetflixImageView;

/* loaded from: classes.dex */
public final class aLS {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String a = "NFANDROID1-";
    private static char a$s39$55 = 56613;
    private static char b$s37$55 = 52069;
    private static int c = 0;
    private static char c$s38$55 = 5553;
    private static char d$s40$55 = 49621;
    private static int e = 1;

    public static String b() {
        int i = 2 % 2;
        int i2 = c;
        int i3 = i2 + 35;
        e = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        e = i5 % 128;
        int i6 = i5 % 2;
        return "-";
    }

    public static String c() {
        int i = 2 % 2;
        int i2 = c + 101;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return "_";
    }

    public static String d() {
        int i = 2 % 2;
        int i2 = c + 27;
        int i3 = i2 % 128;
        e = i3;
        int i4 = i2 % 2;
        String str = a;
        int i5 = i3 + 77;
        c = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String e() {
        int i = 2 % 2;
        int i2 = c + 63;
        e = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        f(14, new char[]{8877, 33584, 11606, 15249, 26285, 19265, 33921, 11609, 62182, 40117, 8877, 33584, 40349, 57956}, objArr);
        String intern = ((String) objArr[0]).intern();
        int i4 = c + 113;
        e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return intern;
    }

    private static void f(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9573sE c9573sE = new C9573sE();
        char[] cArr2 = new char[cArr.length];
        c9573sE.b = 0;
        char[] cArr3 = new char[2];
        while (c9573sE.b < cArr.length) {
            int i3 = $11 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            $10 = i3 % 128;
            int i4 = 58224;
            if (i3 % 2 != 0) {
                cArr3[1] = cArr[c9573sE.b];
                cArr3[1] = cArr[c9573sE.b];
            } else {
                cArr3[0] = cArr[c9573sE.b];
                cArr3[1] = cArr[c9573sE.b + 1];
            }
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $10;
                int i7 = i6 + 67;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + ((char) (a$s39$55 ^ (-3358735357273865631L))))) ^ ((c3 >>> 5) + ((char) (d$s40$55 ^ (-3358735357273865631L))))));
                cArr3[1] = c4;
                cArr3[0] = (char) (c3 - (((c4 >>> 5) + ((char) (c$s38$55 ^ (-3358735357273865631L)))) ^ ((c4 + i4) ^ ((c4 << 4) + ((char) (b$s37$55 ^ (-3358735357273865631L)))))));
                i4 -= 40503;
                i5++;
                int i9 = i6 + 9;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            cArr2[c9573sE.b] = cArr3[0];
            cArr2[c9573sE.b + 1] = cArr3[1];
            c9573sE.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
