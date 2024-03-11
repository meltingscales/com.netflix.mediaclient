package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8803dzc;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    public Object c;
    final /* synthetic */ C8803dzc.c d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(C8803dzc.c cVar, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.a |= Integer.MIN_VALUE;
        return this.d.collect(null, this);
    }
}
