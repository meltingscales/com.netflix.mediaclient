package o;

import o.C2529ahm;
import o.C2563aiT;

/* renamed from: o.aDz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1510aDz extends aEV implements InterfaceC5181bts {
    private final C2563aiT d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1510aDz(C2529ahm.e eVar, C2563aiT c2563aiT) {
        super(eVar);
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) c2563aiT, "");
        this.d = c2563aiT;
    }

    @Override // o.InterfaceC5181bts
    public String a() {
        String b = this.d.b();
        return b == null ? "" : b;
    }

    public String c() {
        C2563aiT.b e = this.d.e();
        if (e != null) {
            return e.c();
        }
        return null;
    }

    @Override // o.InterfaceC5181bts
    public String d() {
        C2563aiT.c d;
        C2563aiT.a a = this.d.a();
        if (a == null || (d = a.d()) == null) {
            return null;
        }
        return d.e();
    }

    @Override // o.InterfaceC5181bts
    public String b() {
        C2563aiT.e c;
        C2563aiT.a a = this.d.a();
        if (a == null || (c = a.c()) == null) {
            return null;
        }
        return c.c();
    }
}
