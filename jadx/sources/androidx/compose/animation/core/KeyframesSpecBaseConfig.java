package androidx.compose.animation.core;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {
    private int delayMillis;
    private int durationMillis;
    private final MutableIntObjectMap<E> keyframes;

    public /* synthetic */ KeyframesSpecBaseConfig(C8627dsp c8627dsp) {
        this();
    }

    public abstract E createEntityFor$animation_core_release(T t);

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final MutableIntObjectMap<E> getKeyframes$animation_core_release() {
        return this.keyframes;
    }

    public final void setDurationMillis(int i) {
        this.durationMillis = i;
    }

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        this.keyframes = IntObjectMapKt.mutableIntObjectMapOf();
    }

    public E at(T t, int i) {
        E createEntityFor$animation_core_release = createEntityFor$animation_core_release(t);
        this.keyframes.set(i, createEntityFor$animation_core_release);
        return createEntityFor$animation_core_release;
    }

    public final E using(E e, Easing easing) {
        e.setEasing$animation_core_release(easing);
        return e;
    }
}
