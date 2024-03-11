package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2248acf;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1383Zh implements InterfaceC8999hM<b> {
    public static final d e = new d(null);
    private final C2865aoD b;
    private final boolean c;
    private final int d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "e33fe388-cb41-4bbc-97ad-93c1a2e161c8";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1383Zh) {
            C1383Zh c1383Zh = (C1383Zh) obj;
            return this.d == c1383Zh.d && C8632dsu.c(this.b, c1383Zh.b);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PlayerUINextEpisode";
    }

    public final C2865aoD g() {
        return this.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.d) * 31) + this.b.hashCode();
    }

    public final int i() {
        return this.d;
    }

    public String toString() {
        int i = this.d;
        C2865aoD c2865aoD = this.b;
        return "PlayerUINextEpisodeQuery(videoId=" + i + ", artworkParamsForMdx=" + c2865aoD + ")";
    }

    public C1383Zh(int i, C2865aoD c2865aoD) {
        C8632dsu.c((Object) c2865aoD, "");
        this.d = i;
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
        C2252acj.e.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2248acf.b.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2820anL.c.e()).d();
    }

    /* renamed from: o.Zh$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final List<c> a;

        public final List<c> b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            List<c> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<c> list = this.a;
            return "Data(videos=" + list + ")";
        }

        public b(List<c> list) {
            this.a = list;
        }
    }

    /* renamed from: o.Zh$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final a c;
        private final String d;

        public final a a() {
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
            int hashCode = this.d.hashCode();
            a aVar = this.c;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            a aVar = this.c;
            return "Video(__typename=" + str + ", onEpisode=" + aVar + ")";
        }

        public c(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = aVar;
        }
    }

    /* renamed from: o.Zh$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final e b;
        private final int c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final e b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && this.c == aVar.c && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.c);
            e eVar = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            int i = this.c;
            e eVar = this.b;
            return "OnEpisode(__typename=" + str + ", videoId=" + i + ", nextEpisode=" + eVar + ")";
        }

        public a(String str, int i, e eVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = i;
            this.b = eVar;
        }
    }

    /* renamed from: o.Zh$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2572aic a;
        private final C2579aij b;
        private final String c;

        public final C2579aij b() {
            return this.b;
        }

        public final C2572aic d() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2579aij c2579aij = this.b;
            C2572aic c2572aic = this.a;
            return "NextEpisode(__typename=" + str + ", playerUIBasicInfo=" + c2579aij + ", playerEpisodeDetails=" + c2572aic + ")";
        }

        public e(String str, C2579aij c2579aij, C2572aic c2572aic) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2579aij, "");
            C8632dsu.c((Object) c2572aic, "");
            this.c = str;
            this.b = c2579aij;
            this.a = c2572aic;
        }
    }

    /* renamed from: o.Zh$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
