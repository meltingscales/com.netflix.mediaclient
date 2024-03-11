package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2246acd;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1379Zd implements InterfaceC8999hM<b> {
    public static final d c = new d(null);
    private final int d;
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "9fd5c3cd-1cb7-421b-94f6-25329807312a";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1379Zd) && this.d == ((C1379Zd) obj).d;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PlayerSeasonList";
    }

    public int hashCode() {
        return Integer.hashCode(this.d);
    }

    public final int j() {
        return this.d;
    }

    public String toString() {
        int i = this.d;
        return "PlayerSeasonListQuery(videoId=" + i + ")";
    }

    public C1379Zd(int i) {
        this.d = i;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2250ach.d.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2246acd.a.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2819anK.d.c()).d();
    }

    /* renamed from: o.Zd$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final List<e> b;

        public final List<e> c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.b, ((b) obj).b);
        }

        public int hashCode() {
            List<e> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<e> list = this.b;
            return "Data(videos=" + list + ")";
        }

        public b(List<e> list) {
            this.b = list;
        }
    }

    /* renamed from: o.Zd$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2546aiC d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final C2546aiC e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            C2546aiC c2546aiC = this.d;
            return (hashCode * 31) + (c2546aiC == null ? 0 : c2546aiC.hashCode());
        }

        public String toString() {
            String str = this.e;
            C2546aiC c2546aiC = this.d;
            return "Video(__typename=" + str + ", seasonListInfo=" + c2546aiC + ")";
        }

        public e(String str, C2546aiC c2546aiC) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = c2546aiC;
        }
    }

    /* renamed from: o.Zd$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
