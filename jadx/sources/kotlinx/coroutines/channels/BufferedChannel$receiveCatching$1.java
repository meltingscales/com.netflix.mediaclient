package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C8586drb;
import o.C8793dyt;
import o.C8797dyx;
import o.InterfaceC8585dra;

/* loaded from: classes5.dex */
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    final /* synthetic */ C8793dyt<E> b;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(C8793dyt<E> c8793dyt, InterfaceC8585dra<? super BufferedChannel$receiveCatching$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = c8793dyt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        Object e2 = C8793dyt.e((C8793dyt) this.b, (InterfaceC8585dra) this);
        e = C8586drb.e();
        return e2 == e ? e2 : C8797dyx.a(e2);
    }
}
