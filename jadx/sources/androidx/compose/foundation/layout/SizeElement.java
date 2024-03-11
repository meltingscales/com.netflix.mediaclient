package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SizeElement extends ModifierNodeElement<SizeNode> {
    private final boolean enforceIncoming;
    private final drM<InspectorInfo, dpR> inspectorInfo;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, drM drm, C8627dsp c8627dsp) {
        this(f, f2, f3, f4, z, drm);
    }

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, drM drm, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? Dp.Companion.m2501getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.Companion.m2501getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? Dp.Companion.m2501getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? Dp.Companion.m2501getUnspecifiedD9Ej5fM() : f4, z, drm, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f, float f2, float f3, float f4, boolean z, drM<? super InspectorInfo, dpR> drm) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
        this.inspectorInfo = drm;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SizeNode create() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SizeNode sizeNode) {
        sizeNode.m307setMinWidth0680j_4(this.minWidth);
        sizeNode.m306setMinHeight0680j_4(this.minHeight);
        sizeNode.m305setMaxWidth0680j_4(this.maxWidth);
        sizeNode.m304setMaxHeight0680j_4(this.maxHeight);
        sizeNode.setEnforceIncoming(this.enforceIncoming);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SizeElement) {
            SizeElement sizeElement = (SizeElement) obj;
            return Dp.m2494equalsimpl0(this.minWidth, sizeElement.minWidth) && Dp.m2494equalsimpl0(this.minHeight, sizeElement.minHeight) && Dp.m2494equalsimpl0(this.maxWidth, sizeElement.maxWidth) && Dp.m2494equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.minWidth);
        int m2495hashCodeimpl2 = Dp.m2495hashCodeimpl(this.minHeight);
        int m2495hashCodeimpl3 = Dp.m2495hashCodeimpl(this.maxWidth);
        return (((((((m2495hashCodeimpl * 31) + m2495hashCodeimpl2) * 31) + m2495hashCodeimpl3) * 31) + Dp.m2495hashCodeimpl(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }
}
