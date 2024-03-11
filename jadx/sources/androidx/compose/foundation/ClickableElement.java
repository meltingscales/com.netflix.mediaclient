package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
final class ClickableElement extends ModifierNodeElement<ClickableNode> {
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final drO<dpR> onClick;
    private final String onClickLabel;
    private final Role role;

    public /* synthetic */ ClickableElement(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, drO dro, C8627dsp c8627dsp) {
        this(mutableInteractionSource, z, str, role, dro);
    }

    private ClickableElement(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, drO<dpR> dro) {
        this.interactionSource = mutableInteractionSource;
        this.enabled = z;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = dro;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ClickableNode create() {
        return new ClickableNode(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ClickableNode clickableNode) {
        clickableNode.m132updateXHw0xAI(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ClickableElement.class == obj.getClass()) {
            ClickableElement clickableElement = (ClickableElement) obj;
            return C8632dsu.c(this.interactionSource, clickableElement.interactionSource) && this.enabled == clickableElement.enabled && C8632dsu.c((Object) this.onClickLabel, (Object) clickableElement.onClickLabel) && C8632dsu.c(this.role, clickableElement.role) && C8632dsu.c(this.onClick, clickableElement.onClick);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.interactionSource.hashCode();
        int hashCode2 = Boolean.hashCode(this.enabled);
        String str = this.onClickLabel;
        int hashCode3 = str != null ? str.hashCode() : 0;
        Role role = this.role;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (role != null ? Role.m2033hashCodeimpl(role.m2035unboximpl()) : 0)) * 31) + this.onClick.hashCode();
    }
}
