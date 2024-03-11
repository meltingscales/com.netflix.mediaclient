package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2308adm;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class ZI implements InterfaceC8999hM<d> {
    public static final e b = new e(null);
    private final boolean a;
    private final List<Integer> d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "bf860a88-99cf-4d5c-8147-cecfa964b6ea";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZI) && C8632dsu.c(this.d, ((ZI) obj).d);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "VideosInRemindMe";
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public final List<Integer> j() {
        return this.d;
    }

    public String toString() {
        List<Integer> list = this.d;
        return "VideosInRemindMeQuery(videoIds=" + list + ")";
    }

    public ZI(List<Integer> list) {
        C8632dsu.c((Object) list, "");
        this.d = list;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2307adl.e.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2308adm.e.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2903aop.d.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final List<b> c;

        public final List<b> e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.c, ((d) obj).c);
        }

        public int hashCode() {
            List<b> list = this.c;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<b> list = this.c;
            return "Data(videos=" + list + ")";
        }

        public d(List<b> list) {
            this.c = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String c;
        private final C2631aji e;

        public final String d() {
            return this.c;
        }

        public final C2631aji e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2631aji c2631aji = this.e;
            return "Video(__typename=" + str + ", videoInRemindMe=" + c2631aji + ")";
        }

        public b(String str, C2631aji c2631aji) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2631aji, "");
            this.c = str;
            this.e = c2631aji;
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
