package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Constraints;
import o.C8632dsu;
import o.InterfaceC8612dsa;

/* loaded from: classes.dex */
final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {
    private final InterfaceC8612dsa<MeasureScope, Measurable, Constraints, MeasureResult> measure;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && C8632dsu.c(this.measure, ((LayoutElement) obj).measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    public String toString() {
        return "LayoutElement(measure=" + this.measure + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(InterfaceC8612dsa<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> interfaceC8612dsa) {
        this.measure = interfaceC8612dsa;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutModifierImpl layoutModifierImpl) {
        layoutModifierImpl.setMeasureBlock(this.measure);
    }
}
