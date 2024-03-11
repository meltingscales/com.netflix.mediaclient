package kotlin;

import java.io.Serializable;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpM;
import o.drO;

/* loaded from: classes5.dex */
public final class SynchronizedLazyImpl<T> implements InterfaceC8554dpx<T>, Serializable {
    private drO<? extends T> c;
    private volatile Object d;
    private final Object e;

    public SynchronizedLazyImpl(drO<? extends T> dro, Object obj) {
        C8632dsu.c((Object) dro, "");
        this.c = dro;
        this.d = dpM.e;
        this.e = obj == null ? this : obj;
    }

    public /* synthetic */ SynchronizedLazyImpl(drO dro, Object obj, int i, C8627dsp c8627dsp) {
        this(dro, (i & 2) != 0 ? null : obj);
    }

    @Override // o.InterfaceC8554dpx
    public T getValue() {
        T t;
        T t2 = (T) this.d;
        dpM dpm = dpM.e;
        if (t2 != dpm) {
            return t2;
        }
        synchronized (this.e) {
            t = (T) this.d;
            if (t == dpm) {
                drO<? extends T> dro = this.c;
                C8632dsu.d(dro);
                t = dro.invoke();
                this.d = t;
                this.c = null;
            }
        }
        return t;
    }

    @Override // o.InterfaceC8554dpx
    public boolean isInitialized() {
        return this.d != dpM.e;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }
}
