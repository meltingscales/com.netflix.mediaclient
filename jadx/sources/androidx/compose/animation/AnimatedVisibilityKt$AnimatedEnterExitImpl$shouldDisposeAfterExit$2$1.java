package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dyQ;
import o.dyS;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends SuspendLambda implements drX<ProduceStateScope<Boolean>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ State<drX<EnterExitState, EnterExitState, Boolean>> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(Transition<EnterExitState> transition, State<? extends drX<? super EnterExitState, ? super EnterExitState, Boolean>> state, InterfaceC8585dra<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, interfaceC8585dra);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // o.drX
    public final Object invoke(ProduceStateScope<Boolean> produceStateScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create(produceStateScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            final Transition<EnterExitState> transition = this.$childTransition;
            dyS snapshotFlow = SnapshotStateKt.snapshotFlow(new drO<Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final Boolean invoke() {
                    boolean exitFinished;
                    exitFinished = AnimatedVisibilityKt.getExitFinished(transition);
                    return Boolean.valueOf(exitFinished);
                }
            });
            final Transition<EnterExitState> transition2 = this.$childTransition;
            final State<drX<EnterExitState, EnterExitState, Boolean>> state = this.$shouldDisposeBlockUpdated$delegate;
            dyQ dyq = new dyQ() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.2
                @Override // o.dyQ
                public /* synthetic */ Object emit(Object obj2, InterfaceC8585dra interfaceC8585dra) {
                    return emit(((Boolean) obj2).booleanValue(), interfaceC8585dra);
                }

                public final Object emit(boolean z, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    boolean z2;
                    drX AnimatedEnterExitImpl$lambda$4;
                    ProduceStateScope<Boolean> produceStateScope2 = produceStateScope;
                    if (z) {
                        AnimatedEnterExitImpl$lambda$4 = AnimatedVisibilityKt.AnimatedEnterExitImpl$lambda$4(state);
                        z2 = ((Boolean) AnimatedEnterExitImpl$lambda$4.invoke(transition2.getCurrentState(), transition2.getTargetState())).booleanValue();
                    } else {
                        z2 = false;
                    }
                    produceStateScope2.setValue(C8589dre.e(z2));
                    return dpR.c;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(dyq, this) == e) {
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
