package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2208abs;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YI implements InterfaceC8999hM<a> {
    public static final d a = new d(null);
    private final boolean b;
    private final C2865aoD c;
    private final C2865aoD d;
    private final C2865aoD e;
    private final List<Integer> g;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "2dc2997d-ee08-4178-a65e-32e589c136af";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YI) {
            YI yi = (YI) obj;
            return C8632dsu.c(this.g, yi.g) && C8632dsu.c(this.c, yi.c) && C8632dsu.c(this.d, yi.d) && C8632dsu.c(this.e, yi.e);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "MovieDetailsForOffline";
    }

    public final C2865aoD g() {
        return this.c;
    }

    public final C2865aoD h() {
        return this.d;
    }

    public int hashCode() {
        return (((((this.g.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final C2865aoD i() {
        return this.e;
    }

    public final List<Integer> j() {
        return this.g;
    }

    public String toString() {
        List<Integer> list = this.g;
        C2865aoD c2865aoD = this.c;
        C2865aoD c2865aoD2 = this.d;
        C2865aoD c2865aoD3 = this.e;
        return "MovieDetailsForOfflineQuery(videoIds=" + list + ", artworkParamsForMdx=" + c2865aoD + ", artworkParamsForSDP=" + c2865aoD2 + ", artworkParamsForInterestingSmall=" + c2865aoD3 + ")";
    }

    public YI(List<Integer> list, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        this.g = list;
        this.c = c2865aoD;
        this.d = c2865aoD2;
        this.e = c2865aoD3;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2207abr.e.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2208abs.e.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2849ano.a.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final List<b> b;

        public final List<b> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.b, ((a) obj).b);
        }

        public int hashCode() {
            List<b> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<b> list = this.b;
            return "Data(videos=" + list + ")";
        }

        public a(List<b> list) {
            this.b = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final C2514ahX b;
        private final C2579aij c;
        private final C2539ahw d;
        private final C2410afi e;

        public final C2514ahX a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final C2539ahw c() {
            return this.d;
        }

        public final C2410afi d() {
            return this.e;
        }

        public final C2579aij e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.c, bVar.c) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2579aij c2579aij = this.c;
            C2410afi c2410afi = this.e;
            C2539ahw c2539ahw = this.d;
            C2514ahX c2514ahX = this.b;
            return "Video(__typename=" + str + ", playerUIBasicInfo=" + c2579aij + ", horzArtwork=" + c2410afi + ", offlinePlayable=" + c2539ahw + ", playable=" + c2514ahX + ")";
        }

        public b(String str, C2579aij c2579aij, C2410afi c2410afi, C2539ahw c2539ahw, C2514ahX c2514ahX) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2579aij, "");
            C8632dsu.c((Object) c2410afi, "");
            C8632dsu.c((Object) c2539ahw, "");
            C8632dsu.c((Object) c2514ahX, "");
            this.a = str;
            this.c = c2579aij;
            this.e = c2410afi;
            this.d = c2539ahw;
            this.b = c2514ahX;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
