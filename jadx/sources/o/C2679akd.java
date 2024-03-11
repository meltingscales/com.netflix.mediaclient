package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.akd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2679akd {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> d;
    public static final C2679akd e = new C2679akd();

    public final List<AbstractC9025hm> e() {
        return d;
    }

    private C2679akd() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("LiveEvent");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LiveEvent", e2).b(C2652akC.d.a()).a());
        a = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("liveEvent", C2931apQ.e.b()).e(j).d());
        d = j2;
    }
}
