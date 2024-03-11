package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyT;

/* loaded from: classes5.dex */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public int c;
    public int d;
    public int e;
    final /* synthetic */ dyT.d h;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1(dyT.d dVar, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.h = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.d |= Integer.MIN_VALUE;
        return this.h.collect(null, this);
    }
}
