package o;

import android.content.Context;
import android.os.Build;
import com.netflix.android.volley.Request;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.model.Error;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlayApiPlaybackLogs;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyLogblobs;
import com.netflix.mediaclient.service.logging.LoggingErrorReporter;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.servicemgr.Logblob;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import o.aTW;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aVc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1972aVc {
    private static final AtomicLong d = new AtomicLong(0);
    private final Context a;
    private final aTW.a b;
    private final JSONObject c;
    private String e;
    private long g = System.currentTimeMillis();

    private boolean i() {
        return false;
    }

    public boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1972aVc(Context context, List<Logblob> list, Logblob.d dVar, aTW.a aVar) {
        long incrementAndGet = d.incrementAndGet();
        this.a = context;
        this.c = b(context, incrementAndGet, dVar, list);
        this.b = aVar;
    }

    private JSONObject b(Context context, long j, Logblob.d dVar, List<Logblob> list) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (i < list.size()) {
            JSONObject c = list.get(i).c();
            c.put("clienttime", list.get(i).z_());
            c.put("snum", j);
            i++;
            c.put("lnum", i);
            c.put("devmod", dVar.e);
            c.put("platformVersion", C8055ddE.e(context));
            c.put("platformBuildNum", C8055ddE.c(context));
            c.put("platformType", "Android Tanto");
            c.put("uiver", C8055ddE.e(context));
            c.put("fingerprint", Build.FINGERPRINT);
            c.put("android_api_level", Build.VERSION.SDK_INT);
            jSONArray.put(c);
        }
        jSONObject.put("entries", jSONArray);
        return jSONObject;
    }

    private void e(Status status) {
        Error error;
        if (Config_FastProperty_RetryPolicyLogblobs.shouldLogDetailsOnErrorToDeliverEvents()) {
            C1044Mm.e("nf_logblob_SendLogblobs", "Logging details on failure");
            if (status instanceof NetflixStatus) {
                error = ((NetflixStatus) status).a();
            } else {
                C1044Mm.d("nf_logblob_SendLogblobs", "It should be NetflixStatus. This should NOT happen!");
                error = null;
            }
            ExtLogger.INSTANCE.logError(new Error("logblobDeliveryFailure", error, null));
        }
        if (Config_FastProperty_RetryPolicyLogblobs.shouldCountFailuresToDeliverEvents()) {
            LoggingErrorReporter.INSTANCE.e(LoggingErrorReporter.LoggingType.LOGBLOBS, status.c());
        }
    }

    private void g() {
        if (Config_FastProperty_RetryPolicyLogblobs.shouldCountFailuresToDeliverEvents()) {
            LoggingErrorReporter.INSTANCE.e(LoggingErrorReporter.LoggingType.LOGBLOBS);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<String> c() {
        List<String> e;
        e = C1976aVg.e(new Object[]{"[\"logblobs\"]"});
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject b(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e = e;
            jSONObject = null;
        }
        try {
            InterfaceC2092aZo b = C2090aZm.d.b(jSONObject);
            if (b != null) {
                b.d();
            }
        } catch (JSONException e2) {
            e = e2;
            C1044Mm.e("nf_logblob_SendLogblobs", "error parsing json", e);
            return jSONObject;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(JSONObject jSONObject) {
        g();
        if (this.b != null) {
            this.b.c(C1959aUp.c(this.a, jSONObject, BasePlayErrorStatus.PlayRequestType.other));
            return;
        }
        C1044Mm.j("nf_logblob_SendLogblobs", "callback null?");
    }

    public Object b() {
        return NetworkRequestType.LOG_BLOB;
    }

    public Request.Priority a() {
        return Request.Priority.LOW;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> a(Map<String, String> map, boolean z) {
        try {
            if (Config_FastProperty_PlayApiPlaybackLogs.shouldSendLogblobs()) {
                C1044Mm.e("nf_logblob_SendLogblobs", "shouldSendLogblobs true");
                C8200dfr.e(map, "logblob", z);
            } else {
                C1044Mm.e("nf_logblob_SendLogblobs", "shouldSendLogblobs false");
                C8200dfr.c(map, "logblob", i());
            }
        } catch (Throwable th) {
            C1044Mm.b("nf_logblob_SendLogblobs", th, "Failed to get MSL headers", new Object[0]);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        List e;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(SignupConstants.Field.URL, "/logblob");
            jSONObject.putOpt("params", j());
            if (C8168dfL.h(this.e)) {
                e = C1976aVg.e(new Object[]{this.e});
                jSONObject.putOpt("languages", new JSONArray((Collection) e));
            }
        } catch (JSONException e2) {
            C1044Mm.e("nf_logblob_SendLogblobs", "error building payload for Nq", e2);
        }
        return jSONObject.toString();
    }

    private JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("method", "logblob");
            jSONObject.put("logblobs", this.c);
        } catch (Exception e) {
            C1044Mm.e("nf_logblob_SendLogblobs", "error creating logblob params", e);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, String> b(Map<String, String> map) {
        String str = map.get("languages");
        this.e = str;
        if (C8168dfL.h(str)) {
            map.remove("languages");
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(Status status) {
        e(status);
        aTW.a aVar = this.b;
        if (aVar != null) {
            aVar.c(status);
        } else {
            C1044Mm.j("nf_logblob_SendLogblobs", "callback null?");
        }
    }
}
