package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.ajq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2639ajq {
    public static final C2639ajq b = new C2639ajq();
    private static final List<AbstractC9025hm> c;

    public final List<AbstractC9025hm> b() {
        return c;
    }

    private C2639ajq() {
    }

    static {
        List<AbstractC9025hm> j;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9018hf.a("releaseYear", cVar.d()).d());
        c = j;
    }
}
