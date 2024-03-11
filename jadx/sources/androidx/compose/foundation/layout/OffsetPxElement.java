package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {
    private final drM<InspectorInfo, dpR> inspectorInfo;
    private final drM<Density, IntOffset> offset;
    private final boolean rtlAware;

    /* JADX WARN: Multi-variable type inference failed */
    public OffsetPxElement(drM<? super Density, IntOffset> drm, boolean z, drM<? super InspectorInfo, dpR> drm2) {
        this.offset = drm;
        this.rtlAware = z;
        this.inspectorInfo = drm2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OffsetPxNode create() {
        return new OffsetPxNode(this.offset, this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OffsetPxNode offsetPxNode) {
        offsetPxNode.setOffset(this.offset);
        offsetPxNode.setRtlAware(this.rtlAware);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return C8632dsu.c(this.offset, offsetPxElement.offset) && this.rtlAware == offsetPxElement.rtlAware;
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=" + this.rtlAware + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.offset.hashCode() * 31) + Boolean.hashCode(this.rtlAware);
    }
}
