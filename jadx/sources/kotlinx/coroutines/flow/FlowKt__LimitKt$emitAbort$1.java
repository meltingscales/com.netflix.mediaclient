package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8802dzb;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    public /* synthetic */ Object b;
    public Object c;
    public int d;

    public FlowKt__LimitKt$emitAbort$1(InterfaceC8585dra<? super FlowKt__LimitKt$emitAbort$1> interfaceC8585dra) {
        super(interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return C8802dzb.c(null, null, this);
    }
}
