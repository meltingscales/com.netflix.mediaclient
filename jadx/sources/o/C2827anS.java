package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2827anS {
    private static final List<AbstractC9025hm> a;
    public static final C2827anS b = new C2827anS();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> b() {
        return a;
    }

    private C2827anS() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c;
        List<C9021hi> e;
        List<AbstractC9025hm> e2;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("isInRemindMeList", C2945ape.b.b()).d());
        d = j;
        C9018hf.a aVar = new C9018hf.a("removeFromRemindMe", C3378axp.e.d());
        C9021hi.d dVar = new C9021hi.d("input");
        c = dqE.c(dpD.a(SignupConstants.Field.VIDEO_ID, new C9027ho(SignupConstants.Field.VIDEO_ID)), dpD.a("trackId", new C9027ho("trackId")));
        e = C8566dqi.e(dVar.b(c).b());
        e2 = C8566dqi.e(aVar.b(e).e(j).d());
        a = e2;
    }
}
