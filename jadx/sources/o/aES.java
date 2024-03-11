package o;

import com.netflix.mediaclient.graphql.models.type.PlaylistAction;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.advisory.RatingDetails;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C2344aeV;
import o.C2367aes;
import o.C2371aew;
import o.C2372aex;
import o.C2454agQ;
import o.C2628ajf;
import o.C2635ajm;
import o.InterfaceC5222bug;
import o.aEX;

/* loaded from: classes3.dex */
public final class aES implements InterfaceC5223buh, TrailerItem, InterfaceC5222bug<aES> {
    private final String a;
    private final ContextualText b;
    private final String c;
    private final C2454agQ.d d;
    private final C2372aex e;
    private final String f;
    private final boolean g;
    private final TrailerItem.a h;
    private final C2367aes i;
    private final String j;
    private final int k;
    private final RatingDetails l;
    private final int m;
    private final Instant n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13422o;
    private final String p;
    private final int q;
    private final String r;
    private final String s;
    private final String t;
    private final VideoType u;
    private final String w;
    private final String x;
    private final aES y;

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String B() {
        return this.x;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public boolean D() {
        return this.g;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public ContextualText b() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String c() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String e() {
        return this.f;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public Instant f() {
        return this.n;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return "";
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return "";
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        return null;
    }

    public TrailerItem.a h() {
        return this.h;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String j() {
        return this.j;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public int k() {
        return this.m;
    }

    @Override // o.InterfaceC5221buf
    public RatingDetails n() {
        return this.l;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String o() {
        return this.f13422o;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String p() {
        return this.r;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String r() {
        return this.t;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public int s() {
        return this.k;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String t() {
        return this.s;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public int u() {
        return this.q;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String v() {
        return this.p;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: w */
    public aES getVideo() {
        return this.y;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public String x() {
        return this.w;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public VideoType y() {
        return this.u;
    }

    public aES(C2454agQ.d dVar, C2367aes c2367aes, C2372aex c2372aex, TrailerItem.a aVar) {
        int b;
        String d;
        VideoType c;
        C2324aeB d2;
        String a2;
        C2324aeB d3;
        String c2;
        C2324aeB d4;
        C2324aeB d5;
        C2628ajf d6;
        C2628ajf.a c3;
        C2371aew e;
        C2344aeV a3;
        C2371aew e2;
        C2371aew e3;
        C2371aew.b d7;
        C2371aew e4;
        C2371aew.b d8;
        C2371aew e5;
        C2344aeV a4;
        C2371aew e6;
        C2344aeV a5;
        C2371aew e7;
        C2344aeV a6;
        C2638ajp a7;
        Integer c4;
        C2630ajh b2;
        C2630ajh b3;
        C2630ajh b4;
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) c2367aes, "");
        C8632dsu.c((Object) c2372aex, "");
        C8632dsu.c((Object) aVar, "");
        this.d = dVar;
        this.i = c2367aes;
        this.e = c2372aex;
        this.y = this;
        this.h = aVar;
        C2372aex.d a8 = c2372aex.a();
        RatingDetails ratingDetails = null;
        this.x = String.valueOf((a8 == null || (b4 = a8.b()) == null) ? null : Integer.valueOf(b4.e()));
        this.n = c2367aes.h();
        C2372aex.d a9 = c2372aex.a();
        int i = 0;
        this.g = ((a9 == null || (b3 = a9.b()) == null) ? null : aEX.a.e(b3)) == VideoType.SUPPLEMENTAL;
        C2372aex.d a10 = c2372aex.a();
        this.f13422o = String.valueOf((a10 == null || (b2 = a10.b()) == null) ? null : Integer.valueOf(b2.e()));
        C2372aex.d a11 = c2372aex.a();
        if (a11 != null && (a7 = a11.a()) != null && (c4 = a7.c()) != null) {
            i = c4.intValue();
        }
        this.k = i;
        this.c = c2367aes.b();
        C2367aes.b d9 = c2367aes.d();
        this.r = d9 != null ? d9.e() : null;
        C2367aes.b d10 = c2367aes.d();
        this.s = d10 != null ? d10.d() : null;
        this.b = new a();
        C2367aes.g f = c2367aes.f();
        if (f == null || (e7 = f.e()) == null || (a6 = e7.a()) == null) {
            C2367aes.g f2 = c2367aes.f();
            C8632dsu.d(f2);
            C2324aeB d11 = f2.d();
            C8632dsu.d(d11);
            b = d11.b();
        } else {
            b = a6.a();
        }
        this.q = b;
        Integer j = c2367aes.j();
        this.m = j != null ? j.intValue() : u();
        C2367aes.g f3 = c2367aes.f();
        if ((f3 != null ? f3.e() : null) != null) {
            c = VideoType.GAMES;
        } else {
            aEX.e eVar = aEX.a;
            C2367aes.g f4 = c2367aes.f();
            c = eVar.c((f4 == null || (d2 = f4.d()) == null || (d = d2.f()) == null) ? c2372aex.d() : d);
        }
        this.u = c;
        C2367aes.g f5 = c2367aes.f();
        if (f5 == null || (e6 = f5.e()) == null || (a5 = e6.a()) == null || (a2 = a5.c()) == null) {
            C2367aes.g f6 = c2367aes.f();
            a2 = (f6 == null || (d3 = f6.d()) == null) ? null : d3.a();
        }
        this.p = a2;
        C2367aes.g f7 = c2367aes.f();
        if (f7 == null || (e5 = f7.e()) == null || (a4 = e5.a()) == null || (c2 = a4.b()) == null) {
            C2367aes.g f8 = c2367aes.f();
            c2 = (f8 == null || (d4 = f8.d()) == null) ? null : d4.c();
        }
        this.w = c2;
        C2367aes.e e8 = c2367aes.e();
        this.a = e8 != null ? e8.a() : null;
        C2367aes.h i2 = c2367aes.i();
        this.t = i2 != null ? i2.e() : null;
        C2367aes.g f9 = c2367aes.f();
        this.f = (f9 == null || (e4 = f9.e()) == null || (d8 = e4.d()) == null) ? null : d8.a();
        C2367aes.g f10 = c2367aes.f();
        this.j = (f10 == null || (e3 = f10.e()) == null || (d7 = e3.d()) == null) ? null : d7.e();
        C2367aes.g f11 = c2367aes.f();
        if (f11 != null && (e = f11.e()) != null && (a3 = e.a()) != null && a3.d() != null) {
            C2367aes.g f12 = c2367aes.f();
            C2344aeV a12 = (f12 == null || (e2 = f12.e()) == null) ? null : e2.a();
            RatingDetails c1521aEj = a12 != null ? new C1521aEj(a12.d()) : null;
            if (c1521aEj != null) {
                ratingDetails = c1521aEj;
                this.l = ratingDetails;
            }
        }
        C2367aes.g f13 = c2367aes.f();
        if (f13 != null && (d5 = f13.d()) != null && (d6 = d5.d()) != null && (c3 = d6.c()) != null) {
            ratingDetails = new aEW(c3);
        }
        this.l = ratingDetails;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: d */
    public aES mo3081getEntity() {
        return (aES) InterfaceC5222bug.a.d(this);
    }

    private final C2630ajh E() {
        C2372aex.d a2 = this.e.a();
        if (a2 != null) {
            return a2.b();
        }
        return null;
    }

    private final C2344aeV H() {
        C2372aex.e c = this.e.c();
        if (c != null) {
            return c.c();
        }
        return null;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        String num;
        C2630ajh E = E();
        if (E == null || (num = Integer.valueOf(E.e()).toString()) == null) {
            C2344aeV H = H();
            C8632dsu.d(H);
            return String.valueOf(H.a());
        }
        return num;
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String c;
        C2630ajh E = E();
        if (E == null || (c = E.c()) == null) {
            C2344aeV H = H();
            if (H != null) {
                return H.c();
            }
            return null;
        }
        return c;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        VideoType e;
        C2630ajh E = E();
        return (E == null || (e = aEX.a.e(E)) == null) ? VideoType.GAMES : e;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        String b;
        C2630ajh E = E();
        if (E == null || (b = E.b()) == null) {
            C2344aeV H = H();
            b = H != null ? H.b() : null;
            C8632dsu.d((Object) b);
        }
        return b;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        C2324aeB d;
        C2367aes.g f = this.i.f();
        if ((f != null ? f.e() : null) != null) {
            return true;
        }
        C2367aes.g f2 = this.i.f();
        if (f2 == null || (d = f2.d()) == null) {
            return false;
        }
        return C8632dsu.c(d.e(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        Boolean g;
        C2630ajh E = E();
        if (E == null || (g = E.g()) == null) {
            return true;
        }
        return g.booleanValue();
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        Boolean f;
        C2630ajh E = E();
        if (E == null || (f = E.f()) == null) {
            return false;
        }
        return f.booleanValue();
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return this.i.g();
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getCursor */
    public String mo3080getCursor() {
        String c = this.d.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5222bug
    public int getPosition() {
        Integer b = this.d.b();
        if (b != null) {
            return b.intValue();
        }
        return -1;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public List<TrailerItem.Action> a() {
        List<TrailerItem.Action> i;
        TrailerItem.Action action;
        List<C2367aes.c> a2 = this.i.a();
        if (a2 == null) {
            i = C8569dql.i();
            return i;
        }
        ArrayList<String> arrayList = new ArrayList();
        Iterator<T> it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2367aes.c cVar = (C2367aes.c) it.next();
            String a3 = cVar != null ? cVar.a() : null;
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            try {
                action = TrailerItem.Action.valueOf(str);
            } catch (Exception unused) {
                action = null;
            }
            if (action != null) {
                arrayList2.add(action);
            }
        }
        return arrayList2;
    }

    @Override // o.InterfaceC5146btJ
    public boolean m() {
        Boolean c;
        C2324aeB d;
        C2627aje h;
        C2371aew e;
        C2339aeQ b;
        C2367aes.g f = this.i.f();
        if (f == null || (e = f.e()) == null || (b = e.b()) == null || (c = b.d()) == null) {
            C2367aes.g f2 = this.i.f();
            c = (f2 == null || (d = f2.d()) == null || (h = d.h()) == null) ? null : h.c();
        }
        return C8632dsu.c(c, Boolean.TRUE);
    }

    @Override // o.InterfaceC5146btJ
    public String g() {
        return String.valueOf(u());
    }

    @Override // o.InterfaceC5218buc
    public boolean A() {
        C2324aeB d;
        C2371aew e;
        List<PlaylistAction> c;
        C2367aes.g f = this.i.f();
        if (f == null || (e = f.e()) == null || (c = e.c()) == null) {
            C2367aes.g f2 = this.i.f();
            if (f2 == null || (d = f2.d()) == null) {
                return false;
            }
            return C8632dsu.c(d.g(), Boolean.TRUE);
        }
        return c.contains(PlaylistAction.e);
    }

    @Override // o.InterfaceC5218buc
    public String i() {
        return String.valueOf(u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G() {
        C2367aes.d c = this.i.c();
        if (c != null) {
            return c.e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String z() {
        C2367aes.d c = this.i.c();
        if (c != null) {
            return c.c();
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public static final class a implements ContextualText {
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

        a() {
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
        public String text() {
            return aES.this.G();
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
        public String evidenceKey() {
            return aES.this.z();
        }

        @Override // o.InterfaceC8323diH
        public long getTimestamp() {
            return System.currentTimeMillis();
        }
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        Boolean i;
        C2324aeB d;
        C2371aew e;
        C2367aes.g f = this.i.f();
        if (f == null || (e = f.e()) == null || (i = e.i()) == null) {
            C2367aes.g f2 = this.i.f();
            i = (f2 == null || (d = f2.d()) == null) ? null : d.i();
            if (i == null) {
                return true;
            }
        }
        return i.booleanValue();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public boolean C() {
        C2367aes.g f = this.i.f();
        return (f != null ? f.e() : null) != null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public List<String> l() {
        List<String> i;
        C2367aes.i b;
        C2367aes.a b2;
        List<String> c;
        C2367aes.g f = this.i.f();
        if (f == null || (b = f.b()) == null || (b2 = b.b()) == null || (c = b2.c()) == null) {
            i = C8569dql.i();
            return i;
        }
        return c;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.TrailerItem
    public List<String> q() {
        List<String> i;
        C2324aeB d;
        C2635ajm j;
        List<C2635ajm.d> a2;
        C2371aew e;
        C2344aeV a3;
        List<C2344aeV.e> e2;
        C2367aes.g f = this.i.f();
        if (f == null || (e = f.e()) == null || (a3 = e.a()) == null || (e2 = a3.e()) == null) {
            C2367aes.g f2 = this.i.f();
            if (f2 == null || (d = f2.d()) == null || (j = d.j()) == null || (a2 = j.a()) == null) {
                i = C8569dql.i();
                return i;
            }
            ArrayList arrayList = new ArrayList();
            for (C2635ajm.d dVar : a2) {
                String e3 = dVar != null ? dVar.e() : null;
                if (e3 != null) {
                    arrayList.add(e3);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C2344aeV.e eVar : e2) {
            String d2 = eVar != null ? eVar.d() : null;
            if (d2 != null) {
                arrayList2.add(d2);
            }
        }
        return arrayList2;
    }
}
