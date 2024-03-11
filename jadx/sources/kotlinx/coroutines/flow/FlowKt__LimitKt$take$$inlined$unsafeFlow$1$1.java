package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8802dzb;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    final /* synthetic */ C8802dzb.d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1(C8802dzb.d dVar, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.c |= Integer.MIN_VALUE;
        return this.e.collect(null, this);
    }
}
