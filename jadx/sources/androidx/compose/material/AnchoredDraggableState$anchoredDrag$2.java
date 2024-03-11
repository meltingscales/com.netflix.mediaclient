package androidx.compose.material;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements drM<InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8612dsa<AnchoredDragScope, DraggableAnchors<T>, InterfaceC8585dra<? super dpR>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$anchoredDrag$2(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC8612dsa<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, InterfaceC8585dra<? super AnchoredDraggableState$anchoredDrag$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.this$0 = anchoredDraggableState;
        this.$block = interfaceC8612dsa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new AnchoredDraggableState$anchoredDrag$2(this.this$0, this.$block, interfaceC8585dra);
    }

    @Override // o.drM
    public final Object invoke(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AnchoredDraggableState$anchoredDrag$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2<T> extends SuspendLambda implements drX<DraggableAnchors<T>, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ InterfaceC8612dsa<AnchoredDragScope, DraggableAnchors<T>, InterfaceC8585dra<? super dpR>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(InterfaceC8612dsa<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, AnchoredDraggableState<T> anchoredDraggableState, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$block = interfaceC8612dsa;
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC8585dra);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(DraggableAnchors<T> draggableAnchors, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(draggableAnchors, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // o.drX
        public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return invoke((DraggableAnchors) ((DraggableAnchors) obj), interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            AnchoredDragScope anchoredDragScope;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                InterfaceC8612dsa<AnchoredDragScope, DraggableAnchors<T>, InterfaceC8585dra<? super dpR>, Object> interfaceC8612dsa = this.$block;
                anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                if (interfaceC8612dsa.invoke(anchoredDragScope, (DraggableAnchors) this.L$0, this) == e) {
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
        Object e;
        Object restartable;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            drO<DraggableAnchors<T>> dro = new drO<DraggableAnchors<T>>() { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public final DraggableAnchors<T> invoke() {
                    return anchoredDraggableState.getAnchors();
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
            this.label = 1;
            restartable = AnchoredDraggableKt.restartable(dro, anonymousClass2, this);
            if (restartable == e) {
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
