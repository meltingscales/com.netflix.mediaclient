package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8808dzh;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C8808dzh.a b;
    public Object c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ReduceKt$first$$inlined$collectWhile$2$1(C8808dzh.a aVar, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.e |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
