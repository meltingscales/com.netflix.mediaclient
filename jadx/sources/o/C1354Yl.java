package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2152aap;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Yl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1354Yl implements InterfaceC8990hD<d> {
    public static final b d = new b(null);
    private final boolean e;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "32f5aa86-1e29-4bb9-b965-fd3634adf189";
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
        return "CreateSSOToken";
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == C1354Yl.class;
    }

    public int hashCode() {
        return dsA.a(C1354Yl.class).hashCode();
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2152aap.d.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2767amL.a.b()).d();
    }

    /* renamed from: o.Yl$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8990hD.b {
        private final String c;

        public final String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c((Object) this.c, (Object) ((d) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            String str = this.c;
            return "Data(createSSOToken=" + str + ")";
        }

        public d(String str) {
            C8632dsu.c((Object) str, "");
            this.c = str;
        }
    }

    /* renamed from: o.Yl$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
