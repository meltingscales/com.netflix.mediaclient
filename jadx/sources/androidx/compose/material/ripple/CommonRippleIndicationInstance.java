package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Map;
import o.C8627dsp;
import o.C8737dwr;
import o.dwU;

/* loaded from: classes.dex */
public final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z, float f, State state, State state2, C8627dsp c8627dsp) {
        this(z, f, state, state2);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    private CommonRippleIndicationInstance(boolean z, float f, State<Color> state, State<RippleAlpha> state2) {
        super(z, state2);
        this.bounded = z;
        this.radius = f;
        this.color = state;
        this.rippleAlpha = state2;
        this.ripples = SnapshotStateKt.mutableStateMapOf();
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) {
        long m1302unboximpl = this.color.getValue().m1302unboximpl();
        contentDrawScope.drawContent();
        m709drawStateLayerH2RKhps(contentDrawScope, this.radius, m1302unboximpl);
        m700drawRipples4WTKRHQ(contentDrawScope, m1302unboximpl);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press press, dwU dwu) {
        for (Map.Entry<PressInteraction.Press, RippleAnimation> entry : this.ripples.entrySet()) {
            entry.getValue().finish();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.bounded ? Offset.m1126boximpl(press.m222getPressPositionF1C5BW0()) : null, this.radius, this.bounded, null);
        this.ripples.put(press, rippleAnimation);
        C8737dwr.c(dwu, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, press, null), 3, null);
    }

    /* renamed from: drawRipples-4WTKRHQ  reason: not valid java name */
    private final void m700drawRipples4WTKRHQ(DrawScope drawScope, long j) {
        for (Map.Entry<PressInteraction.Press, RippleAnimation> entry : this.ripples.entrySet()) {
            RippleAnimation value = entry.getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha != 0.0f) {
                value.m703draw4WTKRHQ(drawScope, Color.m1292copywmQWz5c$default(j, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }
}
