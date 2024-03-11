package o;

import android.content.Context;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: o.bqO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C4992bqO extends AbstractC1900aSk<String> {
    private long a;
    private String d;
    private InterfaceC4986bqI g;

    @Override // o.AbstractC1902aSm
    public String e() {
        return "get";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4992bqO(Context context, NetflixDataRequest.Transport transport, long j, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "CreateAutoLoginTokenRequest");
        this.d = "[\"createAutoLoginToken2\"]";
        this.g = interfaceC4986bqI;
        this.a = j;
        C1044Mm.d("nf_service_user_autologinrequest", "Query = %s", "[\"createAutoLoginToken2\"]");
    }

    @Override // o.AbstractC1902aSm
    public Map<String, String> b() {
        Map<String, String> b = super.b();
        b.put("param", "\"" + this.a + "\"");
        return b;
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        return Arrays.asList(this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: b */
    public String e(String str, String str2) {
        C1044Mm.a("nf_service_user_autologinrequest", "String response to parse = %s", str);
        try {
            String asString = C0946Ir.e("nf_service_user_autologinrequest", str).getAsJsonPrimitive("createAutoLoginToken2").getAsString();
            if (C8168dfL.g(asString)) {
                throw new FalkorException("Empty token!");
            }
            return asString;
        } catch (Throwable th) {
            C1044Mm.b("nf_service_user_autologinrequest", th, "Failed", new Object[0]);
            throw new FalkorException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: a */
    public void b(String str) {
        InterfaceC4986bqI interfaceC4986bqI = this.g;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b(str, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.g;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b((String) null, status);
        }
    }
}
