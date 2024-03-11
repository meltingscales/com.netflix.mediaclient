package o;

import o.C2431afu;
import o.C2492ahB;

/* renamed from: o.cTx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6101cTx extends cTF {
    private final C2492ahB.b a;
    private final C2431afu c;
    private final C2492ahB.i d;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6101cTx(String str, C2492ahB.i iVar, C2492ahB.b bVar, C2431afu c2431afu) {
        super(str, iVar, bVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) iVar, "");
        C8632dsu.c((Object) c2431afu, "");
        this.e = str;
        this.d = iVar;
        this.a = bVar;
        this.c = c2431afu;
    }

    @Override // o.cTF, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryImgUrl() {
        C2431afu.b b = this.c.b();
        if (b != null) {
            return b.d();
        }
        return null;
    }

    @Override // o.cTF, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryBoxartId() {
        C2431afu.b b = this.c.b();
        if (b != null) {
            return b.c();
        }
        return null;
    }
}
