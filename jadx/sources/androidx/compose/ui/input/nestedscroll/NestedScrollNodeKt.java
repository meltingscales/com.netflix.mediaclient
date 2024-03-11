package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.DelegatableNode;
import o.drO;

/* loaded from: classes.dex */
public final class NestedScrollNodeKt {
    private static final ProvidableModifierLocal<NestedScrollNode> ModifierLocalNestedScroll = ModifierLocalKt.modifierLocalOf(new drO<NestedScrollNode>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$ModifierLocalNestedScroll$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final NestedScrollNode invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal<NestedScrollNode> getModifierLocalNestedScroll() {
        return ModifierLocalNestedScroll;
    }

    public static final DelegatableNode nestedScrollModifierNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}
