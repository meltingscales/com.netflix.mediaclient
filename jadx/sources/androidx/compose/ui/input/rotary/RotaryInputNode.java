package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import o.drM;

/* loaded from: classes.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {
    private drM<? super RotaryScrollEvent, Boolean> onEvent;
    private drM<? super RotaryScrollEvent, Boolean> onPreEvent;

    public final void setOnEvent(drM<? super RotaryScrollEvent, Boolean> drm) {
        this.onEvent = drm;
    }

    public final void setOnPreEvent(drM<? super RotaryScrollEvent, Boolean> drm) {
        this.onPreEvent = drm;
    }

    public RotaryInputNode(drM<? super RotaryScrollEvent, Boolean> drm, drM<? super RotaryScrollEvent, Boolean> drm2) {
        this.onEvent = drm;
        this.onPreEvent = drm2;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        drM<? super RotaryScrollEvent, Boolean> drm = this.onEvent;
        if (drm != null) {
            return drm.invoke(rotaryScrollEvent).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        drM<? super RotaryScrollEvent, Boolean> drm = this.onPreEvent;
        if (drm != null) {
            return drm.invoke(rotaryScrollEvent).booleanValue();
        }
        return false;
    }
}
