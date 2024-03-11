package androidx.compose.runtime;

import o.InterfaceC8554dpx;
import o.dpA;
import o.drO;

/* loaded from: classes.dex */
public final class LazyValueHolder<T> implements State<T> {
    private final InterfaceC8554dpx current$delegate;

    public LazyValueHolder(drO<? extends T> dro) {
        this.current$delegate = dpA.d(dro);
    }

    private final T getCurrent() {
        return (T) this.current$delegate.getValue();
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return getCurrent();
    }
}
