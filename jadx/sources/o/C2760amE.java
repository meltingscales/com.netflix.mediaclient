package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C2949api;
import o.C2954apn;
import o.C3378axp;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2760amE {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2760amE e = new C2760amE();
    private static final List<AbstractC9025hm> g;

    public final List<AbstractC9025hm> b() {
        return d;
    }

    private C2760amE() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c2;
        List<C9021hi> e2;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        Map b2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j4;
        List e4;
        List<C9021hi> e5;
        List<AbstractC9025hm> e6;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("available", C2945ape.b.b()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        c = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf.a c3 = new C9018hf.a("artwork", C2951apk.b.b()).c("storyArt");
        C9021hi.d dVar = new C9021hi.d("params");
        c2 = dqE.c(dpD.a("artworkType", "MERCH_STILL"), dpD.a("format", "WEBP"));
        e2 = C8566dqi.e(dVar.b(c2).b());
        j2 = C8569dql.j(d2, d3, c3.b(e2).e(j).d());
        b = j2;
        C9018hf d4 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C3378axp.d dVar2 = C3378axp.e;
        j3 = C8569dql.j(d4, new C9018hf.a("video", dVar2.d()).e(j2).d());
        a = j3;
        C9018hf d5 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d6 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf.a aVar = new C9018hf.a("promoVideo", C3146atT.c.e());
        C9021hi.d dVar3 = new C9021hi.d("context");
        b2 = dqD.b(dpD.a("uiContext", "EDUCATIONAL"));
        e3 = C8566dqi.e(dVar3.b(b2).b());
        j4 = C8569dql.j(d5, d6, aVar.b(e3).e(j3).d());
        g = j4;
        C9018hf.a aVar2 = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) dVar2.d()));
        C9021hi.d dVar4 = new C9021hi.d("videoIds");
        e4 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e5 = C8566dqi.e(dVar4.b(e4).b());
        e6 = C8566dqi.e(aVar2.b(e5).e(j4).d());
        d = e6;
    }
}
