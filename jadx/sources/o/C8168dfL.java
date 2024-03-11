package o;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import androidx.core.content.ContextCompat;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: o.dfL  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8168dfL {
    private static final Pattern a;
    private static int c = 1;
    private static int d;
    private static final char[] e;
    private static byte e$ss2$343;

    static void b() {
        e$ss2$343 = (byte) 24;
    }

    static {
        b();
        e = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        a = Pattern.compile("^[0-9]");
    }

    @Deprecated(since = "Use getLocalizedString(Context context, @StringRes int stringId) to avoid the lookup call")
    public static String d(int i) {
        return b((Context) C1332Xp.b(Context.class), i);
    }

    public static String b(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = d + 111;
        c = i3 % 128;
        int i4 = i3 % 2;
        String string = context.getString(i);
        boolean startsWith = string.startsWith("'!#+");
        if (i4 == 0) {
            int i5 = 37 / 0;
            if (!startsWith) {
                return string;
            }
        } else if (!startsWith) {
            return string;
        }
        Object[] objArr = new Object[1];
        k(string.substring(4), objArr);
        String intern = ((String) objArr[0]).intern();
        int i6 = c + 3;
        d = i6 % 128;
        int i7 = i6 % 2;
        return intern;
    }

    @Deprecated
    public static String a(int i, Object... objArr) {
        return ((Context) C1332Xp.b(Context.class)).getString(i, objArr);
    }

    public static int a(String str, char c2, int i) {
        if (i <= 0) {
            return -1;
        }
        int indexOf = str.indexOf(c2, 0);
        while (i > 1 && indexOf != -1) {
            indexOf = str.indexOf(c2, indexOf + 1);
            i--;
        }
        return indexOf;
    }

    public static String e(String str, String str2) {
        return c(str, str2, true);
    }

    public static String c(String str, String str2, boolean z) {
        if (str == null) {
            return "";
        }
        if (z) {
            return str.trim().replaceAll("\\s", str2);
        }
        return str.replaceAll("\\s", str2);
    }

    public static String j(String str) {
        return str == null ? "" : str.trim().replaceAll("\\s+", " ");
    }

    public static boolean h(String str) {
        return !g(str);
    }

    public static boolean g(String str) {
        return str == null || "".equals(str.trim());
    }

    public static boolean b(CharSequence charSequence) {
        return !a(charSequence);
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence == null || "".contentEquals(charSequence);
    }

    public static String c(String[] strArr) {
        return b(strArr, (String) null);
    }

    public static String b(String[] strArr, String str) {
        if (strArr != null) {
            boolean z = true;
            if (strArr.length < 1) {
                return "";
            }
            if (str == null) {
                str = ",";
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                if (str2 != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(str);
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static boolean d(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static String[] b(String str, String str2) {
        return g(str) ? new String[0] : str.split(str2);
    }

    public static String e(String str) {
        return b(str, (Locale) null);
    }

    public static String b(String str, Locale locale) {
        if (g(str)) {
            return str;
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        char[] charArray = str.toCharArray();
        String upperCase = str.toUpperCase(locale);
        StringBuilder sb = new StringBuilder();
        sb.append(upperCase.charAt(0));
        for (int i = 1; i < charArray.length; i++) {
            sb.append(charArray[i]);
        }
        return sb.toString();
    }

    public static String b(String str) {
        return g(str) ? str : Html.fromHtml(str, 0).toString();
    }

    public static Spanned c(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml(str, 0);
    }

    public static boolean i(String str) {
        return a(str, 10);
    }

    public static boolean a(String str, int i) {
        if (g(str)) {
            return false;
        }
        String trim = str.trim();
        for (int i2 = 0; i2 < trim.length(); i2++) {
            if (i2 == 0 && trim.charAt(i2) == '-') {
                if (trim.length() == 1) {
                    return false;
                }
            } else if (Character.digit(trim.charAt(i2), i) < 0) {
                return false;
            }
        }
        return true;
    }

    public static int d(String str) {
        if (g(str)) {
            return 0;
        }
        return str.split(",").length;
    }

    public static String d(byte[] bArr, String str) {
        if (bArr != null) {
            try {
                return new String(bArr, str);
            } catch (UnsupportedEncodingException e2) {
                C1044Mm.e("StringUtils", "byteArrayToString error", e2);
            }
        }
        return null;
    }

    public static boolean c(String str, String str2) {
        if (g(str)) {
            return false;
        }
        return str.equals(str2);
    }

    public static long f(String str) {
        if (str == null) {
            return 0L;
        }
        String trim = str.trim();
        if ("".equals(trim) || "null".equalsIgnoreCase(trim)) {
            return 0L;
        }
        try {
            return l(str);
        } catch (Throwable th) {
            C1044Mm.d("StringUtils", "Got exception inside toLongSafe: " + th);
            return 0L;
        }
    }

    private static long l(String str) {
        return Long.parseLong(str);
    }

    public static String d(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (str3 != null) {
            sb.append(str3);
        }
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public static String c(String str, int i) {
        StringBuilder sb = new StringBuilder(str.length() * i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void d(StringBuilder sb, String str) {
        sb.append(' ');
        sb.append(str);
    }

    public static SpannableString d(Context context, CharSequence charSequence, int i) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, i)), 0, charSequence.length(), 33);
        return spannableString;
    }

    public static String m(String str) {
        return URLEncoder.encode(str, "UTF-8");
    }

    public static String n(String str) {
        return URLDecoder.decode(str, "UTF-8");
    }

    private static void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$343);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
