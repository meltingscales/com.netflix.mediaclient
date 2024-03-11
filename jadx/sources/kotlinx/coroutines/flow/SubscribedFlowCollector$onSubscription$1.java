package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dzC;

/* loaded from: classes5.dex */
public final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ dzC<T> c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(dzC<T> dzc, InterfaceC8585dra<? super SubscribedFlowCollector$onSubscription$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.c = dzc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
