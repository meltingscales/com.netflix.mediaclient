package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aKG extends aZH {
    public static final c d = new c(null);
    private final InterfaceC1698aKy a;

    @Override // o.AbstractC2102aZy
    public String J() {
        return "generateAttestationNonce";
    }

    @Override // o.AbstractC2102aZy
    public boolean R() {
        return true;
    }

    @Override // o.AbstractC2102aZy
    public boolean S() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aKG(InterfaceC1698aKy interfaceC1698aKy) {
        super(1);
        C8632dsu.c((Object) interfaceC1698aKy, "");
        this.a = interfaceC1698aKy;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PlayIntegrity_NonceMslRequest");
        }
    }

    @Override // o.aZH, com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.API;
    }

    @Override // o.AbstractC2102aZy
    public JSONObject M() {
        JSONObject M = super.M();
        C8632dsu.a(M, "");
        M.putOpt("type", "play-integrity");
        return M;
    }

    private final String a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT);
        if (optJSONObject == null || !optJSONObject.has("nonce")) {
            return null;
        }
        return optJSONObject.getString("nonce");
    }

    @Override // o.aZE
    public void e(Status status) {
        C8632dsu.c((Object) status, "");
        this.a.a(status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: e */
    public void a(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        d.getLogTag();
        this.a.c(a(jSONObject));
    }
}
