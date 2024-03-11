package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;
import o.dBJ;

/* loaded from: classes5.dex */
public final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ dBJ<R> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(dBJ<R> dbj, InterfaceC8585dra<? super SelectImplementation$doSelectSuspend$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = dbj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        d = this.e.d((InterfaceC8585dra) this);
        return d;
    }
}
