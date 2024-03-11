package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aok  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2898aok {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2898aok c = new C2898aok();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> e() {
        return h;
    }

    private C2898aok() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e2;
        List e3;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> e4;
        List e5;
        List e6;
        List<AbstractC9025hm> j4;
        List<C9021hi> e7;
        List<AbstractC9025hm> e8;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LocalizedString", j).b(C2801amt.a.b()).a());
        e = j2;
        e2 = C8566dqi.e(new C9018hf.a("localizedDescription", C2934apT.b.c()).e(j2).d());
        d = e2;
        e3 = C8566dqi.e("AlertDialog");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("AlertDialog", e3).b(C2797amp.d.a()).a());
        b = j3;
        e4 = C8566dqi.e(new C9018hf.a("alert", C2910aow.b.b()).e(j3).d());
        a = e4;
        e5 = C8566dqi.e("UPIHandleAvailable");
        e6 = C8566dqi.e("UPIHandleUnavailableError");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("UPIHandleAvailable", e5).b(e2).a(), new C9017he.d("UPIHandleUnavailableError", e6).b(e4).a());
        i = j4;
        C9018hf.a aVar = new C9018hf.a("upiHandleAvailability", C3192auM.e.b());
        e7 = C8566dqi.e(new C9021hi.d("handle").b(new C9027ho("handle")).b());
        e8 = C8566dqi.e(aVar.b(e7).e(j4).d());
        h = e8;
    }
}
