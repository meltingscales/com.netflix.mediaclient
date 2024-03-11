package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8801dza;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 extends ContinuationImpl {
    public Object a;
    final /* synthetic */ C8801dza.b.AnonymousClass4 b;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1(C8801dza.b.AnonymousClass4 anonymousClass4, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
