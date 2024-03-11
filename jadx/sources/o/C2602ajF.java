package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.ajF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2602ajF {
    private static final List<AbstractC9025hm> a;
    public static final C2602ajF b = new C2602ajF();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return d;
    }

    private C2602ajF() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, d3, new C9018hf.a("personId", C9019hg.d(cVar.d())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9018hf.a("name", eVar.e()).d());
        a = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3066art.e.d()).e(j).d());
        e = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", cVar.d()).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C3062arp.c.a())).e(j2).d());
        d = j3;
    }
}
