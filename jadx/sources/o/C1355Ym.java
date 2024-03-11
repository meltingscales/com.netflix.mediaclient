package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2151aao;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Ym  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1355Ym implements InterfaceC8999hM<b> {
    public static final c d = new c(null);
    private final boolean a;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "639ed092-ae96-4df7-883b-d99b33fc2a73";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "CurrentCountryQuery";
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == C1355Ym.class;
    }

    public int hashCode() {
        return dsA.a(C1355Ym.class).hashCode();
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2151aao.b.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2766amK.a.e()).d();
    }

    /* renamed from: o.Ym$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final e e;

        public final e d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.e, ((b) obj).e);
        }

        public int hashCode() {
            e eVar = this.e;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            e eVar = this.e;
            return "Data(currentCountry=" + eVar + ")";
        }

        public b(e eVar) {
            this.e = eVar;
        }
    }

    /* renamed from: o.Ym$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String c;
        private final String e;

        public final String a() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.e, (Object) eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            return "CurrentCountry(__typename=" + str + ", code=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.e = str2;
        }
    }

    /* renamed from: o.Ym$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
