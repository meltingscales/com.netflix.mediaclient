package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyJ;
import o.dyQ;
import o.dyR;
import o.dzH;

/* loaded from: classes5.dex */
public final class ChannelFlow$collect$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ dyQ<T> b;
    final /* synthetic */ dzH<T> c;
    private /* synthetic */ Object d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlow$collect$2(dyQ<? super T> dyq, dzH<T> dzh, InterfaceC8585dra<? super ChannelFlow$collect$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = dyq;
        this.c = dzh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.b, this.c, interfaceC8585dra);
        channelFlow$collect$2.d = obj;
        return channelFlow$collect$2;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ChannelFlow$collect$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dyQ<T> dyq = this.b;
            dyJ c = this.c.c((dwU) this.d);
            this.e = 1;
            if (dyR.d(dyq, c, this) == e) {
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
