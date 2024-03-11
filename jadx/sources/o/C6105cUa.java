package o;

import o.C2416afo;

/* renamed from: o.cUa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6105cUa extends cTX {
    private final C2416afo.t c;
    private final String d;
    private final C2416afo.u e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6105cUa(String str, C2416afo.u uVar, C2416afo.t tVar) {
        super(str, uVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) uVar, "");
        this.d = str;
        this.e = uVar;
        this.c = tVar;
    }

    @Override // o.cTX, com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        C2416afo.h c;
        C2416afo.C2418b c2;
        C2416afo.t tVar = this.c;
        if (tVar == null || (c = tVar.c()) == null || (c2 = c.c()) == null) {
            return null;
        }
        return c2.c();
    }

    @Override // o.cTX, com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        C2416afo.h c;
        C2416afo.C2418b c2;
        C2416afo.t tVar = this.c;
        if (tVar == null || (c = tVar.c()) == null || (c2 = c.c()) == null) {
            return null;
        }
        return c2.d();
    }
}
