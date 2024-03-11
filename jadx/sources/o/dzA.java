package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dzA extends dzF<C8821dzu<?>> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(dzA.class, Object.class, "_state");
    private volatile Object _state;

    @Override // o.dzF
    /* renamed from: d */
    public boolean e(C8821dzu<?> c8821dzu) {
        dAH dah;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        dah = dzB.c;
        atomicReferenceFieldUpdater.set(this, dah);
        return true;
    }

    @Override // o.dzF
    public InterfaceC8585dra<dpR>[] a(C8821dzu<?> c8821dzu) {
        a.set(this, null);
        return dzG.e;
    }

    public final void e() {
        dAH dah;
        dAH dah2;
        dAH dah3;
        dAH dah4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            dah = dzB.a;
            if (obj == dah) {
                return;
            }
            dah2 = dzB.c;
            if (obj == dah2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                dah3 = dzB.a;
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, obj, dah3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a;
                dah4 = dzB.c;
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater3, this, obj, dah4)) {
                    Result.c cVar = Result.e;
                    ((C8741dwv) obj).resumeWith(Result.e(dpR.c));
                    return;
                }
            }
        }
    }

    public final boolean a() {
        dAH dah;
        dAH dah2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        dah = dzB.c;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, dah);
        C8632dsu.d(andSet);
        dah2 = dzB.a;
        return andSet == dah2;
    }

    public final Object a(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b;
        dAH dah;
        Object e;
        Object e2;
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        dah = dzB.c;
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, dah, c8741dwv)) {
            Result.c cVar = Result.e;
            c8741dwv.resumeWith(Result.e(dpR.c));
        }
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        e2 = C8586drb.e();
        return b2 == e2 ? b2 : dpR.c;
    }
}
