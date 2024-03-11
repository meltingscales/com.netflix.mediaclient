package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.IntSize;
import o.C8632dsu;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
final class SizeAnimationModifierElement extends ModifierNodeElement<SizeAnimationModifierNode> {
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final drX<IntSize, IntSize, dpR> finishedListener;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SizeAnimationModifierElement) {
            SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
            return C8632dsu.c(this.animationSpec, sizeAnimationModifierElement.animationSpec) && C8632dsu.c(this.finishedListener, sizeAnimationModifierElement.finishedListener);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.animationSpec.hashCode();
        drX<IntSize, IntSize, dpR> drx = this.finishedListener;
        return (hashCode * 31) + (drx == null ? 0 : drx.hashCode());
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", finishedListener=" + this.finishedListener + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SizeAnimationModifierElement(FiniteAnimationSpec<IntSize> finiteAnimationSpec, drX<? super IntSize, ? super IntSize, dpR> drx) {
        this.animationSpec = finiteAnimationSpec;
        this.finishedListener = drx;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SizeAnimationModifierNode create() {
        return new SizeAnimationModifierNode(this.animationSpec, this.finishedListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SizeAnimationModifierNode sizeAnimationModifierNode) {
        sizeAnimationModifierNode.setAnimationSpec(this.animationSpec);
        sizeAnimationModifierNode.setListener(this.finishedListener);
    }
}
