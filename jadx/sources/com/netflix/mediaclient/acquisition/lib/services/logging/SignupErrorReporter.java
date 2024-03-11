package com.netflix.mediaclient.acquisition.lib.services.logging;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.cl.model.Error;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import java.util.List;
import javax.inject.Inject;
import o.C1044Mm;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class SignupErrorReporter {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "SignupErrorLogger";
    private final LoggedErrorListener loggedErrorListener;
    private final MoneyballDataSource moneyballDataSource;
    private final SignupLogger signupLogger;

    /* loaded from: classes3.dex */
    public interface LoggedErrorListener {
        void onErrorLogged(String str, String str2);
    }

    @Inject
    public SignupErrorReporter(SignupLogger signupLogger, MoneyballDataSource moneyballDataSource, LoggedErrorListener loggedErrorListener) {
        C8632dsu.c((Object) signupLogger, "");
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) loggedErrorListener, "");
        this.signupLogger = signupLogger;
        this.moneyballDataSource = moneyballDataSource;
        this.loggedErrorListener = loggedErrorListener;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ String getPartialStackTrace$default(Companion companion, Exception exc, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 15;
            }
            return companion.getPartialStackTrace(exc, i);
        }

        public final String getPartialStackTrace(Exception exc, int i) {
            C8632dsu.c((Object) exc, "");
            StackTraceElement[] stackTrace = exc.getStackTrace();
            StringBuilder sb = new StringBuilder();
            int min = Math.min(stackTrace.length - 1, i);
            if (min >= 0) {
                int i2 = 0;
                while (true) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    sb.append(stackTraceElement + "\n");
                    if (i2 == min) {
                        break;
                    }
                    i2++;
                }
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return sb2;
        }
    }

    public static /* synthetic */ void onDataError$default(SignupErrorReporter signupErrorReporter, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        signupErrorReporter.onDataError(str, str2, jSONObject);
    }

    public final void onDataError(String str, String str2, JSONObject jSONObject) {
        C8632dsu.c((Object) str, "");
        MoneyballData value = this.moneyballDataSource.getLiveMoneyballData().getValue();
        FlowMode flowMode = value != null ? value.getFlowMode() : null;
        if (flowMode == null) {
            return;
        }
        this.signupLogger.logError(toClError(str, str2, flowMode, jSONObject));
        logAndNotifyDataError(str, str2);
    }

    public final void onDataError(String str, List<String> list) {
        String d;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        d = C8576dqs.d(list, ".", null, null, 0, null, null, 62, null);
        onDataError$default(this, str, d, null, 4, null);
    }

    static /* synthetic */ Error toClError$default(SignupErrorReporter signupErrorReporter, String str, Object obj, FlowMode flowMode, JSONObject jSONObject, int i, Object obj2) {
        if ((i & 8) != 0) {
            jSONObject = null;
        }
        return signupErrorReporter.toClError(str, obj, flowMode, jSONObject);
    }

    private final Error toClError(String str, Object obj, FlowMode flowMode, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("flow", flowMode.getFlow()).put("mode", flowMode.getMode());
        return new Error(str, null, new JSONObject().put(SignupConstants.Error.DEBUG_FIELD_KEY, obj).put(SignupConstants.Error.DEBUG_FIELD_STACK_TRACE, Companion.getPartialStackTrace$default(Companion, new Exception(), 0, 2, null)).put(SignupConstants.Error.DEBUG_FIELD_INFO, jSONObject));
    }

    private final void logAndNotifyDataError(String str, String str2) {
        C1044Mm.d(TAG, str + ": '" + str2 + "'");
        this.loggedErrorListener.onErrorLogged(str, str2);
    }
}
