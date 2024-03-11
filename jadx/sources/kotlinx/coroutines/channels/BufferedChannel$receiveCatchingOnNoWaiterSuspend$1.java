package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8586drb;
import o.C8793dyt;
import o.C8796dyw;
import o.C8797dyx;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    public int a;
    public Object b;
    public long c;
    public Object d;
    public int e;
    public /* synthetic */ Object h;
    final /* synthetic */ C8793dyt<E> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(C8793dyt<E> c8793dyt, InterfaceC8585dra<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.j = c8793dyt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object e2;
        this.h = obj;
        this.a |= Integer.MIN_VALUE;
        e = this.j.e((C8796dyw) null, 0, 0L, (InterfaceC8585dra) this);
        e2 = C8586drb.e();
        return e == e2 ? e : C8797dyx.a(e);
    }
}
