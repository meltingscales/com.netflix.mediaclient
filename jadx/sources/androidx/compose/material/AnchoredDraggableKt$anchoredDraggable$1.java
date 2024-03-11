package androidx.compose.material;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class AnchoredDraggableKt$anchoredDraggable$1 extends SuspendLambda implements InterfaceC8612dsa<dwU, Float, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ AnchoredDraggableState<T> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$anchoredDraggable$1(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC8585dra<? super AnchoredDraggableKt$anchoredDraggable$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.$state = anchoredDraggableState;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(dwU dwu, Float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke(dwu, f.floatValue(), interfaceC8585dra);
    }

    public final Object invoke(dwU dwu, float f, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        AnchoredDraggableKt$anchoredDraggable$1 anchoredDraggableKt$anchoredDraggable$1 = new AnchoredDraggableKt$anchoredDraggable$1(this.$state, interfaceC8585dra);
        anchoredDraggableKt$anchoredDraggable$1.L$0 = dwu;
        anchoredDraggableKt$anchoredDraggable$1.F$0 = f;
        return anchoredDraggableKt$anchoredDraggable$1.invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, float f, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$state = anchoredDraggableState;
            this.$velocity = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.$state, this.$velocity, interfaceC8585dra);
        }

        @Override // o.drX
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                AnchoredDraggableState<T> anchoredDraggableState = this.$state;
                float f = this.$velocity;
                this.label = 1;
                if (anchoredDraggableState.settle(f, this) == e) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            C8737dwr.c((dwU) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
