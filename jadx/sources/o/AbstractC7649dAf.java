package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.dAf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7649dAf<T> extends dAA {
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(AbstractC7649dAf.class, Object.class, "_consensus");
    private volatile Object _consensus = C7651dAh.a;

    public abstract Object a(T t);

    public abstract void e(T t, Object obj);

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C7651dAh.a;
        return obj2 != obj3 ? obj2 : AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dAA
    public final Object d(Object obj) {
        Object obj2 = c.get(this);
        if (obj2 == C7651dAh.a) {
            obj2 = c(a(obj));
        }
        e(obj, obj2);
        return obj2;
    }
}
