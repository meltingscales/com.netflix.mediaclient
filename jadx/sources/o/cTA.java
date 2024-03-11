package o;

import o.C2502ahL;

/* loaded from: classes4.dex */
public class cTA extends C6102cTy {
    private final C2502ahL.n a;
    private final C2502ahL.g b;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cTA(String str, C2502ahL.n nVar, C2502ahL.g gVar) {
        super(str, nVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) nVar, "");
        this.d = str;
        this.a = nVar;
        this.b = gVar;
    }

    @Override // o.C6102cTy, com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        C2502ahL.d d;
        C2502ahL.e c;
        C2502ahL.g gVar = this.b;
        if (gVar == null || (d = gVar.d()) == null || (c = d.c()) == null) {
            return null;
        }
        return c.a();
    }

    @Override // o.C6102cTy, com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        C2502ahL.d d;
        C2502ahL.e c;
        C2502ahL.g gVar = this.b;
        if (gVar == null || (d = gVar.d()) == null || (c = d.c()) == null) {
            return null;
        }
        return c.c();
    }
}
