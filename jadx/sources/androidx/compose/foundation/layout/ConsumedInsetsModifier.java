package androidx.compose.foundation.layout;

import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ConsumedInsetsModifier implements ModifierLocalConsumer {
    private final drM<WindowInsets, dpR> block;
    private WindowInsets oldWindowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    public ConsumedInsetsModifier(drM<? super WindowInsets, dpR> drm) {
        this.block = drm;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsumedInsetsModifier) {
            return C8632dsu.c(((ConsumedInsetsModifier) obj).block, this.block);
        }
        return false;
    }

    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if (C8632dsu.c(windowInsets, this.oldWindowInsets)) {
            return;
        }
        this.oldWindowInsets = windowInsets;
        this.block.invoke(windowInsets);
    }
}
