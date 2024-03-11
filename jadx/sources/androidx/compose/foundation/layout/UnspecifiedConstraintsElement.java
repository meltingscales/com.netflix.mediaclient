package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsElement(float f, float f2, C8627dsp c8627dsp) {
        this(f, f2);
    }

    private UnspecifiedConstraintsElement(float f, float f2) {
        this.minWidth = f;
        this.minHeight = f2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public UnspecifiedConstraintsNode create() {
        return new UnspecifiedConstraintsNode(this.minWidth, this.minHeight, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(UnspecifiedConstraintsNode unspecifiedConstraintsNode) {
        unspecifiedConstraintsNode.m309setMinWidth0680j_4(this.minWidth);
        unspecifiedConstraintsNode.m308setMinHeight0680j_4(this.minHeight);
    }

    public boolean equals(Object obj) {
        if (obj instanceof UnspecifiedConstraintsElement) {
            UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
            return Dp.m2494equalsimpl0(this.minWidth, unspecifiedConstraintsElement.minWidth) && Dp.m2494equalsimpl0(this.minHeight, unspecifiedConstraintsElement.minHeight);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Dp.m2495hashCodeimpl(this.minWidth) * 31) + Dp.m2495hashCodeimpl(this.minHeight);
    }
}
