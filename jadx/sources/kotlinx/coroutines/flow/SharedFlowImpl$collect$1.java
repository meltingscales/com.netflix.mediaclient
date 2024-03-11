package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8818dzr;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class SharedFlowImpl$collect$1<T> extends ContinuationImpl {
    public Object a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    final /* synthetic */ C8818dzr<T> f;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(C8818dzr<T> c8818dzr, InterfaceC8585dra<? super SharedFlowImpl$collect$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.f = c8818dzr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.c |= Integer.MIN_VALUE;
        return C8818dzr.b(this.f, null, this);
    }
}
