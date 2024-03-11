package o;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.drm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8597drm {
    private static c a;
    public static final C8597drm d = new C8597drm();
    private static final c c = new c(null, null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.drm$c */
    /* loaded from: classes5.dex */
    public static final class c {
        public final Method a;
        public final Method b;
        public final Method c;

        public c(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    private C8597drm() {
    }

    public final String b(BaseContinuationImpl baseContinuationImpl) {
        C8632dsu.c((Object) baseContinuationImpl, "");
        c cVar = a;
        if (cVar == null) {
            cVar = e(baseContinuationImpl);
        }
        if (cVar == c) {
            return null;
        }
        Method method = cVar.a;
        Object invoke = method != null ? method.invoke(baseContinuationImpl.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = cVar.b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = cVar.c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }

    private final c e(BaseContinuationImpl baseContinuationImpl) {
        try {
            c cVar = new c(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            a = cVar;
            return cVar;
        } catch (Exception unused) {
            c cVar2 = c;
            a = cVar2;
            return cVar2;
        }
    }
}
