package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ButtonElevation$animateElevation$2$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ ButtonElevation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2$1(Animatable<Dp, AnimationVector1D> animatable, float f, boolean z, ButtonElevation buttonElevation, Interaction interaction, InterfaceC8585dra<? super ButtonElevation$animateElevation$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$animatable = animatable;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = buttonElevation;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ButtonElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ButtonElevation$animateElevation$2$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        float f;
        float f2;
        float f3;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            if (!Dp.m2494equalsimpl0(this.$animatable.getTargetValue().m2498unboximpl(), this.$target)) {
                if (!this.$enabled) {
                    Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
                    Dp m2490boximpl = Dp.m2490boximpl(this.$target);
                    this.label = 1;
                    if (animatable.snapTo(m2490boximpl, this) == e) {
                        return e;
                    }
                } else {
                    float m2498unboximpl = this.$animatable.getTargetValue().m2498unboximpl();
                    f = this.this$0.pressedElevation;
                    Interaction interaction = null;
                    if (Dp.m2494equalsimpl0(m2498unboximpl, f)) {
                        interaction = new PressInteraction.Press(Offset.Companion.m1149getZeroF1C5BW0(), null);
                    } else {
                        f2 = this.this$0.hoveredElevation;
                        if (Dp.m2494equalsimpl0(m2498unboximpl, f2)) {
                            interaction = new HoverInteraction.Enter();
                        } else {
                            f3 = this.this$0.focusedElevation;
                            if (Dp.m2494equalsimpl0(m2498unboximpl, f3)) {
                                interaction = new FocusInteraction.Focus();
                            }
                        }
                    }
                    Animatable<Dp, AnimationVector1D> animatable2 = this.$animatable;
                    float f4 = this.$target;
                    Interaction interaction2 = this.$interaction;
                    this.label = 2;
                    if (ElevationKt.m785animateElevationrAjV9yQ(animatable2, f4, interaction, interaction2, this) == e) {
                        return e;
                    }
                }
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
