package o;

/* renamed from: o.dyi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8782dyi {
    public static final Object b(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        Object e2;
        Object e3;
        dqZ context = interfaceC8585dra.getContext();
        dxG.d(context);
        b = C8590drf.b(interfaceC8585dra);
        C7655dAl c7655dAl = b instanceof C7655dAl ? (C7655dAl) b : null;
        if (c7655dAl == null) {
            e = dpR.c;
        } else {
            if (c7655dAl.d.isDispatchNeeded(context)) {
                c7655dAl.b(context, (dqZ) dpR.c);
            } else {
                C8784dyk c8784dyk = new C8784dyk();
                dqZ plus = context.plus(c8784dyk);
                dpR dpr = dpR.c;
                c7655dAl.b(plus, (dqZ) dpr);
                if (c8784dyk.d) {
                    e = C7653dAj.b(c7655dAl) ? C8586drb.e() : dpr;
                }
            }
            e = C8586drb.e();
        }
        e2 = C8586drb.e();
        if (e == e2) {
            C8592drh.c(interfaceC8585dra);
        }
        e3 = C8586drb.e();
        return e == e3 ? e : dpR.c;
    }
}
