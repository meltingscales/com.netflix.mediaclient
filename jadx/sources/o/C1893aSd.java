package o;

import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o.aSd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1893aSd extends aRX<AuthCookieHolder> {
    private InterfaceC4986bqI a;
    private String d;
    private AuthCookieHolder e;

    @Override // o.AbstractC2100aZw
    public String M() {
        return "call";
    }

    @Override // o.aRX
    protected String S() {
        return "FetchCookiesConfigMSLRequest_Ab57679";
    }

    @Override // o.aRX, com.netflix.android.volley.Request
    public /* bridge */ /* synthetic */ boolean C() {
        return super.C();
    }

    @Override // o.aRX, o.aZE
    public /* bridge */ /* synthetic */ String O() {
        return super.O();
    }

    @Override // o.aRX, o.aZE, com.netflix.android.volley.Request
    public /* bridge */ /* synthetic */ Map j() {
        return super.j();
    }

    @Override // o.aRX, com.netflix.android.volley.Request
    public /* bridge */ /* synthetic */ Request.Priority s() {
        return super.s();
    }

    @Override // o.aRX, com.netflix.android.volley.Request
    public /* bridge */ /* synthetic */ Object y() {
        return super.y();
    }

    public C1893aSd(String str, InterfaceC4986bqI interfaceC4986bqI) {
        this.a = interfaceC4986bqI;
        this.d = str;
    }

    @Override // o.aRX, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        Map<String, String> o2 = super.o();
        o2.put("param", "\"" + this.d + "\"");
        return o2;
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return Collections.singletonList("[\"bind\"]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: c */
    public AuthCookieHolder d(C8380djl c8380djl) {
        AuthCookieHolder b = C8064ddN.b(Z().d(), C8284dhV.a(c8380djl.b()));
        this.e = b;
        if (b == null) {
            C1044Mm.d("FetchCookiesMSLRequest", "Cookies are missing in bind call, profile switch fail");
            InterfaceC1598aHf.a(new C1596aHd("Cookies are missing in bind call, profile switch fail").b(false));
            throw new VolleyError("Cookies are missing in bind call, profile switch fail");
        }
        return (AuthCookieHolder) super.d(c8380djl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: f */
    public AuthCookieHolder a(String str) {
        C1044Mm.d("FetchCookiesMSLRequest", "String response to parse = %s", str);
        return this.e;
    }

    @Override // o.aZE
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.a;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b((AuthCookieHolder) null, status);
        }
    }

    @Override // o.aZE
    public void a(AuthCookieHolder authCookieHolder) {
        InterfaceC4986bqI interfaceC4986bqI = this.a;
        if (interfaceC4986bqI != null) {
            authCookieHolder.userId = this.d;
            interfaceC4986bqI.b(authCookieHolder, InterfaceC1078Nw.aJ);
        }
    }
}
