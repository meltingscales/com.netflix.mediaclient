package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2812anD {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2812anD d = new C2812anD();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> g;

    public final List<AbstractC9025hm> b() {
        return b;
    }

    private C2812anD() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List e3;
        List<AbstractC9025hm> j2;
        List e4;
        List e5;
        List<AbstractC9025hm> j3;
        List e6;
        List<AbstractC9025hm> j4;
        List e7;
        List<C9021hi> e8;
        List<AbstractC9025hm> e9;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Season");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Season", e2).b(C2727alY.c.c()).a());
        c = j;
        e3 = C8566dqi.e("Show");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Show", e3).b(C2718alP.c.d()).a());
        a = j2;
        e4 = C8566dqi.e("Episode");
        e5 = C8566dqi.e("Episode");
        j3 = C8569dql.j(new C9018hf.a("parentSeason", C3215auk.e.e()).e(j).d(), new C9017he.d("Episode", e4).b(C2612ajP.b.a()).a(), new C9017he.d("Episode", e5).b(C2709alG.d.c()).a(), new C9018hf.a("parentShow", C3226auv.e.e()).e(j2).d());
        e = j3;
        e6 = C8566dqi.e("Episode");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e6).b(j3).a());
        g = j4;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e7 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e8 = C8566dqi.e(dVar.b(e7).b());
        e9 = C8566dqi.e(aVar.b(e8).e(j4).d());
        b = e9;
    }
}
