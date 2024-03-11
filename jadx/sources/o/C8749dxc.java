package o;

import o.dqZ;

/* renamed from: o.dxc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8749dxc {
    public static final Object b(long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        Object e2;
        if (j <= 0) {
            return dpR.c;
        }
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        if (j < Long.MAX_VALUE) {
            c(c8741dwv.getContext()).b(j, c8741dwv);
        }
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        e2 = C8586drb.e();
        return b2 == e2 ? b2 : dpR.c;
    }

    public static final Object c(long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object b = b(c(j), interfaceC8585dra);
        e = C8586drb.e();
        return b == e ? b : dpR.c;
    }

    public static final InterfaceC8748dxb c(dqZ dqz) {
        dqZ.b bVar = dqz.get(dqY.d);
        InterfaceC8748dxb interfaceC8748dxb = bVar instanceof InterfaceC8748dxb ? (InterfaceC8748dxb) bVar : null;
        return interfaceC8748dxb == null ? dwX.a() : interfaceC8748dxb;
    }

    public static final long c(long j) {
        long e;
        if (duI.d(j, duI.d.b()) > 0) {
            e = C8657dts.e(duI.h(j), 1L);
            return e;
        }
        return 0L;
    }
}
