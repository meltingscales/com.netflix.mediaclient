package kotlin;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpM;
import o.drO;

/* loaded from: classes5.dex */
public final class SafePublicationLazyImpl<T> implements InterfaceC8554dpx<T>, Serializable {
    private volatile drO<? extends T> b;
    private volatile Object c;
    private final Object d;
    public static final c e = new c(null);
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> a = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "c");

    public SafePublicationLazyImpl(drO<? extends T> dro) {
        C8632dsu.c((Object) dro, "");
        this.b = dro;
        dpM dpm = dpM.e;
        this.c = dpm;
        this.d = dpm;
    }

    @Override // o.InterfaceC8554dpx
    public T getValue() {
        T t = (T) this.c;
        dpM dpm = dpM.e;
        if (t != dpm) {
            return t;
        }
        drO<? extends T> dro = this.b;
        if (dro != null) {
            T invoke = dro.invoke();
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(a, this, dpm, invoke)) {
                this.b = null;
                return invoke;
            }
        }
        return (T) this.c;
    }

    @Override // o.InterfaceC8554dpx
    public boolean isInitialized() {
        return this.c != dpM.e;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
