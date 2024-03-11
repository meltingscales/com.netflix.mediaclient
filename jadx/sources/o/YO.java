package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2210abu;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes6.dex */
public final class YO implements InterfaceC8999hM<a> {
    public static final c e = new c(null);
    private final C2990aqW a;
    private final C2865aoD b;
    private final boolean c;
    private final boolean d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "5d574030-1b04-4764-b991-0fda1d12b904";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YO) {
            YO yo = (YO) obj;
            return C8632dsu.c(this.a, yo.a) && C8632dsu.c(this.b, yo.b) && this.c == yo.c;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "myList";
    }

    public final C2990aqW g() {
        return this.a;
    }

    public final C2865aoD h() {
        return this.b;
    }

    public int hashCode() {
        C2990aqW c2990aqW = this.a;
        return ((((c2990aqW == null ? 0 : c2990aqW.hashCode()) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public final boolean i() {
        return this.c;
    }

    public String toString() {
        C2990aqW c2990aqW = this.a;
        C2865aoD c2865aoD = this.b;
        boolean z = this.c;
        return "MyListQuery(myListInput=" + c2990aqW + ", imageParamsForBoxart=" + c2865aoD + ", includeLiveData=" + z + ")";
    }

    public YO(C2990aqW c2990aqW, C2865aoD c2865aoD, boolean z) {
        C8632dsu.c((Object) c2865aoD, "");
        this.a = c2990aqW;
        this.b = c2865aoD;
        this.c = z;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2213abx.c.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2210abu.d.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2848ann.e.d()).d();
    }

    /* loaded from: classes6.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final int a;
        private final d b;
        private final g e;

        public final g b() {
            return this.e;
        }

        public final int c() {
            return this.a;
        }

        public final d e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.e, aVar.e) && C8632dsu.c(this.b, aVar.b) && this.a == aVar.a;
            }
            return false;
        }

        public int hashCode() {
            g gVar = this.e;
            int hashCode = gVar == null ? 0 : gVar.hashCode();
            d dVar = this.b;
            return (((hashCode * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            g gVar = this.e;
            d dVar = this.b;
            int i = this.a;
            return "Data(myList=" + gVar + ", gatewayRequestDetails=" + dVar + ", trackId=" + i + ")";
        }

        public a(g gVar, d dVar, int i) {
            this.e = gVar;
            this.b = dVar;
            this.a = i;
        }
    }

    /* loaded from: classes6.dex */
    public static final class g {
        private final String a;
        private final List<b> b;
        private final h d;
        private final Integer e;

        public final h a() {
            return this.d;
        }

        public final String b() {
            return this.a;
        }

        public final List<b> c() {
            return this.b;
        }

        public final Integer d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.a, (Object) gVar.a) && C8632dsu.c(this.e, gVar.e) && C8632dsu.c(this.d, gVar.d) && C8632dsu.c(this.b, gVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            Integer num = this.e;
            int hashCode2 = num == null ? 0 : num.hashCode();
            h hVar = this.d;
            int hashCode3 = hVar == null ? 0 : hVar.hashCode();
            List<b> list = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            Integer num = this.e;
            h hVar = this.d;
            List<b> list = this.b;
            return "MyList(__typename=" + str + ", totalCount=" + num + ", pageInfo=" + hVar + ", edges=" + list + ")";
        }

        public g(String str, Integer num, h hVar, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = num;
            this.d = hVar;
            this.b = list;
        }
    }

    /* loaded from: classes6.dex */
    public static final class h {
        private final String a;
        private final String b;
        private final String c;
        private final boolean e;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.a, (Object) hVar.a) && C8632dsu.c((Object) this.c, (Object) hVar.c) && C8632dsu.c((Object) this.b, (Object) hVar.b) && this.e == hVar.e;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            String str3 = this.b;
            boolean z = this.e;
            return "PageInfo(__typename=" + str + ", startCursor=" + str2 + ", endCursor=" + str3 + ", hasNextPage=" + z + ")";
        }

        public h(String str, String str2, String str3, boolean z) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = str2;
            this.b = str3;
            this.e = z;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private final j a;
        private final String b;
        private final String d;

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.d;
        }

        public final j d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            j jVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            j jVar = this.a;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + jVar + ")";
        }

        public b(String str, String str2, j jVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = str2;
            this.a = jVar;
        }
    }

    /* loaded from: classes6.dex */
    public static final class j {
        private final e a;
        private final C2383afH b;
        private final C2382afG c;
        private final String d;
        private final C2514ahX e;
        private final C2630ajh g;
        private final String j;

        public final C2382afG a() {
            return this.c;
        }

        public final C2383afH b() {
            return this.b;
        }

        public final String c() {
            return this.j;
        }

        public final e d() {
            return this.a;
        }

        public final C2514ahX e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.d, (Object) jVar.d) && C8632dsu.c((Object) this.j, (Object) jVar.j) && C8632dsu.c(this.a, jVar.a) && C8632dsu.c(this.g, jVar.g) && C8632dsu.c(this.e, jVar.e) && C8632dsu.c(this.b, jVar.b) && C8632dsu.c(this.c, jVar.c);
            }
            return false;
        }

        public final C2630ajh g() {
            return this.g;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.j;
            int hashCode2 = str == null ? 0 : str.hashCode();
            e eVar = this.a;
            int hashCode3 = eVar == null ? 0 : eVar.hashCode();
            C2630ajh c2630ajh = this.g;
            int hashCode4 = c2630ajh == null ? 0 : c2630ajh.hashCode();
            C2514ahX c2514ahX = this.e;
            int hashCode5 = c2514ahX == null ? 0 : c2514ahX.hashCode();
            C2383afH c2383afH = this.b;
            int hashCode6 = c2383afH == null ? 0 : c2383afH.hashCode();
            C2382afG c2382afG = this.c;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (c2382afG != null ? c2382afG.hashCode() : 0);
        }

        public final String i() {
            return this.d;
        }

        public String toString() {
            String str = this.d;
            String str2 = this.j;
            e eVar = this.a;
            C2630ajh c2630ajh = this.g;
            C2514ahX c2514ahX = this.e;
            C2383afH c2383afH = this.b;
            C2382afG c2382afG = this.c;
            return "Node(__typename=" + str + ", title=" + str2 + ", artwork=" + eVar + ", videoSummary=" + c2630ajh + ", playable=" + c2514ahX + ", liveVideoData=" + c2383afH + ", liveVideoArtworkData=" + c2382afG + ")";
        }

        public j(String str, String str2, e eVar, C2630ajh c2630ajh, C2514ahX c2514ahX, C2383afH c2383afH, C2382afG c2382afG) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.j = str2;
            this.a = eVar;
            this.g = c2630ajh;
            this.e = c2514ahX;
            this.b = c2383afH;
            this.c = c2382afG;
        }
    }

    /* loaded from: classes6.dex */
    public static final class e {
        private final String a;
        private final String b;
        private final String e;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.e, (Object) eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.a;
            String str3 = this.e;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = str2;
            this.e = str3;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d {
        private final String d;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.d, (Object) dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            return "GatewayRequestDetails(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public d(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = str2;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
