package o;

/* renamed from: o.dyc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8776dyc {
    public static final C8776dyc a = new C8776dyc();
    private static final ThreadLocal<AbstractC8765dxs> d = dAQ.b(new dAH("ThreadLocalEventLoop"));

    private C8776dyc() {
    }

    public final AbstractC8765dxs c() {
        ThreadLocal<AbstractC8765dxs> threadLocal = d;
        AbstractC8765dxs abstractC8765dxs = threadLocal.get();
        if (abstractC8765dxs == null) {
            AbstractC8765dxs a2 = C8764dxr.a();
            threadLocal.set(a2);
            return a2;
        }
        return abstractC8765dxs;
    }

    public final AbstractC8765dxs b() {
        return d.get();
    }

    public final void e() {
        d.set(null);
    }

    public final void d(AbstractC8765dxs abstractC8765dxs) {
        d.set(abstractC8765dxs);
    }
}
