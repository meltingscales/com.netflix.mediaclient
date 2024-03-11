package kotlin;

import java.io.Serializable;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpM;
import o.drO;

/* loaded from: classes5.dex */
public final class UnsafeLazyImpl<T> implements InterfaceC8554dpx<T>, Serializable {
    private drO<? extends T> c;
    private Object e;

    public UnsafeLazyImpl(drO<? extends T> dro) {
        C8632dsu.c((Object) dro, "");
        this.c = dro;
        this.e = dpM.e;
    }

    @Override // o.InterfaceC8554dpx
    public T getValue() {
        if (this.e == dpM.e) {
            drO<? extends T> dro = this.c;
            C8632dsu.d(dro);
            this.e = dro.invoke();
            this.c = null;
        }
        return (T) this.e;
    }

    @Override // o.InterfaceC8554dpx
    public boolean isInitialized() {
        return this.e != dpM.e;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }
}
