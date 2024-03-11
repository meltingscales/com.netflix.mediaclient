package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2775amT {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2775amT c = new C2775amT();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;

    public final List<AbstractC9025hm> a() {
        return d;
    }

    private C2775amT() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List e3;
        List e4;
        List<AbstractC9025hm> j2;
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
        e = j;
        e3 = C8566dqi.e("Show");
        e4 = C8566dqi.e("Show");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Show", e3).b(C2728alZ.c.a()).a(), new C9017he.d("Show", e4).b(C2724alV.a.e()).a());
        a = j2;
        e5 = C8566dqi.e("Episode");
        j3 = C8569dql.j(new C9017he.d("Episode", e5).b(C2612ajP.b.a()).a(), new C9018hf.a("parentSeason", C3215auk.e.e()).e(j).d(), new C9018hf.a("parentShow", C3226auv.e.e()).e(j2).d());
        b = j3;
        e6 = C8566dqi.e("Episode");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e6).b(j3).a());
        f = j4;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e7 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e8 = C8566dqi.e(dVar.b(e7).b());
        e9 = C8566dqi.e(aVar.b(e8).e(j4).d());
        d = e9;
    }
}
