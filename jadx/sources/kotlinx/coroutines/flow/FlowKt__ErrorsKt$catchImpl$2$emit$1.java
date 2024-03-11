package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8803dzc;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$catchImpl$2$emit$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ C8803dzc.d<T> b;
    public Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ErrorsKt$catchImpl$2$emit$1(C8803dzc.d<? super T> dVar, InterfaceC8585dra<? super FlowKt__ErrorsKt$catchImpl$2$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.a |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
