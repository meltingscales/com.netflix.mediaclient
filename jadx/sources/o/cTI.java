package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.CreatorHomeBanner;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.List;
import o.C2492ahB;
import o.C2494ahD;
import o.C2542ahz;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cTI implements SearchSectionSummary {
    private final long a;
    private final String b;
    private final C2542ahz d;
    private final String e;
    private final String f;
    private final int g;
    private final C2494ahD h;
    private final int i;
    private final String j;

    public final String b() {
        String str = this.b;
        return str == null ? "" : str;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getEntityTreatmentType() {
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public String getImpressionToken() {
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        return this.g;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getPageKind() {
        return this.f;
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        return this.j;
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
        return this.i;
    }

    public cTI(C2494ahD c2494ahD, C2542ahz c2542ahz, int i, String str, int i2, String str2, long j, String str3, String str4) {
        C8632dsu.c((Object) c2494ahD, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.h = c2494ahD;
        this.d = c2542ahz;
        this.g = i;
        this.f = str;
        this.i = i2;
        this.j = str2;
        this.a = j;
        this.e = str3;
        this.b = str4;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return this.h.b();
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        String e = this.h.e();
        return e == null ? "" : e;
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return InterfaceC5178btp.c.e();
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        Integer d = this.h.d();
        if (d != null) {
            return d.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5281bvm
    public String getListId() {
        return this.h.b();
    }

    @Override // o.InterfaceC5281bvm
    public String getListContext() {
        return this.h.c();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getDisplayString() {
        return this.h.e();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getListType() {
        C2492ahB b;
        C2492ahB.i b2;
        C2492ahB.j a2;
        C2494ahD.c a3 = this.h.a();
        String str = null;
        List<C2494ahD.b> a4 = a3 != null ? a3.a() : null;
        if (a4 != null && (!a4.isEmpty())) {
            C2494ahD.d d = a4.get(0).d();
            if (d != null && (b = d.b()) != null && (b2 = b.b()) != null && (a2 = b2.a()) != null) {
                str = a2.a();
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
        return this.h.b();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getFeature() {
        return this.h.c();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getReferenceId() {
        String b = this.h.b();
        String str = this.j;
        return str + "|" + b;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public Long getExpiresTime() {
        return Long.valueOf(this.a);
    }

    /* loaded from: classes4.dex */
    public static final class a implements CreatorHomeBanner {
        a() {
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getUrl() {
            C2542ahz.a b;
            C2542ahz.d e = cTI.this.d.e();
            if (e == null || (b = e.b()) == null) {
                return null;
            }
            return b.c();
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public JSONObject getTrackingInfo() {
            C2542ahz.a b;
            JSONObject jSONObject = new JSONObject();
            C2542ahz.d e = cTI.this.d.e();
            jSONObject.put("imageTypeIdentifier", (e == null || (b = e.b()) == null) ? null : b.a());
            C2542ahz.d e2 = cTI.this.d.e();
            jSONObject.put("entityId", e2 != null ? e2.d() : null);
            Integer d = cTI.this.h.d();
            jSONObject.put("trackId", d != null ? d.intValue() : -1);
            return jSONObject;
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getCreatorHomeId() {
            C2542ahz.d e = cTI.this.d.e();
            if (e != null) {
                return e.d();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getCreatorHomeTitle() {
            C2542ahz.d e = cTI.this.d.e();
            String c = e != null ? e.c() : null;
            return c == null ? "" : c;
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getUnifiedEntityId() {
            C2542ahz.d e = cTI.this.d.e();
            String e2 = e != null ? e.e() : null;
            return e2 == null ? "" : e2;
        }
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public CreatorHomeBanner getCreatorHomeBanner() {
        if (this.d != null) {
            return new a();
        }
        return null;
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        List<C2494ahD.b> a2;
        C2494ahD.c a3 = this.h.a();
        if (a3 == null || (a2 = a3.a()) == null) {
            return 0;
        }
        return a2.size();
    }
}
