package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.gson.Gson;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.brd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5060brd extends AbstractC1900aSk<UmaAlert> {
    private final InterfaceC5013bqj a;
    private final Context d;
    private final String f;
    private final String g;
    private final boolean h;

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
    }

    @Override // o.AbstractC1902aSm
    public boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5060brd(Context context, NetflixDataRequest.Transport transport, InterfaceC5013bqj interfaceC5013bqj, String str, boolean z, String str2) {
        super(context, transport, "RefreshUserMessageRequest");
        this.a = interfaceC5013bqj;
        this.d = context;
        this.g = str;
        this.h = z;
        this.f = str2;
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        return Collections.singletonList("[\"user\", \"uma\"]");
    }

    @Override // o.AbstractC1902aSm
    public Map<String, String> b() {
        Map<String, String> b = super.b();
        if (b == null) {
            b = new HashMap<>();
        }
        if (!TextUtils.isEmpty(this.g)) {
            b.put("tagFilter", this.g);
        }
        if (this.h) {
            b.put("isConsumptionOnly", "true");
        }
        if (ConfigFastPropertyFeatureControlConfig.Companion.f()) {
            b.put("interstitialLocation", this.f);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: b */
    public UmaAlert e(String str, String str2) {
        try {
            return e(str);
        } catch (Exception e) {
            throw new FalkorException("response missing user json objects", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: a */
    public void b(UmaAlert umaAlert) {
        this.a.a(umaAlert);
        LocalBroadcastManager.getInstance(this.d).sendBroadcast(new Intent("RefreshUserMessageRequest.ACTION_UMA_MESSAGE_UPDATED"));
    }

    public static UmaAlert e(String str) {
        JSONObject b;
        JSONObject jSONObject = new JSONObject(str).getJSONObject("jsonGraph").getJSONObject("user").getJSONObject("uma");
        boolean z = true;
        boolean z2 = jSONObject.has("$type") && UmaAlert.ICON_ERROR.equals(jSONObject.getString("$type"));
        if (!jSONObject.has("value") || jSONObject.optJSONObject("value") == null) {
            z = false;
        }
        if (z2 || !z || (b = new C4363bdB(jSONObject.getJSONObject("value")).b()) == null) {
            return null;
        }
        return (UmaAlert) ((Gson) C1332Xp.b(Gson.class)).fromJson(b.getJSONObject("uma").toString(), (Class<Object>) UmaAlert.class);
    }
}
