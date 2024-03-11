package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2123aaM;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Ys  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1361Ys implements InterfaceC8999hM<a> {
    public static final b c = new b(null);
    private final String a;
    private final int b;
    private final int d;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "1d46db3e-3851-4364-8be7-b5989ebb2d73";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1361Ys) {
            C1361Ys c1361Ys = (C1361Ys) obj;
            return this.d == c1361Ys.d && C8632dsu.c((Object) this.a, (Object) c1361Ys.a) && this.b == c1361Ys.b;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "FullDpMoreEpisodes";
    }

    public final int g() {
        return this.d;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.d) * 31) + this.a.hashCode()) * 31) + Integer.hashCode(this.b);
    }

    public final int i() {
        return this.b;
    }

    public String toString() {
        int i = this.d;
        String str = this.a;
        int i2 = this.b;
        return "FullDpMoreEpisodesQuery(seasonId=" + i + ", afterCursor=" + str + ", widthForEpisode=" + i2 + ")";
    }

    public C1361Ys(int i, String str, int i2) {
        C8632dsu.c((Object) str, "");
        this.d = i;
        this.a = str;
        this.b = i2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2113aaI.a.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2123aaM.a.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2778amW.b.b()).d();
    }

    /* renamed from: o.Ys$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final List<d> b;

        public final List<d> d() {
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

    /* renamed from: o.Ys$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final e c;
        private final int d;

        public final e a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && this.d == dVar.d && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = Integer.hashCode(this.d);
            e eVar = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            int i = this.d;
            e eVar = this.c;
            return "Video(__typename=" + str + ", videoId=" + i + ", onSeason=" + eVar + ")";
        }

        public d(String str, int i, e eVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = i;
            this.c = eVar;
        }
    }

    /* renamed from: o.Ys$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final c e;

        public final c b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.e, ((e) obj).e);
        }

        public int hashCode() {
            c cVar = this.e;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            c cVar = this.e;
            return "OnSeason(episodes=" + cVar + ")";
        }

        public e(c cVar) {
            this.e = cVar;
        }
    }

    /* renamed from: o.Ys$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final C2328aeF d;

        public final C2328aeF a() {
            return this.d;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2328aeF c2328aeF = this.d;
            return "Episodes(__typename=" + str + ", fullDpEpisodesPage=" + c2328aeF + ")";
        }

        public c(String str, C2328aeF c2328aeF) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2328aeF, "");
            this.b = str;
            this.d = c2328aeF;
        }
    }

    /* renamed from: o.Ys$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
