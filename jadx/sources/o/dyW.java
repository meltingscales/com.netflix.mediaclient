package o;

import kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1;

/* loaded from: classes5.dex */
public final /* synthetic */ class dyW {
    public static final Object b(dyS<?> dys, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object collect = dys.collect(dzW.b, interfaceC8585dra);
        e = C8586drb.e();
        return collect == e ? collect : dpR.c;
    }

    public static final <T> dxD d(dyS<? extends T> dys, dwU dwu) {
        dxD c;
        c = C8737dwr.c(dwu, null, null, new FlowKt__CollectKt$launchIn$1(dys, null), 3, null);
        return c;
    }

    public static final <T> Object a(dyS<? extends T> dys, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        dyS a;
        Object e;
        a = dyZ.a(dyR.e(dys, drx), 0, null, 2, null);
        Object a2 = dyR.a(a, interfaceC8585dra);
        e = C8586drb.e();
        return a2 == e ? a2 : dpR.c;
    }

    public static final <T> Object b(dyQ<? super T> dyq, dyS<? extends T> dys, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        dyR.b(dyq);
        Object collect = dys.collect(dyq, interfaceC8585dra);
        e = C8586drb.e();
        return collect == e ? collect : dpR.c;
    }
}
