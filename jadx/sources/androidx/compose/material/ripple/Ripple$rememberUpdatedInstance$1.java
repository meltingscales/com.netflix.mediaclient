package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* loaded from: classes.dex */
final class Ripple$rememberUpdatedInstance$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ RippleIndicationInstance $instance;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, InterfaceC8585dra<? super Ripple$rememberUpdatedInstance$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$interactionSource = interactionSource;
        this.$instance = rippleIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, interfaceC8585dra);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((Ripple$rememberUpdatedInstance$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final dwU dwu = (dwU) this.L$0;
            dyS<Interaction> interactions = this.$interactionSource.getInteractions();
            final RippleIndicationInstance rippleIndicationInstance = this.$instance;
            dyQ<? super Interaction> dyq = new dyQ() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1.1
                @Override // o.dyQ
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC8585dra interfaceC8585dra) {
                    return emit((Interaction) obj2, (InterfaceC8585dra<? super dpR>) interfaceC8585dra);
                }

                public final Object emit(Interaction interaction, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    if (interaction instanceof PressInteraction.Press) {
                        RippleIndicationInstance.this.addRipple((PressInteraction.Press) interaction, dwu);
                    } else if (interaction instanceof PressInteraction.Release) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Cancel) interaction).getPress());
                    } else {
                        RippleIndicationInstance.this.updateStateLayer$material_ripple_release(interaction, dwu);
                    }
                    return dpR.c;
                }
            };
            this.label = 1;
            if (interactions.collect(dyq, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
