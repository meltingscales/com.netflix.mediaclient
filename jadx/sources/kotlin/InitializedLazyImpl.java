package kotlin;

import java.io.Serializable;
import o.InterfaceC8554dpx;

/* loaded from: classes6.dex */
public final class InitializedLazyImpl<T> implements InterfaceC8554dpx<T>, Serializable {
    private final T a;

    @Override // o.InterfaceC8554dpx
    public T getValue() {
        return this.a;
    }

    @Override // o.InterfaceC8554dpx
    public boolean isInitialized() {
        return true;
    }

    public InitializedLazyImpl(T t) {
        this.a = t;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
