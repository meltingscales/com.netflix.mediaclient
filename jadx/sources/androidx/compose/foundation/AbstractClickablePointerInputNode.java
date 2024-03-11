package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import o.C8586drb;
import o.C8627dsp;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
abstract class AbstractClickablePointerInputNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode, PointerInputModifierNode {
    private final drO<Boolean> delayPressInteraction;
    private boolean enabled;
    private final AbstractClickableNode.InteractionData interactionData;
    private MutableInteractionSource interactionSource;
    private drO<dpR> onClick;
    private final SuspendingPointerInputModifierNode pointerInputNode;

    public /* synthetic */ AbstractClickablePointerInputNode(boolean z, MutableInteractionSource mutableInteractionSource, drO dro, AbstractClickableNode.InteractionData interactionData, C8627dsp c8627dsp) {
        this(z, mutableInteractionSource, dro, interactionData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractClickableNode.InteractionData getInteractionData() {
        return this.interactionData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final drO<dpR> getOnClick() {
        return this.onClick;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object pointerInput(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setOnClick(drO<dpR> dro) {
        this.onClick = dro;
    }

    private AbstractClickablePointerInputNode(boolean z, MutableInteractionSource mutableInteractionSource, drO<dpR> dro, AbstractClickableNode.InteractionData interactionData) {
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.onClick = dro;
        this.interactionData = interactionData;
        this.delayPressInteraction = new drO<Boolean>() { // from class: androidx.compose.foundation.AbstractClickablePointerInputNode$delayPressInteraction$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                return Boolean.valueOf(((Boolean) AbstractClickablePointerInputNode.this.getCurrent(ScrollableKt.getModifierLocalScrollableContainer())).booleanValue() || Clickable_androidKt.isComposeRootInScrollableContainer(AbstractClickablePointerInputNode.this));
            }
        };
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractClickablePointerInputNode$pointerInputNode$1(this, null)));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo93onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.pointerInputNode.mo93onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: handlePressInteraction-d-4ec7I  reason: not valid java name */
    public final Object m98handlePressInteractiond4ec7I(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            Object m126access$handlePressInteractionEPk0efs = ClickableKt.m126access$handlePressInteractionEPk0efs(pressGestureScope, j, mutableInteractionSource, this.interactionData, this.delayPressInteraction, interfaceC8585dra);
            e = C8586drb.e();
            if (m126access$handlePressInteractionEPk0efs == e) {
                return m126access$handlePressInteractionEPk0efs;
            }
        }
        return dpR.c;
    }
}
