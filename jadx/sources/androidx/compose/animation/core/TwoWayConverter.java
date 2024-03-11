package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import o.drM;

/* loaded from: classes.dex */
public interface TwoWayConverter<T, V extends AnimationVector> {
    drM<V, T> getConvertFromVector();

    drM<T, V> getConvertToVector();
}
