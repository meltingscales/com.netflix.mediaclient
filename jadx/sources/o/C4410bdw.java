package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.bdw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4410bdw extends C4402bdo {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4402bdo
    public void c(JSONObject jSONObject, Status status) {
    }

    public C4410bdw(Context context, String str, ManifestRequestFlavor manifestRequestFlavor, InterfaceC4389bdb interfaceC4389bdb) {
        super(context, str, manifestRequestFlavor, interfaceC4389bdb);
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> map;
        try {
            map = super.j();
        } catch (Throwable th) {
            C1044Mm.b("nf_manifest", th, "Failed to get MSL headers", new Object[0]);
            map = null;
        }
        C1044Mm.a("nf_manifest", "headers: %s", map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4402bdo, o.aZE
    /* renamed from: d */
    public void a(JSONObject jSONObject) {
        c(jSONObject, InterfaceC1078Nw.aJ);
    }
}
