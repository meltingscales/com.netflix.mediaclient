package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.drX;
import o.dyR;
import o.dyS;

/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public Object b;
    public Object c;
    public Object d;
    public int e;

    public FlowKt__ReduceKt$first$3(InterfaceC8585dra<? super FlowKt__ReduceKt$first$3> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.e |= Integer.MIN_VALUE;
        return dyR.a((dyS) null, (drX) null, this);
    }
}
