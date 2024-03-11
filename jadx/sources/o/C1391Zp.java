package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2261acs;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1391Zp implements InterfaceC8990hD<c> {
    public static final a b = new a(null);
    private final boolean a;
    private final String c;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "0776cb8b-7eb2-4139-a576-47f5b73cefa7";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1391Zp) && C8632dsu.c((Object) this.c, (Object) ((C1391Zp) obj).c);
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RecordRdid";
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public final String j() {
        return this.c;
    }

    public String toString() {
        String str = this.c;
        return "RecordRdidMutation(id=" + str + ")";
    }

    public C1391Zp(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2260acr.a.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2261acs.a.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2824anP.c.c()).d();
    }

    /* renamed from: o.Zp$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final Boolean a;

        public final Boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            Boolean bool = this.a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            Boolean bool = this.a;
            return "Data(recordRdid=" + bool + ")";
        }

        public c(Boolean bool) {
            this.a = bool;
        }
    }

    /* renamed from: o.Zp$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
