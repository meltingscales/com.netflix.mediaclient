package o;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class dHR {
    public static final c e = new c(null);
    private final Method a;
    private final Method b;
    private final Method c;

    public dHR(Method method, Method method2, Method method3) {
        this.a = method;
        this.c = method2;
        this.b = method3;
    }

    public final Object d(String str) {
        C8632dsu.d((Object) str, "");
        Method method = this.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.c;
                if (method2 == null) {
                    C8632dsu.e();
                }
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            try {
                Method method = this.b;
                if (method == null) {
                    C8632dsu.e();
                }
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final dHR c() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new dHR(method, method3, method2);
        }
    }
}
