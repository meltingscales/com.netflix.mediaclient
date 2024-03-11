package o;

import com.netflix.mediaclient.graphql.models.type.TokenScope;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2148aal;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Ye  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1347Ye implements InterfaceC8990hD<d> {
    public static final c c = new c(null);
    private final boolean b;
    private final TokenScope d;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "91d5c361-8380-4a06-8cd4-2caf241e608c";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1347Ye) && this.d == ((C1347Ye) obj).d;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "CreateAutoLoginToken";
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public final TokenScope i() {
        return this.d;
    }

    public String toString() {
        TokenScope tokenScope = this.d;
        return "CreateAutoLoginTokenMutation(scope=" + tokenScope + ")";
    }

    public C1347Ye(TokenScope tokenScope) {
        C8632dsu.c((Object) tokenScope, "");
        this.d = tokenScope;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2147aak.d.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2148aal.c.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2769amN.a.c()).d();
    }

    /* renamed from: o.Ye$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8990hD.b {
        private final String a;

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c((Object) this.a, (Object) ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "Data(createAutoLoginToken=" + str + ")";
        }

        public d(String str) {
            C8632dsu.c((Object) str, "");
            this.a = str;
        }
    }

    /* renamed from: o.Ye$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
