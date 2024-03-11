package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes.dex */
public final class ElevationKt {
    private static final TweenSpec<Dp> DefaultIncomingSpec;
    private static final TweenSpec<Dp> DefaultOutgoingSpec;
    private static final TweenSpec<Dp> HoveredOutgoingSpec;
    private static final Easing OutgoingSpecEasing;

    /* renamed from: animateElevation-rAjV9yQ  reason: not valid java name */
    public static final Object m785animateElevationrAjV9yQ(Animatable<Dp, ?> animatable, float f, Interaction interaction, Interaction interaction2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        AnimationSpec<Dp> outgoingAnimationSpecForInteraction;
        Object e;
        Object e2;
        if (interaction2 != null) {
            outgoingAnimationSpecForInteraction = ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2);
        } else {
            outgoingAnimationSpecForInteraction = interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        }
        AnimationSpec<Dp> animationSpec = outgoingAnimationSpecForInteraction;
        if (animationSpec != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, Dp.m2490boximpl(f), animationSpec, null, null, interfaceC8585dra, 12, null);
            e2 = C8586drb.e();
            return animateTo$default == e2 ? animateTo$default : dpR.c;
        }
        Object snapTo = animatable.snapTo(Dp.m2490boximpl(f), interfaceC8585dra);
        e = C8586drb.e();
        return snapTo == e ? snapTo : dpR.c;
    }

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        OutgoingSpecEasing = cubicBezierEasing;
        DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        DefaultOutgoingSpec = new TweenSpec<>(150, 0, cubicBezierEasing, 2, null);
        HoveredOutgoingSpec = new TweenSpec<>(120, 0, cubicBezierEasing, 2, null);
    }
}
