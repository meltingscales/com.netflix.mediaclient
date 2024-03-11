package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2778amW {
    private static final List<AbstractC9025hm> a;
    public static final C2778amW b = new C2778amW();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return d;
    }

    private C2778amW() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<C9021hi> j2;
        List<AbstractC9025hm> e3;
        List e4;
        List<AbstractC9025hm> j3;
        List e5;
        List<C9021hi> e6;
        List<AbstractC9025hm> e7;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("EpisodesConnection");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("EpisodesConnection", e2).b(C2678akc.b.c()).a());
        a = j;
        C9018hf.a aVar = new C9018hf.a("episodes", C2886aoY.d.c());
        j2 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("afterCursor")).b(), new C9021hi.d("first").b(20).b(), new C9021hi.d("includeUpcomingEpisodes").b(Boolean.TRUE).b());
        e3 = C8566dqi.e(aVar.b(j2).e(j).d());
        e = e3;
        e4 = C8566dqi.e("Season");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9017he.d("Season", e4).b(e3).a());
        c = j3;
        C9018hf.a aVar2 = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e5 = C8566dqi.e(new C9027ho("seasonId"));
        e6 = C8566dqi.e(dVar.b(e5).b());
        e7 = C8566dqi.e(aVar2.b(e6).e(j3).d());
        d = e7;
    }
}
