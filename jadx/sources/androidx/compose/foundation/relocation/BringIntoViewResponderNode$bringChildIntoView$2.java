package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;
import o.dxD;

/* loaded from: classes.dex */
final class BringIntoViewResponderNode$bringChildIntoView$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dxD>, Object> {
    final /* synthetic */ drO<Rect> $boundsProvider;
    final /* synthetic */ LayoutCoordinates $childCoordinates;
    final /* synthetic */ drO<Rect> $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BringIntoViewResponderNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringChildIntoView$2(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, drO<Rect> dro, drO<Rect> dro2, InterfaceC8585dra<? super BringIntoViewResponderNode$bringChildIntoView$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = layoutCoordinates;
        this.$boundsProvider = dro;
        this.$parentRect = dro2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        BringIntoViewResponderNode$bringChildIntoView$2 bringIntoViewResponderNode$bringChildIntoView$2 = new BringIntoViewResponderNode$bringChildIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, interfaceC8585dra);
        bringIntoViewResponderNode$bringChildIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringChildIntoView$2;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dxD> interfaceC8585dra) {
        return ((BringIntoViewResponderNode$bringChildIntoView$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dxD c;
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.L$0;
            C8737dwr.c(dwu, null, null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3, null);
            c = C8737dwr.c(dwu, null, null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3, null);
            return c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ drO<Rect> $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, drO<Rect> dro, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.this$0 = bringIntoViewResponderNode;
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = dro;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, interfaceC8585dra);
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
                BringIntoViewResponder responder = this.this$0.getResponder();
                C00111 c00111 = new C00111(this.this$0, this.$childCoordinates, this.$boundsProvider);
                this.label = 1;
                if (responder.bringChildIntoView(c00111, this) == e) {
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
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class C00111 extends FunctionReferenceImpl implements drO<Rect> {
            final /* synthetic */ drO<Rect> $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00111(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, drO<Rect> dro) {
                super(0, C8632dsu.b.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = dro;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Rect invoke() {
                Rect bringChildIntoView$localRect;
                bringChildIntoView$localRect = BringIntoViewResponderNode.bringChildIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                return bringChildIntoView$localRect;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ drO<Rect> $parentRect;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, drO<Rect> dro, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.this$0 = bringIntoViewResponderNode;
            this.$parentRect = dro;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass2(this.this$0, this.$parentRect, interfaceC8585dra);
        }

        @Override // o.drX
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                BringIntoViewParent parent = this.this$0.getParent();
                LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    return dpR.c;
                }
                drO<Rect> dro = this.$parentRect;
                this.label = 1;
                if (parent.bringChildIntoView(layoutCoordinates, dro, this) == e) {
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
