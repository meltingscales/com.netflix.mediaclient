package o;

import com.netflix.msl.MslEntityAuthException;

/* renamed from: o.aZg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2084aZg implements InterfaceC8423dla {
    @Override // o.InterfaceC8423dla
    public boolean c(String str) {
        return false;
    }

    @Override // o.InterfaceC8423dla
    public boolean b(String str, djI dji) {
        C1044Mm.a("nf_msl_auth_server", "isSchemePermitted: identity %s, entityAuthenticationScheme: %s", str, dji);
        if ("APPBOOT".equals(str) || "Netflix".equals(str)) {
            return dji == djI.j || dji == djI.b;
        }
        return false;
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
