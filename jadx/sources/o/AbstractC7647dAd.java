package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.AbstractC7647dAd;

/* renamed from: o.dAd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7647dAd<N extends AbstractC7647dAd<N>> {
    private volatile Object _next;
    private volatile Object _prev;
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(AbstractC7647dAd.class, Object.class, "_next");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(AbstractC7647dAd.class, Object.class, "_prev");

    public abstract boolean g();

    public AbstractC7647dAd(N n) {
        this._prev = n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return e.get(this);
    }

    public final boolean c(N n) {
        return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, null, n);
    }

    public final boolean j() {
        return b() == null;
    }

    public final N e() {
        return (N) d.get(this);
    }

    public final void c() {
        d.lazySet(this, null);
    }

    public final boolean i() {
        return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, null, C7650dAg.a());
    }

    public final void h() {
        Object obj;
        if (j()) {
            return;
        }
        while (true) {
            N a = a();
            N d2 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            do {
                obj = atomicReferenceFieldUpdater.get(d2);
            } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, d2, obj, ((AbstractC7647dAd) obj) == null ? null : a));
            if (a != null) {
                e.set(a, d2);
            }
            if (!d2.g() || d2.j()) {
                if (a == null || !a.g()) {
                    return;
                }
            }
        }
    }

    private final N a() {
        N e2 = e();
        while (e2 != null && e2.g()) {
            e2 = (N) d.get(e2);
        }
        return e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.dAd] */
    private final N d() {
        ?? b;
        N b2 = b();
        C8632dsu.d(b2);
        while (b2.g() && (b = b2.b()) != 0) {
            b2 = b;
        }
        return b2;
    }

    public final N b() {
        Object f = f();
        if (f == C7650dAg.a()) {
            return null;
        }
        return (N) f;
    }
}
