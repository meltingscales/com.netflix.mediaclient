package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2931apQ;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.akz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2701akz {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2701akz e = new C2701akz();
    private static final List<AbstractC9025hm> f;

    public final List<AbstractC9025hm> b() {
        return f;
    }

    private C2701akz() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e3;
        List e4;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e5;
        List e6;
        List j3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("LiveEvent");
        C9017he.d dVar = new C9017he.d("LiveEvent", e2);
        C2695akt c2695akt = C2695akt.d;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), dVar.b(c2695akt.d()).a());
        d = j;
        C2931apQ.d dVar2 = C2931apQ.e;
        e3 = C8566dqi.e(new C9018hf.a("nextLiveEvent", dVar2.b()).e(j).d());
        c = e3;
        e4 = C8566dqi.e("LiveEvent");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LiveEvent", e4).b(c2695akt.d()).a());
        b = j2;
        e5 = C8566dqi.e(new C9018hf.a("liveEvent", dVar2.b()).e(j2).d());
        a = e5;
        e6 = C8566dqi.e("Show");
        j3 = C8569dql.j("Episode", "Movie");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9017he.d("Show", e6).b(e3).a(), new C9017he.d("LiveEventViewable", j3).b(e5).a());
        f = j4;
    }
}
