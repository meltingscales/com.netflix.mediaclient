package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8802dzb;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$take$2$1$emit$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ C8802dzb.j<T> c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1$emit$1(C8802dzb.j<? super T> jVar, InterfaceC8585dra<? super FlowKt__LimitKt$take$2$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
