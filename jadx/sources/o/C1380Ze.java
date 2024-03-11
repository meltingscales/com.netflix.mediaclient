package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2188abY;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Ze  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1380Ze implements InterfaceC8999hM<e> {
    public static final d d = new d(null);
    private final int a;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "95c4eb84-36e1-41f3-94bc-c372772af4e5";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1380Ze) && this.a == ((C1380Ze) obj).a;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PlayerAdvisories";
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int i() {
        return this.a;
    }

    public String toString() {
        int i = this.a;
        return "PlayerAdvisoriesQuery(videoId=" + i + ")";
    }

    public C1380Ze(int i) {
        this.a = i;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2189abZ.a.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2188abY.d.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2811anC.e.b()).d();
    }

    /* renamed from: o.Ze$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final List<b> e;

        public final List<b> b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.e, ((e) obj).e);
        }

        public int hashCode() {
            List<b> list = this.e;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<b> list = this.e;
            return "Data(videos=" + list + ")";
        }

        public e(List<b> list) {
            this.e = list;
        }
    }

    /* renamed from: o.Ze$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final int a;
        private final C2512ahV b;
        private final C2315adt c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final C2512ahV b() {
            return this.b;
        }

        public final int c() {
            return this.a;
        }

        public final C2315adt d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && this.a == bVar.a && C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.d.hashCode() * 31) + Integer.hashCode(this.a)) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            int i = this.a;
            C2512ahV c2512ahV = this.b;
            C2315adt c2315adt = this.c;
            return "Video(__typename=" + str + ", videoId=" + i + ", playerAdvisories=" + c2512ahV + ", broadcastInfo=" + c2315adt + ")";
        }

        public b(String str, int i, C2512ahV c2512ahV, C2315adt c2315adt) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2512ahV, "");
            C8632dsu.c((Object) c2315adt, "");
            this.d = str;
            this.a = i;
            this.b = c2512ahV;
            this.c = c2315adt;
        }
    }

    /* renamed from: o.Ze$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
