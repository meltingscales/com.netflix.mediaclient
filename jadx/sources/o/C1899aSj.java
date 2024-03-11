package o;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aSj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1899aSj extends AbstractC1891aSb<SignInData> {
    private final C5007bqd a;
    private final aOV d;
    private final Context v;
    private final String x = String.format("[\"%s\"]", "signInVerify");
    private final InterfaceC1813aPe y;

    @Override // o.aRX
    protected String S() {
        return "VerifyLoginMslRequest";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1899aSj(Context context, aOV aov, C5007bqd c5007bqd, InterfaceC1813aPe interfaceC1813aPe) {
        this.v = context;
        this.y = interfaceC1813aPe;
        this.a = c5007bqd;
        this.d = aov;
    }

    @Override // o.aRX, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        UserCookies e = C8284dhV.e(C1815aPg.d(this.v).a());
        SignInConfigData W = this.d.W();
        Map<String, String> o2 = super.o();
        if (W != null) {
            o2.put("flwssn", W.flwssn);
        }
        if (e != null && e.isValid()) {
            o2.put("netflixId", e.netflixId);
            o2.put("secureNetflixId", e.secureNetflixId);
        }
        if (C8168dfL.h(this.d.n())) {
            o2.put("channelId", this.d.n());
        }
        o2.put("installType", this.d.B());
        o2.put("installType", this.d.B());
        o2.put("userLoginId", this.a.e());
        o2.put(SignupConstants.Field.COUNTRY_CODE, this.a.a());
        o2.put("countryIsoCode", this.a.d());
        o2.put("recaptchaError", this.a.c());
        o2.put("recaptchaResponseToken", this.a.g());
        o2.put("recaptchaResponseTime", String.valueOf(this.a.i()));
        o2.put("isConsumptionOnly", String.valueOf(this.d.ai()));
        if (this.a.h()) {
            o2.put("isSmartLockLogin", String.valueOf(this.a.h()));
        }
        C1044Mm.a("nf_login", "signInParams=%s", o2.toString());
        o2.put(SignupConstants.Field.PASSWORD, this.a.b());
        return o2;
    }

    @Override // o.AbstractC1891aSb, o.aRX, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        j.put("X-Netflix.msl-header-friendly-client", "true");
        return j;
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return Arrays.asList(this.x);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: a */
    public SignInData d(C8380djl c8380djl) {
        ((AbstractC1891aSb) this).e = C8064ddN.d(c8380djl, c8380djl.b());
        String e = C8284dhV.e(C8284dhV.c(c8380djl.b()));
        C1044Mm.a("nf_login", "nfvdid: %s", e);
        if (C8168dfL.h(e)) {
            C8284dhV.f(e);
        }
        return a(c8380djl.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: h */
    public SignInData a(String str) {
        SignInData.Fields fields;
        C1044Mm.a("nf_login", "String response to parse = %s", str);
        JsonObject e = C0946Ir.e("nf_login", str);
        if (C8118deO.e(e)) {
            throw new FalkorException("verifyLogin empty!!!");
        }
        i(str);
        try {
            InterfaceC2092aZo b = C2090aZm.d.b(C0946Ir.c(e, "signInVerify"));
            if (b != null) {
                b.d();
            }
            SignInData signInData = (SignInData) C8118deO.e(e, "signInVerify", (Class<Object>) SignInData.class);
            if (signInData != null && (fields = signInData.fields) != null) {
                C1823aPo.d(this.v, fields.abAllocations);
            }
            return signInData;
        } catch (Exception e2) {
            C1044Mm.b("nf_login", e2, "Failed to parse %s", str);
            throw new FalkorException("response missing json objects", e2);
        }
    }

    private void i(String str) {
        if (str.indexOf("\"passport\"") > 0) {
            C1044Mm.j("nf_login", "ZUUL passport leaked %s", str);
            InterfaceC1598aHf.a(new C1596aHd("ZUUL passport leaked").b(ErrorType.p).b(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    public void a(SignInData signInData) {
        if (signInData != null) {
            signInData.authCookieHolder = ((AbstractC1891aSb) this).e;
        }
        AuthCookieHolder authCookieHolder = ((AbstractC1891aSb) this).e;
        if (authCookieHolder != null) {
            this.d.e(new UserCookies(authCookieHolder.netflixId, authCookieHolder.secureNetflixId));
        }
        C1044Mm.a("nf_login", "login verify: singInData: %s", signInData);
        if (((AbstractC1891aSb) this).e == null && signInData.isSignInSuccessful()) {
            C1044Mm.d("nf_login", "SignIn was successfully but we did not received cookies in MSL header or HTTP response");
            InterfaceC1598aHf.a(new C1596aHd("Credentials NOT found in HTTP or MSL headers when signin was success!").b(ErrorType.f13164o).b(false));
        }
        if (this.y != null) {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aI;
            if (signInData != null && signInData.isSignInSuccessful()) {
                netflixImmutableStatus = InterfaceC1078Nw.aJ;
            }
            this.y.c(signInData, netflixImmutableStatus);
        }
    }

    @Override // o.aZE
    public void e(Status status) {
        InterfaceC1813aPe interfaceC1813aPe = this.y;
        if (interfaceC1813aPe != null) {
            interfaceC1813aPe.c(null, status);
        }
    }
}
