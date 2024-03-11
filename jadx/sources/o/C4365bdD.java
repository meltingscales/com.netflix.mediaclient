package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.ClientActionFromLase;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bdD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4365bdD extends C4403bdp {
    public C4365bdD(Context context, String str, String str2, InterfaceC4389bdb interfaceC4389bdb) {
        super(context, str, str2, interfaceC4389bdb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4403bdp, o.aZE
    /* renamed from: e */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        C1044Mm.a("nf_bladerunner", "parsing license sync response");
        Status status = InterfaceC1078Nw.aJ;
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            status = C1959aUp.a(this.C, jSONObject, BasePlayErrorStatus.PlayRequestType.SyncLicense);
            jSONObject2 = jSONObject.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT);
        } else {
            jSONObject2 = null;
        }
        JSONObject optJSONObject = jSONObject2 != null ? jSONObject2.optJSONObject("actions") : null;
        if (optJSONObject != null) {
            try {
                Iterator keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    String string = optJSONObject.getString(str);
                    C1044Mm.c("nf_bladerunner", "OfflineLicenseSyncRequest response movieId=%s action=%s", str, string);
                    hashMap.put(str, ClientActionFromLase.a(C8198dfp.d(string, Integer.valueOf(ClientActionFromLase.NO_ACTION.c())).intValue()));
                }
            } catch (JSONException e) {
                C1044Mm.e("nf_bladerunner", "JSONException", e);
            }
        }
        C1044Mm.a("nf_bladerunner", "onSuccess %s status: %s responseActions %s", ((C4403bdp) this).e, status, hashMap);
        InterfaceC4389bdb interfaceC4389bdb = ((C4403bdp) this).d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.c(hashMap, status);
        } else {
            C1044Mm.e("nf_bladerunner", "no callback for OfflineLicenseSyncRequest");
        }
    }

    @Override // o.C4403bdp, o.aZE
    public void e(Status status) {
        InterfaceC4389bdb interfaceC4389bdb = ((C4403bdp) this).d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.c(Collections.emptyMap(), status);
        } else {
            C1044Mm.e("nf_bladerunner", "no callback for OfflineLicenseSyncRequest");
        }
    }
}
