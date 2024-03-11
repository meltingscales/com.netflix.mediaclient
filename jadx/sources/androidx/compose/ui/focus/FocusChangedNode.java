package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    private FocusState focusState;
    private drM<? super FocusState, dpR> onFocusChanged;

    public final void setOnFocusChanged(drM<? super FocusState, dpR> drm) {
        this.onFocusChanged = drm;
    }

    public FocusChangedNode(drM<? super FocusState, dpR> drm) {
        this.onFocusChanged = drm;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (C8632dsu.c(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }
}
