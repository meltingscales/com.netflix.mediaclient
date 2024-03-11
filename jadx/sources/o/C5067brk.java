package o;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o.brk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5067brk extends AbstractC1900aSk<Boolean> {
    private final String a;
    private String d;
    private final String f;
    private final String g;
    private final InterfaceC4986bqI i;

    @Override // o.AbstractC1902aSm
    public String e() {
        return "call";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5067brk(Context context, NetflixDataRequest.Transport transport, String str, UserAgent.PinType pinType, String str2, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "VerifyPinRequest");
        this.i = interfaceC4986bqI;
        this.a = str;
        this.f = str2;
        String str3 = UserAgent.PinType.MATURITY_PIN == pinType ? "verifyPin" : "verifyPreviewPin";
        this.d = str3;
        String format = String.format("[\"user\", \"%s\"]", str3);
        this.g = format;
        C1044Mm.d("nf_pin", "Query = %s, args = [%s, %s]", format, str, str2);
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        return Collections.singletonList(this.g);
    }

    @Override // o.AbstractC1902aSm
    public Map<String, String> b() {
        Map<String, String> b = super.b();
        b.put("param", String.format("\"%s\"", this.a));
        String str = this.f;
        if (str != null) {
            b.put("param", String.format("\"%s\"", str));
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: b */
    public Boolean e(String str, String str2) {
        C1044Mm.d("nf_pin", "String response to parse = %s", str);
        JsonObject e = C0946Ir.e("nf_pin", str);
        if (C8118deO.e(e)) {
            throw new FalkorException("verifyPinResponse empty!!!");
        }
        try {
            return Boolean.valueOf(e.getAsJsonObject("user").getAsJsonObject(this.d).get("isPinValid").getAsBoolean());
        } catch (Exception e2) {
            C1044Mm.b("nf_pin", "String response to parse = " + str);
            throw new FalkorException("response missing user json objects", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: a */
    public void b(Boolean bool) {
        InterfaceC4986bqI interfaceC4986bqI = this.i;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b(bool.booleanValue(), InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        InterfaceC4986bqI interfaceC4986bqI = this.i;
        if (interfaceC4986bqI != null) {
            interfaceC4986bqI.b(false, status);
        }
    }
}
