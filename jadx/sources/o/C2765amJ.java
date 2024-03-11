package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2765amJ {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2765amJ d = new C2765amJ();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return a;
    }

    private C2765amJ() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<C9021hi> j5;
        List<AbstractC9025hm> e2;
        C2954apn.e eVar = C2954apn.c;
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9017he.d("Video", j).b(C2787amf.b.a()).a());
        b = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3378axp.e.d()).e(j2).d());
        e = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", cVar.d()).d(), new C9018hf.a("edges", C9019hg.a(C9019hg.d(C2874aoM.c.a()))).e(j3).d());
        c = j4;
        C9018hf.a aVar = new C9018hf.a("downloadsForYou", C2875aoN.d.a());
        j5 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("videoCursor")).b(), new C9021hi.d("first").b(new C9027ho("first_videos")).b());
        e2 = C8566dqi.e(aVar.b(j5).e(j4).d());
        a = e2;
    }
}
