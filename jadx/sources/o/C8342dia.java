package o;

import android.net.Uri;
import android.util.Patterns;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.regex.Pattern;

/* renamed from: o.dia  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8342dia {
    private static MessageDigest d;

    private C8342dia() {
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        return h(Uri.parse(str).getHost());
    }

    private static boolean h(String str) {
        return Pattern.matches("^(10\\.|172\\.(1[6-9]|2[0-9]|3[0-1])\\.|192\\.168\\.)[0-9.]+$", str) || Pattern.matches("^(fc[0-9a-f]{2}:|fd[0-9a-f]{2}:).*", str);
    }

    public static boolean b(String str) {
        if (C8168dfL.g(str)) {
            return false;
        }
        return Patterns.WEB_URL.matcher(str.toLowerCase()).matches();
    }

    public static String d(String str) {
        if (C8168dfL.g(str)) {
            throw new IllegalArgumentException("Empty uri string");
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            String valueOf = String.valueOf(str.hashCode());
            C1044Mm.j("UrlUtils", "Could not parse uri: " + str + ", returning hash: " + valueOf);
            return valueOf;
        }
        return parse.getPath();
    }

    public static String a(String str) {
        if (C8168dfL.g(str)) {
            throw new IllegalArgumentException("Empty uri string");
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf > 0 && lastIndexOf < str.length() - 1) {
            String substring = str.substring(lastIndexOf + 1);
            int indexOf = substring.indexOf(63);
            if (indexOf > 0) {
                substring = substring.substring(0, indexOf);
            }
            return substring.length() > 80 ? f(substring) : substring;
        }
        C1044Mm.j("UrlUtils", "No filename found in URI - using hash: " + str);
        return f(str);
    }

    private static String f(String str) {
        String c;
        synchronized (C8342dia.class) {
            try {
                if (d == null) {
                    d = MessageDigest.getInstance("SHA-256");
                }
                d.update(str.getBytes(Charset.forName("UTF-8")));
                c = C8137deh.c(d.digest());
            } catch (Exception e) {
                C1044Mm.b("UrlUtils", e, "unable to hash filename", new Object[0]);
                return String.valueOf(str.hashCode());
            }
        }
        return c;
    }

    public static String e(String str) {
        if (str == null) {
            InterfaceC1598aHf.a("uriStr is null");
            return null;
        } else if (C8168dfL.g(str)) {
            C1044Mm.d("UrlUtils", "Empty uri string");
            return null;
        } else {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return null;
            }
            return parse.getQuery();
        }
    }
}
