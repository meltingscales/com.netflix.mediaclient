package o;

import com.facebook.battery.reporter.core.SystemMetricsReporter;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.android.BatteryMeasurementReported;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aVt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1989aVt implements SystemMetricsReporter.Event {
    private JSONObject c;

    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter.Event
    public boolean isSampled() {
        return true;
    }

    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter.Event
    public void acquireEvent(String str, String str2) {
        C1044Mm.e("BatteryEvent", "New event: {");
        if (this.c != null) {
            C1044Mm.d("BatteryEvent", "error - json object created but not deleted");
        }
        this.c = new JSONObject();
    }

    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter.Event
    public void add(String str, String str2) {
        C1044Mm.e("BatteryEvent", str + ":" + str2);
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException unused) {
                C1044Mm.e("BatteryEvent", "Unable to add event");
            }
        }
    }

    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter.Event
    public void add(String str, long j) {
        C1044Mm.e("BatteryEvent", str + ":" + j);
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            try {
                jSONObject.put(str, j);
            } catch (JSONException unused) {
                C1044Mm.e("BatteryEvent", "Unable to add event");
            }
        }
    }

    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter.Event
    public void add(String str, double d) {
        C1044Mm.e("BatteryEvent", str + ":" + d);
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            try {
                jSONObject.put(str, d);
            } catch (JSONException unused) {
                C1044Mm.e("BatteryEvent", "Unable to add event");
            }
        }
    }

    @Override // com.facebook.battery.reporter.core.SystemMetricsReporter.Event
    public void logAndRelease() {
        C1044Mm.e("BatteryEvent", "}");
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            Logger.INSTANCE.logEvent(new BatteryMeasurementReported(jSONObject));
        } else {
            C1044Mm.d("BatteryEvent", "Unable to log clevent");
        }
        this.c = null;
    }
}
