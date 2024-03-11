package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2299add;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class ZJ implements InterfaceC8999hM<d> {
    public static final b a = new b(null);
    private final boolean b;
    private final String c;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "0c7c324e-1c26-4ba6-890e-e76832df5ffc";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZJ) && C8632dsu.c((Object) this.c, (Object) ((ZJ) obj).c);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "VerifyPassword";
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public final String j() {
        return this.c;
    }

    public String toString() {
        String str = this.c;
        return "VerifyPasswordQuery(password=" + str + ")";
    }

    public ZJ(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2301adf.e.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2299add.d.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2894aog.a.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final a e;

        public final a d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.e, ((d) obj).e);
        }

        public int hashCode() {
            a aVar = this.e;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.e;
            return "Data(verifyPassword=" + aVar + ")";
        }

        public d(a aVar) {
            this.e = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final Boolean a;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final Boolean b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Boolean bool = this.a;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.d;
            Boolean bool = this.a;
            return "VerifyPassword(__typename=" + str + ", verified=" + bool + ")";
        }

        public a(String str, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = bool;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
