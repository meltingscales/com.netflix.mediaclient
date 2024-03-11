package o;

import com.netflix.mediaclient.util.net.AuthCookieHolder;

/* renamed from: o.brA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5031brA implements InterfaceC5034brD {
    private String a;
    private String c;
    private InterfaceC5034brD d;
    private String e;

    @Override // o.InterfaceC5034brD
    public String d() {
        return this.c;
    }

    @Override // o.InterfaceC5034brD
    public String i() {
        return this.a;
    }

    @Override // o.InterfaceC5034brD
    public String j() {
        return this.e;
    }

    public C5031brA(InterfaceC5034brD interfaceC5034brD) {
        this.d = interfaceC5034brD;
        if (interfaceC5034brD != null) {
            this.a = interfaceC5034brD.i();
            this.e = interfaceC5034brD.j();
            this.c = interfaceC5034brD.d();
        }
    }

    @Override // o.InterfaceC5034brD
    public String f() {
        return this.d.f();
    }

    @Override // o.InterfaceC5034brD
    public String g() {
        return this.d.g();
    }

    @Override // o.InterfaceC5034brD
    public boolean c(AuthCookieHolder authCookieHolder) {
        return this.d.c(authCookieHolder);
    }

    @Override // o.InterfaceC5034brD
    public String b() {
        return this.d.b();
    }
}
