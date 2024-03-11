package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2187abX;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1377Zb implements InterfaceC8999hM<d> {
    public static final e c = new e(null);
    private final int a;
    private final C2865aoD b;
    private final boolean d;
    private final C2865aoD e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "353b13e5-b9c5-4137-8ff9-b1cc0af0b4ac";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1377Zb) {
            C1377Zb c1377Zb = (C1377Zb) obj;
            return this.a == c1377Zb.a && C8632dsu.c(this.e, c1377Zb.e) && C8632dsu.c(this.b, c1377Zb.b);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PlayerEpisodeDetails";
    }

    public final C2865aoD g() {
        return this.b;
    }

    public final C2865aoD h() {
        return this.e;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    public final int i() {
        return this.a;
    }

    public String toString() {
        int i = this.a;
        C2865aoD c2865aoD = this.e;
        C2865aoD c2865aoD2 = this.b;
        return "PlayerEpisodeDetailsQuery(videoId=" + i + ", artworkParamsForMdx=" + c2865aoD + ", artworkParamsForInterestingSmall=" + c2865aoD2 + ")";
    }

    public C1377Zb(int i, C2865aoD c2865aoD, C2865aoD c2865aoD2) {
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        this.a = i;
        this.e = c2865aoD;
        this.b = c2865aoD2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2185abV.d.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2187abX.a.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2812anD.d.b()).d();
    }

    /* renamed from: o.Zb$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final List<g> c;

        public final List<g> a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.c, ((d) obj).c);
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

        public d(List<g> list) {
            this.c = list;
        }
    }

    /* renamed from: o.Zb$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final String b;
        private final b d;

        public final String c() {
            return this.b;
        }

        public final b e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.b, (Object) gVar.b) && C8632dsu.c(this.d, gVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            b bVar = this.d;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            b bVar = this.d;
            return "Video(__typename=" + str + ", onEpisode=" + bVar + ")";
        }

        public g(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = bVar;
        }
    }

    /* renamed from: o.Zb$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2572aic a;
        private final c c;
        private final a d;
        private final C2363aeo e;

        public final c a() {
            return this.c;
        }

        public final C2572aic b() {
            return this.a;
        }

        public final a c() {
            return this.d;
        }

        public final C2363aeo e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.c, bVar.c) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            c cVar = this.c;
            int hashCode = cVar == null ? 0 : cVar.hashCode();
            a aVar = this.d;
            return (((((hashCode * 31) + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            c cVar = this.c;
            a aVar = this.d;
            C2363aeo c2363aeo = this.e;
            C2572aic c2572aic = this.a;
            return "OnEpisode(parentSeason=" + cVar + ", parentShow=" + aVar + ", episodeInfo=" + c2363aeo + ", playerEpisodeDetails=" + c2572aic + ")";
        }

        public b(c cVar, a aVar, C2363aeo c2363aeo, C2572aic c2572aic) {
            C8632dsu.c((Object) c2363aeo, "");
            C8632dsu.c((Object) c2572aic, "");
            this.c = cVar;
            this.d = aVar;
            this.e = c2363aeo;
            this.a = c2572aic;
        }
    }

    /* renamed from: o.Zb$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2547aiD c;
        private final String d;

        public final C2547aiD a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2547aiD c2547aiD = this.c;
            return "ParentSeason(__typename=" + str + ", seasonInfo=" + c2547aiD + ")";
        }

        public c(String str, C2547aiD c2547aiD) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2547aiD, "");
            this.d = str;
            this.c = c2547aiD;
        }
    }

    /* renamed from: o.Zb$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String c;
        private final C2576aig e;

        public final String b() {
            return this.c;
        }

        public final C2576aig e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2576aig c2576aig = this.e;
            return "ParentShow(__typename=" + str + ", playerShowBasic=" + c2576aig + ")";
        }

        public a(String str, C2576aig c2576aig) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2576aig, "");
            this.c = str;
            this.e = c2576aig;
        }
    }

    /* renamed from: o.Zb$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
