package o;

import o.C2305adj;
import o.C2319adx;
import o.C2529ahm;

/* loaded from: classes3.dex */
public final class aDF extends aEV {
    private final C2271adB b;
    private String d;
    private String e;
    private Integer j;

    public final Integer c() {
        return this.j;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aDF(C2529ahm.e eVar, C2305adj.e eVar2) {
        super(eVar);
        C2319adx b;
        C2319adx.b d;
        C2630ajh a;
        C2630ajh a2;
        C2305adj.d b2;
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) eVar2, "");
        C2305adj.a c = eVar2.c();
        String str = null;
        C2271adB d2 = (c == null || (b2 = c.b()) == null) ? null : b2.d();
        this.b = d2;
        this.j = (d2 == null || (a2 = d2.a()) == null) ? null : Integer.valueOf(a2.e());
        this.d = (d2 == null || (a = d2.a()) == null) ? null : a.c();
        if (d2 != null && (b = d2.b()) != null && (d = b.d()) != null) {
            str = d.b();
        }
        this.e = str;
    }
}
