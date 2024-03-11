package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyR;
import o.dyS;

/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$single$1<T> extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public int e;

    public FlowKt__ReduceKt$single$1(InterfaceC8585dra<? super FlowKt__ReduceKt$single$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return dyR.d((dyS) null, this);
    }
}
