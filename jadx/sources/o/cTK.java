package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.CreatorHomeBanner;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.List;
import o.C2498ahH;
import o.C2499ahI;
import o.C2502ahL;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cTK implements SearchSectionSummary {
    private final C2498ahH a;
    private final String b;
    private final long d;
    private final String e;
    private final int f;
    private final String g;
    private final int h;
    private final String i;
    private final C2499ahI j;

    public final String a() {
        String str = this.b;
        return str == null ? "" : str;
    }

    @Override // o.InterfaceC5281bvm
    public String getImpressionToken() {
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        return this.f;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getPageKind() {
        return this.g;
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        return this.i;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getSecondaryTitle() {
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public String getSectionUid() {
        return null;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public int getSuggestedNumOfVideos() {
        return 0;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public int getTotalSections() {
        return this.h;
    }

    public cTK(C2499ahI c2499ahI, C2498ahH c2498ahH, int i, String str, int i2, String str2, long j, String str3, String str4) {
        C8632dsu.c((Object) c2499ahI, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.j = c2499ahI;
        this.a = c2498ahH;
        this.f = i;
        this.g = str;
        this.h = i2;
        this.i = str2;
        this.d = j;
        this.e = str3;
        this.b = str4;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return this.j.b();
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        String e = this.j.e();
        return e == null ? "" : e;
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return InterfaceC5178btp.c.e();
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        Integer c = this.j.c();
        if (c != null) {
            return c.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5281bvm
    public String getListId() {
        return this.j.b();
    }

    @Override // o.InterfaceC5281bvm
    public String getListContext() {
        return this.j.a();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getDisplayString() {
        return this.j.e();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getListType() {
        C2502ahL e;
        C2502ahL.n h;
        C2502ahL.p c;
        C2499ahI.d d = this.j.d();
        String str = null;
        List<C2499ahI.b> e2 = d != null ? d.e() : null;
        if (e2 != null && (!e2.isEmpty())) {
            C2499ahI.e b = e2.get(0).b();
            if (b != null && (e = b.e()) != null && (h = e.h()) != null && (c = h.c()) != null) {
                str = c.c();
            }
            if (C8632dsu.c((Object) str, (Object) C2942apb.d.c().b())) {
                if (C8632dsu.c((Object) this.e, (Object) C3120asu.a.e().b())) {
                    return "GameCarousel";
                }
                if (C8632dsu.c((Object) this.e, (Object) C3091asR.d.e().b())) {
                    return "GameGallery";
                }
            }
        }
        return this.e;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getSectionId() {
        return this.j.b();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getFeature() {
        return this.j.a();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getReferenceId() {
        String b = this.j.b();
        String str = this.i;
        return str + "|" + b;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public Long getExpiresTime() {
        return Long.valueOf(this.d);
    }

    /* loaded from: classes4.dex */
    public static final class a implements CreatorHomeBanner {
        a() {
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getUrl() {
            C2498ahH.b d;
            C2498ahH.a e;
            C2498ahH.c c;
            C2498ahH.e a = cTK.this.a.a();
            if (a == null || (d = a.d()) == null || (e = d.e()) == null || (c = e.c()) == null) {
                return null;
            }
            return c.a();
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public JSONObject getTrackingInfo() {
            C2498ahH.b d;
            C2498ahH.a e;
            C2498ahH.b d2;
            C2498ahH.a e2;
            C2498ahH.c c;
            JSONObject jSONObject = new JSONObject();
            C2498ahH.e a = cTK.this.a.a();
            String str = null;
            jSONObject.put("imageTypeIdentifier", (a == null || (d2 = a.d()) == null || (e2 = d2.e()) == null || (c = e2.c()) == null) ? null : c.e());
            C2498ahH.e a2 = cTK.this.a.a();
            if (a2 != null && (d = a2.d()) != null && (e = d.e()) != null) {
                str = e.a();
            }
            jSONObject.put("entityId", str);
            Integer c2 = cTK.this.j.c();
            jSONObject.put("trackId", c2 != null ? c2.intValue() : -1);
            return jSONObject;
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getCreatorHomeId() {
            C2498ahH.b d;
            C2498ahH.a e;
            C2498ahH.d b;
            C2498ahH.e a = cTK.this.a.a();
            if (a == null || (d = a.d()) == null || (e = d.e()) == null || (b = e.b()) == null) {
                return null;
            }
            return b.b();
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getCreatorHomeTitle() {
            C2498ahH.b d;
            C2498ahH.a e;
            C2498ahH.d b;
            C2498ahH.e a = cTK.this.a.a();
            String e2 = (a == null || (d = a.d()) == null || (e = d.e()) == null || (b = e.b()) == null) ? null : b.e();
            return e2 == null ? "" : e2;
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getUnifiedEntityId() {
            C2498ahH.b d;
            C2498ahH.a e;
            C2498ahH.e a = cTK.this.a.a();
            String a2 = (a == null || (d = a.d()) == null || (e = d.e()) == null) ? null : e.a();
            return a2 == null ? "" : a2;
        }
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public CreatorHomeBanner getCreatorHomeBanner() {
        if (this.a != null) {
            return new a();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getEntityTreatmentType() {
        List<C2499ahI.b> e;
        C2499ahI.b bVar;
        C2502ahL e2;
        C2502ahL e3;
        C2502ahL e4;
        C2502ahL e5;
        C2502ahL e6;
        C2499ahI.d d = this.j.d();
        if (d != null && (e = d.e()) != null && (bVar = e.get(0)) != null) {
            C2499ahI.e b = bVar.b();
            if (((b == null || (e6 = b.e()) == null) ? null : e6.c()) != null) {
                return C3068arv.e.a().b();
            }
            C2499ahI.e b2 = bVar.b();
            if (((b2 == null || (e5 = b2.e()) == null) ? null : e5.a()) != null) {
                return C3023arC.b.c().b();
            }
            C2499ahI.e b3 = bVar.b();
            if (((b3 == null || (e4 = b3.e()) == null) ? null : e4.d()) != null) {
                return C3177aty.a.e().b();
            }
            C2499ahI.e b4 = bVar.b();
            if (((b4 == null || (e3 = b4.e()) == null) ? null : e3.b()) != null) {
                return C3095asV.a.e().b();
            }
            C2499ahI.e b5 = bVar.b();
            if (((b5 == null || (e2 = b5.e()) == null) ? null : e2.e()) != null) {
                return C3130atD.b.b().b();
            }
        }
        return null;
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        List<C2499ahI.b> e;
        C2499ahI.d d = this.j.d();
        if (d == null || (e = d.e()) == null) {
            return 0;
        }
        return e.size();
    }
}
