package androidx.compose.runtime;

import o.C8632dsu;
import o.drO;

/* loaded from: classes.dex */
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public StaticProvidableCompositionLocal(drO<? extends T> dro) {
        super(dro);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    public State<T> updatedStateOf$runtime_release(T t, State<? extends T> state) {
        return (state == 0 || !C8632dsu.c(state.getValue(), t)) ? new StaticValueHolder(t) : state;
    }
}
