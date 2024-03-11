package o;

import android.content.Context;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.ConnectivityUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bhQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4590bhQ implements InterfaceC4766bmA {
    private final aTU a;
    private final IClientLogging b;
    private final Context e;

    public C4590bhQ(Context context, IClientLogging iClientLogging) {
        this.e = context;
        this.b = iClientLogging;
        this.a = iClientLogging.h();
    }

    @Override // o.InterfaceC4766bmA
    public void a(C4768bmC c4768bmC, boolean z) {
        JSONObject optJSONObject = c4768bmC.optJSONObject("params");
        if (optJSONObject != null) {
            try {
                optJSONObject.put("sessionId", this.b.f());
                optJSONObject.put(NetflixMediaDrm.PROPERTY_APP_ID, this.b.a());
            } catch (JSONException unused) {
            }
        }
        this.a.c(c4768bmC.toString(), z);
        if (ConnectivityUtils.o(this.e)) {
            this.a.e();
        }
    }
}
