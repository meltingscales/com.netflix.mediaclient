package o;

import java.lang.reflect.Method;
import java.util.regex.MatchResult;
import kotlin.random.Random;

/* renamed from: o.dro  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8599dro {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dro$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static final a a = new a();
        public static final Method c;
        public static final Method d;

        private a() {
        }

        static {
            Method method;
            Method method2;
            Object z;
            Method[] methods = Throwable.class.getMethods();
            C8632dsu.d(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (C8632dsu.c((Object) method2.getName(), (Object) "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    C8632dsu.a(parameterTypes, "");
                    z = C8563dqf.z(parameterTypes);
                    if (C8632dsu.c(z, Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            d = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (C8632dsu.c((Object) method3.getName(), (Object) "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            c = method;
        }
    }

    public void c(Throwable th, Throwable th2) {
        C8632dsu.c((Object) th, "");
        C8632dsu.c((Object) th2, "");
        Method method = a.d;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        r3 = o.C8564dqg.p((java.lang.Throwable[]) r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.Throwable> e(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            java.lang.reflect.Method r0 = o.C8599dro.a.c
            if (r0 == 0) goto L1a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L1a
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = o.C8561dqd.e(r3)
            if (r3 != 0) goto L1e
        L1a:
            java.util.List r3 = o.C8570dqm.c()
        L1e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8599dro.e(java.lang.Throwable):java.util.List");
    }

    public C8671duf c(MatchResult matchResult, String str) {
        C8632dsu.c((Object) matchResult, "");
        C8632dsu.c((Object) str, "");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public Random e() {
        return new dsX();
    }
}
