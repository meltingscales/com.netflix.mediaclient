package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2110aaF;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1372Yw implements InterfaceC8999hM<e> {
    public static final c c = new c(null);
    private final boolean d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "1969e773-dc5a-4c65-b2a3-54b802164a70";
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
        return "FetchGameIdentity";
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == C1372Yw.class;
    }

    public int hashCode() {
        return dsA.a(C1372Yw.class).hashCode();
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2110aaF.b.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2777amV.e.c()).d();
    }

    /* renamed from: o.Yw$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final d d;

        public final d a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            d dVar = this.d;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.d;
            return "Data(currentProfile=" + dVar + ")";
        }

        public e(d dVar) {
            this.d = dVar;
        }
    }

    /* renamed from: o.Yw$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final C2589ait e;

        public final C2589ait b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2589ait c2589ait = this.e;
            return "CurrentProfile(__typename=" + str + ", profileIdentityFields=" + c2589ait + ")";
        }

        public d(String str, C2589ait c2589ait) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2589ait, "");
            this.b = str;
            this.e = c2589ait;
        }
    }

    /* renamed from: o.Yw$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
