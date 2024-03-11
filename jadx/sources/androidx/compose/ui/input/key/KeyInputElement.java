package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {
    private final drM<KeyEvent, Boolean> onKeyEvent;
    private final drM<KeyEvent, Boolean> onPreKeyEvent;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            KeyInputElement keyInputElement = (KeyInputElement) obj;
            return C8632dsu.c(this.onKeyEvent, keyInputElement.onKeyEvent) && C8632dsu.c(this.onPreKeyEvent, keyInputElement.onPreKeyEvent);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        drM<KeyEvent, Boolean> drm = this.onKeyEvent;
        int hashCode = drm == null ? 0 : drm.hashCode();
        drM<KeyEvent, Boolean> drm2 = this.onPreKeyEvent;
        return (hashCode * 31) + (drm2 != null ? drm2.hashCode() : 0);
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(drM<? super KeyEvent, Boolean> drm, drM<? super KeyEvent, Boolean> drm2) {
        this.onKeyEvent = drm;
        this.onPreKeyEvent = drm2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public KeyInputNode create() {
        return new KeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(KeyInputNode keyInputNode) {
        keyInputNode.setOnEvent(this.onKeyEvent);
        keyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
