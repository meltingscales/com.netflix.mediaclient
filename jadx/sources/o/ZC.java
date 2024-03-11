package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2296ada;
import o.C9018hf;
import o.InterfaceC8990hD;

/* loaded from: classes3.dex */
public final class ZC implements InterfaceC8990hD<d> {
    public static final c d = new c(null);
    private final boolean b;
    private final String e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "dfeac91b-d11e-4884-82f9-0b046426e5f3";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZC) && C8632dsu.c((Object) this.e, (Object) ((ZC) obj).e);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "upiSetHandle";
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public final String j() {
        return this.e;
    }

    public String toString() {
        String str = this.e;
        return "UpiSetHandleMutation(handle=" + str + ")";
    }

    public ZC(String str) {
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
        C2241acY.d.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2296ada.e.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2897aoj.b.d()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8990hD.b {
        private final o d;

        public final o b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.d, ((d) obj).d);
        }

        public int hashCode() {
            o oVar = this.d;
            if (oVar == null) {
                return 0;
            }
            return oVar.hashCode();
        }

        public String toString() {
            o oVar = this.d;
            return "Data(upiSetHandle=" + oVar + ")";
        }

        public d(o oVar) {
            this.d = oVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o {
        private final i a;
        private final h b;
        private final j c;
        private final g d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final i b() {
            return this.a;
        }

        public final j c() {
            return this.c;
        }

        public final g d() {
            return this.d;
        }

        public final h e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return C8632dsu.c((Object) this.e, (Object) oVar.e) && C8632dsu.c(this.d, oVar.d) && C8632dsu.c(this.b, oVar.b) && C8632dsu.c(this.a, oVar.a) && C8632dsu.c(this.c, oVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            g gVar = this.d;
            int hashCode2 = gVar == null ? 0 : gVar.hashCode();
            h hVar = this.b;
            int hashCode3 = hVar == null ? 0 : hVar.hashCode();
            i iVar = this.a;
            int hashCode4 = iVar == null ? 0 : iVar.hashCode();
            j jVar = this.c;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            g gVar = this.d;
            h hVar = this.b;
            i iVar = this.a;
            j jVar = this.c;
            return "UpiSetHandle(__typename=" + str + ", onUPISetHandleSuccess=" + gVar + ", onUPIHandleValidationError=" + hVar + ", onUPIHandleModerationError=" + iVar + ", onUPIHandleUnavailableError=" + jVar + ")";
        }

        public o(String str, g gVar, h hVar, i iVar, j jVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = gVar;
            this.b = hVar;
            this.a = iVar;
            this.c = jVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g {
        private final f b;

        public final f c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && C8632dsu.c(this.b, ((g) obj).b);
        }

        public int hashCode() {
            f fVar = this.b;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public String toString() {
            f fVar = this.b;
            return "OnUPISetHandleSuccess(handle=" + fVar + ")";
        }

        public g(f fVar) {
            this.b = fVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f {
        private final String b;
        private final String e;

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.e, (Object) fVar.e) && C8632dsu.c((Object) this.b, (Object) fVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            return "Handle(__typename=" + str + ", fullHandle=" + str2 + ")";
        }

        public f(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h {
        private final String c;
        private final b d;

        public final String a() {
            return this.c;
        }

        public final b d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.c, (Object) hVar.c) && C8632dsu.c(this.d, hVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            b bVar = this.d;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            b bVar = this.d;
            return "OnUPIHandleValidationError(__typename=" + str + ", alert=" + bVar + ")";
        }

        public h(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final C2313adr b;

        public final C2313adr a() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2313adr c2313adr = this.b;
            return "Alert(__typename=" + str + ", alertFields=" + c2313adr + ")";
        }

        public b(String str, C2313adr c2313adr) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2313adr, "");
            this.a = str;
            this.b = c2313adr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class i {
        private final a a;
        private final String c;

        public final a b() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.c, (Object) iVar.c) && C8632dsu.c(this.a, iVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            a aVar = this.a;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            a aVar = this.a;
            return "OnUPIHandleModerationError(__typename=" + str + ", alert=" + aVar + ")";
        }

        public i(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final C2313adr d;

        public final String a() {
            return this.a;
        }

        public final C2313adr d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2313adr c2313adr = this.d;
            return "Alert1(__typename=" + str + ", alertFields=" + c2313adr + ")";
        }

        public a(String str, C2313adr c2313adr) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2313adr, "");
            this.a = str;
            this.d = c2313adr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class j {
        private final String b;
        private final e e;

        public final String a() {
            return this.b;
        }

        public final e e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.b, (Object) jVar.b) && C8632dsu.c(this.e, jVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            e eVar = this.e;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            e eVar = this.e;
            return "OnUPIHandleUnavailableError(__typename=" + str + ", alert=" + eVar + ")";
        }

        public j(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final C2313adr b;
        private final String e;

        public final C2313adr b() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2313adr c2313adr = this.b;
            return "Alert2(__typename=" + str + ", alertFields=" + c2313adr + ")";
        }

        public e(String str, C2313adr c2313adr) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2313adr, "");
            this.e = str;
            this.b = c2313adr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
