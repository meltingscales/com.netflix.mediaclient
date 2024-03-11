package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import o.dpD;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ModifierLocalScrollableContainerProvider extends Modifier.Node implements ModifierLocalModifierNode {
    private boolean enabled;
    private final ModifierLocalMap modifierLocalMap = ModifierLocalModifierNodeKt.modifierLocalMapOf(dpD.a(ScrollableKt.getModifierLocalScrollableContainer(), Boolean.TRUE));

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public ModifierLocalScrollableContainerProvider(boolean z) {
        this.enabled = z;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.enabled ? this.modifierLocalMap : ModifierLocalModifierNodeKt.modifierLocalMapOf();
    }
}
