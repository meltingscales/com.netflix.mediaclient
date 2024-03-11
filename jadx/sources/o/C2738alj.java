package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2873aoL;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.alj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2738alj {
    public static final C2738alj b = new C2738alj();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> d() {
        return d;
    }

    private C2738alj() {
    }

    static {
        List<AbstractC9025hm> j;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2873aoL.b bVar = C2873aoL.a;
        j = C8569dql.j(d2, new C9018hf.a("expires", bVar.d()).d(), new C9018hf.a("createTime", bVar.d()).d(), new C9018hf.a("size", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("lolomoId", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d());
        d = j;
    }
}
