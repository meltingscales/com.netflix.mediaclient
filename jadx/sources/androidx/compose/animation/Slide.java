package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class Slide {
    private final FiniteAnimationSpec<IntOffset> animationSpec;
    private final drM<IntSize, IntOffset> slideOffset;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Slide) {
            Slide slide = (Slide) obj;
            return C8632dsu.c(this.slideOffset, slide.slideOffset) && C8632dsu.c(this.animationSpec, slide.animationSpec);
        }
        return false;
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    public final drM<IntSize, IntOffset> getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(drM<? super IntSize, IntOffset> drm, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.slideOffset = drm;
        this.animationSpec = finiteAnimationSpec;
    }
}
