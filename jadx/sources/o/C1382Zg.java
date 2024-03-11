package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2251aci;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1382Zg implements InterfaceC8999hM<c> {
    public static final e a = new e(null);
    private final C2865aoD b;
    private final List<Integer> d;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "48bb17fc-01a2-42db-96ca-49ff9eae7a35";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1382Zg) {
            C1382Zg c1382Zg = (C1382Zg) obj;
            return C8632dsu.c(this.d, c1382Zg.d) && C8632dsu.c(this.b, c1382Zg.b);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PlayerUIVideoDetails";
    }

    public final C2865aoD g() {
        return this.b;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.b.hashCode();
    }

    public final List<Integer> j() {
        return this.d;
    }

    public String toString() {
        List<Integer> list = this.d;
        C2865aoD c2865aoD = this.b;
        return "PlayerUIVideoDetailsQuery(videoIds=" + list + ", artworkParamsForMdx=" + c2865aoD + ")";
    }

    public C1382Zg(List<Integer> list, C2865aoD c2865aoD) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c2865aoD, "");
        this.d = list;
        this.b = c2865aoD;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2249acg.e.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2251aci.a.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2817anI.b.c()).d();
    }

    /* renamed from: o.Zg$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8999hM.c {
        private final List<g> c;

        public final List<g> a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.c, ((c) obj).c);
        }

        public int hashCode() {
            List<g> list = this.c;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<g> list = this.c;
            return "Data(videos=" + list + ")";
        }

        public c(List<g> list) {
            this.c = list;
        }
    }

    /* renamed from: o.Zg$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final d a;
        private final a b;
        private final i c;
        private final String d;
        private final b e;

        public final d a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final a c() {
            return this.b;
        }

        public final b d() {
            return this.e;
        }

        public final i e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.d, (Object) gVar.d) && C8632dsu.c(this.b, gVar.b) && C8632dsu.c(this.a, gVar.a) && C8632dsu.c(this.e, gVar.e) && C8632dsu.c(this.c, gVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            a aVar = this.b;
            int hashCode2 = aVar == null ? 0 : aVar.hashCode();
            d dVar = this.a;
            int hashCode3 = dVar == null ? 0 : dVar.hashCode();
            b bVar = this.e;
            int hashCode4 = bVar == null ? 0 : bVar.hashCode();
            i iVar = this.c;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (iVar != null ? iVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            a aVar = this.b;
            d dVar = this.a;
            b bVar = this.e;
            i iVar = this.c;
            return "Video(__typename=" + str + ", onShow=" + aVar + ", onEpisode=" + dVar + ", onMovie=" + bVar + ", onSupplemental=" + iVar + ")";
        }

        public g(String str, a aVar, d dVar, b bVar, i iVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = aVar;
            this.a = dVar;
            this.e = bVar;
            this.c = iVar;
        }
    }

    /* renamed from: o.Zg$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2552aiI d;

        public final C2552aiI d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.d, ((a) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            C2552aiI c2552aiI = this.d;
            return "OnShow(showInfo=" + c2552aiI + ")";
        }

        public a(C2552aiI c2552aiI) {
            C8632dsu.c((Object) c2552aiI, "");
            this.d = c2552aiI;
        }
    }

    /* renamed from: o.Zg$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2579aij b;
        private final C2572aic d;

        public final C2579aij a() {
            return this.b;
        }

        public final C2572aic c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            C2579aij c2579aij = this.b;
            C2572aic c2572aic = this.d;
            return "OnEpisode(playerUIBasicInfo=" + c2579aij + ", playerEpisodeDetails=" + c2572aic + ")";
        }

        public d(C2579aij c2579aij, C2572aic c2572aic) {
            C8632dsu.c((Object) c2579aij, "");
            C8632dsu.c((Object) c2572aic, "");
            this.b = c2579aij;
            this.d = c2572aic;
        }
    }

    /* renamed from: o.Zg$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2579aij e;

        public final C2579aij c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.e, ((b) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            C2579aij c2579aij = this.e;
            return "OnMovie(playerUIBasicInfo=" + c2579aij + ")";
        }

        public b(C2579aij c2579aij) {
            C8632dsu.c((Object) c2579aij, "");
            this.e = c2579aij;
        }
    }

    /* renamed from: o.Zg$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final C2579aij b;

        public final C2579aij c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C8632dsu.c(this.b, ((i) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            C2579aij c2579aij = this.b;
            return "OnSupplemental(playerUIBasicInfo=" + c2579aij + ")";
        }

        public i(C2579aij c2579aij) {
            C8632dsu.c((Object) c2579aij, "");
            this.b = c2579aij;
        }
    }

    /* renamed from: o.Zg$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
