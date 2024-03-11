package androidx.compose.animation.core;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f) {
        return new AnimationVector1D(f);
    }

    public static final AnimationVector2D AnimationVector(float f, float f2) {
        return new AnimationVector2D(f, f2);
    }

    public static final AnimationVector3D AnimationVector(float f, float f2, float f3) {
        return new AnimationVector3D(f, f2, f3);
    }

    public static final AnimationVector4D AnimationVector(float f, float f2, float f3, float f4) {
        return new AnimationVector4D(f, f2, f3, f4);
    }

    public static final <T extends AnimationVector> T newInstance(T t) {
        T t2 = (T) t.newVector$animation_core_release();
        C8632dsu.d(t2);
        return t2;
    }

    public static final <T extends AnimationVector> T copy(T t) {
        T t2 = (T) newInstance(t);
        int size$animation_core_release = t2.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            t2.set$animation_core_release(i, t.get$animation_core_release(i));
        }
        return t2;
    }

    public static final <T extends AnimationVector> void copyFrom(T t, T t2) {
        int size$animation_core_release = t.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            t.set$animation_core_release(i, t2.get$animation_core_release(i));
        }
    }
}
