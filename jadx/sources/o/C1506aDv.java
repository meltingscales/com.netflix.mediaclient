package o;

import java.util.Locale;

/* renamed from: o.aDv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1506aDv {
    public static final String e(String str) {
        boolean a;
        C8632dsu.c((Object) str, "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            a = duD.a((CharSequence) "!#$&'\"()*+,/:;=?@[]{} ", charAt, false, 2, (Object) null);
            if (a) {
                sb.append(e(charAt));
            } else {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    private static final String e(char c) {
        int c2;
        c2 = C8672dug.c(16);
        String num = Integer.toString(c, c2);
        C8632dsu.a(num, "");
        String upperCase = ("%" + num).toUpperCase(Locale.ROOT);
        C8632dsu.a(upperCase, "");
        return upperCase;
    }
}
