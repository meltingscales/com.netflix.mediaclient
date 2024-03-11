package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.dAl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7655dAl<T> extends AbstractC8754dxh<T> implements InterfaceC8594drj, InterfaceC8585dra<T> {
    private static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(C7655dAl.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final Object a;
    public Object c;
    public final dwQ d;
    public final InterfaceC8585dra<T> e;

    @Override // o.AbstractC8754dxh
    public InterfaceC8585dra<T> a() {
        return this;
    }

    @Override // o.InterfaceC8585dra
    public dqZ getContext() {
        return this.e.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7655dAl(dwQ dwq, InterfaceC8585dra<? super T> interfaceC8585dra) {
        super(-1);
        this.d = dwq;
        this.e = interfaceC8585dra;
        this.c = C7653dAj.b();
        this.a = dAO.c(getContext());
    }

    @Override // o.InterfaceC8594drj
    public InterfaceC8594drj getCallerFrame() {
        InterfaceC8585dra<T> interfaceC8585dra = this.e;
        if (interfaceC8585dra instanceof InterfaceC8594drj) {
            return (InterfaceC8594drj) interfaceC8585dra;
        }
        return null;
    }

    private final C8741dwv<?> h() {
        Object obj = i.get(this);
        if (obj instanceof C8741dwv) {
            return (C8741dwv) obj;
        }
        return null;
    }

    public final boolean b() {
        return i.get(this) != null;
    }

    public final void e() {
        do {
        } while (i.get(this) == C7653dAj.e);
    }

    public final void c() {
        e();
        C8741dwv<?> h = h();
        if (h != null) {
            h.c();
        }
    }

    public final C8741dwv<T> d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                i.set(this, C7653dAj.e);
                return null;
            } else if (obj instanceof C8741dwv) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(i, this, obj, C7653dAj.e)) {
                    return (C8741dwv) obj;
                }
            } else if (obj != C7653dAj.e && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final Throwable c(InterfaceC8743dwx<?> interfaceC8743dwx) {
        dAH dah;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            dah = C7653dAj.e;
            if (obj != dah) {
                if (obj instanceof Throwable) {
                    if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(i, this, obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    return (Throwable) obj;
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(i, this, dah, interfaceC8743dwx));
        return null;
    }

    public final boolean c(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            dAH dah = C7653dAj.e;
            if (C8632dsu.c(obj, dah)) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(i, this, dah, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // o.AbstractC8754dxh
    public Object o() {
        Object obj = this.c;
        this.c = C7653dAj.b();
        return obj;
    }

    @Override // o.InterfaceC8585dra
    public void resumeWith(Object obj) {
        dqZ context = this.e.getContext();
        Object d = dwN.d(obj, null, 1, null);
        if (this.d.isDispatchNeeded(context)) {
            this.c = d;
            this.b = 0;
            this.d.dispatch(context, this);
            return;
        }
        AbstractC8765dxs c = C8776dyc.a.c();
        if (c.d()) {
            this.c = d;
            this.b = 0;
            c.e(this);
            return;
        }
        c.d(true);
        try {
            dqZ context2 = getContext();
            Object c2 = dAO.c(context2, this.a);
            this.e.resumeWith(obj);
            dpR dpr = dpR.c;
            dAO.b(context2, c2);
            do {
            } while (c.i());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // o.AbstractC8754dxh
    public void b(Object obj, Throwable th) {
        if (obj instanceof dwK) {
            ((dwK) obj).a.invoke(th);
        }
    }

    public final void b(dqZ dqz, T t) {
        this.c = t;
        this.b = 1;
        this.d.dispatchYield(dqz, this);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.d + ", " + dwW.e(this.e) + ']';
    }
}
