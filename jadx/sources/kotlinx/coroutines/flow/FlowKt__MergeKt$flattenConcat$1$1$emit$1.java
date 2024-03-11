package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8801dza;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends ContinuationImpl {
    public int b;
    final /* synthetic */ C8801dza.e<T> c;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$flattenConcat$1$1$emit$1(C8801dza.e<? super T> eVar, InterfaceC8585dra<? super FlowKt__MergeKt$flattenConcat$1$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
