package o;

/* renamed from: o.dfp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8198dfp {
    public static Integer d(String str, Integer num) {
        if (C8168dfL.g(str)) {
            return num;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return num;
        }
    }

    public static boolean c(String str) {
        if (C8168dfL.g(str)) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static Long a(String str) {
        try {
            return Long.valueOf(str);
        } catch (Throwable th) {
            C1044Mm.a("nf_numbers", th, "Failed to translate String to Long!");
            return -1L;
        }
    }
}
