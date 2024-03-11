package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class ProvidedValue<T> {
    public static final int $stable = 0;
    private final boolean canOverride;
    private final CompositionLocal<T> compositionLocal;
    private final T value;

    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    public final T getValue() {
        return this.value;
    }

    public ProvidedValue(CompositionLocal<T> compositionLocal, T t, boolean z) {
        this.compositionLocal = compositionLocal;
        this.value = t;
        this.canOverride = z;
    }
}
