package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2945ape;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2798amq {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2798amq e = new C2798amq();
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> a() {
        return h;
    }

    private C2798amq() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List<C9021hi> e2;
        List<C9021hi> j7;
        List<AbstractC9025hm> j8;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        b = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2945ape.b bVar = C2945ape.b;
        C9018hf d3 = new C9018hf.a("isHighest", bVar.b()).d();
        C9018hf d4 = new C9018hf.a("isLowest", bVar.b()).d();
        C9018hf d5 = new C9018hf.a("labels", C9019hg.a((AbstractC9026hn) eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j2 = C8569dql.j(d2, d3, d4, d5, new C9018hf.a("level", cVar.d()).d(), new C9018hf.a("value", cVar.d()).d());
        c = j2;
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j3).b(C2639ajq.b.b()).a());
        a = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3378axp.e.d()).e(j4).d());
        d = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a(C9019hg.d(C3379axq.a.b()))).e(j5).d());
        g = j6;
        C9018hf d6 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("avatar", C2951apk.b.b());
        e2 = C8566dqi.e(new C9021hi.d("dimension").b("AVATAR_SIZE_320").b());
        C9018hf d7 = aVar.b(e2).e(j).d();
        C9018hf d8 = new C9018hf.a("createdAt", C2873aoL.a.d()).d();
        C9018hf d9 = new C9018hf.a(Payload.PARAM_GUID, C9019hg.d(C2946apf.d.a())).d();
        C9018hf d10 = new C9018hf.a("isAccountOwner", bVar.b()).d();
        C9018hf d11 = new C9018hf.a("isAutoStartEnabled", bVar.b()).d();
        C9018hf d12 = new C9018hf.a("isKids", bVar.b()).d();
        C9018hf d13 = new C9018hf.a("isPinLocked", bVar.b()).d();
        C9018hf d14 = new C9018hf.a("isProfileCreationLocked", bVar.b()).d();
        C9018hf d15 = new C9018hf.a("isRecentlyCreated", bVar.b()).d();
        C9018hf d16 = new C9018hf.a("isVideoMerchEnabled", bVar.b()).d();
        C9018hf d17 = new C9018hf.a("lockPin", eVar.e()).d();
        C9018hf d18 = new C9018hf.a("maturityRating", C3140atN.e.b()).e(j2).d();
        C9018hf d19 = new C9018hf.a("name", eVar.e()).d();
        C9018hf d20 = new C9018hf.a("primaryLanguage", eVar.e()).d();
        C9018hf d21 = new C9018hf.a(SignupConstants.Field.SECONDARY_LANGUAGES, C9019hg.a((AbstractC9026hn) eVar.e())).d();
        C9018hf.a aVar2 = new C9018hf.a("titleProtectedVideos", C3142atP.c.e());
        j7 = C8569dql.j(new C9021hi.d("after").b(), new C9021hi.d("first").b(100).b());
        j8 = C8569dql.j(d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, aVar2.b(j7).e(j6).d());
        h = j8;
    }
}
