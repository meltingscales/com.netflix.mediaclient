package o;

import app.cash.sqldelight.BaseTransacterImpl;
import o.InterfaceC9092j;

/* renamed from: o.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8933g extends BaseTransacterImpl implements InterfaceC9092j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8933g(InterfaceC9569s interfaceC9569s) {
        super(interfaceC9569s);
        C8632dsu.c((Object) interfaceC9569s, "");
    }

    @Override // o.InterfaceC9092j
    public <R> R a(boolean z, drM<? super InterfaceC9251m<R>, ? extends R> drm) {
        C8632dsu.c((Object) drm, "");
        return (R) b(z, drm);
    }

    private final <R> R b(boolean z, drM<? super C9304n<R>, ? extends R> drm) {
        R r;
        InterfaceC9092j.b d = getDriver().a().d();
        InterfaceC9092j.b d2 = d.d();
        if (d2 != null && z) {
            throw new IllegalStateException("Already in a transaction".toString());
        }
        Throwable th = null;
        try {
            d.a(this);
            r = drm.invoke(new C9304n(d));
            try {
                d.d(true);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            r = null;
            th = th3;
        }
        d.c();
        return (R) postTransactionCleanup(d, d2, th, r);
    }
}
