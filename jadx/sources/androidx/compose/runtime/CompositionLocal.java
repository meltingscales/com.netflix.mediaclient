package androidx.compose.runtime;

import o.C8627dsp;
import o.drO;

/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    private final LazyValueHolder<T> defaultValueHolder;

    public /* synthetic */ CompositionLocal(drO dro, C8627dsp c8627dsp) {
        this(dro);
    }

    public final LazyValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    public abstract State<T> updatedStateOf$runtime_release(T t, State<? extends T> state);

    private CompositionLocal(drO<? extends T> dro) {
        this.defaultValueHolder = new LazyValueHolder<>(dro);
    }
}
