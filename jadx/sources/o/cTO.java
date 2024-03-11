package o;

import com.netflix.model.leafs.SearchPageEntity;
import o.C2416afo;

/* loaded from: classes4.dex */
public class cTO implements SearchPageEntity {
    private final C2416afo.q a;
    private final String b;

    public final String e() {
        return this.b;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getBoxartId() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getDisplayHeader() {
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

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getTitle() {
        return null;
    }

    public cTO(String str, C2416afo.q qVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) qVar, "");
        this.b = str;
        this.a = qVar;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getVideoId() {
        C2416afo.v e;
        C2630ajh c;
        C2416afo.z b = this.a.b();
        if (b == null || (e = b.e()) == null || (c = e.c()) == null) {
            return null;
        }
        return Integer.valueOf(c.e()).toString();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityId() {
        boolean b;
        boolean b2;
        C2416afo.j c;
        C2344aeV d;
        C2416afo.v e;
        C2630ajh c2;
        C2416afo.z b3 = this.a.b();
        String str = null;
        String d2 = b3 != null ? b3.d() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), d2);
        if (b) {
            C2416afo.z b4 = this.a.b();
            if (b4 != null && (e = b4.e()) != null && (c2 = e.c()) != null) {
                str = Integer.valueOf(c2.e()).toString();
            }
            if (str != null) {
                return str;
            }
        } else {
            b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), d2);
            if (b2) {
                C2416afo.z b5 = this.a.b();
                if (b5 != null && (c = b5.c()) != null && (d = c.d()) != null) {
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
        C2416afo.z b = this.a.b();
        if (b != null) {
            return b.a();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityType() {
        boolean b;
        boolean b2;
        C2416afo.z b3 = this.a.b();
        String d = b3 != null ? b3.d() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), d);
        if (b) {
            return C3378axp.e.d().b();
        }
        b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), d);
        if (b2) {
            return C2942apb.d.c().b();
        }
        C2416afo.z b4 = this.a.b();
        if (b4 != null) {
            return b4.d();
        }
        return null;
    }
}
