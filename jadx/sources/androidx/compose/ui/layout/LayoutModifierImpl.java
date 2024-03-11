package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import o.InterfaceC8612dsa;

/* loaded from: classes.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    private InterfaceC8612dsa<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    public final void setMeasureBlock(InterfaceC8612dsa<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> interfaceC8612dsa) {
        this.measureBlock = interfaceC8612dsa;
    }

    public LayoutModifierImpl(InterfaceC8612dsa<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> interfaceC8612dsa) {
        this.measureBlock = interfaceC8612dsa;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        return this.measureBlock.invoke(measureScope, measurable, Constraints.m2461boximpl(j));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
