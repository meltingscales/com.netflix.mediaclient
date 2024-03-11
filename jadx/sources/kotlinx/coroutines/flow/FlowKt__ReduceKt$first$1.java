package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyR;
import o.dyS;

/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$first$1<T> extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    public Object e;

    public FlowKt__ReduceKt$first$1(InterfaceC8585dra<? super FlowKt__ReduceKt$first$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return dyR.c((dyS) null, this);
    }
}
