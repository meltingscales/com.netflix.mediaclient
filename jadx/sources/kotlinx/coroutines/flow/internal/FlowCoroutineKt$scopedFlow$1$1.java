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

/* loaded from: classes5.dex */
public final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8612dsa<dwU, dyQ<? super R>, InterfaceC8585dra<? super dpR>, Object> a;
    private /* synthetic */ Object b;
    int d;
    final /* synthetic */ dyQ<R> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoroutineKt$scopedFlow$1$1(InterfaceC8612dsa<? super dwU, ? super dyQ<? super R>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, dyQ<? super R> dyq, InterfaceC8585dra<? super FlowCoroutineKt$scopedFlow$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = interfaceC8612dsa;
        this.e = dyq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.a, this.e, interfaceC8585dra);
        flowCoroutineKt$scopedFlow$1$1.b = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC8612dsa<dwU, dyQ<? super R>, InterfaceC8585dra<? super dpR>, Object> interfaceC8612dsa = this.a;
            Object obj2 = this.e;
            this.d = 1;
            if (interfaceC8612dsa.invoke((dwU) this.b, obj2, this) == e) {
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
