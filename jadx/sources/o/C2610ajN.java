package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.ajN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2610ajN {
    private static final List<AbstractC9025hm> a;
    public static final C2610ajN c = new C2610ajN();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> b() {
        return a;
    }

    private C2610ajN() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("isAvailableForDownload", C2945ape.b.b()).d());
        d = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("currentEpisode", C2879aoR.b.c()).e(j).d());
        a = j2;
    }
}
