package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import o.drM;

/* loaded from: classes.dex */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {
    private final drM<V, T> convertFromVector;
    private final drM<T, V> convertToVector;

    @Override // androidx.compose.animation.core.TwoWayConverter
    public drM<V, T> getConvertFromVector() {
        return this.convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public drM<T, V> getConvertToVector() {
        return this.convertToVector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TwoWayConverterImpl(drM<? super T, ? extends V> drm, drM<? super V, ? extends T> drm2) {
        this.convertToVector = drm;
        this.convertFromVector = drm2;
    }
}
