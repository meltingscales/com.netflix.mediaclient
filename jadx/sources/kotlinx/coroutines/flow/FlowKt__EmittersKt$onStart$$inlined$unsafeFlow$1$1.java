package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8804dzd;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public int c;
    public Object d;
    public /* synthetic */ Object e;
    final /* synthetic */ C8804dzd.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1(C8804dzd.a aVar, InterfaceC8585dra interfaceC8585dra) {
        super(interfaceC8585dra);
        this.f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
