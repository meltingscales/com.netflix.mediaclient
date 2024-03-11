package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.CountryCode;
import java.util.List;
import o.C2946apf;
import o.C2954apn;
import o.C2991aqX;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ans  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2853ans {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2853ans e = new C2853ans();
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> e() {
        return h;
    }

    private C2853ans() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List e2;
        List e3;
        List<AbstractC9025hm> j5;
        List<C9021hi> j6;
        List<AbstractC9025hm> e4;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        CountryCode.c cVar = CountryCode.ae;
        j = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(cVar.c())).d(), new C9018hf.a("englishName", eVar.e()).d());
        d = j;
        C2946apf.a aVar = C2946apf.d;
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(aVar.a())).d();
        C2991aqX.b bVar = C2991aqX.e;
        j2 = C8569dql.j(d3, new C9018hf.a("country", C9019hg.d(bVar.d())).e(j).d(), new C9018hf.a("value", C3373axk.a.e()).c("urlValue").d());
        g = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(cVar.c())).d(), new C9018hf.a("englishName", eVar.e()).d());
        b = j3;
        j4 = C8569dql.j(new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(aVar.a())).d(), new C9018hf.a("country", C9019hg.d(bVar.d())).e(j3).d(), new C9018hf.a("value", C2945ape.b.b()).c("booleanValue").d());
        a = j4;
        e2 = C8566dqi.e("OctoberSkyPropertyURL");
        e3 = C8566dqi.e("OctoberSkyPropertyBoolean");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("OctoberSkyPropertyURL", e2).b(j2).a(), new C9017he.d("OctoberSkyPropertyBoolean", e3).b(j4).a());
        c = j5;
        C9018hf.a aVar2 = new C9018hf.a("getOctoberSkyCountriesProperties", C9019hg.a((AbstractC9026hn) C3053arg.e.d()));
        j6 = C8569dql.j(new C9021hi.d("namespace").b(new C9027ho("namespace")).b(), new C9021hi.d("property").b(new C9027ho("property")).b());
        e4 = C8566dqi.e(aVar2.b(j6).e(j5).d());
        h = e4;
    }
}
