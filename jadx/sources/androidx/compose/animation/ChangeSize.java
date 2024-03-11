package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public final class ChangeSize {
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;
    private final drM<IntSize, IntSize> size;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeSize) {
            ChangeSize changeSize = (ChangeSize) obj;
            return C8632dsu.c(this.alignment, changeSize.alignment) && C8632dsu.c(this.size, changeSize.size) && C8632dsu.c(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
        }
        return false;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final drM<IntSize, IntSize> getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31) + Boolean.hashCode(this.clip);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(Alignment alignment, drM<? super IntSize, IntSize> drm, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        this.alignment = alignment;
        this.size = drm;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z;
    }
}
