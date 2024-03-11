package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2931apQ;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.aky  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2700aky {
    private static final List<AbstractC9025hm> a;
    public static final C2700aky b = new C2700aky();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> e() {
        return j;
    }

    private C2700aky() {
    }

    static {
        List<AbstractC9025hm> j2;
        List e2;
        List<AbstractC9025hm> j3;
        List e3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List e4;
        List<AbstractC9025hm> j7;
        List e5;
        List<AbstractC9025hm> j8;
        List e6;
        List j9;
        List<AbstractC9025hm> j10;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j2 = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("number", cVar.d()).d());
        e = j2;
        e2 = C8566dqi.e("Episode");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e2).b(j2).a());
        c = j3;
        e3 = C8566dqi.e("LiveEvent");
        C9017he.d dVar = new C9017he.d("LiveEvent", e3);
        C2652akC c2652akC = C2652akC.d;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("event", C2928apN.d.e()).e(j3).d(), dVar.b(c2652akC.a()).a());
        a = j4;
        C9018hf d3 = new C9018hf.a("hasLiveEvent", C2945ape.b.b()).d();
        C2931apQ.d dVar2 = C2931apQ.e;
        j5 = C8569dql.j(d3, new C9018hf.a("nextLiveEvent", dVar2.b()).e(j4).d());
        f = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("number", cVar.d()).d());
        i = j6;
        e4 = C8566dqi.e("LiveEvent");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LiveEvent", e4).b(c2652akC.a()).a());
        d = j7;
        e5 = C8566dqi.e("Episode");
        j8 = C8569dql.j(new C9017he.d("Episode", e5).b(j6).a(), new C9018hf.a("liveEvent", dVar2.b()).e(j7).d());
        g = j8;
        e6 = C8566dqi.e("Show");
        j9 = C8569dql.j("Episode", "Movie");
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9017he.d("Show", e6).b(j5).a(), new C9017he.d("LiveEventViewable", j9).b(j8).a());
        j = j10;
    }
}
