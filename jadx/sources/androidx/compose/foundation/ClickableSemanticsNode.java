package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
final class ClickableSemanticsNode extends Modifier.Node implements SemanticsModifierNode {
    private boolean enabled;
    private drO<dpR> onClick;
    private String onClickLabel;
    private drO<dpR> onLongClick;
    private String onLongClickLabel;
    private Role role;

    public /* synthetic */ ClickableSemanticsNode(boolean z, String str, Role role, drO dro, String str2, drO dro2, C8627dsp c8627dsp) {
        this(z, str, role, dro, str2, dro2);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    /* renamed from: update-UMe6uN4  reason: not valid java name */
    public final void m135updateUMe6uN4(boolean z, String str, Role role, drO<dpR> dro, String str2, drO<dpR> dro2) {
        this.enabled = z;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = dro;
        this.onLongClickLabel = str2;
        this.onLongClick = dro2;
    }

    private ClickableSemanticsNode(boolean z, String str, Role role, drO<dpR> dro, String str2, drO<dpR> dro2) {
        this.enabled = z;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = dro;
        this.onLongClickLabel = str2;
        this.onLongClick = dro2;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            C8632dsu.d(role);
            SemanticsPropertiesKt.m2050setRolekuIjeqM(semanticsPropertyReceiver, role.m2035unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new drO<Boolean>() { // from class: androidx.compose.foundation.ClickableSemanticsNode$applySemantics$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                drO dro;
                dro = ClickableSemanticsNode.this.onClick;
                dro.invoke();
                return Boolean.TRUE;
            }
        });
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new drO<Boolean>() { // from class: androidx.compose.foundation.ClickableSemanticsNode$applySemantics$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final Boolean invoke() {
                    drO dro;
                    dro = ClickableSemanticsNode.this.onLongClick;
                    if (dro != null) {
                        dro.invoke();
                    }
                    return Boolean.TRUE;
                }
            });
        }
        if (this.enabled) {
            return;
        }
        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
    }
}
