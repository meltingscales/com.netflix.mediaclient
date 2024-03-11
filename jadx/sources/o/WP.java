package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class WP implements UP {
    public static final a a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TrackEventCallbackImpl");
        }
    }

    @Override // o.UP
    public void d(InterfaceC1268Vd interfaceC1268Vd) {
        int d;
        C1293Wc j;
        C8632dsu.c((Object) interfaceC1268Vd, "");
        boolean e = interfaceC1268Vd.e();
        boolean c = C8632dsu.c((Object) interfaceC1268Vd.d(), (Object) interfaceC1268Vd.c());
        List<C1258Ut> a2 = interfaceC1268Vd.a();
        a.getLogTag();
        d = C8572dqo.d(a2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C1258Ut c1258Ut : a2) {
            arrayList.add(new C1292Wb(c1258Ut.d(), c1258Ut.b()));
        }
        C1331Xo c1331Xo = C1331Xo.b;
        c1331Xo.b(new VO(c, e, interfaceC1268Vd.b(), interfaceC1268Vd.c(), arrayList));
        VX b = C1317Xa.e.d().b();
        C1293Wc c1293Wc = (b == null || (j = b.j()) == null) ? null : new C1293Wc(new VR(interfaceC1268Vd.b(), interfaceC1268Vd.c()), j.b(), arrayList);
        if (c1293Wc != null) {
            c1331Xo.b(c1293Wc);
        }
    }
}
