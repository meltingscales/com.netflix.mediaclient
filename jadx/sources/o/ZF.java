package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2302adg;
import o.C9018hf;
import o.InterfaceC8990hD;

/* loaded from: classes3.dex */
public final class ZF implements InterfaceC8990hD<a> {
    public static final d a = new d(null);
    private final boolean b;
    private final C3305awV e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "bc7cf940-1a93-40bf-9707-2e2135c75407";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZF) && C8632dsu.c(this.e, ((ZF) obj).e);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "UxConfigCreate";
    }

    public final C3305awV h() {
        return this.e;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        C3305awV c3305awV = this.e;
        return "UxConfigCreateMutation(input=" + c3305awV + ")";
    }

    public ZF(C3305awV c3305awV) {
        C8632dsu.c((Object) c3305awV, "");
        this.e = c3305awV;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2303adh.d.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2302adg.e.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2895aoh.d.d()).d();
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8990hD.b {
        private final b b;

        public final b b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.b, ((a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            b bVar = this.b;
            return "Data(uxConfigCreate=" + bVar + ")";
        }

        public a(b bVar) {
            C8632dsu.c((Object) bVar, "");
            this.b = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.b, (Object) bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            return "UxConfigCreate(__typename=" + str + ", id=" + str2 + ")";
        }

        public b(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = str2;
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
