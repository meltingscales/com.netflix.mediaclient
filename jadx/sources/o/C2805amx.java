package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2805amx {
    private static final List<AbstractC9025hm> a;
    public static final C2805amx b = new C2805amx();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C2805amx() {
    }

    static {
        List<AbstractC9025hm> j;
        List j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        Map b2;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j(new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("isInPlaylist", C2945ape.b.b()).d());
        c = j;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d(), new C9017he.d("Video", j2).b(j).a());
        d = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("entity", C3375axm.a.e()).e(j3).d());
        e = j4;
        C9018hf.a aVar = new C9018hf.a("addEntityToPlaylist", C2907aot.c.d());
        C9021hi.d dVar = new C9021hi.d("input");
        b2 = dqD.b(dpD.a("entityId", new C9027ho("entityId")));
        e2 = C8566dqi.e(dVar.b(b2).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j4).d());
        a = e3;
    }
}
