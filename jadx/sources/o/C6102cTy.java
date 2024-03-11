package o;

import com.netflix.model.leafs.SearchPageEntity;
import o.C2502ahL;

/* renamed from: o.cTy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6102cTy implements SearchPageEntity {
    private final String a;
    private final C2502ahL.n d;

    public final String e() {
        return this.a;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public boolean getEnableTitleGroupTreatment() {
        return false;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getImageUrl() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryBoxartId() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getPreQueryImgUrl() {
        return null;
    }

    public C6102cTy(String str, C2502ahL.n nVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) nVar, "");
        this.a = str;
        this.d = nVar;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getVideoId() {
        C2502ahL.l a;
        C2630ajh b;
        C2502ahL.p c = this.d.c();
        if (c == null || (a = c.a()) == null || (b = a.b()) == null) {
            return null;
        }
        return Integer.valueOf(b.e()).toString();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityId() {
        boolean b;
        boolean b2;
        C2502ahL.j d;
        C2344aeV c;
        C2502ahL.l a;
        C2630ajh b3;
        C2502ahL.p c2 = this.d.c();
        String str = null;
        String c3 = c2 != null ? c2.c() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), c3);
        if (b) {
            C2502ahL.p c4 = this.d.c();
            if (c4 != null && (a = c4.a()) != null && (b3 = a.b()) != null) {
                str = Integer.valueOf(b3.e()).toString();
            }
            if (str != null) {
                return str;
            }
        } else {
            b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), c3);
            if (b2) {
                C2502ahL.p c5 = this.d.c();
                if (c5 != null && (d = c5.d()) != null && (c = d.c()) != null) {
                    str = Integer.valueOf(c.a()).toString();
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
        C2502ahL.p c = this.d.c();
        if (c != null) {
            return c.e();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityType() {
        boolean b;
        boolean b2;
        C2502ahL.p c = this.d.c();
        String c2 = c != null ? c.c() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), c2);
        if (b) {
            return C3378axp.e.d().b();
        }
        b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), c2);
        if (b2) {
            return C2942apb.d.c().b();
        }
        C2502ahL.p c3 = this.d.c();
        if (c3 != null) {
            return c3.c();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getTitle() {
        return this.d.d();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getDisplayHeader() {
        return this.d.d();
    }
}
