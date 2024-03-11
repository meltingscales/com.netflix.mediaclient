package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyU;

/* loaded from: classes5.dex */
public final class DistinctFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int c;
    final /* synthetic */ dyU.c<T> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl$collect$2$emit$1(dyU.c<? super T> cVar, InterfaceC8585dra<? super DistinctFlowImpl$collect$2$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
