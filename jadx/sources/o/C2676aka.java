package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2945ape;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.aka  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2676aka {
    public static final C2676aka b = new C2676aka();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> a() {
        return d;
    }

    private C2676aka() {
    }

    static {
        List j;
        List j2;
        List j3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        C2945ape.b bVar = C2945ape.b;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("isPlayable", bVar.b()).d(), new C9018hf.a("hasOriginalTreatment", bVar.b()).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d(), new C9017he.d("Video", j).b(C2790ami.e.d()).a(), new C9018hf.a("isInRemindMeList", bVar.b()).d(), new C9017he.d("Video", j2).b(C2788amg.b.c()).a(), new C9017he.d("Video", j3).b(C2796amo.b.a()).a());
        d = j4;
    }
}
