package o;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dug  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8672dug {
    public static boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final String b(char c, Locale locale) {
        C8632dsu.c((Object) locale, "");
        String valueOf = String.valueOf(c);
        C8632dsu.d((Object) valueOf);
        String upperCase = valueOf.toUpperCase(locale);
        C8632dsu.a(upperCase, "");
        return upperCase;
    }

    public static String d(char c, Locale locale) {
        C8632dsu.c((Object) locale, "");
        String b = b(c, locale);
        if (b.length() <= 1) {
            String valueOf = String.valueOf(c);
            C8632dsu.d((Object) valueOf);
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            C8632dsu.a(upperCase, "");
            return !C8632dsu.c((Object) b, (Object) upperCase) ? b : String.valueOf(Character.toTitleCase(c));
        } else if (c == 329) {
            return b;
        } else {
            char charAt = b.charAt(0);
            C8632dsu.d((Object) b);
            String substring = b.substring(1);
            C8632dsu.a(substring, "");
            C8632dsu.d((Object) substring);
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            C8632dsu.a(lowerCase, "");
            return charAt + lowerCase;
        }
    }

    public static final int d(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static int c(int i) {
        if (new C8654dtp(2, 36).a(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C8654dtp(2, 36));
    }
}
