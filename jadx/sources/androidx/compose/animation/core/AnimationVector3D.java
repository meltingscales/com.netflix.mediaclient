package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class AnimationVector3D extends AnimationVector {
    private final int size;
    private float v1;
    private float v2;
    private float v3;

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return 0.0f;
                }
                return this.v3;
            }
            return this.v2;
        }
        return this.v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i, float f) {
        if (i == 0) {
            this.v1 = f;
        } else if (i == 1) {
            this.v2 = f;
        } else if (i != 2) {
        } else {
            this.v3 = f;
        }
    }

    public AnimationVector3D(float f, float f2, float f3) {
        super(null);
        this.v1 = f;
        this.v2 = f2;
        this.v3 = f3;
        this.size = 3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector3D newVector$animation_core_release() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector3D) {
            AnimationVector3D animationVector3D = (AnimationVector3D) obj;
            if (animationVector3D.v1 == this.v1 && animationVector3D.v2 == this.v2 && animationVector3D.v3 == this.v3) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3);
    }
}
