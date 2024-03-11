package androidx.compose.animation.core;

import kotlin.Pair;
import o.C8627dsp;
import o.dpD;
import o.drM;

/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {
    private Easing easing;
    private final T value;

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, C8627dsp c8627dsp) {
        this(obj, easing);
    }

    public final Easing getEasing$animation_core_release() {
        return this.easing;
    }

    public final T getValue$animation_core_release() {
        return this.value;
    }

    public final void setEasing$animation_core_release(Easing easing) {
        this.easing = easing;
    }

    private KeyframeBaseEntity(T t, Easing easing) {
        this.value = t;
        this.easing = easing;
    }

    public final <V extends AnimationVector> Pair<V, Easing> toPair$animation_core_release(drM<? super T, ? extends V> drm) {
        return dpD.a(drm.invoke((T) this.value), this.easing);
    }
}
