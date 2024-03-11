package o;

import o.C2416afo;

/* loaded from: classes4.dex */
public class cTY extends cTX {
    private final C2416afo.u c;
    private final C2416afo.r d;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cTY(String str, C2416afo.u uVar, C2416afo.r rVar) {
        super(str, uVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) uVar, "");
        this.e = str;
        this.c = uVar;
        this.d = rVar;
    }

    @Override // o.cTX, com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        C2416afo.C2417a d;
        C2416afo.C2420d d2;
        C2416afo.r rVar = this.d;
        if (rVar == null || (d = rVar.d()) == null || (d2 = d.d()) == null) {
            return null;
        }
        return d2.a();
    }

    @Override // o.cTX, com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        C2416afo.C2417a d;
        C2416afo.C2420d d2;
        C2416afo.r rVar = this.d;
        if (rVar == null || (d = rVar.d()) == null || (d2 = d.d()) == null) {
            return null;
        }
        return d2.a();
    }

    @Override // o.cTX, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryImgUrl() {
        C2416afo.C2417a d;
        C2416afo.C2420d d2;
        C2416afo.r rVar = this.d;
        if (rVar == null || (d = rVar.d()) == null || (d2 = d.d()) == null) {
            return null;
        }
        return d2.c();
    }

    @Override // o.cTX, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryBoxartId() {
        C2416afo.C2417a d;
        C2416afo.C2420d d2;
        C2416afo.r rVar = this.d;
        if (rVar == null || (d = rVar.d()) == null || (d2 = d.d()) == null) {
            return null;
        }
        return d2.a();
    }
}
