package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8802dzb;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$drop$2$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C8802dzb.a<T> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$drop$2$1$emit$1(C8802dzb.a<? super T> aVar, InterfaceC8585dra<? super FlowKt__LimitKt$drop$2$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
