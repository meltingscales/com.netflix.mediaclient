package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyQ;
import o.dzL;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class ChannelFlowOperator$collectWithContextUndispatched$2<T> extends SuspendLambda implements drX<dyQ<? super T>, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ dzL<S, T> d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(dzL<S, T> dzl, InterfaceC8585dra<? super ChannelFlowOperator$collectWithContextUndispatched$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = dzl;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.d, interfaceC8585dra);
        channelFlowOperator$collectWithContextUndispatched$2.a = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dzL<S, T> dzl = this.d;
            this.e = 1;
            if (dzl.e((dyQ) this.a, this) == e) {
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
