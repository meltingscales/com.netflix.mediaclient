package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8826dzz;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class SubscribedSharedFlow$collect$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    final /* synthetic */ C8826dzz<T> b;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedSharedFlow$collect$1(C8826dzz<T> c8826dzz, InterfaceC8585dra<? super SubscribedSharedFlow$collect$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = c8826dzz;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.e |= Integer.MIN_VALUE;
        return this.b.collect(null, this);
    }
}
