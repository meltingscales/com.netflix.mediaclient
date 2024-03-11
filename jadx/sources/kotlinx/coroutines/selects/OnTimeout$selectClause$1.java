package kotlinx.coroutines.selects;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C7693dBw;
import o.InterfaceC8612dsa;
import o.dBH;
import o.dpR;

/* loaded from: classes5.dex */
public final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements InterfaceC8612dsa<C7693dBw, dBH<?>, Object, dpR> {
    public static final OnTimeout$selectClause$1 d = new OnTimeout$selectClause$1();

    OnTimeout$selectClause$1() {
        super(3, C7693dBw.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final void c(C7693dBw c7693dBw, dBH<?> dbh, Object obj) {
        c7693dBw.e(dbh, obj);
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ dpR invoke(C7693dBw c7693dBw, dBH<?> dbh, Object obj) {
        c(c7693dBw, dbh, obj);
        return dpR.c;
    }
}
