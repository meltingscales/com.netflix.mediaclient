package o;

import android.graphics.Color;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.graphql.models.type.BillboardType;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardAvailabilityDates;
import com.netflix.model.leafs.originals.BillboardCTA;
import com.netflix.model.leafs.originals.BillboardPhase;
import com.netflix.model.leafs.originals.BillboardSummary;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.VideoAssets;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.Pair;
import o.C2312adq;
import o.C2386afK;
import o.C2529ahm;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* loaded from: classes3.dex */
public final class aDA extends aEV implements InterfaceC5180btr, BillboardSummary {
    private final C2386afK.b b;
    private final /* synthetic */ C1535aEx d;
    private BillboardAsset e;
    private final boolean f;
    private final boolean g;
    private BillboardAsset h;
    private BillboardAsset i;
    private BillboardAsset j;

    @Override // o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        return this.d.B();
    }

    @Override // o.InterfaceC5160btX
    public boolean F() {
        return this.d.F();
    }

    @Override // o.InterfaceC5160btX
    public boolean G() {
        return this.d.G();
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        return this.d.H();
    }

    @Override // o.InterfaceC5160btX
    public boolean M() {
        return this.d.M();
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        return this.d.N();
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        return this.d.aB_();
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        return this.d.aC_();
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return this.d.aF_();
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        return this.d.aG_();
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return this.d.aH_();
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        return this.d.aI_();
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        return this.d.aJ_();
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        return this.d.aK_();
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        return this.d.aL_();
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        return this.d.aO_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        return this.d.aR_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        return this.d.aS_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        return this.d.aU_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        return this.d.aV_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        return this.d.aX_();
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return this.d.aY_();
    }

    @Override // o.InterfaceC5160btX
    public int an_() {
        return this.d.an_();
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        return this.d.ap_();
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        return this.d.aq_();
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        return this.d.av_();
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        return this.d.aw_();
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        return this.d.ay_();
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return this.d.az_();
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        return this.d.bd_();
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        return this.d.d();
    }

    @Override // o.InterfaceC5160btX
    public List<Advisory> e() {
        return this.d.e();
    }

    @Override // o.InterfaceC5180btr
    public BillboardSummary f() {
        return this;
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        return this.d.g();
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAsset getBackground() {
        return this.e;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getBillboardTheme() {
        return null;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAsset getHorizontalBackground() {
        return this.i;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardPhase getPhase() {
        return null;
    }

    @Override // o.aEX, o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return this.d.isAvailableToPlay();
    }

    @Override // o.aEX, o.InterfaceC5151btO
    public boolean isPlayable() {
        return this.d.isPlayable();
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        return this.d.x();
    }

    public Void y() {
        return null;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public /* synthetic */ String getSynopsis() {
        return (String) y();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aDA(C2529ahm.e eVar, C2386afK.b bVar, boolean z, boolean z2) {
        super(eVar);
        C2386afK.e b2;
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) bVar, "");
        this.b = bVar;
        this.f = z;
        this.g = z2;
        C2386afK.c b3 = bVar.b();
        C2514ahX d2 = (b3 == null || (b2 = b3.b()) == null) ? null : b2.d();
        C8632dsu.d(d2);
        this.d = new C1535aEx(d2);
        O();
    }

    public final C2312adq i() {
        return this.b.d();
    }

    @Override // o.InterfaceC5180btr
    public SupplementalMessageType A_() {
        C2312adq.p e2;
        C2312adq.k c2;
        C2312adq.x d2;
        SupplementalMessageType.e eVar = SupplementalMessageType.c;
        C2312adq.n n = i().n();
        return eVar.b((n == null || (e2 = n.e()) == null || (c2 = e2.c()) == null || (d2 = c2.d()) == null) ? null : d2.d());
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public List<TagSummary> getTags() {
        List<TagSummary> i2;
        C2312adq.p e2;
        C2312adq.k c2;
        List<C2312adq.y> h;
        C2312adq.n n = i().n();
        if (n == null || (e2 = n.e()) == null || (c2 = e2.c()) == null || (h = c2.h()) == null) {
            i2 = C8569dql.i();
            return i2;
        }
        ArrayList<C2312adq.y> arrayList = new ArrayList();
        for (Object obj : h) {
            C2312adq.y yVar = (C2312adq.y) obj;
            if (yVar != null && C8632dsu.c(yVar.d(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C2312adq.y yVar2 : arrayList) {
            TagSummary e3 = yVar2 != null ? C1509aDy.e(yVar2) : null;
            if (e3 != null) {
                arrayList2.add(e3);
            }
        }
        return arrayList2;
    }

    @Override // o.aEX, o.InterfaceC5175btm
    public String getTitle() {
        C2312adq.m c2;
        C2312adq.q a2;
        C2312adq.l e2;
        C2312adq.t c3;
        String d2;
        C2312adq.e a3 = i().a();
        if (a3 == null || (e2 = a3.e()) == null || (c3 = e2.c()) == null || (d2 = c3.d()) == null) {
            C2312adq.e a4 = i().a();
            String e3 = (a4 == null || (c2 = a4.c()) == null || (a2 = c2.a()) == null) ? null : a2.e();
            return e3 == null ? super.getTitle() : e3;
        }
        return d2;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public List<String> getBadgeKeys() {
        List<String> e2;
        C2312adq.p e3;
        C2312adq.k c2;
        boolean a2;
        C2312adq.e a3 = i().a();
        if (a3 == null || (e2 = a3.b()) == null) {
            C2312adq.n n = i().n();
            e2 = (n == null || (e3 = n.e()) == null || (c2 = e3.c()) == null) ? null : c2.e();
            if (e2 == null) {
                return null;
            }
        }
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : e2) {
            if (true ^ C8632dsu.c((Object) ((String) obj), (Object) "NONE")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (C8632dsu.c((Object) str, (Object) "NEW")) {
                a2 = C8691duz.a(getBillboardType(), "episodic", true);
                if (a2) {
                    str = "NEW_EPISODE";
                }
            }
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getSupplementalMessage() {
        C2312adq.p e2;
        C2312adq.k c2;
        C2312adq.x d2;
        C2312adq.n n = i().n();
        if (n == null || (e2 = n.e()) == null || (c2 = e2.c()) == null || (d2 = c2.d()) == null) {
            return null;
        }
        return d2.a();
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public ContextualText getContextualSynopsis() {
        C2312adq.p e2;
        C2312adq.k c2;
        C2312adq.e a2 = i().a();
        if ((a2 != null ? a2.d() : null) == null) {
            C2312adq.n n = i().n();
            if (((n == null || (e2 = n.e()) == null || (c2 = e2.c()) == null) ? null : c2.b()) == null) {
                return null;
            }
        }
        return new a();
    }

    /* loaded from: classes3.dex */
    public static final class a implements ContextualText {
        a() {
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
        public String text() {
            C2312adq.p e;
            C2312adq.k c;
            C2312adq.c b;
            C2312adq.b d;
            String b2;
            C2312adq.e a = aDA.this.i().a();
            if (a == null || (d = a.d()) == null || (b2 = d.b()) == null) {
                C2312adq.n n = aDA.this.i().n();
                if (n == null || (e = n.e()) == null || (c = e.c()) == null || (b = c.b()) == null) {
                    return null;
                }
                return b.b();
            }
            return b2;
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
        public String evidenceKey() {
            C2312adq.p e;
            C2312adq.k c;
            C2312adq.c b;
            C2312adq.b d;
            String a;
            C2312adq.e a2 = aDA.this.i().a();
            if (a2 == null || (d = a2.d()) == null || (a = d.a()) == null) {
                C2312adq.n n = aDA.this.i().n();
                if (n == null || (e = n.e()) == null || (c = e.c()) == null || (b = c.b()) == null) {
                    return null;
                }
                return b.a();
            }
            return a;
        }

        @Override // o.InterfaceC8321diF
        public void setExpires(Long l) {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // o.InterfaceC8321diF
        public boolean needsRefresh(long j) {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // o.InterfaceC8323diH
        public long getTimestamp() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // o.InterfaceC8323diH
        public void setTimestamp(long j) {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getMaturityRating() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public boolean isAward() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getBillboardType() {
        String c2;
        BillboardType e2 = i().e();
        if (e2 == null || (c2 = e2.c()) == null) {
            return null;
        }
        Locale locale = Locale.ENGLISH;
        C8632dsu.a(locale, "");
        String lowerCase = c2.toLowerCase(locale);
        C8632dsu.a(lowerCase, "");
        return lowerCase;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public List<BillboardCTA> getActions() {
        List<BillboardCTA> i2;
        BillboardCTA e2;
        List<C2312adq.d> b2 = i().b();
        if (b2 == null) {
            i2 = C8569dql.i();
            return i2;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : b2) {
            if (i3 < 0) {
                C8569dql.h();
            }
            e2 = C1509aDy.e((C2312adq.d) obj, i3);
            if (e2 != null) {
                arrayList.add(e2);
            }
            i3++;
        }
        return arrayList;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getImpressionToken() {
        return i().j();
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public String getActionToken() {
        return i().d();
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public VideoAssets getVideoAssets() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAvailabilityDates getAvailabilityDates() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public Integer getHighlightColor() {
        String d2;
        C2312adq.p e2;
        C2312adq.k c2;
        C2312adq.o a2;
        C2312adq.r d3;
        C2312adq.p e3;
        C2312adq.k c3;
        C2312adq.n n = i().n();
        if (n == null || (e3 = n.e()) == null || (c3 = e3.c()) == null || (d2 = c3.c()) == null) {
            C2312adq.n n2 = i().n();
            d2 = (n2 == null || (e2 = n2.e()) == null || (c2 = e2.c()) == null || (a2 = c2.a()) == null || (d3 = a2.d()) == null) ? null : d3.d();
        }
        if (d2 != null) {
            return Integer.valueOf(Color.parseColor("#" + d2));
        }
        return null;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAsset getLogo() {
        BillboardAsset billboardAsset = this.j;
        if (billboardAsset == null) {
            C8632dsu.d("");
            return null;
        }
        return billboardAsset;
    }

    @Override // com.netflix.model.leafs.originals.BillboardSummary
    public BillboardAsset getHorizontalLogo() {
        BillboardAsset billboardAsset = this.h;
        if (billboardAsset == null) {
            C8632dsu.d("");
            return null;
        }
        return billboardAsset;
    }

    private final void O() {
        boolean a2;
        BillboardAsset fVar;
        C2312adq.h l;
        C2312adq.a c2 = i().c();
        boolean c3 = c2 != null ? C8632dsu.c(c2.c(), Boolean.TRUE) : false;
        if (this.f || !(c3 || this.g)) {
            this.e = new c();
        } else if (!c3 && this.g) {
            this.e = new d();
        } else {
            this.e = new e();
        }
        a2 = C8691duz.a(getBillboardType(), "awards", true);
        if (a2 && (l = i().l()) != null && C8632dsu.c(l.c(), Boolean.TRUE)) {
            fVar = new b();
        } else {
            fVar = new f();
        }
        this.j = fVar;
        this.h = new g();
        this.i = new i();
    }

    /* loaded from: classes3.dex */
    public static final class c implements BillboardAsset {
        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getTag() {
            return "GraphQLBillboardAsset|fallbackBackgroundAsset";
        }

        c() {
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getUrl() {
            C2312adq.i i = aDA.this.i().i();
            if (i != null) {
                return i.b();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getWidth() {
            C2312adq.i i = aDA.this.i().i();
            if (i != null) {
                return i.h();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getHeight() {
            C2312adq.i i = aDA.this.i().i();
            if (i != null) {
                return i.e();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getArtWorkType() {
            C2312adq.i i = aDA.this.i().i();
            if (i != null) {
                return i.d();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getImageKey() {
            C2312adq.i i = aDA.this.i().i();
            if (i != null) {
                return i.c();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getDominantBackgroundColor() {
            String e;
            C2312adq.a c = aDA.this.i().c();
            if (c == null || (e = c.e()) == null) {
                return null;
            }
            return aDA.this.b(e);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements BillboardAsset {
        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getTag() {
            return "GraphQLBillboardAsset|fallbackBackgroundAsset";
        }

        d() {
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getUrl() {
            C2312adq.s k = aDA.this.i().k();
            if (k != null) {
                return k.a();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getWidth() {
            C2312adq.s k = aDA.this.i().k();
            if (k != null) {
                return k.i();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getHeight() {
            C2312adq.s k = aDA.this.i().k();
            if (k != null) {
                return k.e();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getArtWorkType() {
            C2312adq.s k = aDA.this.i().k();
            if (k != null) {
                return k.d();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getImageKey() {
            C2312adq.s k = aDA.this.i().k();
            if (k != null) {
                return k.b();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getDominantBackgroundColor() {
            String c;
            C2312adq.s k = aDA.this.i().k();
            if (k == null || (c = k.c()) == null) {
                return null;
            }
            return aDA.this.b(c);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements BillboardAsset {
        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getTag() {
            return "GraphQLBillboardAsset|backgroundAsset";
        }

        e() {
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getUrl() {
            C2312adq.a c = aDA.this.i().c();
            if (c != null) {
                return c.g();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getWidth() {
            C2312adq.a c = aDA.this.i().c();
            if (c != null) {
                return c.h();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getHeight() {
            C2312adq.a c = aDA.this.i().c();
            if (c != null) {
                return c.d();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getArtWorkType() {
            C2312adq.a c = aDA.this.i().c();
            if (c != null) {
                return c.a();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getImageKey() {
            C2312adq.a c = aDA.this.i().c();
            if (c != null) {
                return c.b();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getDominantBackgroundColor() {
            String e;
            C2312adq.a c = aDA.this.i().c();
            if (c == null || (e = c.e()) == null) {
                return null;
            }
            return aDA.this.b(e);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements BillboardAsset {
        public Void c() {
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getTag() {
            return "GraphQLBillboardAsset|logoAssetForAwards";
        }

        b() {
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public /* synthetic */ Integer getDominantBackgroundColor() {
            return (Integer) c();
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getUrl() {
            C2312adq.h l = aDA.this.i().l();
            if (l != null) {
                return l.d();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getWidth() {
            C2312adq.h l = aDA.this.i().l();
            if (l != null) {
                return l.g();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getHeight() {
            C2312adq.h l = aDA.this.i().l();
            if (l != null) {
                return l.e();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getArtWorkType() {
            C2312adq.h l = aDA.this.i().l();
            if (l != null) {
                return l.b();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getImageKey() {
            C2312adq.h l = aDA.this.i().l();
            if (l != null) {
                return l.a();
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements BillboardAsset {
        public Void b() {
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getTag() {
            return "GraphQLBillboardAsset|logoAsset";
        }

        f() {
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public /* synthetic */ Integer getDominantBackgroundColor() {
            return (Integer) b();
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getUrl() {
            C2312adq.g g = aDA.this.i().g();
            if (g != null) {
                return g.d();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getWidth() {
            C2312adq.g g = aDA.this.i().g();
            if (g != null) {
                return g.e();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getHeight() {
            C2312adq.g g = aDA.this.i().g();
            if (g != null) {
                return g.b();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getArtWorkType() {
            C2312adq.g g = aDA.this.i().g();
            if (g != null) {
                return g.a();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getImageKey() {
            C2312adq.g g = aDA.this.i().g();
            if (g != null) {
                return g.c();
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements BillboardAsset {
        public Void a() {
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getTag() {
            return "GraphQLBillboardAsset|horizontalLogoAsset";
        }

        g() {
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public /* synthetic */ Integer getDominantBackgroundColor() {
            return (Integer) a();
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getUrl() {
            C2312adq.f f = aDA.this.i().f();
            if (f != null) {
                return f.e();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getWidth() {
            C2312adq.f f = aDA.this.i().f();
            if (f != null) {
                return f.c();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getHeight() {
            C2312adq.f f = aDA.this.i().f();
            if (f != null) {
                return f.a();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getArtWorkType() {
            C2312adq.f f = aDA.this.i().f();
            if (f != null) {
                return f.b();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getImageKey() {
            C2312adq.f f = aDA.this.i().f();
            if (f != null) {
                return f.d();
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements BillboardAsset {
        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getTag() {
            return "GraphQLBillboardAsset|horizontalBackgroundAsset";
        }

        i() {
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getUrl() {
            C2312adq.j h = aDA.this.i().h();
            if (h != null) {
                return h.e();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getWidth() {
            C2312adq.j h = aDA.this.i().h();
            if (h != null) {
                return h.f();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getHeight() {
            C2312adq.j h = aDA.this.i().h();
            if (h != null) {
                return h.c();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getArtWorkType() {
            C2312adq.j h = aDA.this.i().h();
            if (h != null) {
                return h.a();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public String getImageKey() {
            C2312adq.j h = aDA.this.i().h();
            if (h != null) {
                return h.d();
            }
            return null;
        }

        @Override // com.netflix.model.leafs.originals.BillboardAsset
        public Integer getDominantBackgroundColor() {
            String b;
            C2312adq.j h = aDA.this.i().h();
            if (h == null || (b = h.b()) == null) {
                return null;
            }
            return aDA.this.b(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer b(String str) {
        Map i2;
        Throwable th;
        C2312adq.p e2;
        C2312adq.k c2;
        try {
            return Integer.valueOf(Color.parseColor("#" + str));
        } catch (IllegalArgumentException unused) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            Pair[] pairArr = new Pair[2];
            C2312adq.n n = i().n();
            pairArr[0] = dpD.a(SignupConstants.Field.LANG_ID, String.valueOf((n == null || (e2 = n.e()) == null || (c2 = e2.c()) == null) ? null : Integer.valueOf(c2.i())));
            pairArr[1] = dpD.a("colorString", str);
            i2 = dqE.i(pairArr);
            C1596aHd c1596aHd = new C1596aHd("billboard dominantBackgroundColor was invalid", null, null, false, i2, false, false, 102, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c3 = errorType.c();
                    c1596aHd.a(c3 + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c4 = dVar2.c();
            if (c4 != null) {
                c4.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
            return null;
        }
    }
}
