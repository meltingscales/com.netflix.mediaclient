package o;

import com.google.gson.Gson;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.model.leafs.PersonSummary;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.TaglineMessage;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.ContentWarning;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: o.cwd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7460cwd implements InterfaceC5198buI, InterfaceC5206buQ, InterfaceC5160btX {
    private final C5327bwf a;
    private final C5327bwf c;
    private final InterfaceC5206buQ d;
    private List<C5333bwl> e = null;
    private final Gson b = (Gson) C1332Xp.b(Gson.class);

    @Override // o.InterfaceC5198buI
    public List<GenreItem> I() {
        return null;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5196buG J() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5198buI K() {
        return null;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5202buM L() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        return false;
    }

    @Override // o.InterfaceC5201buL
    public RecommendedTrailer O() {
        return null;
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5194buE P() {
        return null;
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5238buw Q() {
        return null;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5199buJ S() {
        return null;
    }

    public C5327bwf W() {
        return this.a;
    }

    @Override // o.InterfaceC5198buI
    public VideoInfo.Sharing X() {
        return null;
    }

    public C5327bwf aB() {
        return this.c;
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5160btX aE_() {
        return this;
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        return "";
    }

    @Override // o.InterfaceC5198buI
    public List<TaglineMessage> aa() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public String ad() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public String ae() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ah() {
        return null;
    }

    @Override // o.InterfaceC5187bty
    public boolean aj() {
        return false;
    }

    @Override // o.InterfaceC5187bty
    public boolean ak() {
        return false;
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ao_() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public boolean aq() {
        return false;
    }

    @Override // o.InterfaceC5198buI
    public boolean au() {
        return false;
    }

    public InterfaceC5206buQ ax() {
        return this.d;
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> bO_() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5182btt bQ_() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        return true;
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        return true;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return true;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return true;
    }

    @Override // o.InterfaceC5198buI
    public String j() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public String q() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> r() {
        return null;
    }

    @Override // o.InterfaceC5198buI
    public List<GenreItem> z() {
        return null;
    }

    public C7460cwd(C5327bwf c5327bwf, InterfaceC5206buQ interfaceC5206buQ, C5327bwf c5327bwf2) {
        this.a = c5327bwf;
        this.d = interfaceC5206buQ;
        this.c = c5327bwf2;
    }

    @Override // o.InterfaceC5198buI
    public int ag() {
        return this.a.as;
    }

    @Override // o.InterfaceC5198buI
    public String ab() {
        return this.a.af;
    }

    /* renamed from: o.cwd$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ContextualText.TextContext.values().length];
            b = iArr;
            try {
                iArr[ContextualText.TextContext.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // o.InterfaceC5198buI
    public ContextualText e(ContextualText.TextContext textContext) {
        ContextualText contextualText = (AnonymousClass1.b[textContext.ordinal()] == 1 && this.a.aj != null) ? new ContextualText() { // from class: o.cwd.5
            @Override // o.InterfaceC8323diH
            public long getTimestamp() {
                return 0L;
            }

            @Override // o.InterfaceC8321diF
            public boolean needsRefresh(long j) {
                return false;
            }

            @Override // o.InterfaceC8321diF
            public void setExpires(Long l) {
            }

            @Override // o.InterfaceC8323diH
            public void setTimestamp(long j) {
            }

            @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
            public String text() {
                return C7460cwd.this.a.aj;
            }

            @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
            public String evidenceKey() {
                return C7460cwd.this.a.al;
            }
        } : null;
        if (textContext.e() != null && textContext.e() != textContext) {
            contextualText = e(textContext.e());
        }
        return contextualText == null ? new ContextualText() { // from class: o.cwd.3
            @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
            public String evidenceKey() {
                return null;
            }

            @Override // o.InterfaceC8323diH
            public long getTimestamp() {
                return 0L;
            }

            @Override // o.InterfaceC8321diF
            public boolean needsRefresh(long j) {
                return false;
            }

            @Override // o.InterfaceC8321diF
            public void setExpires(Long l) {
            }

            @Override // o.InterfaceC8323diH
            public void setTimestamp(long j) {
            }

            @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
            public String text() {
                return C7460cwd.this.a.af;
            }
        } : contextualText;
    }

    @Override // o.InterfaceC5198buI
    public String R() {
        return this.a.Z;
    }

    @Override // o.InterfaceC5198buI
    public String bP_() {
        return this.a.d;
    }

    @Override // o.InterfaceC5198buI
    public String v() {
        return this.a.r;
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5183btu
    public String k() {
        return this.a.h;
    }

    @Override // o.InterfaceC5198buI
    public int E() {
        return this.a.X;
    }

    @Override // o.InterfaceC5198buI
    public String Y() {
        return this.a.ah;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return this.a.i;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return this.a.j;
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isOriginal() {
        return this.a.F;
    }

    @Override // o.InterfaceC5198buI
    public boolean F() {
        return this.a.H;
    }

    @Override // o.InterfaceC5198buI
    public boolean aU_() {
        return this.a.m;
    }

    @Override // o.InterfaceC5198buI
    public boolean ao() {
        return this.a.y;
    }

    @Override // o.InterfaceC5198buI
    public boolean am() {
        return this.a.x;
    }

    @Override // o.InterfaceC5198buI
    public boolean M() {
        return this.a.M;
    }

    @Override // o.InterfaceC5198buI
    public String p() {
        return this.a.g;
    }

    @Override // o.InterfaceC5198buI
    public boolean ap() {
        return this.a.G;
    }

    @Override // o.InterfaceC5160btX
    public boolean G() {
        return this.a.I;
    }

    @Override // o.InterfaceC5198buI
    public String D() {
        return this.a.v;
    }

    @Override // o.InterfaceC5173btk
    public String bM_() {
        return this.a.u;
    }

    @Override // o.InterfaceC5198buI
    public String U() {
        return this.a.ad;
    }

    @Override // o.InterfaceC5198buI
    public String c() {
        return this.a.a;
    }

    @Override // o.InterfaceC5198buI
    public String m() {
        return this.a.f;
    }

    @Override // o.InterfaceC5198buI
    public String Z() {
        return this.a.ar;
    }

    @Override // o.InterfaceC5198buI
    public String af() {
        return this.a.ap;
    }

    @Override // o.InterfaceC5198buI
    public String w() {
        return this.a.ad;
    }

    @Override // o.InterfaceC5198buI
    public SupplementalMessageType A_() {
        return SupplementalMessageType.c.e(this.a.ag);
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return this.a.A;
    }

    @Override // o.InterfaceC5198buI
    public List<Advisory> e() {
        InterfaceC1912aSw f = new C6004cQk().f();
        Objects.requireNonNull(f);
        return f.c().d(this.a.e);
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        return this.a.z;
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        return this.a.aa;
    }

    @Override // o.InterfaceC5198buI
    public VideoInfo.TimeCodes B() {
        InterfaceC1912aSw f = new C6004cQk().f();
        Objects.requireNonNull(f);
        return f.c().e(this.a.ak);
    }

    @Override // o.InterfaceC5198buI
    public InteractiveSummary az_() {
        InterfaceC1912aSw f = new C6004cQk().f();
        Objects.requireNonNull(f);
        return f.c().c(this.a.D);
    }

    @Override // o.InterfaceC5198buI
    public boolean as() {
        return az_() != null;
    }

    @Override // o.InterfaceC5198buI
    public ContentWarning o() {
        throw new UnsupportedOperationException("ContentWarning not supported in offline");
    }

    @Override // o.InterfaceC5198buI
    public List<TagSummary> ac() {
        throw new UnsupportedOperationException("Use stripped-down version getTagsAsStrings() instead for offline");
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return this.a.aq;
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        return this.a.am;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.create(this.a.ao);
    }

    public int V() {
        return this.a.ao;
    }

    @Override // o.InterfaceC5187bty
    public boolean ar() {
        return this.a.O;
    }

    @Override // o.InterfaceC5187bty
    public boolean aw() {
        return this.a.S;
    }

    @Override // o.InterfaceC5187bty
    public boolean al() {
        return this.a.f13635J;
    }

    @Override // o.InterfaceC5187bty
    public boolean ai() {
        return this.a.w;
    }

    @Override // o.InterfaceC5187bty
    public boolean av() {
        return this.a.R;
    }

    @Override // o.InterfaceC5187bty
    public boolean an() {
        return this.a.P;
    }

    @Override // o.InterfaceC5158btV
    public int getUserThumbRating() {
        throw new UnsupportedOperationException("not supported in offline");
    }

    @Override // o.InterfaceC5158btV, com.netflix.model.leafs.PostPlayItem
    public int getMatchPercentage() {
        throw new UnsupportedOperationException("not supported in offline");
    }

    @Override // o.InterfaceC5206buQ
    public String aH_() {
        return this.a.aq;
    }

    @Override // o.InterfaceC5206buQ
    public int aN_() {
        return this.d.aN_();
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        return this.a.am;
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return this.a.C;
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        return this.a.an;
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return this.a.b;
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        return this.a.b;
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        C5327bwf c5327bwf = this.c;
        if (c5327bwf == null) {
            c5327bwf = this.a;
        }
        return c5327bwf.am;
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        return this.a.T;
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        return this.a.k;
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        int i;
        C5327bwf c5327bwf = this.a;
        int i2 = c5327bwf.n;
        return (i2 > 0 || i2 == (i = c5327bwf.k)) ? i2 : i;
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        return this.a.l;
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        return this.a.Q;
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        return this.a.f13636o;
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        return this.a.ac;
    }

    @Override // o.InterfaceC5160btX
    public int an_() {
        return this.a.W;
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        return this.a.E;
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        return this.a.B;
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        return this.a.N;
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        return this.a.K;
    }

    @Override // o.InterfaceC5206buQ
    public String y() {
        return this.d.y();
    }

    @Override // o.InterfaceC5206buQ
    public CreateRequest.DownloadRequestType s() {
        return this.d.s();
    }

    @Override // o.InterfaceC5206buQ
    public String t() {
        return this.d.y();
    }

    @Override // o.InterfaceC5206buQ
    public int l() {
        return this.d.l();
    }

    @Override // o.InterfaceC5206buQ
    public int at_() {
        return this.d.at_();
    }

    @Override // o.InterfaceC5206buQ
    public String n() {
        return this.d.n();
    }

    @Override // o.InterfaceC5206buQ
    public long ar_() {
        return this.d.ar_();
    }

    @Override // o.InterfaceC5206buQ
    public int as_() {
        return this.d.as_();
    }

    @Override // o.InterfaceC5206buQ
    public int aD_() {
        return this.d.aD_();
    }

    @Override // o.InterfaceC5206buQ
    public WatchState C() {
        return this.d.C();
    }

    @Override // o.InterfaceC5206buQ
    public DownloadState au_() {
        return this.d.au_();
    }

    @Override // o.InterfaceC5206buQ
    public StopReason aM_() {
        return this.d.aM_();
    }

    @Override // o.InterfaceC5206buQ
    public long h() {
        return this.d.h();
    }

    @Override // o.InterfaceC5206buQ
    public long aP_() {
        return this.d.aP_();
    }

    @Override // o.InterfaceC5206buQ
    public String u() {
        return this.d.u();
    }

    @Override // o.InterfaceC5206buQ
    public Status aA_() {
        return this.d.aA_();
    }

    @Override // o.InterfaceC5206buQ
    public long ax_() {
        return this.d.ax_();
    }

    @Override // o.InterfaceC5206buQ
    public long A() {
        return this.d.A();
    }

    @Override // o.InterfaceC5206buQ
    public boolean aZ_() {
        return this.d.aZ_();
    }

    @Override // o.InterfaceC5206buQ
    public boolean aT_() {
        return this.d.aT_();
    }

    @Override // o.InterfaceC5206buQ
    public boolean ba_() {
        return this.d.ba_();
    }

    @Override // o.InterfaceC5206buQ
    public int bc_() {
        return this.d.bc_();
    }

    @Override // o.InterfaceC5206buQ
    public boolean aW_() {
        return this.d.aW_();
    }

    @Override // o.InterfaceC5206buQ
    public boolean bb_() {
        return this.d.bb_();
    }

    @Override // o.InterfaceC5206buQ
    public boolean b(int i) {
        return this.d.b(i);
    }

    @Override // o.InterfaceC5206buQ
    public C4284bbc aQ_() {
        return this.d.aQ_();
    }

    public String a(int i) {
        if (this.e == null) {
            az();
        }
        for (C5333bwl c5333bwl : this.e) {
            if (c5333bwl.d == i) {
                return c5333bwl.b;
            }
        }
        return null;
    }

    private void az() {
        this.e = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(this.a.ab);
            for (int i = 0; i < jSONArray.length(); i++) {
                this.e.add(C5333bwl.a(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
    }

    public int e(int i) {
        if (this.e == null) {
            az();
        }
        for (C5333bwl c5333bwl : this.e) {
            if (c5333bwl.d == i) {
                return c5333bwl.c;
            }
        }
        return 0;
    }

    public String ay() {
        return this.a.Y;
    }

    public String aA() {
        return InterfaceC7303ctf.c(AbstractApplicationC1040Mh.d()).c(this);
    }

    public String at() {
        return this.a.U;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7460cwd) {
            C7460cwd c7460cwd = (C7460cwd) obj;
            return Objects.equals(this.a, c7460cwd.a) && Objects.equals(this.d, c7460cwd.d) && Objects.equals(this.c, c7460cwd.c) && Objects.equals(this.b, c7460cwd.b) && Objects.equals(this.e, c7460cwd.e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.d, this.c, this.b, this.e);
    }

    @Override // o.InterfaceC5197buH
    public String T() {
        return this.a.ad;
    }
}
