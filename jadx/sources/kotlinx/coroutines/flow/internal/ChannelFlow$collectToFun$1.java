package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyK;
import o.dzH;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class ChannelFlow$collectToFun$1<T> extends SuspendLambda implements drX<dyK<? super T>, InterfaceC8585dra<? super dpR>, Object> {
    int c;
    final /* synthetic */ dzH<T> d;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(dzH<T> dzh, InterfaceC8585dra<? super ChannelFlow$collectToFun$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = dzh;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dyK<? super T> dyk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ChannelFlow$collectToFun$1) create(dyk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.d, interfaceC8585dra);
        channelFlow$collectToFun$1.e = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            dzH<T> dzh = this.d;
            this.c = 1;
            if (dzh.a((dyK) this.e, this) == e) {
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
