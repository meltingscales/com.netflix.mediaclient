package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.alv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2750alv {
    private static final List<AbstractC9025hm> b;
    public static final C2750alv c = new C2750alv();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return d;
    }

    private C2750alv() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e2;
        List e3;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d());
        b = j;
        e2 = C8566dqi.e(new C9018hf.a("nextEpisode", C2879aoR.b.c()).e(j).d());
        e = e2;
        e3 = C8566dqi.e("Episode");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e3).b(e2).a());
        d = j2;
    }
}
