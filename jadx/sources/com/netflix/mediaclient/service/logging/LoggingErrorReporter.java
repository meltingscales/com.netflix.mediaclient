package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.HashMap;
import java.util.Map;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C8157dfA;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public enum LoggingErrorReporter {
    INSTANCE;
    
    private Map<LoggingType, c> d = new HashMap();

    /* loaded from: classes3.dex */
    public enum LoggingType {
        PDS_EVENTS,
        CLV2,
        LOGBLOBS
    }

    LoggingErrorReporter() {
    }

    public void e(LoggingType loggingType) {
        c(loggingType, null);
    }

    public void e(LoggingType loggingType, StatusCode statusCode) {
        c(loggingType, statusCode);
    }

    private void c(LoggingType loggingType, StatusCode statusCode) {
        c cVar = this.d.get(loggingType);
        if (cVar == null) {
            cVar = new c(loggingType);
            this.d.put(loggingType, cVar);
        }
        if (statusCode != null) {
            cVar.b(statusCode);
        } else {
            cVar.a();
        }
        b();
    }

    private void b() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (c cVar : this.d.values()) {
                jSONArray.put(cVar.b());
            }
            C8157dfA.a(AbstractApplicationC1040Mh.d(), "preference_logging_delivery_stats", jSONArray.toString());
            C1044Mm.e("LoggingErrorReporter", "Saved");
        } catch (JSONException e) {
            C1044Mm.b("LoggingErrorReporter", e, "Failed to create a JSON!", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class c {
        public final LoggingType a;
        private Map<StatusCode, a> b = new HashMap();
        public int c;
        public int d;
        public int e;

        public void a() {
            this.c++;
            this.e++;
        }

        public String toString() {
            return "StatsPerLoggingType{loggingType=" + this.a + ", totalNumberOfDeliveryAttempts=" + this.c + ", totalNumberOfSuccessDeliveries=" + this.e + ", totalNumberOfFailures=" + this.d + ", failureCauseMap=" + this.b + '}';
        }

        public c(LoggingType loggingType) {
            this.a = loggingType;
        }

        public void b(StatusCode statusCode) {
            this.c++;
            this.d++;
            a aVar = this.b.get(statusCode);
            if (aVar == null) {
                aVar = new a(statusCode);
                this.b.put(statusCode, aVar);
            }
            aVar.d();
        }

        public JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.a.name());
            jSONObject.put("total", this.c);
            jSONObject.put("totalFailed", this.d);
            jSONObject.put("totalSuccess", this.e);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("failuresPerCause", jSONArray);
            for (a aVar : this.b.values()) {
                aVar.a(jSONArray);
            }
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {
        private int d;
        private final StatusCode e;

        public a(StatusCode statusCode) {
            this.e = statusCode;
        }

        public void d() {
            synchronized (this) {
                this.d++;
            }
        }

        public String toString() {
            return "StatsPerFailureCause{failureCause=" + this.e + ", count=" + this.d + '}';
        }

        public JSONArray a(JSONArray jSONArray) {
            synchronized (this) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Payload.PARAM_RENO_CAUSE, this.e.name());
                jSONObject.put("count", this.d);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        }
    }
}
