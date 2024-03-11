package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aKE extends aZH {
    public static final c e = new c(null);
    private final String a;
    private final aKH d;

    @Override // o.AbstractC2102aZy
    public String J() {
        return "verifyAttestation";
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
    public aKE(String str, aKH akh) {
        super(1);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) akh, "");
        this.a = str;
        this.d = akh;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PlayIntegrity_VerifyAttestation");
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
        M.putOpt("integrityToken", this.a);
        M.putOpt("type", "play-integrity");
        M.putOpt("androidApiLevel", String.valueOf(C8054ddD.c()));
        M.putOpt("version", C8055ddE.e(AbstractApplicationC1040Mh.d()).toString());
        M.putOpt("androidBuildVersionRelease", String.valueOf(C8055ddE.c(AbstractApplicationC1040Mh.d())));
        return M;
    }

    private final C1683aKj e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT);
        if (optJSONObject == null || !optJSONObject.has("attestations")) {
            return null;
        }
        return new C1683aKj(optJSONObject);
    }

    @Override // o.aZE
    public void e(Status status) {
        C8632dsu.c((Object) status, "");
        this.d.c(status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: b */
    public void a(JSONObject jSONObject) {
        dpR dpr;
        C8632dsu.c((Object) jSONObject, "");
        e.getLogTag();
        C1683aKj e2 = e(jSONObject);
        if (e2 != null) {
            this.d.b(e2);
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            this.d.c(InterfaceC1078Nw.aC);
        }
    }
}
