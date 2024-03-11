package o;

import java.util.Locale;

/* renamed from: o.ib  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9067ib {
    private static final boolean d(int i) {
        return (97 <= i && i < 123) || (65 <= i && i < 91) || ((48 <= i && i < 58) || i == 45 || i == 46 || i == 95 || i == 126);
    }

    public static final String b(String str) {
        byte[] l;
        C8632dsu.c((Object) str, "");
        StringBuilder sb = new StringBuilder();
        l = C8691duz.l(str);
        for (byte b : l) {
            int i = b & 255;
            if (d(i)) {
                sb.append((char) i);
            } else {
                sb.append(c(i));
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    private static final String c(int i) {
        int c;
        c = C8672dug.c(16);
        String num = Integer.toString(i, c);
        C8632dsu.a(num, "");
        String upperCase = num.toUpperCase(Locale.ROOT);
        C8632dsu.a(upperCase, "");
        if (upperCase.length() == 1) {
            upperCase = '0' + upperCase;
        }
        return '%' + upperCase;
    }
}
