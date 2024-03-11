package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2254acl;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1384Zi implements InterfaceC8999hM<e> {
    public static final b c = new b(null);
    private final boolean a;
    private final C2865aoD d;
    private final List<Integer> e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "f44ad6cd-e167-4c4d-b051-47c24ec50970";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1384Zi) {
            C1384Zi c1384Zi = (C1384Zi) obj;
            return C8632dsu.c(this.e, c1384Zi.e) && C8632dsu.c(this.d, c1384Zi.d);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PrefetchPlayerUIVideoDetails";
    }

    public final C2865aoD h() {
        return this.d;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public final List<Integer> j() {
        return this.e;
    }

    public String toString() {
        List<Integer> list = this.e;
        C2865aoD c2865aoD = this.d;
        return "PrefetchPlayerUIVideoDetailsQuery(videoIds=" + list + ", artworkParamsForMdx=" + c2865aoD + ")";
    }

    public C1384Zi(List<Integer> list, C2865aoD c2865aoD) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) c2865aoD, "");
        this.e = list;
        this.d = c2865aoD;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2255acm.d.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2254acl.d.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2816anH.a.e()).d();
    }

    /* renamed from: o.Zi$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final List<j> b;

        public final List<j> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.b, ((e) obj).b);
        }

        public int hashCode() {
            List<j> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<j> list = this.b;
            return "Data(videos=" + list + ")";
        }

        public e(List<j> list) {
            this.b = list;
        }
    }

    /* renamed from: o.Zi$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final a a;
        private final d b;
        private final i c;
        private final c d;
        private final String e;

        public final a a() {
            return this.a;
        }

        public final i b() {
            return this.c;
        }

        public final c c() {
            return this.d;
        }

        public final d d() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.e, (Object) jVar.e) && C8632dsu.c(this.d, jVar.d) && C8632dsu.c(this.b, jVar.b) && C8632dsu.c(this.a, jVar.a) && C8632dsu.c(this.c, jVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            c cVar = this.d;
            int hashCode2 = cVar == null ? 0 : cVar.hashCode();
            d dVar = this.b;
            int hashCode3 = dVar == null ? 0 : dVar.hashCode();
            a aVar = this.a;
            int hashCode4 = aVar == null ? 0 : aVar.hashCode();
            i iVar = this.c;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (iVar != null ? iVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            c cVar = this.d;
            d dVar = this.b;
            a aVar = this.a;
            i iVar = this.c;
            return "Video(__typename=" + str + ", onShow=" + cVar + ", onEpisode=" + dVar + ", onMovie=" + aVar + ", onSupplemental=" + iVar + ")";
        }

        public j(String str, c cVar, d dVar, a aVar, i iVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = cVar;
            this.b = dVar;
            this.a = aVar;
            this.c = iVar;
        }
    }

    /* renamed from: o.Zi$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2552aiI c;

        public final C2552aiI c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.c, ((c) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C2552aiI c2552aiI = this.c;
            return "OnShow(showInfo=" + c2552aiI + ")";
        }

        public c(C2552aiI c2552aiI) {
            C8632dsu.c((Object) c2552aiI, "");
            this.c = c2552aiI;
        }
    }

    /* renamed from: o.Zi$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2572aic b;
        private final C2579aij c;

        public final C2572aic a() {
            return this.b;
        }

        public final C2579aij d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            C2579aij c2579aij = this.c;
            C2572aic c2572aic = this.b;
            return "OnEpisode(playerUIBasicInfo=" + c2579aij + ", playerEpisodeDetails=" + c2572aic + ")";
        }

        public d(C2579aij c2579aij, C2572aic c2572aic) {
            C8632dsu.c((Object) c2579aij, "");
            C8632dsu.c((Object) c2572aic, "");
            this.c = c2579aij;
            this.b = c2572aic;
        }
    }

    /* renamed from: o.Zi$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2579aij a;

        public final C2579aij d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C2579aij c2579aij = this.a;
            return "OnMovie(playerUIBasicInfo=" + c2579aij + ")";
        }

        public a(C2579aij c2579aij) {
            C8632dsu.c((Object) c2579aij, "");
            this.a = c2579aij;
        }
    }

    /* renamed from: o.Zi$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final C2579aij a;

        public final C2579aij d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C8632dsu.c(this.a, ((i) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C2579aij c2579aij = this.a;
            return "OnSupplemental(playerUIBasicInfo=" + c2579aij + ")";
        }

        public i(C2579aij c2579aij) {
            C8632dsu.c((Object) c2579aij, "");
            this.a = c2579aij;
        }
    }

    /* renamed from: o.Zi$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
