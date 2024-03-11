package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2240acX;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class ZA implements InterfaceC8999hM<e> {
    public static final c a = new c(null);
    private final C3223aus b;
    private final boolean d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "fcaa9e05-b485-4fa6-829f-38a8c8b74156";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZA) && C8632dsu.c(this.b, ((ZA) obj).b);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "ShouldRecordRdid";
    }

    public final C3223aus g() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        C3223aus c3223aus = this.b;
        return "ShouldRecordRdidQuery(input=" + c3223aus + ")";
    }

    public ZA(C3223aus c3223aus) {
        C8632dsu.c((Object) c3223aus, "");
        this.b = c3223aus;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2239acW.d.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2240acX.a.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2892aoe.d.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final Boolean b;

        public final Boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.b, ((e) obj).b);
        }

        public int hashCode() {
            Boolean bool = this.b;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            Boolean bool = this.b;
            return "Data(shouldRecordRdid=" + bool + ")";
        }

        public e(Boolean bool) {
            this.b = bool;
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
