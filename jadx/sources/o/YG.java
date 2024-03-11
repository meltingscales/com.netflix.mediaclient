package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2198abi;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YG implements InterfaceC8999hM<a> {
    public static final e b = new e(null);
    private final C2865aoD a;
    private final List<Integer> c;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "db321343-c821-4094-a82c-eb8103d3a560";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YG) {
            YG yg = (YG) obj;
            return C8632dsu.c(this.c, yg.c) && C8632dsu.c(this.a, yg.a);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "LiveVideoDataWithArtwork";
    }

    public final C2865aoD h() {
        return this.a;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.a.hashCode();
    }

    public final List<Integer> i() {
        return this.c;
    }

    public String toString() {
        List<Integer> list = this.c;
        C2865aoD c2865aoD = this.a;
        return "LiveVideoDataWithArtworkQuery(videoIds=" + list + ", imageParamsForBoxart=" + c2865aoD + ")";
    }

    public YG(List<Integer> list, C2865aoD c2865aoD) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c2865aoD, "");
        this.c = list;
        this.a = c2865aoD;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2197abh.a.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2198abi.e.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2847anm.e.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final List<d> b;

        public final List<d> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.b, ((a) obj).b);
        }

        public int hashCode() {
            List<d> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<d> list = this.b;
            return "Data(videos=" + list + ")";
        }

        public a(List<d> list) {
            this.b = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final C2382afG a;
        private final C2383afH b;
        private final String c;

        public final C2382afG a() {
            return this.a;
        }

        public final C2383afH b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2383afH c2383afH = this.b;
            C2382afG c2382afG = this.a;
            return "Video(__typename=" + str + ", liveVideoData=" + c2383afH + ", liveVideoArtworkData=" + c2382afG + ")";
        }

        public d(String str, C2383afH c2383afH, C2382afG c2382afG) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2383afH, "");
            C8632dsu.c((Object) c2382afG, "");
            this.c = str;
            this.b = c2383afH;
            this.a = c2382afG;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
