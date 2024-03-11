package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8804dzd;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    final /* synthetic */ C8804dzd.d a;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1(C8804dzd.d dVar, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.b |= Integer.MIN_VALUE;
        return this.a.collect(null, this);
    }
}
