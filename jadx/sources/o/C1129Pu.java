package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.Pu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129Pu extends C1045Mp {
    public static final int a;
    private static final Map<Class<AbstractC1127Ps<?>>, AbstractC1127Ps<?>> d;
    public static final C1129Pu e;

    private C1129Pu() {
        super("UserSessionDataManager");
    }

    static {
        C1129Pu c1129Pu = new C1129Pu();
        e = c1129Pu;
        d = new LinkedHashMap();
        c1129Pu.e(C1125Pq.d);
        a = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(AbstractC1127Ps<?> abstractC1127Ps) {
        d.put(abstractC1127Ps.getClass(), abstractC1127Ps);
    }

    public static final <T extends AbstractC1127Ps<?>> T b(Class<? super T> cls) {
        C8632dsu.c((Object) cls, "");
        T t = (T) d.get(cls);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Please register your data class in UserSessionDataManager.init block");
    }
}
