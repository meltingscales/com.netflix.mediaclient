package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.alP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2718alP {
    public static final C2718alP c = new C2718alP();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return e;
    }

    private C2718alP() {
    }

    static {
        List<AbstractC9025hm> j;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d());
        e = j;
    }
}
