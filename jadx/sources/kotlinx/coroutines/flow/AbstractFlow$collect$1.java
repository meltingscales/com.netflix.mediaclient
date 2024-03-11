package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dyO;

/* loaded from: classes5.dex */
public final class AbstractFlow$collect$1 extends ContinuationImpl {
    public int a;
    final /* synthetic */ dyO<T> b;
    public Object c;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(dyO<T> dyo, InterfaceC8585dra<? super AbstractFlow$collect$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = dyo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.a |= Integer.MIN_VALUE;
        return this.b.collect(null, this);
    }
}
