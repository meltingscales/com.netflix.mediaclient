package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2194abe;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YF implements InterfaceC8999hM<b> {
    public static final a c = new a(null);
    private final List<Integer> d;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "bd386528-aaa8-4203-b33c-b5f6f43f2dec";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YF) && C8632dsu.c(this.d, ((YF) obj).d);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "LiveVideoData";
    }

    public final List<Integer> g() {
        return this.d;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        List<Integer> list = this.d;
        return "LiveVideoDataQuery(videoIds=" + list + ")";
    }

    public YF(List<Integer> list) {
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
        C2193abd.c.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2194abe.d.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2846anl.a.d()).d();
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final List<c> b;

        public final List<c> e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.b, ((b) obj).b);
        }

        public int hashCode() {
            List<c> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<c> list = this.b;
            return "Data(videos=" + list + ")";
        }

        public b(List<c> list) {
            this.b = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final C2383afH c;
        private final String d;

        public final String b() {
            return this.d;
        }

        public final C2383afH d() {
            return this.c;
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
            return (this.d.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2383afH c2383afH = this.c;
            return "Video(__typename=" + str + ", liveVideoData=" + c2383afH + ")";
        }

        public c(String str, C2383afH c2383afH) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2383afH, "");
            this.d = str;
            this.c = c2383afH;
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
