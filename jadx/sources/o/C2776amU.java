package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2776amU {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2776amU e = new C2776amU();

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private C2776amU() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j).b(C2614ajR.d.d()).a());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("isAutoStartEnabled", C2945ape.b.b()).d());
        a = j3;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e2 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e3 = C8566dqi.e(dVar.b(e2).b());
        j4 = C8569dql.j(aVar.b(e3).e(j2).d(), new C9018hf.a("currentProfile", C3137atK.a.d()).e(j3).d());
        b = j4;
    }
}
