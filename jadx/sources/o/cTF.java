package o;

import com.netflix.model.leafs.SearchPageEntity;
import o.C2331aeI;
import o.C2492ahB;

/* loaded from: classes4.dex */
public class cTF implements SearchPageEntity {
    private final C2492ahB.b a;
    private final C2492ahB.i b;
    private final String d;

    public final String a() {
        return this.d;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public boolean getEnableTitleGroupTreatment() {
        return false;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryBoxartId() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryImgUrl() {
        return null;
    }

    public cTF(String str, C2492ahB.i iVar, C2492ahB.b bVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) iVar, "");
        this.d = str;
        this.b = iVar;
        this.a = bVar;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getVideoId() {
        C2492ahB.h e;
        C2630ajh d;
        C2492ahB.j a = this.b.a();
        if (a == null || (e = a.e()) == null || (d = e.d()) == null) {
            return null;
        }
        return Integer.valueOf(d.e()).toString();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityId() {
        boolean b;
        boolean b2;
        C2492ahB.a c;
        C2344aeV d;
        C2492ahB.h e;
        C2630ajh d2;
        C2492ahB.j a = this.b.a();
        String str = null;
        String a2 = a != null ? a.a() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), a2);
        if (b) {
            C2492ahB.j a3 = this.b.a();
            if (a3 != null && (e = a3.e()) != null && (d2 = e.d()) != null) {
                str = Integer.valueOf(d2.e()).toString();
            }
            if (str != null) {
                return str;
            }
        } else {
            b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), a2);
            if (b2) {
                C2492ahB.j a4 = this.b.a();
                if (a4 != null && (c = a4.c()) != null && (d = c.d()) != null) {
                    str = Integer.valueOf(d.a()).toString();
                }
                if (str != null) {
                    return str;
                }
            }
        }
        return "";
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getUnifiedEntityId() {
        C2492ahB.j a = this.b.a();
        if (a != null) {
            return a.d();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityType() {
        boolean b;
        boolean b2;
        C2492ahB.j a = this.b.a();
        String a2 = a != null ? a.a() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), a2);
        if (b) {
            return C3378axp.e.d().b();
        }
        b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), a2);
        if (b2) {
            return C2942apb.d.c().b();
        }
        C2492ahB.j a3 = this.b.a();
        if (a3 != null) {
            return a3.a();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getTitle() {
        C2492ahB.b bVar = this.a;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        boolean b;
        boolean b2;
        C2492ahB.j a;
        C2492ahB.a c;
        C2331aeI c2;
        C2331aeI.a a2;
        C2492ahB.c e;
        C2492ahB.j a3 = this.b.a();
        String a4 = a3 != null ? a3.a() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), a4);
        if (b) {
            C2492ahB.b bVar = this.a;
            if (bVar == null || (e = bVar.e()) == null) {
                return null;
            }
            return e.c();
        }
        b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), a4);
        if (!b2 || (a = this.b.a()) == null || (c = a.c()) == null || (c2 = c.c()) == null || (a2 = c2.a()) == null) {
            return null;
        }
        return a2.b();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        boolean b;
        boolean b2;
        C2492ahB.j a;
        C2492ahB.a c;
        C2331aeI c2;
        C2331aeI.a a2;
        C2492ahB.c e;
        C2492ahB.j a3 = this.b.a();
        String a4 = a3 != null ? a3.a() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), a4);
        if (b) {
            C2492ahB.b bVar = this.a;
            if (bVar == null || (e = bVar.e()) == null) {
                return null;
            }
            return e.a();
        }
        b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), a4);
        if (!b2 || (a = this.b.a()) == null || (c = a.c()) == null || (c2 = c.c()) == null || (a2 = c2.a()) == null) {
            return null;
        }
        return a2.d();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getDisplayHeader() {
        C2492ahB.b bVar = this.a;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }
}
