package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class AspectRatioElement extends ModifierNodeElement<AspectRatioNode> {
    private final float aspectRatio;
    private final drM<InspectorInfo, dpR> inspectorInfo;
    private final boolean matchHeightConstraintsFirst;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f, boolean z, drM<? super InspectorInfo, dpR> drm) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
        this.inspectorInfo = drm;
        if (f > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AspectRatioNode create() {
        return new AspectRatioNode(this.aspectRatio, this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AspectRatioNode aspectRatioNode) {
        aspectRatioNode.setAspectRatio(this.aspectRatio);
        aspectRatioNode.setMatchHeightConstraintsFirst(this.matchHeightConstraintsFirst);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        return this.aspectRatio == aspectRatioElement.aspectRatio && this.matchHeightConstraintsFirst == ((AspectRatioElement) obj).matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }
}
