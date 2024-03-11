package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dBM;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyS;
import o.dzZ;

/* loaded from: classes5.dex */
public final class ChannelFlowMerge$collectTo$2$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ dzZ<T> a;
    final /* synthetic */ dBM b;
    final /* synthetic */ dyS<T> c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2$1(dyS<? extends T> dys, dzZ<T> dzz, dBM dbm, InterfaceC8585dra<? super ChannelFlowMerge$collectTo$2$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = dys;
        this.a = dzz;
        this.b = dbm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ChannelFlowMerge$collectTo$2$1(this.c, this.a, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ChannelFlowMerge$collectTo$2$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                dyS<T> dys = this.c;
                Object obj2 = this.a;
                this.d = 1;
                if (dys.collect(obj2, this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            this.b.a();
            return dpR.c;
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }
}
