package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2945ape;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.amm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2794amm {
    private static final List<AbstractC9025hm> c;
    public static final C2794amm d = new C2794amm();

    public final List<AbstractC9025hm> c() {
        return c;
    }

    private C2794amm() {
    }

    static {
        List<AbstractC9025hm> j;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d();
        C9018hf d4 = new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d();
        C9018hf d5 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d();
        C2945ape.b bVar = C2945ape.b;
        j = C8569dql.j(d2, d3, d4, d5, new C9018hf.a("hasOriginalTreatment", bVar.b()).d(), new C9018hf.a("isAvailable", bVar.b()).d(), new C9018hf.a("isAvailableForDownload", bVar.b()).d(), new C9018hf.a("availabilityStartTime", C2873aoL.a.d()).d(), new C9018hf.a("isPlayable", bVar.b()).d());
        c = j;
    }
}
