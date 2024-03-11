package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyT;

/* loaded from: classes5.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 extends ContinuationImpl {
    public Object a;
    public int b;
    final /* synthetic */ dyT.c c;
    public /* synthetic */ Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1(dyT.c cVar, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
