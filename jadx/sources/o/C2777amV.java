package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.amV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2777amV {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> d;
    public static final C2777amV e = new C2777amV();

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C2777amV() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e3;
        e2 = C8566dqi.e("Profile");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Profile", e2).b(C2799amr.d.a()).a());
        d = j;
        e3 = C8566dqi.e(new C9018hf.a("currentProfile", C3137atK.a.d()).e(j).d());
        a = e3;
    }
}
