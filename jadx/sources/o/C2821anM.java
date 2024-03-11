package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.anM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2821anM {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2821anM d = new C2821anM();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return a;
    }

    private C2821anM() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> e2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("fullHandle", eVar.e()).d());
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("handle", C3193auN.c.d()).e(j).d());
        e = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("publicIdentity", C3144atR.a.e()).e(j2).d());
        c = j3;
        e2 = C8566dqi.e(new C9018hf.a("currentProfile", C3137atK.a.d()).e(j3).d());
        a = e2;
    }
}
