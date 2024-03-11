package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C8793dyt;
import o.InterfaceC8612dsa;
import o.dBH;
import o.dpR;

/* loaded from: classes5.dex */
public final /* synthetic */ class BufferedChannel$onReceive$1 extends FunctionReferenceImpl implements InterfaceC8612dsa<C8793dyt<?>, dBH<?>, Object, dpR> {
    public static final BufferedChannel$onReceive$1 a = new BufferedChannel$onReceive$1();

    BufferedChannel$onReceive$1() {
        super(3, C8793dyt.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void a(C8793dyt<?> c8793dyt, dBH<?> dbh, Object obj) {
        c8793dyt.b(dbh, obj);
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ dpR invoke(C8793dyt<?> c8793dyt, dBH<?> dbh, Object obj) {
        a(c8793dyt, dbh, obj);
        return dpR.c;
    }
}
