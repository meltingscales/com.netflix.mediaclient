package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {
    private final drM<InspectorInfo, dpR> inspectorInfo;
    private final boolean rtlAware;
    private final float x;
    private final float y;

    public /* synthetic */ OffsetElement(float f, float f2, boolean z, drM drm, C8627dsp c8627dsp) {
        this(f, f2, z, drm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetElement(float f, float f2, boolean z, drM<? super InspectorInfo, dpR> drm) {
        this.x = f;
        this.y = f2;
        this.rtlAware = z;
        this.inspectorInfo = drm;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OffsetNode create() {
        return new OffsetNode(this.x, this.y, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OffsetNode offsetNode) {
        offsetNode.m257setX0680j_4(this.x);
        offsetNode.m258setY0680j_4(this.y);
        offsetNode.setRtlAware(this.rtlAware);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return Dp.m2494equalsimpl0(this.x, offsetElement.x) && Dp.m2494equalsimpl0(this.y, offsetElement.y) && this.rtlAware == offsetElement.rtlAware;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.x);
        return (((m2495hashCodeimpl * 31) + Dp.m2495hashCodeimpl(this.y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) Dp.m2496toStringimpl(this.x)) + ", y=" + ((Object) Dp.m2496toStringimpl(this.y)) + ", rtlAware=" + this.rtlAware + ')';
    }
}
