package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.akn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2689akn {
    public static final C2689akn b = new C2689akn();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> d() {
        return d;
    }

    private C2689akn() {
    }

    static {
        List<AbstractC9025hm> j;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("genreId", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("name", eVar.e()).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d());
        d = j;
    }
}
