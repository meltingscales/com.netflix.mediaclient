package androidx.compose.foundation.relocation;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import o.drO;

/* loaded from: classes.dex */
public final class BringIntoViewKt {
    private static final ProvidableModifierLocal<BringIntoViewParent> ModifierLocalBringIntoViewParent = ModifierLocalKt.modifierLocalOf(new drO<BringIntoViewParent>() { // from class: androidx.compose.foundation.relocation.BringIntoViewKt$ModifierLocalBringIntoViewParent$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final BringIntoViewParent invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal<BringIntoViewParent> getModifierLocalBringIntoViewParent() {
        return ModifierLocalBringIntoViewParent;
    }
}
