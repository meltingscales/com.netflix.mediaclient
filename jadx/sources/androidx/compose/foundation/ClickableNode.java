package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.semantics.Role;
import o.C8627dsp;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
final class ClickableNode extends AbstractClickableNode {
    private final ClickablePointerInputNode clickablePointerInputNode;
    private final ClickableSemanticsNode clickableSemanticsNode;

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, drO dro, C8627dsp c8627dsp) {
        this(mutableInteractionSource, z, str, role, dro);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public ClickablePointerInputNode getClickablePointerInputNode() {
        return this.clickablePointerInputNode;
    }

    public ClickableSemanticsNode getClickableSemanticsNode() {
        return this.clickableSemanticsNode;
    }

    private ClickableNode(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, drO<dpR> dro) {
        super(mutableInteractionSource, z, str, role, dro, null);
        this.clickableSemanticsNode = (ClickableSemanticsNode) delegate(new ClickableSemanticsNode(z, str, role, dro, null, null, null));
        this.clickablePointerInputNode = (ClickablePointerInputNode) delegate(new ClickablePointerInputNode(z, mutableInteractionSource, dro, getInteractionData()));
    }

    /* renamed from: update-XHw0xAI  reason: not valid java name */
    public final void m132updateXHw0xAI(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, drO<dpR> dro) {
        m95updateCommonXHw0xAI(mutableInteractionSource, z, str, role, dro);
        getClickableSemanticsNode().m135updateUMe6uN4(z, str, role, dro, null, null);
        getClickablePointerInputNode().update(z, mutableInteractionSource, dro);
    }
}
