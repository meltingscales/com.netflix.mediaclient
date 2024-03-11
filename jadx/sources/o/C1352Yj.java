package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2155aas;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1352Yj implements InterfaceC8999hM<d> {
    public static final e a = new e(null);
    private final String c;
    private final Integer d;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "18df6d50-bbae-40e9-8146-de12e361695c";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1352Yj) {
            C1352Yj c1352Yj = (C1352Yj) obj;
            return C8632dsu.c((Object) this.c, (Object) c1352Yj.c) && C8632dsu.c(this.d, c1352Yj.d);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "DownloadsForYou";
    }

    public final Integer h() {
        return this.d;
    }

    public int hashCode() {
        String str = this.c;
        int hashCode = str == null ? 0 : str.hashCode();
        Integer num = this.d;
        return (hashCode * 31) + (num != null ? num.hashCode() : 0);
    }

    public final String j() {
        return this.c;
    }

    public String toString() {
        String str = this.c;
        Integer num = this.d;
        return "DownloadsForYouQuery(videoCursor=" + str + ", first_videos=" + num + ")";
    }

    public C1352Yj(String str, Integer num) {
        this.c = str;
        this.d = num;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2159aaw.b.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2155aas.a.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2770amO.c.e()).d();
    }

    /* renamed from: o.Yj$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final b d;

        public final b e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.d, ((d) obj).d);
        }

        public int hashCode() {
            b bVar = this.d;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.d;
            return "Data(downloadsForYou=" + bVar + ")";
        }

        public d(b bVar) {
            this.d = bVar;
        }
    }

    /* renamed from: o.Yj$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final Integer a;
        private final String b;
        private final List<c> d;

        public final Integer a() {
            return this.a;
        }

        public final List<c> c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Integer num = this.a;
            int hashCode2 = num == null ? 0 : num.hashCode();
            List<c> list = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            Integer num = this.a;
            List<c> list = this.d;
            return "DownloadsForYou(__typename=" + str + ", totalCount=" + num + ", edges=" + list + ")";
        }

        public b(String str, Integer num, List<c> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = num;
            this.d = list;
        }
    }

    /* renamed from: o.Yj$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final a e;

        public final String a() {
            return this.a;
        }

        public final a d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            a aVar = this.e;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            a aVar = this.e;
            return "Edge(__typename=" + str + ", node=" + aVar + ")";
        }

        public c(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = aVar;
        }
    }

    /* renamed from: o.Yj$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final C2293adX b;

        public final String c() {
            return this.a;
        }

        public final C2293adX e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2293adX c2293adX = this.b;
            return "Node(__typename=" + str + ", downloadsForYouData=" + c2293adX + ")";
        }

        public a(String str, C2293adX c2293adX) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2293adX, "");
            this.a = str;
            this.b = c2293adX;
        }
    }

    /* renamed from: o.Yj$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
