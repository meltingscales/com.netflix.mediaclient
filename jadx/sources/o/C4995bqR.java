package o;

import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bqR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4995bqR extends AbstractC2099aZv<AuthCookieHolder> {
    private AuthCookieHolder a;
    private InterfaceC4986bqI d;
    private String e;

    @Override // o.AbstractC2099aZv
    public String T() {
        return "FetchCookiesMSLRequest";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4995bqR(String str, InterfaceC4986bqI interfaceC4986bqI) {
        this.d = interfaceC4986bqI;
        this.e = str;
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return Collections.singletonList("[\"bind\", \"" + this.e + "\"]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: c */
    public AuthCookieHolder d(C8380djl c8380djl) {
        AuthCookieHolder b = C8064ddN.b(Z().d(), C8284dhV.a(c8380djl.b()));
        this.a = b;
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
        return this.a;
    }

    @Override // o.aZE
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.d;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b((AuthCookieHolder) null, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: b */
    public void a(AuthCookieHolder authCookieHolder) {
        InterfaceC4986bqI interfaceC4986bqI = this.d;
        if (interfaceC4986bqI != null) {
            authCookieHolder.userId = this.e;
            interfaceC4986bqI.b(authCookieHolder, InterfaceC1078Nw.aJ);
        }
    }
}
