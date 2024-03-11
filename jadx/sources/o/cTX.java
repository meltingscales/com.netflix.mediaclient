package o;

import com.netflix.model.leafs.SearchPageEntity;
import o.C2416afo;

/* loaded from: classes4.dex */
public class cTX implements SearchPageEntity {
    private final String b;
    private final C2416afo.u e;

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

    public cTX(String str, C2416afo.u uVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) uVar, "");
        this.b = str;
        this.e = uVar;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getVideoId() {
        C2416afo.A b;
        C2630ajh c;
        C2416afo.C b2 = this.e.b();
        if (b2 == null || (b = b2.b()) == null || (c = b.c()) == null) {
            return null;
        }
        return Integer.valueOf(c.e()).toString();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityId() {
        boolean b;
        boolean b2;
        C2416afo.k d;
        C2344aeV d2;
        C2416afo.A b3;
        C2630ajh c;
        C2416afo.C b4 = this.e.b();
        String str = null;
        String c2 = b4 != null ? b4.c() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), c2);
        if (b) {
            C2416afo.C b5 = this.e.b();
            if (b5 != null && (b3 = b5.b()) != null && (c = b3.c()) != null) {
                str = Integer.valueOf(c.e()).toString();
            }
            if (str != null) {
                return str;
            }
        } else {
            b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), c2);
            if (b2) {
                C2416afo.C b6 = this.e.b();
                if (b6 != null && (d = b6.d()) != null && (d2 = d.d()) != null) {
                    str = Integer.valueOf(d2.a()).toString();
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
        C2416afo.C b = this.e.b();
        if (b != null) {
            return b.a();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getEntityType() {
        boolean b;
        boolean b2;
        C2416afo.C b3 = this.e.b();
        String c = b3 != null ? b3.c() : null;
        aCM acm = aCM.e;
        b = C8576dqs.b((Iterable<? extends String>) acm.a(), c);
        if (b) {
            return C3378axp.e.d().b();
        }
        b2 = C8576dqs.b((Iterable<? extends String>) acm.b(), c);
        if (b2) {
            return C2942apb.d.c().b();
        }
        C2416afo.C b4 = this.e.b();
        if (b4 != null) {
            return b4.c();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getTitle() {
        return this.e.e();
    }

    @Override // com.netflix.model.leafs.SearchPageEntity
    public String getDisplayHeader() {
        return this.e.e();
    }
}
