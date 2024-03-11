package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.dxe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8751dxe<T> extends dAE<T> {
    private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C8751dxe.class, "_decision");
    private volatile int _decision;

    public C8751dxe(dqZ dqz, InterfaceC8585dra<? super T> interfaceC8585dra) {
        super(dqz, interfaceC8585dra);
    }

    private final boolean v() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!d.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean w() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!d.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // o.dAE, o.dxM
    public void b(Object obj) {
        a_(obj);
    }

    @Override // o.dAE, o.AbstractC8730dwk
    public void a_(Object obj) {
        InterfaceC8585dra b;
        if (w()) {
            return;
        }
        b = C8590drf.b(this.e);
        C7653dAj.c(b, dwN.e(obj, this.e), null, 2, null);
    }

    public final Object e() {
        Object e;
        if (v()) {
            e = C8586drb.e();
            return e;
        }
        Object d2 = dxJ.d(cy_());
        if (d2 instanceof dwO) {
            throw ((dwO) d2).a;
        }
        return d2;
    }
}
