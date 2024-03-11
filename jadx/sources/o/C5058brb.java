package o;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: o.brb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5058brb extends AbstractC1900aSk<Boolean> {
    private final InterfaceC4986bqI d;

    @Override // o.AbstractC1902aSm
    public boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5058brb(Context context, NetflixDataRequest.Transport transport, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "RestartMembershipRequest");
        this.d = interfaceC4986bqI;
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        return Collections.singletonList("[\"user\", \"restartMembership\"]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: a */
    public Boolean e(String str, String str2) {
        C1044Mm.a("RestartMembershipRequest", "parseFalkorResponse for restartMembership request : %s", str);
        if (str == null) {
            return Boolean.FALSE;
        }
        JsonObject e = C0946Ir.e("RestartMembershipRequest", str);
        if (C8118deO.e(e)) {
            return Boolean.FALSE;
        }
        try {
            JsonObject asJsonObject = e.getAsJsonObject("user");
            if (asJsonObject.has("restartMembership")) {
                JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("restartMembership");
                if (asJsonObject2.has("status")) {
                    return Boolean.valueOf(asJsonObject2.get("status").getAsString().equals("SUCCESS"));
                }
            }
            return Boolean.FALSE;
        } catch (Exception e2) {
            C1044Mm.d("RestartMembershipRequest", "String response to parse = %s", str);
            throw new FalkorException("Status Response missing required fields", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    public void b(Boolean bool) {
        this.d.a(bool.booleanValue() ? InterfaceC1078Nw.aJ : InterfaceC1078Nw.a);
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        this.d.a(status);
    }
}
