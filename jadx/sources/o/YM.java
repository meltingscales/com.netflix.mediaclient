package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2214aby;
import o.C9018hf;
import o.InterfaceC8990hD;

/* loaded from: classes3.dex */
public final class YM implements InterfaceC8990hD<b> {
    public static final d c = new d(null);
    private final String a;
    private final boolean b;
    private final String e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "6032dd48-b542-46ff-8a89-25ccff6adf69";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YM) {
            YM ym = (YM) obj;
            return C8632dsu.c((Object) this.a, (Object) ym.a) && C8632dsu.c((Object) this.e, (Object) ym.e);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "OAuth2Login";
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.e;
        return "OAuth2LoginMutation(authorizationCode=" + str + ", state=" + str2 + ")";
    }

    public YM(String str, String str2) {
        this.a = str;
        this.e = str2;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2164abA.c.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2214aby.a.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2855anu.d.c()).d();
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8990hD.b {
        private final e c;

        public final e d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.c, ((b) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            e eVar = this.c;
            return "Data(oAuth2Login=" + eVar + ")";
        }

        public b(e eVar) {
            C8632dsu.c((Object) eVar, "");
            this.c = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final a e;

        public final String c() {
            return this.b;
        }

        public final a e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            a aVar = this.e;
            return "OAuth2Login(__typename=" + str + ", account=" + aVar + ")";
        }

        public e(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aVar, "");
            this.b = str;
            this.e = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
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
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c((Object) this.d, (Object) aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            return "Account(__typename=" + str + ", ownerGuid=" + str2 + ")";
        }

        public a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
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
