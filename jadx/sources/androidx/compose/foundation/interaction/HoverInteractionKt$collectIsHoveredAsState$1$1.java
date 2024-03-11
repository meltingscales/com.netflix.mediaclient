package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* loaded from: classes.dex */
final class HoverInteractionKt$collectIsHoveredAsState$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MutableState<Boolean> $isHovered;
    final /* synthetic */ InteractionSource $this_collectIsHoveredAsState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverInteractionKt$collectIsHoveredAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, InterfaceC8585dra<? super HoverInteractionKt$collectIsHoveredAsState$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$this_collectIsHoveredAsState = interactionSource;
        this.$isHovered = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new HoverInteractionKt$collectIsHoveredAsState$1$1(this.$this_collectIsHoveredAsState, this.$isHovered, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((HoverInteractionKt$collectIsHoveredAsState$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final ArrayList arrayList = new ArrayList();
            dyS<Interaction> interactions = this.$this_collectIsHoveredAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isHovered;
            dyQ<? super Interaction> dyq = new dyQ() { // from class: androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1.1
                @Override // o.dyQ
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC8585dra interfaceC8585dra) {
                    return emit((Interaction) obj2, (InterfaceC8585dra<? super dpR>) interfaceC8585dra);
                }

                public final Object emit(Interaction interaction, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    }
                    mutableState.setValue(C8589dre.e(!arrayList.isEmpty()));
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
