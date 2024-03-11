package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class Fade {
    private final float alpha;
    private final FiniteAnimationSpec<Float> animationSpec;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Fade) {
            Fade fade = (Fade) obj;
            return Float.compare(this.alpha, fade.alpha) == 0 && C8632dsu.c(this.animationSpec, fade.animationSpec);
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (Float.hashCode(this.alpha) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.alpha + ", animationSpec=" + this.animationSpec + ')';
    }

    public Fade(float f, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.alpha = f;
        this.animationSpec = finiteAnimationSpec;
    }
}
