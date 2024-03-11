package o;

import java.util.Locale;

/* loaded from: classes5.dex */
public final class duG {
    public static final String e(char c) {
        String valueOf = String.valueOf(c);
        C8632dsu.d((Object) valueOf);
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        C8632dsu.a(upperCase, "");
        if (upperCase.length() > 1) {
            if (c == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            C8632dsu.d((Object) upperCase);
            String substring = upperCase.substring(1);
            C8632dsu.a(substring, "");
            C8632dsu.d((Object) substring);
            String lowerCase = substring.toLowerCase(locale);
            C8632dsu.a(lowerCase, "");
            return charAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}
