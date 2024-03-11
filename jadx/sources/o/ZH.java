package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2300ade;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class ZH implements InterfaceC8999hM<e> {
    public static final a b = new a(null);
    private final boolean a;
    private final List<Integer> e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "b0106123-7d90-4dde-afe1-50565ad0e2ad";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZH) && C8632dsu.c(this.e, ((ZH) obj).e);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "VideosInQueue";
    }

    public final List<Integer> h() {
        return this.e;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        List<Integer> list = this.e;
        return "VideosInQueueQuery(videoIds=" + list + ")";
    }

    public ZH(List<Integer> list) {
        C8632dsu.c((Object) list, "");
        this.e = list;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2306adk.a.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2300ade.a.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2896aoi.b.e()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final List<b> b;

        public final List<b> b() {
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

    /* loaded from: classes3.dex */
    public static final class b {
        private final C2627aje d;
        private final String e;

        public final C2627aje d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2627aje c2627aje = this.d;
            return "Video(__typename=" + str + ", videoInQueue=" + c2627aje + ")";
        }

        public b(String str, C2627aje c2627aje) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2627aje, "");
            this.e = str;
            this.d = c2627aje;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
