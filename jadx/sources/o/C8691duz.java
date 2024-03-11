package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: o.duz */
/* loaded from: classes.dex */
public class C8691duz extends C8689dux {
    public static /* synthetic */ boolean e(String str, String str2, boolean z, int i, Object obj) {
        boolean a;
        if ((i & 2) != 0) {
            z = false;
        }
        a = a(str, str2, z);
        return a;
    }

    public static boolean a(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static /* synthetic */ String b(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return d(str, c, c2, z);
    }

    public static final String d(String str, char c, char c2, boolean z) {
        C8632dsu.c((Object) str, "");
        if (!z) {
            String replace = str.replace(c, c2);
            C8632dsu.a(replace, "");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C8675duj.c(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public static /* synthetic */ String b(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return e(str, str2, str3, z);
    }

    public static final String e(String str, String str2, String str3, boolean z) {
        int b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        int i = 0;
        int c = duD.c(str, str2, 0, z);
        if (c < 0) {
            return str;
        }
        int length = str2.length();
        b = C8657dts.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, c);
            sb.append(str3);
            i = c + length;
            if (c >= str.length()) {
                break;
            }
            c = duD.c(str, str2, c + b, z);
        } while (c > 0);
        sb.append((CharSequence) str, i, str.length());
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public static /* synthetic */ String c(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c(str, str2, str3, z);
    }

    public static final String c(String str, String str2, String str3, boolean z) {
        int d;
        CharSequence c;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        d = duD.d(str, str2, 0, z, 2, (Object) null);
        if (d < 0) {
            return str;
        }
        c = duD.c(str, d, str2.length() + d, str3);
        return c.toString();
    }

    public static String b(char[] cArr) {
        C8632dsu.c((Object) cArr, "");
        return new String(cArr);
    }

    public static byte[] l(String str) {
        C8632dsu.c((Object) str, "");
        byte[] bytes = str.getBytes(C8674dui.i);
        C8632dsu.a(bytes, "");
        return bytes;
    }

    public static /* synthetic */ boolean i(String str, String str2, boolean z, int i, Object obj) {
        boolean b;
        if ((i & 2) != 0) {
            z = false;
        }
        b = b(str, str2, z);
        return b;
    }

    public static boolean b(String str, String str2, boolean z) {
        boolean d;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        d = d(str, 0, str2, 0, str2.length(), z);
        return d;
    }

    public static /* synthetic */ boolean b(String str, String str2, int i, boolean z, int i2, Object obj) {
        boolean a;
        if ((i2 & 4) != 0) {
            z = false;
        }
        a = a(str, str2, i, z);
        return a;
    }

    public static boolean a(String str, String str2, int i, boolean z) {
        boolean d;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (!z) {
            return str.startsWith(str2, i);
        }
        d = d(str, i, str2, 0, str2.length(), z);
        return d;
    }

    public static /* synthetic */ boolean a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c(str, str2, z);
    }

    public static final boolean c(String str, String str2, boolean z) {
        boolean d;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (!z) {
            return str.endsWith(str2);
        }
        d = d(str, str.length() - str2.length(), str2, 0, str2.length(), true);
        return d;
    }

    public static boolean d(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return duD.b(charSequence, charSequence2);
    }

    public static boolean d(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean d;
        if (z) {
            return duD.c(charSequence, charSequence2);
        }
        d = d(charSequence, charSequence2);
        return d;
    }

    public static boolean g(CharSequence charSequence) {
        boolean c;
        C8632dsu.c((Object) charSequence, "");
        if (charSequence.length() != 0) {
            C8654dtp h = duD.h(charSequence);
            if (!(h instanceof Collection) || !((Collection) h).isEmpty()) {
                Iterator<Integer> it = h.iterator();
                while (it.hasNext()) {
                    c = C8672dug.c(charSequence.charAt(((dqB) it).nextInt()));
                    if (!c) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean b(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        boolean d;
        if ((i4 & 16) != 0) {
            z = false;
        }
        d = d(str, i, str2, i2, i3, z);
        return d;
    }

    public static boolean d(String str, int i, String str2, int i2, int i3, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static String e(String str, Locale locale) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) locale, "");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    C8632dsu.a(substring, "");
                    C8632dsu.d((Object) substring);
                    String upperCase = substring.toUpperCase(locale);
                    C8632dsu.a(upperCase, "");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                C8632dsu.a(substring2, "");
                sb.append(substring2);
                String sb2 = sb.toString();
                C8632dsu.a(sb2, "");
                return sb2;
            }
            return str;
        }
        return str;
    }

    public static String c(CharSequence charSequence, int i) {
        C8632dsu.c((Object) charSequence, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i != 0) {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length != 0) {
                if (length == 1) {
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        cArr[i2] = charAt;
                    }
                    return new String(cArr);
                }
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                dqB it = new C8654dtp(1, i).iterator();
                while (it.hasNext()) {
                    it.nextInt();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                C8632dsu.d((Object) sb2);
                return sb2;
            }
            return "";
        } else {
            return "";
        }
    }

    public static Comparator<String> d(dsE dse) {
        C8632dsu.c((Object) dse, "");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C8632dsu.a(comparator, "");
        return comparator;
    }
}
