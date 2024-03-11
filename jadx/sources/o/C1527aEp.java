package o;

import o.C2340aeR;
import o.C2454agQ;
import o.C2489agz;

/* renamed from: o.aEp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1527aEp extends C1518aEg implements InterfaceC5145btI {
    private final C2340aeR.c b;
    private final C2489agz.i d;
    private final C2489agz.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527aEp(C2454agQ.d dVar, C2344aeV c2344aeV, C2342aeT c2342aeT, C2489agz.b bVar, C2347aeY c2347aeY) {
        super(dVar, c2344aeV, c2342aeT, c2347aeY);
        C2340aeR c;
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) c2344aeV, "");
        C8632dsu.c((Object) c2342aeT, "");
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) c2347aeY, "");
        this.e = bVar;
        C2489agz.e c2 = bVar.c();
        C2340aeR.c cVar = null;
        C2489agz.i a = c2 != null ? c2.a() : null;
        this.d = a;
        if (a != null && (c = a.c()) != null) {
            cVar = c.c();
        }
        this.b = cVar;
    }

    @Override // o.InterfaceC5145btI
    public String j() {
        C2489agz.a a = this.e.a();
        if (a != null) {
            return a.c();
        }
        return null;
    }

    @Override // o.InterfaceC5145btI
    public String n() {
        C2489agz.d e = this.e.e();
        if (e != null) {
            return e.e();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public String k() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer i() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer f() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer o() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public String h() {
        C2340aeR.c cVar = this.b;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // o.InterfaceC5146btJ
    public boolean m() {
        C2339aeQ b;
        Boolean d;
        C2489agz.i iVar = this.d;
        if (iVar == null || (b = iVar.b()) == null || (d = b.d()) == null) {
            return false;
        }
        return d.booleanValue();
    }

    @Override // o.InterfaceC5146btJ
    public String g() {
        C2339aeQ b;
        String num;
        C2489agz.i iVar = this.d;
        if (iVar == null || (b = iVar.b()) == null || (num = Integer.valueOf(b.b()).toString()) == null) {
            String id = getId();
            C8632dsu.a(id, "");
            return id;
        }
        return num;
    }
}
