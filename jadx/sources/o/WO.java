package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class WO implements US {
    public static final a b = new a(null);

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TrackListEventCallbackImpl");
        }
    }

    @Override // o.US
    public void c(UZ uz) {
        int d;
        int d2;
        C8632dsu.c((Object) uz, "");
        C1250Ul d3 = uz.d();
        List<C1253Uo> b2 = uz.b();
        List<C1258Ut> a2 = uz.a();
        b.getLogTag();
        VR vr = new VR(d3.e(), d3.c());
        d = C8572dqo.d(b2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C1253Uo c1253Uo : b2) {
            arrayList.add(new VI(c1253Uo.a(), c1253Uo.d(), c1253Uo.c(), c1253Uo.b()));
        }
        d2 = C8572dqo.d(a2, 10);
        ArrayList arrayList2 = new ArrayList(d2);
        for (C1258Ut c1258Ut : a2) {
            arrayList2.add(new C1292Wb(c1258Ut.d(), c1258Ut.b()));
        }
        C1331Xo.b.b(new C1293Wc(vr, arrayList, arrayList2));
    }
}
