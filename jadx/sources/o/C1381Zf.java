package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2247ace;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1381Zf implements InterfaceC8999hM<e> {
    public static final a b = new a(null);
    private final boolean a;
    private final int c;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "db79f52c-ca5f-41f7-a578-9f26b30d1684";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1381Zf) && this.c == ((C1381Zf) obj).c;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PlayerSeasonListAndShowDetails";
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.c);
    }

    public String toString() {
        int i = this.c;
        return "PlayerSeasonListAndShowDetailsQuery(videoId=" + i + ")";
    }

    public C1381Zf(int i) {
        this.c = i;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2245acc.c.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2247ace.c.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2818anJ.b.e()).d();
    }

    /* renamed from: o.Zf$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final List<b> b;

        public final List<b> a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.b, ((e) obj).b);
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

        public e(List<b> list) {
            this.b = list;
        }
    }

    /* renamed from: o.Zf$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final d d;

        public final d b() {
            return this.d;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            d dVar = this.d;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            d dVar = this.d;
            return "Video(__typename=" + str + ", onShow=" + dVar + ")";
        }

        public b(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = dVar;
        }
    }

    /* renamed from: o.Zf$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2553aiJ a;

        public final C2553aiJ c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C2553aiJ c2553aiJ = this.a;
            return "OnShow(showDetails=" + c2553aiJ + ")";
        }

        public d(C2553aiJ c2553aiJ) {
            C8632dsu.c((Object) c2553aiJ, "");
            this.a = c2553aiJ;
        }
    }

    /* renamed from: o.Zf$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
