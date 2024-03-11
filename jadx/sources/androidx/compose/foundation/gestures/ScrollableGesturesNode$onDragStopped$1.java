package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
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
/* loaded from: classes.dex */
public final class ScrollableGesturesNode$onDragStopped$1 extends SuspendLambda implements InterfaceC8612dsa<dwU, Velocity, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ ScrollableGesturesNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableGesturesNode$onDragStopped$1(ScrollableGesturesNode scrollableGesturesNode, InterfaceC8585dra<? super ScrollableGesturesNode$onDragStopped$1> interfaceC8585dra) {
        super(3, interfaceC8585dra);
        this.this$0 = scrollableGesturesNode;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Object invoke(dwU dwu, Velocity velocity, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return m197invokeLuvzFrg(dwu, velocity.m2593unboximpl(), interfaceC8585dra);
    }

    /* renamed from: invoke-LuvzFrg  reason: not valid java name */
    public final Object m197invokeLuvzFrg(dwU dwu, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new ScrollableGesturesNode$onDragStopped$1(this.this$0, interfaceC8585dra);
        scrollableGesturesNode$onDragStopped$1.J$0 = j;
        return scrollableGesturesNode$onDragStopped$1.invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ long $velocity;
        int label;
        final /* synthetic */ ScrollableGesturesNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScrollableGesturesNode scrollableGesturesNode, long j, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.this$0 = scrollableGesturesNode;
            this.$velocity = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.this$0, this.$velocity, interfaceC8585dra);
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
                ScrollingLogic scrollLogic = this.this$0.getScrollLogic();
                long j = this.$velocity;
                this.label = 1;
                if (scrollLogic.m204onDragStoppedsFctU(j, this) == e) {
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
            C8737dwr.c(this.this$0.getNestedScrollDispatcher().getCoroutineScope(), null, null, new AnonymousClass1(this.this$0, this.J$0, null), 3, null);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
