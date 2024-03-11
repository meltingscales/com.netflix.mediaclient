package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2683akh {
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2683akh e = new C2683akh();

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2683akh() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e2;
        List e3;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("displayName", eVar.e()).d());
        d = j;
        C9018hf.a aVar = new C9018hf.a("tags", C9019hg.a((AbstractC9026hn) C2881aoT.b.c()));
        e2 = C8566dqi.e(new C9021hi.d("tagsCriteria").b());
        e3 = C8566dqi.e("Game");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("gameId", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), aVar.b(e2).e(j).d(), new C9017he.d("Game", e3).b(C2684aki.a.a()).a());
        c = j2;
    }
}
