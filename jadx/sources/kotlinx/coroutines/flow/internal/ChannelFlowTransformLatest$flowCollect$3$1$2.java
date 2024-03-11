package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dzN;

/* loaded from: classes5.dex */
final class ChannelFlowTransformLatest$flowCollect$3$1$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ T a;
    final /* synthetic */ dzN<T, R> b;
    final /* synthetic */ dyQ<R> c;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3$1$2(dzN<T, R> dzn, dyQ<? super R> dyq, T t, InterfaceC8585dra<? super ChannelFlowTransformLatest$flowCollect$3$1$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = dzn;
        this.c = dyq;
        this.a = t;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ChannelFlowTransformLatest$flowCollect$3$1$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ChannelFlowTransformLatest$flowCollect$3$1$2(this.b, this.c, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC8612dsa b = dzN.b(this.b);
            Object obj2 = this.c;
            T t = this.a;
            this.e = 1;
            if (b.invoke(obj2, t, this) == e) {
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
