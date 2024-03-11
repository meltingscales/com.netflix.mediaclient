package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2759amD {
    private static final List<AbstractC9025hm> b;
    public static final C2759amD c = new C2759amD();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return b;
    }

    private C2759amD() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c2;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("isInRemindMeList", C2945ape.b.b()).d());
        e = j;
        C9018hf.a aVar = new C9018hf.a("addToRemindMe", C3378axp.e.d());
        C9021hi.d dVar = new C9021hi.d("input");
        c2 = dqE.c(dpD.a(SignupConstants.Field.VIDEO_ID, new C9027ho(SignupConstants.Field.VIDEO_ID)), dpD.a("trackId", new C9027ho("trackId")));
        e2 = C8566dqi.e(dVar.b(c2).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j).d());
        b = e3;
    }
}
