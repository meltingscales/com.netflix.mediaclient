package o;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: o.dsu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8632dsu {
    public static int a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    public static int d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    private C8632dsu() {
    }

    public static String d(String str, Object obj) {
        return str + obj;
    }

    public static void d(Object obj) {
        if (obj == null) {
            b();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            a(str);
        }
    }

    public static void e() {
        throw ((KotlinNullPointerException) e(new KotlinNullPointerException()));
    }

    public static void b() {
        throw ((NullPointerException) e(new NullPointerException()));
    }

    public static void a(String str) {
        throw ((NullPointerException) e(new NullPointerException(str)));
    }

    public static void c(String str) {
        throw ((UninitializedPropertyAccessException) e(new UninitializedPropertyAccessException(str)));
    }

    public static void d(String str) {
        c("lateinit property " + str + " has not been initialized");
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) e(new IllegalStateException(str + " must not be null")));
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) e(new NullPointerException(str + " must not be null")));
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            h(str);
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            f(str);
        }
    }

    private static void h(String str) {
        throw ((IllegalArgumentException) e(new IllegalArgumentException(e(str))));
    }

    private static void f(String str) {
        throw ((NullPointerException) e(new NullPointerException(e(str))));
    }

    private static String e(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C8632dsu.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean c(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    public static boolean c(Float f, Float f2) {
        return f != null ? !(f2 == null || f.floatValue() != f2.floatValue()) : f2 == null;
    }

    public static boolean b(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static void d() {
        b("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void b(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void a(int i, String str) {
        d();
    }

    private static <T extends Throwable> T e(T t) {
        return (T) a((Throwable) t, C8632dsu.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: o.dsu$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }
    }
}
