package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class WC implements UK {
    public static final e c = new e(null);

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PairingListenerImpl");
        }
    }

    @Override // o.UK
    public void d(List<C1255Uq> list) {
        int d;
        C8632dsu.c((Object) list, "");
        c.getLogTag();
        C1326Xj c1326Xj = C1326Xj.e;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C1255Uq c1255Uq : list) {
            arrayList.add(new VY(new VZ(c1255Uq.a(), c1255Uq.c(), c1255Uq.h(), c1255Uq.d(), c1255Uq.e(), c1255Uq.b())));
        }
        c1326Xj.e(arrayList);
        C1326Xj.e.d(null);
    }

    @Override // o.UK
    public void e(C1255Uq c1255Uq) {
        C8632dsu.c((Object) c1255Uq, "");
        c.getLogTag();
        C1326Xj c1326Xj = C1326Xj.e;
        c1326Xj.d(new VS(new VZ(c1255Uq.a(), c1255Uq.c(), c1255Uq.h(), c1255Uq.d(), c1255Uq.e(), c1255Uq.b())));
        c1326Xj.e(null);
    }
}
