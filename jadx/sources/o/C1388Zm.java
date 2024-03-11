package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2262act;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Zm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1388Zm implements InterfaceC8999hM<e> {
    public static final b a = new b(null);
    private final boolean d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "e601e19f-9881-4ad7-aca9-a64c28a6b0ea";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PublicIdentityFullHandleQuery";
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == C1388Zm.class;
    }

    public int hashCode() {
        return dsA.a(C1388Zm.class).hashCode();
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2262act.c.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2821anM.d.b()).d();
    }

    /* renamed from: o.Zm$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final d c;

        public final d a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            d dVar = this.c;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.c;
            return "Data(currentProfile=" + dVar + ")";
        }

        public e(d dVar) {
            this.c = dVar;
        }
    }

    /* renamed from: o.Zm$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final c d;
        private final String e;

        public final c c() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            c cVar = this.d;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            c cVar = this.d;
            return "CurrentProfile(__typename=" + str + ", publicIdentity=" + cVar + ")";
        }

        public d(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = cVar;
        }
    }

    /* renamed from: o.Zm$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String d;
        private final a e;

        public final a b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            a aVar = this.e;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            a aVar = this.e;
            return "PublicIdentity(__typename=" + str + ", handle=" + aVar + ")";
        }

        public c(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = aVar;
        }
    }

    /* renamed from: o.Zm$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String d;

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.d, (Object) aVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            return "Handle(__typename=" + str + ", fullHandle=" + str2 + ")";
        }

        public a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = str2;
        }
    }

    /* renamed from: o.Zm$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
