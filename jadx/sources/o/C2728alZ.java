package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2728alZ {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2728alZ c = new C2728alZ();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return b;
    }

    private C2728alZ() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> j4;
        List<AbstractC9025hm> j5;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Season");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Season", e2).b(C2727alY.c.c()).a());
        e = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3215auk.e.e()).e(j).d());
        a = j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j3 = C8569dql.j(d2, new C9018hf.a("totalCount", cVar.d()).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C3214auj.a.c())).e(j2).d());
        d = j3;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf.a aVar = new C9018hf.a("seasons", C3216aul.c.c());
        j4 = C8569dql.j(new C9021hi.d("after").b(), new C9021hi.d("first").b(40).b());
        j5 = C8569dql.j(d3, d4, aVar.b(j4).e(j3).d());
        b = j5;
    }
}
