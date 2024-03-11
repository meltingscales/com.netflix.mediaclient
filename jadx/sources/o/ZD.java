package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2242acZ;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class ZD implements InterfaceC8999hM<b> {
    public static final d a = new d(null);
    private final boolean b;
    private final String e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "e30e2b4b-e9fc-443f-b236-364bd48d884c";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZD) && C8632dsu.c((Object) this.e, (Object) ((ZD) obj).e);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "upiHandleAvailability";
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public final String j() {
        return this.e;
    }

    public String toString() {
        String str = this.e;
        return "UpiHandleAvailabilityQuery(handle=" + str + ")";
    }

    public ZD(String str) {
        C8632dsu.c((Object) str, "");
        this.e = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2298adc.c.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2242acZ.a.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2898aok.c.e()).d();
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final f c;

        public final f c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.c, ((b) obj).c);
        }

        public int hashCode() {
            f fVar = this.c;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public String toString() {
            f fVar = this.c;
            return "Data(upiHandleAvailability=" + fVar + ")";
        }

        public b(f fVar) {
            this.c = fVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f {
        private final i a;
        private final a b;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final a d() {
            return this.b;
        }

        public final i e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.e, (Object) fVar.e) && C8632dsu.c(this.b, fVar.b) && C8632dsu.c(this.a, fVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            a aVar = this.b;
            int hashCode2 = aVar == null ? 0 : aVar.hashCode();
            i iVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (iVar != null ? iVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            a aVar = this.b;
            i iVar = this.a;
            return "UpiHandleAvailability(__typename=" + str + ", onUPIHandleAvailable=" + aVar + ", onUPIHandleUnavailableError=" + iVar + ")";
        }

        public f(String str, a aVar, i iVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = aVar;
            this.a = iVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final e b;

        public final e e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.b, ((a) obj).b);
        }

        public int hashCode() {
            e eVar = this.b;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            e eVar = this.b;
            return "OnUPIHandleAvailable(localizedDescription=" + eVar + ")";
        }

        public a(e eVar) {
            this.b = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final C2381afF e;

        public final C2381afF c() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2381afF c2381afF = this.e;
            return "LocalizedDescription(__typename=" + str + ", localizedStringFields=" + c2381afF + ")";
        }

        public e(String str, C2381afF c2381afF) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2381afF, "");
            this.a = str;
            this.e = c2381afF;
        }
    }

    /* loaded from: classes3.dex */
    public static final class i {
        private final c a;

        public final c b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C8632dsu.c(this.a, ((i) obj).a);
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            c cVar = this.a;
            return "OnUPIHandleUnavailableError(alert=" + cVar + ")";
        }

        public i(c cVar) {
            this.a = cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final C2313adr c;

        public final String a() {
            return this.a;
        }

        public final C2313adr d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2313adr c2313adr = this.c;
            return "Alert(__typename=" + str + ", alertFields=" + c2313adr + ")";
        }

        public c(String str, C2313adr c2313adr) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2313adr, "");
            this.a = str;
            this.c = c2313adr;
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
