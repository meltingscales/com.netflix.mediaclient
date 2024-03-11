package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2238acV;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class ZB implements InterfaceC8999hM<d> {
    public static final a a = new a(null);
    private final C2865aoD b;
    private final C2865aoD c;
    private final boolean d;
    private final C2865aoD e;
    private final List<Integer> g;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "c8683886-458c-4be2-997e-269108fa65f0";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZB) {
            ZB zb = (ZB) obj;
            return C8632dsu.c(this.g, zb.g) && C8632dsu.c(this.e, zb.e) && C8632dsu.c(this.b, zb.b) && C8632dsu.c(this.c, zb.c);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "ShowDetailsAndSeasonsForOffline";
    }

    public final C2865aoD g() {
        return this.e;
    }

    public final List<Integer> h() {
        return this.g;
    }

    public int hashCode() {
        return (((((this.g.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final C2865aoD i() {
        return this.c;
    }

    public final C2865aoD j() {
        return this.b;
    }

    public String toString() {
        List<Integer> list = this.g;
        C2865aoD c2865aoD = this.e;
        C2865aoD c2865aoD2 = this.b;
        C2865aoD c2865aoD3 = this.c;
        return "ShowDetailsAndSeasonsForOfflineQuery(videoIds=" + list + ", artworkParamsForSDP=" + c2865aoD + ", artworkParamsForInterestingSmall=" + c2865aoD2 + ", artworkParamsForMdx=" + c2865aoD3 + ")";
    }

    public ZB(List<Integer> list, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        this.g = list;
        this.e = c2865aoD;
        this.b = c2865aoD2;
        this.c = c2865aoD3;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2297adb.b.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2238acV.b.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2893aof.b.c()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final List<e> c;

        public final List<e> c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.c, ((d) obj).c);
        }

        public int hashCode() {
            List<e> list = this.c;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<e> list = this.c;
            return "Data(videos=" + list + ")";
        }

        public d(List<e> list) {
            this.c = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final C2553aiJ a;
        private final c b;
        private final String d;
        private final C2410afi e;

        public final C2410afi a() {
            return this.e;
        }

        public final c b() {
            return this.b;
        }

        public final C2553aiJ d() {
            return this.a;
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
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.b.hashCode();
            C2553aiJ c2553aiJ = this.a;
            return (((((hashCode * 31) + hashCode2) * 31) + (c2553aiJ == null ? 0 : c2553aiJ.hashCode())) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            c cVar = this.b;
            C2553aiJ c2553aiJ = this.a;
            C2410afi c2410afi = this.e;
            return "Video(__typename=" + str + ", onVideo=" + cVar + ", showDetails=" + c2553aiJ + ", horzArtwork=" + c2410afi + ")";
        }

        public e(String str, c cVar, C2553aiJ c2553aiJ, C2410afi c2410afi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) cVar, "");
            C8632dsu.c((Object) c2410afi, "");
            this.d = str;
            this.b = cVar;
            this.a = c2553aiJ;
            this.e = c2410afi;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final C2539ahw a;
        private final C2514ahX c;
        private final C2538ahv e;

        public final C2514ahX a() {
            return this.c;
        }

        public final C2539ahw b() {
            return this.a;
        }

        public final C2538ahv e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.c, cVar.c) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            C2514ahX c2514ahX = this.c;
            C2539ahw c2539ahw = this.a;
            C2538ahv c2538ahv = this.e;
            return "OnVideo(playable=" + c2514ahX + ", offlinePlayable=" + c2539ahw + ", offlineShowDetails=" + c2538ahv + ")";
        }

        public c(C2514ahX c2514ahX, C2539ahw c2539ahw, C2538ahv c2538ahv) {
            C8632dsu.c((Object) c2514ahX, "");
            C8632dsu.c((Object) c2539ahw, "");
            C8632dsu.c((Object) c2538ahv, "");
            this.c = c2514ahX;
            this.a = c2539ahw;
            this.e = c2538ahv;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
