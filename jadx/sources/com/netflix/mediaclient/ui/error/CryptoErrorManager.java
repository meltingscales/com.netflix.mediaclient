package com.netflix.mediaclient.ui.error;

import android.os.SystemClock;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.service.user.UserAgent;
import o.C1044Mm;
import o.InterfaceC4208baF;
import o.InterfaceC5128bss;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface CryptoErrorManager {

    /* loaded from: classes.dex */
    public enum CryptoFailback {
        widevineL3,
        widevineL3Failed,
        uknown
    }

    /* loaded from: classes.dex */
    public enum CryptoFailbackCause {
        WORKFLOW,
        BLACKLISTED
    }

    void a(ErrorSource errorSource, StatusCode statusCode, Throwable th);

    void b(long j, UserAgent userAgent, InterfaceC4208baF interfaceC4208baF, InterfaceC5128bss interfaceC5128bss);

    CryptoFailback d(CryptoFailbackCause cryptoFailbackCause, a[] aVarArr);

    /* loaded from: classes.dex */
    public static class a {
        ErrorSource a;
        StatusCode b;
        long c;
        JSONObject d;
        long e;
        long i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(long j) {
            return this.e == j;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(ErrorSource errorSource, StatusCode statusCode, long j, Throwable th) {
            this.a = errorSource;
            this.b = statusCode;
            this.i = System.currentTimeMillis();
            this.c = SystemClock.elapsedRealtime();
            this.e = j;
            this.d = b(th);
        }

        private JSONObject b(Throwable th) {
            JSONObject jSONObject = new JSONObject();
            if (th != null) {
                try {
                    jSONObject.put("stacktrace", C1044Mm.d(th));
                    if (th.getMessage() != null) {
                        jSONObject.put("MESSAGE", th.getMessage());
                    }
                } catch (Throwable unused) {
                }
            }
            return jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(JSONObject jSONObject) {
            this.i = jSONObject.getLong("ts");
            this.c = jSONObject.getLong("up");
            this.e = jSONObject.getLong("appStartupTime");
            this.a = ErrorSource.valueOf(jSONObject.getString("src"));
            this.b = StatusCode.getStatusCodeByValue(jSONObject.getInt(Payload.PARAM_RENO_CAUSE));
            this.d = jSONObject.optJSONObject("originalCause");
        }

        public JSONObject d() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", this.i);
            jSONObject.put("appStartupTime", this.e);
            jSONObject.put("up", this.c);
            jSONObject.put("src", this.a.name());
            jSONObject.put(Payload.PARAM_RENO_CAUSE, this.b.getValue());
            JSONObject jSONObject2 = this.d;
            if (jSONObject2 != null) {
                jSONObject.put("originalCause", jSONObject2);
            }
            return jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean e() {
            return this.i + 3600000 > System.currentTimeMillis();
        }

        public String toString() {
            return "FatalCryptoError{appStartupTimeInMs=" + this.e + ", timestamp=" + this.i + ", howLongDeviceWasUpInMs=" + this.c + ", errorSource=" + this.a + ", statusCode=" + this.b + ", originalCause=" + this.d + '}';
        }
    }
}
