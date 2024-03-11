package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.model.Error;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayApiPlaybackLogs;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyLogblobs;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SendServiceTokensPolicy;
import com.netflix.mediaclient.service.logging.LoggingErrorReporter;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C1958aUo;
import o.C1983aVn;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aVi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1978aVi extends AbstractC2101aZx {
    private aOV a;
    private String d;
    private Context e;
    private NetworkRequestType v;
    private JSONArray x;
    private final C1958aUo.b y;

    private boolean X() {
        return false;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public boolean C() {
        return true;
    }

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Object y() {
        return this.v;
    }

    public C1978aVi(Context context, String[] strArr, aOV aov, C1958aUo.b bVar) {
        this.v = NetworkRequestType.PDS_EVENT;
        this.a = aov;
        this.e = context;
        this.y = bVar;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                JSONObject jSONObject = new JSONObject(str);
                NetworkRequestType d = C1983aVn.d(jSONObject);
                NetworkRequestType networkRequestType = this.v;
                NetworkRequestType networkRequestType2 = NetworkRequestType.PDS_EVENT;
                if (networkRequestType != networkRequestType2 && d != networkRequestType2) {
                    this.v = d;
                    jSONArray.put(jSONObject);
                }
                this.v = networkRequestType2;
                jSONArray.put(jSONObject);
            }
            this.x = jSONArray;
        } catch (Exception unused) {
            C1044Mm.d("nf_pds_sendPdsBundleMsl", "error in creating json array");
        }
    }

    @Override // o.aZE
    public boolean F_() {
        return !Config_FastProperty_SendServiceTokensPolicy.shouldSendWithPdsEvents();
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.LOW;
    }

    @Override // o.AbstractC2103aZz, o.aZE
    public String O() {
        return Config_FastProperty_PlayApiPlaybackLogs.shouldSendPds() ? "/playapi/android/event/1" : super.O();
    }

    @Override // o.AbstractC2103aZz, o.aZE
    public void L() {
        if (Config_FastProperty_PlayApiPlaybackLogs.shouldSendPds()) {
            k(this.a.j().d("/playapi/android/event/1"));
        } else {
            super.L();
        }
    }

    @Override // o.aZE
    public String G_() {
        this.x = a(this.x);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(SignupConstants.Field.URL, "bundle");
            jSONObject.putOpt("params", this.x);
        } catch (JSONException e) {
            C1044Mm.e("nf_pds_sendPdsBundleMsl", "unable to build pdsBundle", e);
        }
        return jSONObject.toString();
    }

    @Override // o.AbstractC2103aZz, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        Map<String, String> o2 = super.o();
        String str = o2.get("languages");
        this.d = str;
        if (C8168dfL.h(str)) {
            o2.remove("languages");
        }
        return o2;
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return Arrays.asList("[\"pdsEventBundle\"]");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> map;
        char c;
        String c2;
        try {
            map = super.j();
        } catch (Throwable th) {
            th = th;
            map = null;
        }
        try {
            Iterator<C1983aVn.b> it = C1983aVn.e(this.x).iterator();
            String str = "";
            while (it.hasNext()) {
                C1983aVn.b next = it.next();
                String str2 = next.d ? "events/live/" : "events/";
                String str3 = next.b;
                Iterator<C1983aVn.b> it2 = it;
                switch (str3.hashCode()) {
                    case -1775507384:
                        if (str3.equals("keepAlive")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1163336193:
                        if (str3.equals("adStart")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -934426579:
                        if (str3.equals("resume")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -895859076:
                        if (str3.equals("splice")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3540994:
                        if (str3.equals("stop")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106440182:
                        if (str3.equals("pause")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109757538:
                        if (str3.equals("start")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1119772528:
                        if (str3.equals("adProgress")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1483846645:
                        if (str3.equals("adBreakComplete")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1521405564:
                        if (str3.equals("adComplete")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        c2 = c(str, str2 + "start");
                        break;
                    case 1:
                        c2 = c(str, str2 + "splice");
                        break;
                    case 2:
                        c2 = c(str, str2 + "stop");
                        break;
                    case 3:
                        c2 = c(str, str2 + "pause");
                        break;
                    case 4:
                        c2 = c(str, str2 + "resume");
                        break;
                    case 5:
                        c2 = c(str, str2 + "keepAlive");
                        break;
                    case 6:
                        c2 = c(str, str2 + "adStart");
                        break;
                    case 7:
                        c2 = c(str, str2 + "adProgress");
                        break;
                    case '\b':
                        c2 = c(str, str2 + "adComplete");
                        break;
                    case '\t':
                        c2 = c(str, str2 + "adBreakComplete");
                        break;
                    default:
                        c2 = c(str, str2 + "offline");
                        break;
                }
                str = c2;
                it = it2;
            }
            if (C8168dfL.g(str)) {
                str = "events/start";
            }
            if (Config_FastProperty_PlayApiPlaybackLogs.shouldSendPds()) {
                C8200dfr.e(map, str, true);
            } else {
                C8200dfr.c(map, str, X());
            }
        } catch (Throwable th2) {
            th = th2;
            C1044Mm.b("nf_pds_sendPdsBundleMsl", th, "Failed to get MSL headers", new Object[0]);
            return map;
        }
        return map;
    }

    private static String c(String str, String str2) {
        if (C8168dfL.g(str)) {
            return str2;
        }
        if (str.contains(str2)) {
            return str;
        }
        return str + "," + str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: b */
    public void a(JSONObject jSONObject) {
        T();
        if (this.y != null) {
            this.y.d(C1959aUp.c(this.e, jSONObject, BasePlayErrorStatus.PlayRequestType.other));
            return;
        }
        C1044Mm.j("nf_pds_sendPdsBundleMsl", "callback null?");
    }

    @Override // o.aZE
    public void e(Status status) {
        a(status);
        C1958aUo.b bVar = this.y;
        if (bVar != null) {
            bVar.d(status);
        } else {
            C1044Mm.j("nf_pds_sendPdsBundleMsl", "callback null?");
        }
    }

    private JSONArray a(JSONArray jSONArray) {
        JSONObject jSONObject;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (C8168dfL.h(this.d) && jSONObject2 != null && !jSONObject2.has("languages")) {
                    jSONObject2.putOpt("languages", new JSONArray((Collection) Arrays.asList(this.d)));
                }
                if (jSONObject2 != null && jSONObject2.has("params") && (jSONObject = jSONObject2.getJSONObject("params")) != null && jSONObject.has("xid")) {
                    Object obj = jSONObject.get("xid");
                    if (!(obj instanceof String)) {
                        jSONObject.putOpt("xid", String.valueOf(obj));
                    }
                }
            } catch (JSONException e) {
                C1044Mm.e("nf_pds_sendPdsBundleMsl", "error inserting languages", e);
            }
        }
        return jSONArray;
    }

    private void a(Status status) {
        Error error;
        if (Config_FastProperty_RetryPolicyLogblobs.shouldLogDetailsOnErrorToDeliverEvents()) {
            C1044Mm.e("nf_pds_sendPdsBundleMsl", "Logging details on failure");
            if (status instanceof NetflixStatus) {
                error = ((NetflixStatus) status).a();
            } else {
                C1044Mm.d("nf_pds_sendPdsBundleMsl", "It should be NetflixStatus. This should NOT happen!");
                error = null;
            }
            ExtLogger.INSTANCE.logError(new Error("pdsDeliveryFailure", error, null));
        }
        if (Config_FastProperty_RetryPolicyLogblobs.shouldCountFailuresToDeliverEvents()) {
            LoggingErrorReporter.INSTANCE.e(LoggingErrorReporter.LoggingType.PDS_EVENTS, status.c());
        }
    }

    private void T() {
        if (Config_FastProperty_RetryPolicyLogblobs.shouldCountFailuresToDeliverEvents()) {
            LoggingErrorReporter.INSTANCE.e(LoggingErrorReporter.LoggingType.PDS_EVENTS);
        }
    }
}
