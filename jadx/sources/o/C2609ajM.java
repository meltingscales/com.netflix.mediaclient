package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9018hf;

/* renamed from: o.ajM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2609ajM {
    public static final C2609ajM a = new C2609ajM();
    private static final List<AbstractC9025hm> c;

    public final List<AbstractC9025hm> e() {
        return c;
    }

    private C2609ajM() {
    }

    static {
        List<AbstractC9025hm> j;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("isAvailableForDownload", C2945ape.b.b()).d());
        c = j;
    }
}
