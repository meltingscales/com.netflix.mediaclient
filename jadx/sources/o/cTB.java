package o;

import o.C2492ahB;
import o.C2506ahP;
import o.C2590aiu;

/* loaded from: classes4.dex */
public final class cTB extends cTF {
    private final C2506ahP.c a;
    private final C2492ahB.i b;
    private final String c;
    private final C2492ahB.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cTB(String str, C2492ahB.i iVar, C2492ahB.b bVar, C2506ahP.c cVar) {
        super(str, iVar, bVar);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) iVar, "");
        C8632dsu.c((Object) cVar, "");
        this.c = str;
        this.b = iVar;
        this.d = bVar;
        this.a = cVar;
    }

    @Override // o.cTF, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryImgUrl() {
        C2590aiu.a c = this.a.b().c();
        if (c != null) {
            return c.c();
        }
        return null;
    }

    @Override // o.cTF, com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryBoxartId() {
        C2590aiu.a c = this.a.b().c();
        if (c != null) {
            return c.b();
        }
        return null;
    }
}
