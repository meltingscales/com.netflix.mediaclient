package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ClickableKt$handlePressInteraction$2$delayJob$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drO<Boolean> $delayPressInteraction;
    final /* synthetic */ AbstractClickableNode.InteractionData $interactionData;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2$delayJob$1(drO<Boolean> dro, long j, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, InterfaceC8585dra<? super ClickableKt$handlePressInteraction$2$delayJob$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$delayPressInteraction = dro;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$interactionData = interactionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        PressInteraction.Press press;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            if (this.$delayPressInteraction.invoke().booleanValue()) {
                long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
                this.label = 1;
                if (C8749dxc.b(tapIndicationDelay, this) == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            if (i == 2) {
                press = (PressInteraction.Press) this.L$0;
                C8556dpz.d(obj);
                this.$interactionData.setPressInteraction(press);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.$pressPoint, null);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        this.L$0 = press2;
        this.label = 2;
        if (mutableInteractionSource.emit(press2, this) == e) {
            return e;
        }
        press = press2;
        this.$interactionData.setPressInteraction(press);
        return dpR.c;
    }
}
