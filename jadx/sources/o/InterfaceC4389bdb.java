package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.OfflineLicenseResponse;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.ClientActionFromLase;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.bdb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4389bdb {
    void a(OfflineLicenseResponse offlineLicenseResponse, Status status);

    void a(JSONObject jSONObject, Status status);

    void b(Status status, String str);

    void b(JSONObject jSONObject, Status status);

    void c(Map<String, ClientActionFromLase> map, Status status);

    default void c(JSONObject jSONObject, Status status) {
    }

    void d(JSONObject jSONObject, Status status);

    void e(JSONObject jSONObject, Status status);
}
