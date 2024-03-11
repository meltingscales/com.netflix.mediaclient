package o;

import com.netflix.msl.MslEntityAuthException;

/* loaded from: classes3.dex */
class aYP implements InterfaceC8423dla {
    private final InterfaceC1843aQh d;

    @Override // o.InterfaceC8423dla
    public boolean c(String str) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aYP(InterfaceC1843aQh interfaceC1843aQh) {
        if (interfaceC1843aQh == null || C8168dfL.g(interfaceC1843aQh.m())) {
            throw new IllegalArgumentException("ESN missing!");
        }
        this.d = interfaceC1843aQh;
    }

    @Override // o.InterfaceC8423dla
    public boolean b(String str, djI dji) {
        C1044Mm.a("nf_msl_auth_client", "isSchemePermitted: identity %s, entityAuthenticationScheme: %s", str, dji);
        if (dji == djI.d || dji == djL.r) {
            return this.d.m().equals(str);
        }
        return dji == djL.p || dji == djL.t;
    }

    @Override // o.InterfaceC8423dla
    public void e(String str, djI dji) {
        if (b(str, dji)) {
            return;
        }
        C8373dje c8373dje = C8373dje.M;
        throw new MslEntityAuthException(c8373dje, "Authentication Scheme for Device Type Not Supported " + str + ":" + dji.c());
    }
}
