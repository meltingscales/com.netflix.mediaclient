package o;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.bUi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4049bUi implements InterfaceC8962gc {
    private final String a;
    private final boolean b;
    private final int c;
    private final bTL d;
    private final C4029bTp e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final Long i;
    private final int j;
    private final bZK k;
    private final boolean l;
    private final AbstractC8918fl<InterfaceC5155btS> m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13548o;
    private final C4054bUn p;
    private final TrackingInfoHolder q;
    private final AbstractC6677chn r;
    private final String s;
    private final AbstractC6677chn t;
    private final AbstractC8918fl<List<LoMo>> u;
    private final boolean v;
    private final List<Integer> w;
    private final CollectTaste.MessageType x;
    private final Map<String, AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>>> y;
    private final Set<String> z;

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final bTL c() {
        return this.d;
    }

    public final boolean component1() {
        return this.l;
    }

    public final Long component10() {
        return this.i;
    }

    public final bTL component11() {
        return this.d;
    }

    public final boolean component12() {
        return this.b;
    }

    public final AbstractC6677chn component13() {
        return this.r;
    }

    public final AbstractC6677chn component14() {
        return this.t;
    }

    public final boolean component15() {
        return this.g;
    }

    public final boolean component16() {
        return this.v;
    }

    public final boolean component17() {
        return this.h;
    }

    public final C4029bTp component18() {
        return this.e;
    }

    public final CollectTaste.MessageType component19() {
        return this.x;
    }

    public final String component2() {
        return this.a;
    }

    public final String component20() {
        return this.n;
    }

    public final C4054bUn component21() {
        return this.p;
    }

    public final int component22() {
        return this.c;
    }

    public final boolean component23() {
        return this.f13548o;
    }

    public final int component24() {
        return this.j;
    }

    public final String component25() {
        return this.s;
    }

    public final TrackingInfoHolder component3() {
        return this.q;
    }

    public final List<Integer> component4() {
        return this.w;
    }

    public final AbstractC8918fl<InterfaceC5155btS> component5() {
        return this.m;
    }

    public final AbstractC8918fl<List<LoMo>> component6() {
        return this.u;
    }

    public final Map<String, AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>>> component7() {
        return this.y;
    }

    public final bZK component8() {
        return this.k;
    }

    public final Set<String> component9() {
        return this.z;
    }

    public final C4049bUi d(boolean z, String str, TrackingInfoHolder trackingInfoHolder, List<Integer> list, AbstractC8918fl<? extends InterfaceC5155btS> abstractC8918fl, AbstractC8918fl<? extends List<? extends LoMo>> abstractC8918fl2, Map<String, ? extends AbstractC8918fl<? extends List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>>> map, bZK bzk, Set<String> set, Long l, bTL btl, boolean z2, AbstractC6677chn abstractC6677chn, AbstractC6677chn abstractC6677chn2, boolean z3, boolean z4, boolean z5, C4029bTp c4029bTp, CollectTaste.MessageType messageType, String str2, C4054bUn c4054bUn, int i, boolean z6, int i2, String str3) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) bzk, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) messageType, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) c4054bUn, "");
        return new C4049bUi(z, str, trackingInfoHolder, list, abstractC8918fl, abstractC8918fl2, map, bzk, set, l, btl, z2, abstractC6677chn, abstractC6677chn2, z3, z4, z5, c4029bTp, messageType, str2, c4054bUn, i, z6, i2, str3);
    }

    public final boolean d() {
        return this.b;
    }

    public final C4029bTp e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4049bUi) {
            C4049bUi c4049bUi = (C4049bUi) obj;
            return this.l == c4049bUi.l && C8632dsu.c((Object) this.a, (Object) c4049bUi.a) && C8632dsu.c(this.q, c4049bUi.q) && C8632dsu.c(this.w, c4049bUi.w) && C8632dsu.c(this.m, c4049bUi.m) && C8632dsu.c(this.u, c4049bUi.u) && C8632dsu.c(this.y, c4049bUi.y) && C8632dsu.c(this.k, c4049bUi.k) && C8632dsu.c(this.z, c4049bUi.z) && C8632dsu.c(this.i, c4049bUi.i) && C8632dsu.c(this.d, c4049bUi.d) && this.b == c4049bUi.b && C8632dsu.c(this.r, c4049bUi.r) && C8632dsu.c(this.t, c4049bUi.t) && this.g == c4049bUi.g && this.v == c4049bUi.v && this.h == c4049bUi.h && C8632dsu.c(this.e, c4049bUi.e) && this.x == c4049bUi.x && C8632dsu.c((Object) this.n, (Object) c4049bUi.n) && C8632dsu.c(this.p, c4049bUi.p) && this.c == c4049bUi.c && this.f13548o == c4049bUi.f13548o && this.j == c4049bUi.j && C8632dsu.c((Object) this.s, (Object) c4049bUi.s);
        }
        return false;
    }

    public final boolean f() {
        return this.h;
    }

    public final boolean g() {
        return this.f13548o;
    }

    public final boolean h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.l);
        String str = this.a;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.q.hashCode();
        int hashCode4 = this.w.hashCode();
        int hashCode5 = this.m.hashCode();
        int hashCode6 = this.u.hashCode();
        int hashCode7 = this.y.hashCode();
        int hashCode8 = this.k.hashCode();
        int hashCode9 = this.z.hashCode();
        Long l = this.i;
        int hashCode10 = l == null ? 0 : l.hashCode();
        bTL btl = this.d;
        int hashCode11 = btl == null ? 0 : btl.hashCode();
        int hashCode12 = Boolean.hashCode(this.b);
        AbstractC6677chn abstractC6677chn = this.r;
        int hashCode13 = abstractC6677chn == null ? 0 : abstractC6677chn.hashCode();
        AbstractC6677chn abstractC6677chn2 = this.t;
        int hashCode14 = abstractC6677chn2 == null ? 0 : abstractC6677chn2.hashCode();
        int hashCode15 = Boolean.hashCode(this.g);
        int hashCode16 = Boolean.hashCode(this.v);
        int hashCode17 = Boolean.hashCode(this.h);
        C4029bTp c4029bTp = this.e;
        int hashCode18 = c4029bTp == null ? 0 : c4029bTp.hashCode();
        int hashCode19 = this.x.hashCode();
        int hashCode20 = this.n.hashCode();
        int hashCode21 = this.p.hashCode();
        int hashCode22 = Integer.hashCode(this.c);
        int hashCode23 = Boolean.hashCode(this.f13548o);
        int hashCode24 = Integer.hashCode(this.j);
        String str2 = this.s;
        return (((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + (str2 == null ? 0 : str2.hashCode());
    }

    public final boolean i() {
        return this.f;
    }

    public final int j() {
        return this.j;
    }

    public final String k() {
        return this.n;
    }

    public final bZK l() {
        return this.k;
    }

    public final AbstractC6677chn m() {
        return this.r;
    }

    public final AbstractC8918fl<InterfaceC5155btS> n() {
        return this.m;
    }

    public final TrackingInfoHolder o() {
        return this.q;
    }

    public final String p() {
        return this.s;
    }

    public final AbstractC6677chn q() {
        return this.t;
    }

    public final AbstractC8918fl<List<LoMo>> r() {
        return this.u;
    }

    public final C4054bUn s() {
        return this.p;
    }

    public final List<Integer> t() {
        return this.w;
    }

    public String toString() {
        boolean z = this.l;
        String str = this.a;
        TrackingInfoHolder trackingInfoHolder = this.q;
        List<Integer> list = this.w;
        AbstractC8918fl<InterfaceC5155btS> abstractC8918fl = this.m;
        AbstractC8918fl<List<LoMo>> abstractC8918fl2 = this.u;
        Map<String, AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>>> map = this.y;
        bZK bzk = this.k;
        Set<String> set = this.z;
        Long l = this.i;
        bTL btl = this.d;
        boolean z2 = this.b;
        AbstractC6677chn abstractC6677chn = this.r;
        AbstractC6677chn abstractC6677chn2 = this.t;
        boolean z3 = this.g;
        boolean z4 = this.v;
        boolean z5 = this.h;
        C4029bTp c4029bTp = this.e;
        CollectTaste.MessageType messageType = this.x;
        String str2 = this.n;
        C4054bUn c4054bUn = this.p;
        int i = this.c;
        boolean z6 = this.f13548o;
        int i2 = this.j;
        String str3 = this.s;
        return "LolomoState(isKidProfile=" + z + ", genreId=" + str + ", lolomoTrackingInfo=" + trackingInfoHolder + ", parentTrackIds=" + list + ", lolomoSummary=" + abstractC8918fl + ", rows=" + abstractC8918fl2 + ", rowsVideos=" + map + ", liveVideosState=" + bzk + ", videoIDsRemovedFromWatchHistory=" + set + ", installedTimeStamp=" + l + ", background=" + btl + ", hasBillboard=" + z2 + ", messagingHomeBanner=" + abstractC6677chn + ", messagingHomeFooter=" + abstractC6677chn2 + ", hasGameBillboard=" + z3 + ", showTitleIfAvailable=" + z4 + ", hideLogo=" + z5 + ", feedState=" + c4029bTp + ", showCollectTasteMessageModule=" + messageType + ", kidsMysteryRevealedToken=" + str2 + ", notificationsState=" + c4054bUn + ", actionBarHeight=" + i + ", interstitialBannerShowing=" + z6 + ", highestBoundRowPosition=" + i2 + ", parentPageUUID=" + str3 + ")";
    }

    public final Map<String, AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>>> u() {
        return this.y;
    }

    public final boolean v() {
        return this.v;
    }

    public final CollectTaste.MessageType x() {
        return this.x;
    }

    public final Set<String> y() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4049bUi(boolean z, String str, TrackingInfoHolder trackingInfoHolder, List<Integer> list, AbstractC8918fl<? extends InterfaceC5155btS> abstractC8918fl, AbstractC8918fl<? extends List<? extends LoMo>> abstractC8918fl2, Map<String, ? extends AbstractC8918fl<? extends List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>>> map, bZK bzk, Set<String> set, Long l, bTL btl, boolean z2, AbstractC6677chn abstractC6677chn, AbstractC6677chn abstractC6677chn2, boolean z3, boolean z4, boolean z5, C4029bTp c4029bTp, CollectTaste.MessageType messageType, String str2, C4054bUn c4054bUn, int i, boolean z6, int i2, String str3) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) bzk, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) messageType, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) c4054bUn, "");
        this.l = z;
        this.a = str;
        this.q = trackingInfoHolder;
        this.w = list;
        this.m = abstractC8918fl;
        this.u = abstractC8918fl2;
        this.y = map;
        this.k = bzk;
        this.z = set;
        this.i = l;
        this.d = btl;
        this.b = z2;
        this.r = abstractC6677chn;
        this.t = abstractC6677chn2;
        this.g = z3;
        this.v = z4;
        this.h = z5;
        this.e = c4029bTp;
        this.x = messageType;
        this.n = str2;
        this.p = c4054bUn;
        this.c = i;
        this.f13548o = z6;
        this.j = i2;
        this.s = str3;
        this.f = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4049bUi(boolean r30, java.lang.String r31, com.netflix.mediaclient.clutils.TrackingInfoHolder r32, java.util.List r33, o.AbstractC8918fl r34, o.AbstractC8918fl r35, java.util.Map r36, o.bZK r37, java.util.Set r38, java.lang.Long r39, o.bTL r40, boolean r41, o.AbstractC6677chn r42, o.AbstractC6677chn r43, boolean r44, boolean r45, boolean r46, o.C4029bTp r47, com.netflix.mediaclient.ui.collecttaste.api.CollectTaste.MessageType r48, java.lang.String r49, o.C4054bUn r50, int r51, boolean r52, int r53, java.lang.String r54, int r55, o.C8627dsp r56) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4049bUi.<init>(boolean, java.lang.String, com.netflix.mediaclient.clutils.TrackingInfoHolder, java.util.List, o.fl, o.fl, java.util.Map, o.bZK, java.util.Set, java.lang.Long, o.bTL, boolean, o.chn, o.chn, boolean, boolean, boolean, o.bTp, com.netflix.mediaclient.ui.collecttaste.api.CollectTaste$MessageType, java.lang.String, o.bUn, int, boolean, int, java.lang.String, int, o.dsp):void");
    }

    public final boolean w() {
        List<LoMo> c;
        if (this.m instanceof C8971gl) {
            AbstractC8918fl<List<LoMo>> abstractC8918fl = this.u;
            if ((abstractC8918fl instanceof C8971gl) && (c = abstractC8918fl.c()) != null) {
                if (!c.isEmpty()) {
                    for (LoMo loMo : c) {
                        if (loMo.getLength() != 0) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Status z() {
        AbstractC8918fl<InterfaceC5155btS> abstractC8918fl = this.m;
        if (abstractC8918fl instanceof C8971gl) {
            return new NetflixStatus(StatusCode.OK, 0);
        }
        if (abstractC8918fl instanceof Error) {
            return new NetflixStatus(StatusCode.NETWORK_ERROR, 0);
        }
        if (abstractC8918fl instanceof C8927fu) {
            return new NetflixStatus(StatusCode.INTERNAL_ERROR, 0);
        }
        return null;
    }

    public final LoMo e(String str) {
        C8632dsu.c((Object) str, "");
        List<LoMo> c = this.u.c();
        Object obj = null;
        if (c != null) {
            Iterator<T> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C8632dsu.c((Object) ((LoMo) next).getListId(), (Object) str)) {
                    obj = next;
                    break;
                }
            }
            return (LoMo) obj;
        }
        return null;
    }

    public final List<InterfaceC5222bug<? extends InterfaceC5223buh>> c(LoMo loMo) {
        C8632dsu.c((Object) loMo, "");
        AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl = this.y.get(loMo.getId());
        if (abstractC8918fl != null) {
            return abstractC8918fl.c();
        }
        return null;
    }

    public final C4029bTp D() {
        C4029bTp c4029bTp = this.e;
        if (c4029bTp != null) {
            return c4029bTp;
        }
        throw new IllegalArgumentException("This is null except when rendering a feed genre".toString());
    }
}
