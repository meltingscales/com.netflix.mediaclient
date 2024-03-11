package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import o.drM;

/* loaded from: classes.dex */
final class KeyInputNode extends Modifier.Node implements KeyInputModifierNode {
    private drM<? super KeyEvent, Boolean> onEvent;
    private drM<? super KeyEvent, Boolean> onPreEvent;

    public final void setOnEvent(drM<? super KeyEvent, Boolean> drm) {
        this.onEvent = drm;
    }

    public final void setOnPreEvent(drM<? super KeyEvent, Boolean> drm) {
        this.onPreEvent = drm;
    }

    public KeyInputNode(drM<? super KeyEvent, Boolean> drm, drM<? super KeyEvent, Boolean> drm2) {
        this.onEvent = drm;
        this.onPreEvent = drm2;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo92onKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        drM<? super KeyEvent, Boolean> drm = this.onEvent;
        if (drm != null) {
            return drm.invoke(KeyEvent.m1644boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo94onPreKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        drM<? super KeyEvent, Boolean> drm = this.onPreEvent;
        if (drm != null) {
            return drm.invoke(KeyEvent.m1644boximpl(keyEvent)).booleanValue();
        }
        return false;
    }
}
