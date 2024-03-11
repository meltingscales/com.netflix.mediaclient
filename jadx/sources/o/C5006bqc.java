package o;

import android.content.Context;
import com.netflix.mediaclient.service.user.UserAgentImpl;
import com.netflix.mediaclient.util.net.AuthCookieHolder;

/* renamed from: o.bqc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5006bqc implements InterfaceC5093bsJ, InterfaceC5034brD {
    private String a;
    private AbstractC8424dlb b;
    private String c;
    private final UserAgentImpl d;
    private String e;

    @Override // o.InterfaceC5034brD
    public String b() {
        return this.a;
    }

    @Override // o.InterfaceC5093bsJ
    public String d() {
        return this.a;
    }

    public C5006bqc(UserAgentImpl userAgentImpl) {
        this.d = userAgentImpl;
    }

    @Override // o.InterfaceC5093bsJ
    public AbstractC8424dlb c() {
        if (this.d.getConfigurationAgent() == null) {
            return this.b;
        }
        String d = d();
        if (C8168dfL.g(d)) {
            C1044Mm.j("nf_service_useragent", "getMSLUserCredentialRegistry:: User profile is not known, regular workflow");
            return this.b;
        } else if (this.d.getMSLClient().c(d)) {
            C1044Mm.e("nf_service_useragent", "getMSLUserCredentialRegistry:: User profile is known to MSL, regular workflow.");
            return this.b;
        } else {
            return m();
        }
    }

    private AbstractC8424dlb m() {
        boolean z;
        C1044Mm.e("nf_service_useragent", "getMSLUserCredentialRegistry:: User profile is NOT known to MSL, get cookies for UserAuthenticationData.");
        String i = i();
        String j = j();
        if (C8168dfL.g(i)) {
            C1044Mm.e("nf_service_useragent", "getMSLUserCredentialRegistry:: Netflix ID is NOT known for profile %s even if it should be!", this.a);
            z = true;
        } else {
            z = false;
        }
        if (C8168dfL.g(j)) {
            C1044Mm.e("nf_service_useragent", "getMSLUserCredentialRegistry:: Secure Netflix ID is NOT known for profile %s even if it should be!", this.a);
        } else if (!z) {
            C1044Mm.a("nf_service_useragent", "getMSLUserCredentialRegistry:: Authorization cookies known for profile %s", this.a);
            return new dkX(i, j);
        }
        return this.b;
    }

    public void c(String str) {
        synchronized (this) {
            String str2 = this.a;
            boolean z = str2 == null || !str2.equals(str);
            this.a = str;
            if (z) {
                a((AbstractC8424dlb) null);
                a(str);
            }
        }
    }

    void a(AbstractC8424dlb abstractC8424dlb) {
        synchronized (this) {
            this.b = abstractC8424dlb;
        }
    }

    private void a(String str) {
        if (str == null) {
            C1044Mm.j("nf_service_useragent", "");
            C8157dfA.e(this.d.getContext(), "useragent_current_profile_id");
        } else if ("TEMP_PROFILE_ID".equals(str)) {
        } else {
            C8157dfA.a(this.d.getContext(), "useragent_current_profile_id", str);
        }
    }

    @Override // o.InterfaceC5034brD
    public String f() {
        return C8284dhV.c(k());
    }

    @Override // o.InterfaceC5034brD
    public String g() {
        return C8284dhV.b(k());
    }

    @Override // o.InterfaceC5034brD
    public String i() {
        return this.d.v() ? this.e : C8284dhV.e(k()).netflixId;
    }

    @Override // o.InterfaceC5034brD
    public String j() {
        return this.d.v() ? this.c : C8284dhV.e(k()).secureNetflixId;
    }

    public void b(AuthCookieHolder authCookieHolder) {
        C1044Mm.a("nf_service_useragent", "Update user credentials: %s : %s, %s : %s to instance %d", f(), authCookieHolder.netflixId, g(), authCookieHolder.secureNetflixId, Integer.valueOf(hashCode()));
        this.e = authCookieHolder.netflixId;
        this.c = authCookieHolder.secureNetflixId;
    }

    @Override // o.InterfaceC5034brD
    public boolean c(AuthCookieHolder authCookieHolder) {
        synchronized (this) {
            if (authCookieHolder == null) {
                C1044Mm.d("nf_service_useragent", "We did not received authorization credentials!");
                return false;
            } else if (C8168dfL.g(authCookieHolder.userId)) {
                C1044Mm.d("nf_service_useragent", "We did not received back userId!");
                return false;
            } else {
                String str = this.a;
                if (!authCookieHolder.userId.equals(str)) {
                    C1044Mm.j("nf_service_useragent", "User in update %s differs than current user %s, profile is changed, DO NOT update cookies!", authCookieHolder.userId, str);
                    return false;
                }
                C1044Mm.e("nf_service_useragent", "Same user, update cookies!");
                b(authCookieHolder);
                this.d.getMslAgentCookiesProvider().a(this.a, authCookieHolder);
                return true;
            }
        }
    }

    public void a() {
        synchronized (this) {
            this.e = null;
            this.c = null;
        }
    }

    public void e() {
        synchronized (this) {
            a();
            c((String) null);
        }
    }

    public String toString() {
        return "MSLUserCredentialRegistryImpl{userId='" + this.a + "', netflixId='" + this.e + "', secureNetflixId='" + this.c + "', hash='" + hashCode() + "'}";
    }

    private boolean k() {
        return C1815aPg.d(h()).a();
    }

    private Context h() {
        return AbstractApplicationC1040Mh.a();
    }
}
