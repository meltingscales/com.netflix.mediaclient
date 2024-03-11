package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C9018hf;
import o.InterfaceC8990hD;
import o.ZK;

/* loaded from: classes3.dex */
public final class XV implements InterfaceC8990hD<c> {
    public static final d a = new d(null);
    private final boolean d;
    private final C2911aox e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "e0963d22-099c-4e01-832a-789a8d98a240";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XV) && C8632dsu.c(this.e, ((XV) obj).e);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "AddProfileTitleProtectionMutation";
    }

    public final C2911aox g() {
        return this.e;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        C2911aox c2911aox = this.e;
        return "AddProfileTitleProtectionMutation(input=" + c2911aox + ")";
    }

    public XV(C2911aox c2911aox) {
        C8632dsu.c((Object) c2911aox, "");
        this.e = c2911aox;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        ZQ.e.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(ZK.c.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2806amy.d.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final b d;

        public final b b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.d, ((c) obj).d);
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
            return "Data(addTitleProtection=" + bVar + ")";
        }

        public c(b bVar) {
            this.d = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final List<a> a;
        private final String c;
        private final boolean e;

        public final boolean b() {
            return this.e;
        }

        public final List<a> c() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && this.e == bVar.e && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Boolean.hashCode(this.e);
            List<a> list = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.c;
            boolean z = this.e;
            List<a> list = this.a;
            return "AddTitleProtection(__typename=" + str + ", success=" + z + ", errors=" + list + ")";
        }

        public b(String str, boolean z, List<a> list) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = z;
            this.a = list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final String c;
        private final String d;

        public final String b() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c((Object) this.d, (Object) aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            return "Error(__typename=" + str + ", message=" + str2 + ")";
        }

        public a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.d = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
