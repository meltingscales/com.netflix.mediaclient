package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2154aar;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1351Yi implements InterfaceC8999hM<e> {
    public static final d d = new d(null);
    private final String a;
    private final Integer b;
    private final boolean c;
    private final C2865aoD e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "6b8893c1-b69e-4707-8b00-b0734f2e1d9e";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1351Yi) {
            C1351Yi c1351Yi = (C1351Yi) obj;
            return C8632dsu.c((Object) this.a, (Object) c1351Yi.a) && C8632dsu.c(this.b, c1351Yi.b) && C8632dsu.c(this.e, c1351Yi.e);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "DownloadsForYouBoxarts";
    }

    public final C2865aoD g() {
        return this.e;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        Integer num = this.b;
        return (((hashCode * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final Integer i() {
        return this.b;
    }

    public final String j() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        Integer num = this.b;
        C2865aoD c2865aoD = this.e;
        return "DownloadsForYouBoxartsQuery(videoCursor=" + str + ", first_videos=" + num + ", imageParamsForBoxart=" + c2865aoD + ")";
    }

    public C1351Yi(String str, Integer num, C2865aoD c2865aoD) {
        C8632dsu.c((Object) c2865aoD, "");
        this.a = str;
        this.b = num;
        this.e = c2865aoD;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2153aaq.a.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2154aar.e.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2765amJ.d.e()).d();
    }

    /* renamed from: o.Yi$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final c a;

        public final c b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            c cVar = this.a;
            return "Data(downloadsForYou=" + cVar + ")";
        }

        public e(c cVar) {
            this.a = cVar;
        }
    }

    /* renamed from: o.Yi$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final Integer a;
        private final List<b> b;
        private final String d;

        public final List<b> a() {
            return this.b;
        }

        public final Integer c() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Integer num = this.a;
            int hashCode2 = num == null ? 0 : num.hashCode();
            List<b> list = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            Integer num = this.a;
            List<b> list = this.b;
            return "DownloadsForYou(__typename=" + str + ", totalCount=" + num + ", edges=" + list + ")";
        }

        public c(String str, Integer num, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = num;
            this.b = list;
        }
    }

    /* renamed from: o.Yi$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final a c;

        public final String d() {
            return this.a;
        }

        public final a e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            a aVar = this.c;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            a aVar = this.c;
            return "Edge(__typename=" + str + ", node=" + aVar + ")";
        }

        public b(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = aVar;
        }
    }

    /* renamed from: o.Yi$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2625ajc b;
        private final String d;
        private final int e;

        public final C2625ajc a() {
            return this.b;
        }

        public final String c() {
            return this.d;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && this.e == aVar.e && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (((this.d.hashCode() * 31) + Integer.hashCode(this.e)) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            int i = this.e;
            C2625ajc c2625ajc = this.b;
            return "Node(__typename=" + str + ", videoId=" + i + ", videoBoxart=" + c2625ajc + ")";
        }

        public a(String str, int i, C2625ajc c2625ajc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2625ajc, "");
            this.d = str;
            this.e = i;
            this.b = c2625ajc;
        }
    }

    /* renamed from: o.Yi$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
