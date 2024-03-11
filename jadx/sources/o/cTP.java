package o;

import o.C2416afo;

/* loaded from: classes4.dex */
public class cTP extends cTO {
    private final C2416afo.l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cTP(String str, C2416afo.q qVar, C2416afo.l lVar) {
        super(str, qVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) qVar, "");
        this.b = lVar;
    }

    @Override // o.cTO, com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        C2416afo.g d;
        C2416afo.l lVar = this.b;
        if (lVar == null || (d = lVar.d()) == null) {
            return null;
        }
        return d.e();
    }

    @Override // o.cTO, com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        C2416afo.g d;
        C2416afo.l lVar = this.b;
        if (lVar == null || (d = lVar.d()) == null) {
            return null;
        }
        return d.b();
    }
}
