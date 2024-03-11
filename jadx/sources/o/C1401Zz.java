package o;

import com.netflix.mediaclient.graphql.models.type.SSOTokenNotRenewedReason;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2229acM;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1401Zz implements InterfaceC8990hD<e> {
    public static final a d = new a(null);
    private final boolean a;
    private final String e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "27733693-5f9d-4b74-b72e-43b1e6cf06ee";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1401Zz) && C8632dsu.c((Object) this.e, (Object) ((C1401Zz) obj).e);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RenewSSOToken";
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public final String j() {
        return this.e;
    }

    public String toString() {
        String str = this.e;
        return "RenewSSOTokenMutation(ssoToken=" + str + ")";
    }

    public C1401Zz(String str) {
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
        C2231acO.c.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2229acM.d.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2831anW.d.d()).d();
    }

    /* renamed from: o.Zz$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8990hD.b {
        private final b c;

        public final b c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            b bVar = this.c;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.c;
            return "Data(renewSSOToken=" + bVar + ")";
        }

        public e(b bVar) {
            this.c = bVar;
        }
    }

    /* renamed from: o.Zz$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final c b;
        private final d e;

        public final String a() {
            return this.a;
        }

        public final c c() {
            return this.b;
        }

        public final d d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            c cVar = this.b;
            int hashCode2 = cVar == null ? 0 : cVar.hashCode();
            d dVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            c cVar = this.b;
            d dVar = this.e;
            return "RenewSSOToken(__typename=" + str + ", onSSOTokenRenewed=" + cVar + ", onSSOTokenNotRenewed=" + dVar + ")";
        }

        public b(String str, c cVar, d dVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = cVar;
            this.e = dVar;
        }
    }

    /* renamed from: o.Zz$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String c;

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c((Object) this.c, (Object) ((c) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            String str = this.c;
            return "OnSSOTokenRenewed(ssoToken=" + str + ")";
        }

        public c(String str) {
            C8632dsu.c((Object) str, "");
            this.c = str;
        }
    }

    /* renamed from: o.Zz$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final SSOTokenNotRenewedReason a;

        public final SSOTokenNotRenewedReason b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public int hashCode() {
            SSOTokenNotRenewedReason sSOTokenNotRenewedReason = this.a;
            if (sSOTokenNotRenewedReason == null) {
                return 0;
            }
            return sSOTokenNotRenewedReason.hashCode();
        }

        public String toString() {
            SSOTokenNotRenewedReason sSOTokenNotRenewedReason = this.a;
            return "OnSSOTokenNotRenewed(reason=" + sSOTokenNotRenewedReason + ")";
        }

        public d(SSOTokenNotRenewedReason sSOTokenNotRenewedReason) {
            this.a = sSOTokenNotRenewedReason;
        }
    }

    /* renamed from: o.Zz$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
