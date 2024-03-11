package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
final class ClickablePointerInputNode extends AbstractClickablePointerInputNode {
    public ClickablePointerInputNode(boolean z, MutableInteractionSource mutableInteractionSource, drO<dpR> dro, AbstractClickableNode.InteractionData interactionData) {
        super(z, mutableInteractionSource, dro, interactionData, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    public Object pointerInput(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        AbstractClickableNode.InteractionData interactionData = getInteractionData();
        long m2552getCenterozmzZPI = IntSizeKt.m2552getCenterozmzZPI(pointerInputScope.mo1742getSizeYbymL2g());
        interactionData.m97setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m2533getXimpl(m2552getCenterozmzZPI), IntOffset.m2534getYimpl(m2552getCenterozmzZPI)));
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new ClickablePointerInputNode$pointerInput$2(this, null), new drM<Offset, dpR>() { // from class: androidx.compose.foundation.ClickablePointerInputNode$pointerInput$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Offset offset) {
                m134invokek4lQ0M(offset.m1146unboximpl());
                return dpR.c;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m134invokek4lQ0M(long j) {
                if (ClickablePointerInputNode.this.getEnabled()) {
                    ClickablePointerInputNode.this.getOnClick().invoke();
                }
            }
        }, interfaceC8585dra);
        e = C8586drb.e();
        return detectTapAndPress == e ? detectTapAndPress : dpR.c;
    }

    public final void update(boolean z, MutableInteractionSource mutableInteractionSource, drO<dpR> dro) {
        setEnabled(z);
        setOnClick(dro);
        setInteractionSource(mutableInteractionSource);
    }
}
