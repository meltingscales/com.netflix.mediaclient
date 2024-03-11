package o;

import o.C2502ahL;

/* loaded from: classes4.dex */
public class cTC extends C6102cTy {
    private final String b;
    private final C2502ahL.n c;
    private final C2502ahL.h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cTC(String str, C2502ahL.n nVar, C2502ahL.h hVar) {
        super(str, nVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) nVar, "");
        this.b = str;
        this.c = nVar;
        this.e = hVar;
    }

    @Override // o.C6102cTy, com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        C2502ahL.a b;
        C2502ahL.c d;
        C2502ahL.h hVar = this.e;
        if (hVar == null || (b = hVar.b()) == null || (d = b.d()) == null) {
            return null;
        }
        return d.e();
    }

    @Override // o.C6102cTy, com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        C2502ahL.a b;
        C2502ahL.c d;
        C2502ahL.h hVar = this.e;
        if (hVar == null || (b = hVar.b()) == null || (d = b.d()) == null) {
            return null;
        }
        return d.e();
    }

    @Override // o.C6102cTy, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryImgUrl() {
        C2502ahL.a b;
        C2502ahL.c d;
        C2502ahL.h hVar = this.e;
        if (hVar == null || (b = hVar.b()) == null || (d = b.d()) == null) {
            return null;
        }
        return d.d();
    }

    @Override // o.C6102cTy, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryBoxartId() {
        C2502ahL.a b;
        C2502ahL.c d;
        C2502ahL.h hVar = this.e;
        if (hVar == null || (b = hVar.b()) == null || (d = b.d()) == null) {
            return null;
        }
        return d.e();
    }
}
