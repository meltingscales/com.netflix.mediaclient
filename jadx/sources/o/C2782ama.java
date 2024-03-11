package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2945ape;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.ama  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2782ama {
    public static final C2782ama a = new C2782ama();
    private static final List<AbstractC9025hm> c;

    public final List<AbstractC9025hm> c() {
        return c;
    }

    private C2782ama() {
    }

    static {
        List<AbstractC9025hm> j;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d2 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d();
        C9018hf d3 = new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d();
        C2945ape.b bVar = C2945ape.b;
        j = C8569dql.j(d, d2, d3, d4, new C9018hf.a("hasOriginalTreatment", bVar.b()).d(), new C9018hf.a("isAvailable", bVar.b()).d(), new C9018hf.a("isAvailableForDownload", bVar.b()).d(), new C9018hf.a("availabilityStartTime", C2873aoL.a.d()).d(), new C9018hf.a("isPlayable", bVar.b()).d(), new C9018hf.a("isAvailable", bVar.b()).d());
        c = j;
    }
}
