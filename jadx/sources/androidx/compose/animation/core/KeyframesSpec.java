package androidx.compose.animation.core;

import androidx.collection.MutableIntObjectMap;
import java.util.LinkedHashMap;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    private final KeyframesSpecConfig<T> config;

    public KeyframesSpec(KeyframesSpecConfig<T> keyframesSpecConfig) {
        this.config = keyframesSpecConfig;
    }

    /* loaded from: classes.dex */
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public KeyframesSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity at(Object obj, int i) {
            return at((KeyframesSpecConfig<T>) obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core_release(Object obj) {
            return createEntityFor$animation_core_release((KeyframesSpecConfig<T>) obj);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> createEntityFor$animation_core_release(T t) {
            return new KeyframeEntity<>(t, null, 2, null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> at(T t, int i) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t, null, 2, null);
            getKeyframes$animation_core_release().set(i, keyframeEntity);
            return keyframeEntity;
        }
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MutableIntObjectMap<KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        int[] iArr = keyframes$animation_core_release.keys;
        Object[] objArr = keyframes$animation_core_release.values;
        long[] jArr = keyframes$animation_core_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            linkedHashMap.put(Integer.valueOf(iArr[i4]), ((KeyframeEntity) objArr[i4]).toPair$animation_core_release(twoWayConverter.getConvertToVector()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new VectorizedKeyframesSpec<>(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }

    /* loaded from: classes.dex */
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i, C8627dsp c8627dsp) {
            this(obj, (i & 2) != 0 ? EasingKt.getLinearEasing() : easing);
        }

        public KeyframeEntity(T t, Easing easing) {
            super(t, easing, null);
        }

        public boolean equals(Object obj) {
            if (obj instanceof KeyframeEntity) {
                KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
                if (C8632dsu.c(keyframeEntity.getValue$animation_core_release(), getValue$animation_core_release()) && C8632dsu.c(keyframeEntity.getEasing$animation_core_release(), getEasing$animation_core_release())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T value$animation_core_release = getValue$animation_core_release();
            return ((value$animation_core_release != null ? value$animation_core_release.hashCode() : 0) * 31) + getEasing$animation_core_release().hashCode();
        }
    }
}
