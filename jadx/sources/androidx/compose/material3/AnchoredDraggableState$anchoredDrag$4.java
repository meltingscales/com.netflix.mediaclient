package androidx.compose.material3;

import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8613dsb;
import o.dpD;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements drM<InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8613dsb<AnchoredDragScope, DraggableAnchors<T>, T, InterfaceC8585dra<? super dpR>, Object> $block;
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$anchoredDrag$4(AnchoredDraggableState<T> anchoredDraggableState, T t, InterfaceC8613dsb<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8613dsb, InterfaceC8585dra<? super AnchoredDraggableState$anchoredDrag$4> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = t;
        this.$block = interfaceC8613dsb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new AnchoredDraggableState$anchoredDrag$4(this.this$0, this.$targetValue, this.$block, interfaceC8585dra);
    }

    @Override // o.drM
    public final Object invoke(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AnchoredDraggableState$anchoredDrag$4) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object restartable;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            this.this$0.setDragTarget(this.$targetValue);
            final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            drO<Pair<? extends DraggableAnchors<T>, ? extends T>> dro = new drO<Pair<? extends DraggableAnchors<T>, ? extends T>>() { // from class: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public final Pair<DraggableAnchors<T>, T> invoke() {
                    return dpD.a(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> extends SuspendLambda implements drX<Pair<? extends DraggableAnchors<T>, ? extends T>, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ InterfaceC8613dsb<AnchoredDragScope, DraggableAnchors<T>, T, InterfaceC8585dra<? super dpR>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(InterfaceC8613dsb<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8613dsb, AnchoredDraggableState<T> anchoredDraggableState, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.$block = interfaceC8613dsb;
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC8585dra);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // o.drX
        public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return invoke((Pair) ((Pair) obj), interfaceC8585dra);
        }

        public final Object invoke(Pair<? extends DraggableAnchors<T>, ? extends T> pair, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(pair, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            AnchoredDragScope anchoredDragScope;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                Pair pair = (Pair) this.L$0;
                Object c = pair.c();
                InterfaceC8613dsb<AnchoredDragScope, DraggableAnchors<T>, T, InterfaceC8585dra<? super dpR>, Object> interfaceC8613dsb = this.$block;
                anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                if (interfaceC8613dsb.invoke(anchoredDragScope, (DraggableAnchors) pair.b(), c, this) == e) {
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
}
