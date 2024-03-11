package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: o.rO  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9531rO {
    public static String e(AnnotatedMethod annotatedMethod, boolean z) {
        String d = annotatedMethod.d();
        String b = b(annotatedMethod, d, z);
        return b == null ? e(annotatedMethod, d, z) : b;
    }

    public static String e(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (str.startsWith("get")) {
            if ("getCallbacks".equals(str)) {
                if (e(annotatedMethod)) {
                    return null;
                }
            } else if ("getMetaClass".equals(str) && c(annotatedMethod)) {
                return null;
            }
            if (z) {
                return a(str, 3);
            }
            return c(str, 3);
        }
        return null;
    }

    public static String b(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (str.startsWith("is")) {
            Class<?> e = annotatedMethod.e();
            if (e == Boolean.class || e == Boolean.TYPE) {
                if (z) {
                    return a(str, 2);
                }
                return c(str, 2);
            }
            return null;
        }
        return null;
    }

    public static String a(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String d = annotatedMethod.d();
        if (d.startsWith(str)) {
            if (z) {
                return a(d, str.length());
            }
            return c(d, str.length());
        }
        return null;
    }

    public static Object a(JavaType javaType) {
        Class<?> h = javaType.h();
        Class<?> v = C9537rU.v(h);
        if (v != null) {
            return C9537rU.d(v);
        }
        if (javaType.x() || javaType.d()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (h == String.class) {
            return "";
        }
        if (javaType.e(Date.class)) {
            return new Date(0L);
        }
        if (javaType.e(Calendar.class)) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }
        return null;
    }

    protected static boolean e(AnnotatedMethod annotatedMethod) {
        String m;
        Class<?> e = annotatedMethod.e();
        return e.isArray() && (m = C9537rU.m(e.getComponentType())) != null && m.contains(".cglib") && (m.startsWith("net.sf.cglib") || m.startsWith("org.hibernate.repackage.cglib") || m.startsWith("org.springframework.cglib"));
    }

    protected static boolean c(AnnotatedMethod annotatedMethod) {
        String m = C9537rU.m(annotatedMethod.e());
        return m != null && m.startsWith("groovy.lang");
    }

    protected static String c(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char charAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append((CharSequence) str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    protected static String a(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i2, length);
        return sb.toString();
    }
}
