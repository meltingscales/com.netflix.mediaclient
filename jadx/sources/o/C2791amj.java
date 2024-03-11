package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C3145atS;
import o.C9018hf;

/* renamed from: o.amj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2791amj {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2791amj d = new C2791amj();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> b() {
        return b;
    }

    private C2791amj() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        e = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("hexString", eVar.e()).d());
        a = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("hexString", eVar.e()).d());
        c = j3;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C3145atS.e eVar2 = C3145atS.a;
        j4 = C8569dql.j(d2, new C9018hf.a("accentColor", eVar2.a()).e(j2).d(), new C9018hf.a("backgroundColor", eVar2.a()).e(j3).d());
        h = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("boxshotImage", C3150atX.b.b()).e(j).d(), new C9018hf.a("theme", C3143atQ.b.a()).e(j4).d(), new C9018hf.a("slug", eVar.e()).d());
        b = j5;
    }
}
