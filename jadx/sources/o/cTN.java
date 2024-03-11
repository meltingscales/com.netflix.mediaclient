package o;

import o.C2416afo;

/* loaded from: classes4.dex */
public class cTN extends cTO {
    private final C2416afo.m c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cTN(String str, C2416afo.q qVar, C2416afo.m mVar) {
        super(str, qVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) qVar, "");
        this.c = mVar;
    }

    @Override // o.cTO, com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        C2416afo.i d;
        C2416afo.m mVar = this.c;
        if (mVar == null || (d = mVar.d()) == null) {
            return null;
        }
        return d.b();
    }

    @Override // o.cTO, com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        C2416afo.i d;
        C2416afo.m mVar = this.c;
        if (mVar == null || (d = mVar.d()) == null) {
            return null;
        }
        return d.e();
    }

    @Override // o.cTO, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryImgUrl() {
        C2416afo.i d;
        C2416afo.m mVar = this.c;
        if (mVar == null || (d = mVar.d()) == null) {
            return null;
        }
        return d.b();
    }

    @Override // o.cTO, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryBoxartId() {
        C2416afo.i d;
        C2416afo.m mVar = this.c;
        if (mVar == null || (d = mVar.d()) == null) {
            return null;
        }
        return d.e();
    }
}
