package o;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$$ExternalSyntheticApiModelOutline1;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.chromium.net.ConnectionSubtype;
import org.json.JSONObject;

@Singleton
/* renamed from: o.dhx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8312dhx {
    public static final a a = new a(null);
    public static final int b = 8;
    private boolean c;
    private final Context e;

    @Inject
    public C8312dhx(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.e = context;
    }

    /* renamed from: o.dhx$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ApplicationExitInfoLog");
        }
    }

    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (Build.VERSION.SDK_INT >= 30 && ConfigFastPropertyFeatureControlConfig.Companion.r()) {
            C1665aJs c1665aJs = new C1665aJs(0L, null, false, null, 15, null);
            C1665aJs.e(c1665aJs, "ApplicationExitInfo", c(), (NetflixTraceCategory) null, (Long) null, (AppView) null, 28, (Object) null);
            Logger.INSTANCE.logEvent(c1665aJs.c());
        }
    }

    @TargetApi(ConnectionSubtype.SUBTYPE_WIFI_N)
    private final JSONObject c() {
        boolean isLowMemoryKillReportSupported;
        int reason;
        int status;
        long timestamp;
        JSONObject jSONObject = new JSONObject();
        isLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
        jSONObject.put("isLowMemoryKillReportSupported", isLowMemoryKillReportSupported);
        List<ApplicationExitInfo> e = e();
        if (!e.isEmpty()) {
            ApplicationExitInfo m = ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m(e.get(0));
            reason = m.getReason();
            jSONObject.put("applicationExitReason", reason);
            status = m.getStatus();
            jSONObject.put("applicationExitStatus", status);
            timestamp = m.getTimestamp();
            jSONObject.put("applicationExitTimestamp", timestamp);
        }
        return jSONObject;
    }

    @TargetApi(ConnectionSubtype.SUBTYPE_WIFI_N)
    private final List<ApplicationExitInfo> e() {
        List<ApplicationExitInfo> i;
        List<ApplicationExitInfo> historicalProcessExitReasons;
        try {
            historicalProcessExitReasons = ((ActivityManager) this.e.getSystemService(ActivityManager.class)).getHistoricalProcessExitReasons(null, 0, 1);
            C8632dsu.a(historicalProcessExitReasons, "");
            return historicalProcessExitReasons;
        } catch (Throwable unused) {
            i = C8569dql.i();
            return i;
        }
    }
}
