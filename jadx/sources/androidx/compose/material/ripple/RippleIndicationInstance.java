package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import o.dwU;

/* loaded from: classes.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    private final StateLayer stateLayer;

    public abstract void addRipple(PressInteraction.Press press, dwU dwu);

    public abstract void removeRipple(PressInteraction.Press press);

    public RippleIndicationInstance(boolean z, State<RippleAlpha> state) {
        this.stateLayer = new StateLayer(z, state);
    }

    public final void updateStateLayer$material_ripple_release(Interaction interaction, dwU dwu) {
        this.stateLayer.handleInteraction(interaction, dwu);
    }

    /* renamed from: drawStateLayer-H2RKhps  reason: not valid java name */
    public final void m709drawStateLayerH2RKhps(DrawScope drawScope, float f, long j) {
        this.stateLayer.m713drawStateLayerH2RKhps(drawScope, f, j);
    }
}
