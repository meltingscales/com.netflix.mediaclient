package o;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.bqM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C4990bqM extends AbstractC1900aSk<C1569aGd> {
    private InterfaceC4986bqI a;
    private String d;
    private String f;

    @Override // o.AbstractC1902aSm
    public String e() {
        return "get";
    }

    @Override // o.AbstractC1902aSm
    public boolean f() {
        return false;
    }

    @Override // o.AbstractC1902aSm
    public boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4990bqM(Context context, NetflixDataRequest.Transport transport, String str, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "AutoLoginRequest");
        this.a = interfaceC4986bqI;
        if (str == null) {
            this.f = "";
        } else {
            this.f = str;
        }
        String str2 = "[\"autoLogin\",\"" + this.f + "\"]";
        this.d = str2;
        C1044Mm.d("nf_service_user_autologinrequest", "Query = %s", str2);
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        return Arrays.asList(this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: d */
    public C1569aGd e(String str, String str2) {
        try {
            JsonObject e = C0946Ir.e("nf_service_user_autologinrequest", str);
            JsonObject asJsonObject = e.getAsJsonObject("autoLogin").getAsJsonObject(this.f);
            if (asJsonObject != null && asJsonObject.has("usingCookies") && asJsonObject.getAsJsonPrimitive("usingCookies").getAsBoolean()) {
                if (asJsonObject.getAsJsonPrimitive("success").getAsBoolean()) {
                    AuthCookieHolder c = C8284dhV.c("fake_id", str2);
                    return new C1569aGd(c.netflixId, c.secureNetflixId);
                }
                return null;
            }
            JsonObject asJsonObject2 = e.getAsJsonObject("credentials");
            String asString = asJsonObject2.getAsJsonPrimitive("netflixId").getAsString();
            String asString2 = asJsonObject2.getAsJsonPrimitive("secureNetflixId").getAsString();
            if (C8168dfL.g(asString) || C8168dfL.g(asString2)) {
                throw new FalkorException("Empty tokens!");
            }
            return new C1569aGd(asString, asString2);
        } catch (Throwable th) {
            C1044Mm.b("nf_service_user_autologinrequest", th, "Failed", new Object[0]);
            throw new FalkorException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: e */
    public void b(C1569aGd c1569aGd) {
        InterfaceC4986bqI interfaceC4986bqI = this.a;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.d(c1569aGd, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.a;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.d((C1569aGd) null, status);
        }
    }
}
