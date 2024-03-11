package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2112aaH;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1359Yq implements InterfaceC8999hM<e> {
    public static final b c = new b(null);
    private final C2865aoD a;
    private final C2865aoD b;
    private final int d;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "445e1bf2-492e-4993-b023-2fce2312d097";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1359Yq) {
            C1359Yq c1359Yq = (C1359Yq) obj;
            return this.d == c1359Yq.d && C8632dsu.c(this.b, c1359Yq.b) && C8632dsu.c(this.a, c1359Yq.a);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "EpisodeListPrefetch";
    }

    public final C2865aoD h() {
        return this.a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.d) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public final int i() {
        return this.d;
    }

    public final C2865aoD j() {
        return this.b;
    }

    public String toString() {
        int i = this.d;
        C2865aoD c2865aoD = this.b;
        C2865aoD c2865aoD2 = this.a;
        return "EpisodeListPrefetchQuery(videoId=" + i + ", artworkParamsForMdx=" + c2865aoD + ", artworkParamsForInterestingSmall=" + c2865aoD2 + ")";
    }

    public C1359Yq(int i, C2865aoD c2865aoD, C2865aoD c2865aoD2) {
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        this.d = i;
        this.b = c2865aoD;
        this.a = c2865aoD2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2111aaG.c.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2112aaH.c.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2775amT.c.a()).d();
    }

    /* renamed from: o.Yq$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final List<j> d;

        public final List<j> e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            List<j> list = this.d;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<j> list = this.d;
            return "Data(videos=" + list + ")";
        }

        public e(List<j> list) {
            this.d = list;
        }
    }

    /* renamed from: o.Yq$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final c d;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final c e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.e, (Object) jVar.e) && C8632dsu.c(this.d, jVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            c cVar = this.d;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            c cVar = this.d;
            return "Video(__typename=" + str + ", onEpisode=" + cVar + ")";
        }

        public j(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = cVar;
        }
    }

    /* renamed from: o.Yq$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final a a;
        private final C2363aeo c;
        private final d d;

        public final a a() {
            return this.a;
        }

        public final d c() {
            return this.d;
        }

        public final C2363aeo e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.d, cVar.d) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            d dVar = this.d;
            int hashCode = dVar == null ? 0 : dVar.hashCode();
            a aVar = this.a;
            return (((hashCode * 31) + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            d dVar = this.d;
            a aVar = this.a;
            C2363aeo c2363aeo = this.c;
            return "OnEpisode(parentSeason=" + dVar + ", parentShow=" + aVar + ", episodeInfo=" + c2363aeo + ")";
        }

        public c(d dVar, a aVar, C2363aeo c2363aeo) {
            C8632dsu.c((Object) c2363aeo, "");
            this.d = dVar;
            this.a = aVar;
            this.c = c2363aeo;
        }
    }

    /* renamed from: o.Yq$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2547aiD a;
        private final String c;

        public final C2547aiD c() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2547aiD c2547aiD = this.a;
            return "ParentSeason(__typename=" + str + ", seasonInfo=" + c2547aiD + ")";
        }

        public d(String str, C2547aiD c2547aiD) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2547aiD, "");
            this.c = str;
            this.a = c2547aiD;
        }
    }

    /* renamed from: o.Yq$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2553aiJ a;
        private final C2546aiC b;
        private final String e;

        public final C2553aiJ a() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final C2546aiC e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.b, aVar.b) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2546aiC c2546aiC = this.b;
            C2553aiJ c2553aiJ = this.a;
            return "ParentShow(__typename=" + str + ", seasonListInfo=" + c2546aiC + ", showDetails=" + c2553aiJ + ")";
        }

        public a(String str, C2546aiC c2546aiC, C2553aiJ c2553aiJ) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2546aiC, "");
            C8632dsu.c((Object) c2553aiJ, "");
            this.e = str;
            this.b = c2546aiC;
            this.a = c2553aiJ;
        }
    }

    /* renamed from: o.Yq$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
