package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
final class AndroidViewHolder$onNestedFling$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z, AndroidViewHolder androidViewHolder, long j, InterfaceC8585dra<? super AndroidViewHolder$onNestedFling$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$consumed = z;
        this.this$0 = androidViewHolder;
        this.$viewVelocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AndroidViewHolder$onNestedFling$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        NestedScrollDispatcher nestedScrollDispatcher;
        NestedScrollDispatcher nestedScrollDispatcher2;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            if (!this.$consumed) {
                nestedScrollDispatcher2 = this.this$0.dispatcher;
                long m2594getZero9UxMQ8M = Velocity.Companion.m2594getZero9UxMQ8M();
                long j = this.$viewVelocity;
                this.label = 1;
                if (nestedScrollDispatcher2.m1670dispatchPostFlingRZ2iAVY(m2594getZero9UxMQ8M, j, this) == e) {
                    return e;
                }
            } else {
                nestedScrollDispatcher = this.this$0.dispatcher;
                long j2 = this.$viewVelocity;
                long m2594getZero9UxMQ8M2 = Velocity.Companion.m2594getZero9UxMQ8M();
                this.label = 2;
                if (nestedScrollDispatcher.m1670dispatchPostFlingRZ2iAVY(j2, m2594getZero9UxMQ8M2, this) == e) {
                    return e;
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
