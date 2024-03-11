package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9018hf;

/* renamed from: o.ami  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2790ami {
    private static final List<AbstractC9025hm> b;
    public static final C2790ami e = new C2790ami();

    public final List<AbstractC9025hm> d() {
        return b;
    }

    private C2790ami() {
    }

    static {
        List<AbstractC9025hm> j;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("isInPlaylist", C2945ape.b.b()).d());
        b = j;
    }
}
