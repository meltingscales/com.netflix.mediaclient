package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2873aoL;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2695akt {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2695akt d = new C2695akt();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return b;
    }

    private C2695akt() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> e2;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2873aoL.b bVar = C2873aoL.a;
        j = C8569dql.j(d2, new C9018hf.a("startTime", bVar.d()).d(), new C9018hf.a("endTime", bVar.d()).d());
        e = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("timeRange", C3187auH.a.a()).e(j).d(), new C9018hf.a("image", C2951apk.b.b()).e(j2).d());
        a = j3;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("liveArtwork", C9019hg.a((AbstractC9026hn) C3186auG.a.d()));
        e2 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForBoxart")).b());
        j4 = C8569dql.j(d3, aVar.b(e2).e(j3).d());
        b = j4;
    }
}
