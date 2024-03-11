package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2913aoz;
import o.C2934apT;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.amp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2797amp {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2797amp d = new C2797amp();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> a() {
        return g;
    }

    private C2797amp() {
    }

    static {
        List j2;
        List<AbstractC9025hm> j3;
        List j4;
        List<AbstractC9025hm> j5;
        List j6;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> j8;
        List j9;
        List<AbstractC9025hm> j10;
        List<AbstractC9025hm> j11;
        List<AbstractC9025hm> j12;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        C9017he.d dVar = new C9017he.d("LocalizedString", j2);
        C2801amt c2801amt = C2801amt.a;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), dVar.b(c2801amt.b()).a());
        j = j3;
        j4 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LocalizedString", j4).b(c2801amt.b()).a());
        b = j5;
        j6 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LocalizedString", j6).b(c2801amt.b()).a());
        c = j7;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2934apT.b bVar = C2934apT.b;
        j8 = C8569dql.j(d2, new C9018hf.a("label", bVar.c()).e(j7).d());
        e = j8;
        j9 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LocalizedString", j9).b(c2801amt.b()).a());
        a = j10;
        j11 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("label", bVar.c()).e(j10).d());
        h = j11;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, bVar.c()).e(j3).d();
        C9018hf d5 = new C9018hf.a("message", bVar.c()).e(j5).d();
        C9018hf d6 = new C9018hf.a("errorCode", eVar.e()).d();
        C2913aoz.e eVar2 = C2913aoz.e;
        j12 = C8569dql.j(d3, d4, d5, d6, new C9018hf.a("dismissAction", eVar2.b()).e(j8).d(), new C9018hf.a("secondaryAction", eVar2.b()).e(j11).d());
        g = j12;
    }
}
