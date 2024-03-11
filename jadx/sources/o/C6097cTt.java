package o;

import o.C2502ahL;

/* renamed from: o.cTt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6097cTt extends C6102cTy {
    private final C2502ahL.n a;
    private final C2502ahL.i b;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6097cTt(String str, C2502ahL.n nVar, C2502ahL.i iVar) {
        super(str, nVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) nVar, "");
        this.e = str;
        this.a = nVar;
        this.b = iVar;
    }

    @Override // o.C6102cTy, com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        C2502ahL.f a;
        C2502ahL.b e;
        C2502ahL.i iVar = this.b;
        if (iVar == null || (a = iVar.a()) == null || (e = a.e()) == null) {
            return null;
        }
        return e.c();
    }

    @Override // o.C6102cTy, com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        C2502ahL.f a;
        C2502ahL.b e;
        C2502ahL.i iVar = this.b;
        if (iVar == null || (a = iVar.a()) == null || (e = a.e()) == null) {
            return null;
        }
        return e.a();
    }
}
