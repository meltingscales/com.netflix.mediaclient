package o;

import o.C2416afo;

/* renamed from: o.cUb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6106cUb extends cTX {
    private final C2416afo.p b;
    private final C2416afo.u d;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6106cUb(String str, C2416afo.u uVar, C2416afo.p pVar) {
        super(str, uVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) uVar, "");
        this.e = str;
        this.d = uVar;
        this.b = pVar;
    }

    @Override // o.cTX, com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        C2416afo.C2419c e;
        C2416afo.e c;
        C2416afo.p pVar = this.b;
        if (pVar == null || (e = pVar.e()) == null || (c = e.c()) == null) {
            return null;
        }
        return c.e();
    }

    @Override // o.cTX, com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        C2416afo.C2419c e;
        C2416afo.e c;
        C2416afo.p pVar = this.b;
        if (pVar == null || (e = pVar.e()) == null || (c = e.c()) == null) {
            return null;
        }
        return c.b();
    }
}
