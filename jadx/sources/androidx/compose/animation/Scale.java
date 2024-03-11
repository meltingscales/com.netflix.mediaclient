package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.TransformOrigin;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class Scale {
    private final FiniteAnimationSpec<Float> animationSpec;
    private final float scale;
    private final long transformOrigin;

    public /* synthetic */ Scale(float f, long j, FiniteAnimationSpec finiteAnimationSpec, C8627dsp c8627dsp) {
        this(f, j, finiteAnimationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scale) {
            Scale scale = (Scale) obj;
            return Float.compare(this.scale, scale.scale) == 0 && TransformOrigin.m1474equalsimpl0(this.transformOrigin, scale.transformOrigin) && C8632dsu.c(this.animationSpec, scale.animationSpec);
        }
        return false;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ  reason: not valid java name */
    public final long m45getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return (((Float.hashCode(this.scale) * 31) + TransformOrigin.m1477hashCodeimpl(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) TransformOrigin.m1478toStringimpl(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }

    private Scale(float f, long j, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.scale = f;
        this.transformOrigin = j;
        this.animationSpec = finiteAnimationSpec;
    }
}
