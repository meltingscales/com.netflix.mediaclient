package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import java.util.List;
import o.C2879aoR;
import o.C2945ape;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2746alr {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2746alr d = new C2746alr();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> a() {
        return h;
    }

    private C2746alr() {
    }

    static {
        List<AbstractC9025hm> j2;
        List e2;
        List e3;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<C9021hi> e4;
        List<C9021hi> e5;
        List<AbstractC9025hm> j6;
        List e6;
        List e7;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> j8;
        List e8;
        List<C9021hi> e9;
        List e10;
        List e11;
        List e12;
        List<AbstractC9025hm> j9;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C2945ape.b bVar = C2945ape.b;
        j2 = C8569dql.j(d2, d3, new C9018hf.a("isPlayable", bVar.b()).d());
        c = j2;
        C2879aoR.c cVar2 = C2879aoR.b;
        e2 = C8566dqi.e("Episode");
        C9017he.d dVar = new C9017he.d("Episode", e2);
        C2709alG c2709alG = C2709alG.d;
        e3 = C8566dqi.e("Episode");
        C9017he.d dVar2 = new C9017he.d("Episode", e3);
        C2612ajP c2612ajP = C2612ajP.b;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("nextEpisode", cVar2.c()).e(j2).d(), new C9018hf.a("logicalEndOffsetSec", cVar.d()).d(), new C9018hf.a("logicalStartOffsetSec", cVar.d()).d(), dVar.b(c2709alG.c()).a(), dVar2.b(c2612ajP.a()).a());
        e = j3;
        j4 = C8569dql.j(new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("currentEpisode", cVar2.c()).e(j3).d());
        f = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("isPlayable", bVar.b()).d());
        a = j5;
        C9018hf d4 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d5 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf.a c2 = new C9018hf.a("numberLabelV2", eVar.e()).c("longNumberLabel");
        e4 = C8566dqi.e(new C9021hi.d("label").b("LONG").b());
        C9018hf d6 = c2.b(e4).d();
        C9018hf.a aVar = new C9018hf.a("numberLabelV2", eVar.e());
        e5 = C8566dqi.e(new C9021hi.d("label").b("ABBR").b());
        j6 = C8569dql.j(d4, d5, d6, aVar.b(e5).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9018hf.a("number", cVar.d()).d());
        j = j6;
        e6 = C8566dqi.e("Episode");
        e7 = C8566dqi.e("Episode");
        j7 = C8569dql.j(new C9018hf.a("logicalEndOffsetSec", cVar.d()).d(), new C9018hf.a("logicalStartOffsetSec", cVar.d()).d(), new C9017he.d("Episode", e6).b(c2709alG.c()).a(), new C9017he.d("Episode", e7).b(c2612ajP.a()).a(), new C9018hf.a("nextEpisode", cVar2.c()).e(j5).d(), new C9018hf.a("parentSeason", C3215auk.e.e()).e(j6).d());
        b = j7;
        j8 = C8569dql.j(new C9018hf.a("logicalEndOffsetSec", cVar.d()).d(), new C9018hf.a("logicalStartOffsetSec", cVar.d()).d());
        g = j8;
        C9018hf.a aVar2 = new C9018hf.a("isInTurboCollections", C9019hg.a(C9019hg.d(cVar.d())));
        C9021hi.d dVar3 = new C9021hi.d("collectionIds");
        e8 = C8566dqi.e(1681383);
        e9 = C8566dqi.e(dVar3.b(e8).b());
        e10 = C8566dqi.e("Show");
        e11 = C8566dqi.e("Episode");
        e12 = C8566dqi.e("Movie");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), aVar2.b(e9).d(), new C9018hf.a("playbackBadges", C9019hg.a((AbstractC9026hn) PlaybackBadge.b.c())).d(), new C9017he.d("Show", e10).b(j4).a(), new C9017he.d("Episode", e11).b(j7).a(), new C9017he.d("Movie", e12).b(j8).a());
        h = j9;
    }
}
