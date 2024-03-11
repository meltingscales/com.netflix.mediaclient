package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8801dza;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 extends ContinuationImpl {
    final /* synthetic */ C8801dza.a.AnonymousClass3 b;
    public /* synthetic */ Object c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1(C8801dza.a.AnonymousClass3 anonymousClass3, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
