package androidx.compose.runtime;

import o.drO;

/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public ProvidableCompositionLocal(drO<? extends T> dro) {
        super(dro, null);
    }

    public final ProvidedValue<T> provides(T t) {
        return new ProvidedValue<>(this, t, true);
    }

    public final ProvidedValue<T> providesDefault(T t) {
        return new ProvidedValue<>(this, t, false);
    }
}
