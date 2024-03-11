package o;

import o.C2416afo;

/* loaded from: classes4.dex */
public class cTR extends cTO {
    private final C2416afo.o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cTR(String str, C2416afo.q qVar, C2416afo.o oVar) {
        super(str, qVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) qVar, "");
        this.d = oVar;
    }

    @Override // o.cTO, com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        C2416afo.f e;
        C2416afo.o oVar = this.d;
        if (oVar == null || (e = oVar.e()) == null) {
            return null;
        }
        return e.b();
    }

    @Override // o.cTO, com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        C2416afo.f e;
        C2416afo.o oVar = this.d;
        if (oVar == null || (e = oVar.e()) == null) {
            return null;
        }
        return e.e();
    }
}
