package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.akl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2687akl {
    private static final List<AbstractC9025hm> c;
    public static final C2687akl d = new C2687akl();

    public final List<AbstractC9025hm> e() {
        return c;
    }

    private C2687akl() {
    }

    static {
        List<AbstractC9025hm> j;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("headerId", eVar.e()).d(), new C9018hf.a("headerText", eVar.e()).d());
        c = j;
    }
}
