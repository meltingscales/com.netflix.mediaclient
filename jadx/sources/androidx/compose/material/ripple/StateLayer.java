package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import o.C8576dqs;
import o.C8632dsu;
import o.C8737dwr;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class StateLayer {
    private final boolean bounded;
    private Interaction currentInteraction;
    private final State<RippleAlpha> rippleAlpha;
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z, State<RippleAlpha> state) {
        this.bounded = z;
        this.rippleAlpha = state;
    }

    public final void handleInteraction(Interaction interaction, dwU dwu) {
        Object D;
        float draggedAlpha;
        boolean z = interaction instanceof HoverInteraction.Enter;
        if (z) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        }
        D = C8576dqs.D((List<? extends Object>) this.interactions);
        Interaction interaction2 = (Interaction) D;
        if (C8632dsu.c(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            if (z) {
                draggedAlpha = this.rippleAlpha.getValue().getHoveredAlpha();
            } else if (interaction instanceof FocusInteraction.Focus) {
                draggedAlpha = this.rippleAlpha.getValue().getFocusedAlpha();
            } else {
                draggedAlpha = interaction instanceof DragInteraction.Start ? this.rippleAlpha.getValue().getDraggedAlpha() : 0.0f;
            }
            C8737dwr.c(dwu, null, null, new StateLayer$handleInteraction$1(this, draggedAlpha, RippleKt.access$incomingStateLayerAnimationSpecFor(interaction2), null), 3, null);
        } else {
            C8737dwr.c(dwu, null, null, new StateLayer$handleInteraction$2(this, RippleKt.access$outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = interaction2;
    }

    /* renamed from: drawStateLayer-H2RKhps  reason: not valid java name */
    public final void m713drawStateLayerH2RKhps(DrawScope drawScope, float f, long j) {
        float mo193toPx0680j_4;
        if (Float.isNaN(f)) {
            mo193toPx0680j_4 = RippleAnimationKt.m704getRippleEndRadiuscSwnlzA(drawScope, this.bounded, drawScope.mo1562getSizeNHjbRc());
        } else {
            mo193toPx0680j_4 = drawScope.mo193toPx0680j_4(f);
        }
        float f2 = mo193toPx0680j_4;
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue > 0.0f) {
            long m1292copywmQWz5c$default = Color.m1292copywmQWz5c$default(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.bounded) {
                DrawScope.m1547drawCircleVaOC9Bg$default(drawScope, m1292copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float m1176getWidthimpl = Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc());
            float m1174getHeightimpl = Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc());
            int m1283getIntersectrtfAjoo = ClipOp.Companion.m1283getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo1541clipRectN_I0leg(0.0f, 0.0f, m1176getWidthimpl, m1174getHeightimpl, m1283getIntersectrtfAjoo);
            DrawScope.m1547drawCircleVaOC9Bg$default(drawScope, m1292copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
            drawContext.getCanvas().restore();
            drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
        }
    }
}
