package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {
    private final drM<RotaryScrollEvent, Boolean> onPreRotaryScrollEvent;
    private final drM<RotaryScrollEvent, Boolean> onRotaryScrollEvent;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
            return C8632dsu.c(this.onRotaryScrollEvent, rotaryInputElement.onRotaryScrollEvent) && C8632dsu.c(this.onPreRotaryScrollEvent, rotaryInputElement.onPreRotaryScrollEvent);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        drM<RotaryScrollEvent, Boolean> drm = this.onRotaryScrollEvent;
        int hashCode = drm == null ? 0 : drm.hashCode();
        drM<RotaryScrollEvent, Boolean> drm2 = this.onPreRotaryScrollEvent;
        return (hashCode * 31) + (drm2 != null ? drm2.hashCode() : 0);
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.onRotaryScrollEvent + ", onPreRotaryScrollEvent=" + this.onPreRotaryScrollEvent + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(drM<? super RotaryScrollEvent, Boolean> drm, drM<? super RotaryScrollEvent, Boolean> drm2) {
        this.onRotaryScrollEvent = drm;
        this.onPreRotaryScrollEvent = drm2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RotaryInputNode create() {
        return new RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(RotaryInputNode rotaryInputNode) {
        rotaryInputNode.setOnEvent(this.onRotaryScrollEvent);
        rotaryInputNode.setOnPreEvent(this.onPreRotaryScrollEvent);
    }
}
