package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C8793dyt;
import o.InterfaceC8612dsa;
import o.dBH;
import o.dpR;

/* loaded from: classes5.dex */
public final /* synthetic */ class BufferedChannel$onReceiveCatching$1 extends FunctionReferenceImpl implements InterfaceC8612dsa<C8793dyt<?>, dBH<?>, Object, dpR> {
    public static final BufferedChannel$onReceiveCatching$1 c = new BufferedChannel$onReceiveCatching$1();

    BufferedChannel$onReceiveCatching$1() {
        super(3, C8793dyt.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void b(C8793dyt<?> c8793dyt, dBH<?> dbh, Object obj) {
        c8793dyt.b(dbh, obj);
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ dpR invoke(C8793dyt<?> c8793dyt, dBH<?> dbh, Object obj) {
        b(c8793dyt, dbh, obj);
        return dpR.c;
    }
}
