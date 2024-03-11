package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.CreatorHomeBanner;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.List;
import o.C2411afj;
import o.C2415afn;
import o.C2416afo;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cTV implements SearchSectionSummary {
    private final String a;
    private final C2411afj b;
    private final long d;
    private final String e;
    private final String f;
    private final int g;
    private final String h;
    private final C2415afn i;
    private final int j;

    public final String b() {
        String str = this.a;
        return str == null ? "" : str;
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
        return this.h;
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        return this.f;
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
        return this.j;
    }

    public cTV(C2415afn c2415afn, C2411afj c2411afj, int i, String str, int i2, String str2, long j, String str3, String str4) {
        C8632dsu.c((Object) c2415afn, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.i = c2415afn;
        this.b = c2411afj;
        this.g = i;
        this.h = str;
        this.j = i2;
        this.f = str2;
        this.d = j;
        this.e = str3;
        this.a = str4;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return this.i.e();
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        String b2 = this.i.b();
        return b2 == null ? "" : b2;
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return InterfaceC5178btp.c.e();
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        Integer d = this.i.d();
        if (d != null) {
            return d.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5281bvm
    public String getListId() {
        return this.i.e();
    }

    @Override // o.InterfaceC5281bvm
    public String getListContext() {
        return this.i.a();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getDisplayString() {
        return this.i.b();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getListType() {
        C2416afo b2;
        C2416afo.q c;
        C2416afo.z b3;
        C2415afn.e c2 = this.i.c();
        String str = null;
        List<C2415afn.d> c3 = c2 != null ? c2.c() : null;
        if (c3 != null && (!c3.isEmpty())) {
            C2415afn.b e = c3.get(0).e();
            if (e != null && (b2 = e.b()) != null && (c = b2.c()) != null && (b3 = c.b()) != null) {
                str = b3.d();
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
        return this.i.e();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getFeature() {
        return this.i.a();
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getReferenceId() {
        String e = this.i.e();
        String str = this.f;
        return str + "|" + e;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public Long getExpiresTime() {
        return Long.valueOf(this.d);
    }

    /* loaded from: classes4.dex */
    public static final class b implements CreatorHomeBanner {
        b() {
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getUrl() {
            C2411afj.a a;
            C2411afj.b c;
            C2411afj.g c2 = cTV.this.b.c();
            if (c2 == null || (a = c2.a()) == null || (c = a.c()) == null) {
                return null;
            }
            return c.e();
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public JSONObject getTrackingInfo() {
            C2411afj.a a;
            C2411afj.a a2;
            C2411afj.b c;
            JSONObject jSONObject = new JSONObject();
            C2411afj.g c2 = cTV.this.b.c();
            String str = null;
            jSONObject.put("imageTypeIdentifier", (c2 == null || (a2 = c2.a()) == null || (c = a2.c()) == null) ? null : c.a());
            C2411afj.g c3 = cTV.this.b.c();
            if (c3 != null && (a = c3.a()) != null) {
                str = a.b();
            }
            jSONObject.put("entityId", str);
            Integer d = cTV.this.i.d();
            jSONObject.put("trackId", d != null ? d.intValue() : -1);
            return jSONObject;
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getCreatorHomeId() {
            C2411afj.a a;
            C2411afj.g c = cTV.this.b.c();
            if (c == null || (a = c.a()) == null) {
                return null;
            }
            return a.d();
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getCreatorHomeTitle() {
            C2411afj.a a;
            String e;
            C2411afj.g c = cTV.this.b.c();
            return (c == null || (a = c.a()) == null || (e = a.e()) == null) ? "" : e;
        }

        @Override // com.netflix.model.leafs.CreatorHomeBanner
        public String getUnifiedEntityId() {
            C2411afj.a a;
            String b;
            C2411afj.g c = cTV.this.b.c();
            return (c == null || (a = c.a()) == null || (b = a.b()) == null) ? "" : b;
        }
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public CreatorHomeBanner getCreatorHomeBanner() {
        if (this.b != null) {
            return new b();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.SearchSectionSummary
    public String getEntityTreatmentType() {
        List<C2415afn.d> c;
        C2415afn.d dVar;
        C2416afo b2;
        C2416afo b3;
        C2416afo b4;
        C2416afo b5;
        C2416afo b6;
        C2415afn.e c2 = this.i.c();
        if (c2 != null && (c = c2.c()) != null && (dVar = c.get(0)) != null) {
            C2415afn.b e = dVar.e();
            if (((e == null || (b6 = e.b()) == null) ? null : b6.a()) != null) {
                return C2956app.a.e().b();
            }
            C2415afn.b e2 = dVar.e();
            if (((e2 == null || (b5 = e2.b()) == null) ? null : b5.e()) != null) {
                return C2960apt.e.b().b();
            }
            C2415afn.b e3 = dVar.e();
            if (((e3 == null || (b4 = e3.b()) == null) ? null : b4.h()) != null) {
                return C3177aty.a.e().b();
            }
            C2415afn.b e4 = dVar.e();
            if (((e4 == null || (b3 = e4.b()) == null) ? null : b3.b()) != null) {
                return C2922apH.a.c().b();
            }
            C2415afn.b e5 = dVar.e();
            if (((e5 == null || (b2 = e5.b()) == null) ? null : b2.i()) != null) {
                return C3130atD.b.b().b();
            }
        }
        return null;
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        List<C2415afn.d> c;
        C2415afn.e c2 = this.i.c();
        if (c2 == null || (c = c2.c()) == null) {
            return 0;
        }
        return c.size();
    }
}
