package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.dAv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7665dAv<E> {
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(C7665dAv.class, Object.class, "_cur");
    private volatile Object _cur;

    public C7665dAv(boolean z) {
        this._cur = new C7662dAs(8, z);
    }

    public final int a() {
        return ((C7662dAs) d.get(this)).d();
    }

    public final void e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        while (true) {
            C7662dAs c7662dAs = (C7662dAs) atomicReferenceFieldUpdater.get(this);
            if (c7662dAs.b()) {
                return;
            }
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, this, c7662dAs, c7662dAs.a());
        }
    }

    public final boolean e(E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        while (true) {
            C7662dAs c7662dAs = (C7662dAs) atomicReferenceFieldUpdater.get(this);
            int a = c7662dAs.a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, this, c7662dAs, c7662dAs.a());
            } else if (a == 2) {
                return false;
            }
        }
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        while (true) {
            C7662dAs c7662dAs = (C7662dAs) atomicReferenceFieldUpdater.get(this);
            E e = (E) c7662dAs.c();
            if (e != C7662dAs.a) {
                return e;
            }
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, this, c7662dAs, c7662dAs.a());
        }
    }
}
