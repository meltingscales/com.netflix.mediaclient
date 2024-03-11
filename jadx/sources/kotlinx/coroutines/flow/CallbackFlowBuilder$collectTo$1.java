package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyL;

/* loaded from: classes5.dex */
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {
    final /* synthetic */ dyL<T> a;
    public Object c;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(dyL<T> dyl, InterfaceC8585dra<? super CallbackFlowBuilder$collectTo$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = dyl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.a.a(null, this);
    }
}
