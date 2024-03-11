package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2161aay;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1358Yp implements InterfaceC8999hM<b> {
    public static final d b = new d(null);
    private final C2865aoD a;
    private final C2865aoD c;
    private final C2865aoD d;
    private final C2865aoD e;
    private final List<Integer> h;
    private final boolean j;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "fddc4e16-64c3-4a48-96dd-82c6b9683aa0";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1358Yp) {
            C1358Yp c1358Yp = (C1358Yp) obj;
            return C8632dsu.c(this.h, c1358Yp.h) && C8632dsu.c(this.d, c1358Yp.d) && C8632dsu.c(this.c, c1358Yp.c) && C8632dsu.c(this.e, c1358Yp.e) && C8632dsu.c(this.a, c1358Yp.a);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "EpisodeDetailsForOffline";
    }

    public final C2865aoD g() {
        return this.d;
    }

    public final C2865aoD h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((this.h.hashCode() * 31) + this.d.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
    }

    public final C2865aoD i() {
        return this.c;
    }

    public final C2865aoD j() {
        return this.e;
    }

    public final List<Integer> o() {
        return this.h;
    }

    public String toString() {
        List<Integer> list = this.h;
        C2865aoD c2865aoD = this.d;
        C2865aoD c2865aoD2 = this.c;
        C2865aoD c2865aoD3 = this.e;
        C2865aoD c2865aoD4 = this.a;
        return "EpisodeDetailsForOfflineQuery(videoIds=" + list + ", artworkParamsForMdx=" + c2865aoD + ", artworkParamsForSDP=" + c2865aoD2 + ", artworkParamsForInterestingSmall=" + c2865aoD3 + ", artworkParamsForInteresting=" + c2865aoD4 + ")";
    }

    public C1358Yp(List<Integer> list, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.h = list;
        this.d = c2865aoD;
        this.c = c2865aoD2;
        this.e = c2865aoD3;
        this.a = c2865aoD4;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2105aaA.c.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2161aay.e.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2772amQ.e.e()).d();
    }

    /* renamed from: o.Yp$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final List<i> c;

        public final List<i> d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.c, ((b) obj).c);
        }

        public int hashCode() {
            List<i> list = this.c;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<i> list = this.c;
            return "Data(videos=" + list + ")";
        }

        public b(List<i> list) {
            this.c = list;
        }
    }

    /* renamed from: o.Yp$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final C2539ahw a;
        private final a b;
        private final c c;
        private final String d;
        private final C2410afi e;
        private final C2514ahX f;

        public final a a() {
            return this.b;
        }

        public final c b() {
            return this.c;
        }

        public final C2539ahw c() {
            return this.a;
        }

        public final C2514ahX d() {
            return this.f;
        }

        public final C2410afi e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.d, (Object) iVar.d) && C8632dsu.c(this.c, iVar.c) && C8632dsu.c(this.b, iVar.b) && C8632dsu.c(this.a, iVar.a) && C8632dsu.c(this.f, iVar.f) && C8632dsu.c(this.e, iVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            c cVar = this.c;
            int hashCode2 = cVar == null ? 0 : cVar.hashCode();
            a aVar = this.b;
            return (((((((((hashCode * 31) + hashCode2) * 31) + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
        }

        public final String j() {
            return this.d;
        }

        public String toString() {
            String str = this.d;
            c cVar = this.c;
            a aVar = this.b;
            C2539ahw c2539ahw = this.a;
            C2514ahX c2514ahX = this.f;
            C2410afi c2410afi = this.e;
            return "Video(__typename=" + str + ", interestingArtwork=" + cVar + ", onEpisode=" + aVar + ", offlinePlayable=" + c2539ahw + ", playable=" + c2514ahX + ", horzArtwork=" + c2410afi + ")";
        }

        public i(String str, c cVar, a aVar, C2539ahw c2539ahw, C2514ahX c2514ahX, C2410afi c2410afi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2539ahw, "");
            C8632dsu.c((Object) c2514ahX, "");
            C8632dsu.c((Object) c2410afi, "");
            this.d = str;
            this.c = cVar;
            this.b = aVar;
            this.a = c2539ahw;
            this.f = c2514ahX;
            this.e = c2410afi;
        }
    }

    /* renamed from: o.Yp$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final String d;

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.d, (Object) cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            return "InterestingArtwork(__typename=" + str + ", url=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = str2;
        }
    }

    /* renamed from: o.Yp$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final e a;
        private final int c;
        private final String d;
        private final j e;

        public final int a() {
            return this.c;
        }

        public final e b() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public final j e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.c == aVar.c && C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.a, aVar.a) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.c);
            int hashCode2 = this.d.hashCode();
            e eVar = this.a;
            int hashCode3 = eVar == null ? 0 : eVar.hashCode();
            j jVar = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            int i = this.c;
            String str = this.d;
            e eVar = this.a;
            j jVar = this.e;
            return "OnEpisode(videoId=" + i + ", __typename=" + str + ", parentSeason=" + eVar + ", parentShow=" + jVar + ")";
        }

        public a(int i, String str, e eVar, j jVar) {
            C8632dsu.c((Object) str, "");
            this.c = i;
            this.d = str;
            this.a = eVar;
            this.e = jVar;
        }
    }

    /* renamed from: o.Yp$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String d;
        private final C2547aiD e;

        public final C2547aiD c() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2547aiD c2547aiD = this.e;
            return "ParentSeason(__typename=" + str + ", seasonInfo=" + c2547aiD + ")";
        }

        public e(String str, C2547aiD c2547aiD) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2547aiD, "");
            this.d = str;
            this.e = c2547aiD;
        }
    }

    /* renamed from: o.Yp$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final String c;
        private final C2576aig d;

        public final String a() {
            return this.c;
        }

        public final C2576aig d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.c, (Object) jVar.c) && C8632dsu.c(this.d, jVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2576aig c2576aig = this.d;
            return "ParentShow(__typename=" + str + ", playerShowBasic=" + c2576aig + ")";
        }

        public j(String str, C2576aig c2576aig) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2576aig, "");
            this.c = str;
            this.d = c2576aig;
        }
    }

    /* renamed from: o.Yp$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
