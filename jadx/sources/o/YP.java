package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2166abC;
import o.C9018hf;
import o.InterfaceC8990hD;

/* loaded from: classes3.dex */
public final class YP implements InterfaceC8990hD<c> {
    public static final b b = new b(null);
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "c10f6f0f-54b6-48ef-910e-5023f502b743";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "OAuth2PKCEInit";
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == YP.class;
    }

    public int hashCode() {
        return dsA.a(YP.class).hashCode();
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2166abC.c.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2857anw.b.e()).d();
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final a b;

        public final a e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.b, ((c) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            a aVar = this.b;
            return "Data(oAuth2PKCEInit=" + aVar + ")";
        }

        public c(a aVar) {
            C8632dsu.c((Object) aVar, "");
            this.b = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final String d;

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c((Object) this.b, (Object) aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.d;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            String str3 = this.b;
            return "OAuth2PKCEInit(__typename=" + str + ", state=" + str2 + ", codeChallenge=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            this.a = str;
            this.d = str2;
            this.b = str3;
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
