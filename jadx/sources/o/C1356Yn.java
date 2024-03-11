package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2162aaz;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1356Yn implements InterfaceC8999hM<a> {
    public static final d e = new d(null);
    private final C2865aoD a;
    private final C2865aoD b;
    private final boolean c;
    private final int d;
    private final int g;
    private final String j;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "b592c3da-25a4-49c8-a35e-9fc962cf149a";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1356Yn) {
            C1356Yn c1356Yn = (C1356Yn) obj;
            return this.g == c1356Yn.g && C8632dsu.c(this.a, c1356Yn.a) && C8632dsu.c((Object) this.j, (Object) c1356Yn.j) && this.d == c1356Yn.d && C8632dsu.c(this.b, c1356Yn.b);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "EpisodeDetails";
    }

    public final C2865aoD g() {
        return this.b;
    }

    public final String h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.g);
        int hashCode2 = this.a.hashCode();
        String str = this.j;
        return (((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.d)) * 31) + this.b.hashCode();
    }

    public final int i() {
        return this.d;
    }

    public final C2865aoD j() {
        return this.a;
    }

    public final int o() {
        return this.g;
    }

    public String toString() {
        int i = this.g;
        C2865aoD c2865aoD = this.a;
        String str = this.j;
        int i2 = this.d;
        C2865aoD c2865aoD2 = this.b;
        return "EpisodeDetailsQuery(videoId=" + i + ", artworkParamsForInterestingSmall=" + c2865aoD + ", startEpisodeCursor=" + str + ", numOfEpisodes=" + i2 + ", artworkParamsForMdx=" + c2865aoD2 + ")";
    }

    public C1356Yn(int i, C2865aoD c2865aoD, String str, int i2, C2865aoD c2865aoD2) {
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        this.g = i;
        this.a = c2865aoD;
        this.j = str;
        this.d = i2;
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
        C2109aaE.a.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2162aaz.a.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2776amU.e.c()).d();
    }

    /* renamed from: o.Yn$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final List<e> a;
        private final c e;

        public final List<e> a() {
            return this.a;
        }

        public final c e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.a, aVar.a) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            List<e> list = this.a;
            int hashCode = list == null ? 0 : list.hashCode();
            c cVar = this.e;
            return (hashCode * 31) + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            List<e> list = this.a;
            c cVar = this.e;
            return "Data(videos=" + list + ", currentProfile=" + cVar + ")";
        }

        public a(List<e> list, c cVar) {
            this.a = list;
            this.e = cVar;
        }
    }

    /* renamed from: o.Yn$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String c;
        private final C2368aet e;

        public final String b() {
            return this.c;
        }

        public final C2368aet c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2368aet c2368aet = this.e;
            return "Video(__typename=" + str + ", episodesInfo=" + c2368aet + ")";
        }

        public e(String str, C2368aet c2368aet) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2368aet, "");
            this.c = str;
            this.e = c2368aet;
        }
    }

    /* renamed from: o.Yn$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String d;
        private final Boolean e;

        public final Boolean b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Boolean bool = this.e;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.d;
            Boolean bool = this.e;
            return "CurrentProfile(__typename=" + str + ", isAutoStartEnabled=" + bool + ")";
        }

        public c(String str, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = bool;
        }
    }

    /* renamed from: o.Yn$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
