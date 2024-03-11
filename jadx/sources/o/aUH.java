package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.model.Error;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.configuration.EdgeStack;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_RetryPolicyCL;
import com.netflix.mediaclient.service.logging.LoggingErrorReporter;
import java.util.Map;

/* loaded from: classes3.dex */
public class aUH extends aUE {
    public static boolean d = false;
    private static boolean e = true;
    private String h;
    private String i;
    private aUA j;

    @Override // o.AbstractC1968aUz
    public String L() {
        return "nf_log_cl";
    }

    @Override // o.aUE
    protected String R() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aUH(String str, String str2, aUA aua) {
        C1044Mm.e("nf_log_cl", "LoggingEventsCLv2WebRequest::");
        this.j = aua;
        this.h = str;
        this.i = str2;
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        if (e) {
            j.put("debugRequest", "true");
        }
        return j;
    }

    /* renamed from: o.aUH$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[EdgeStack.values().length];
            e = iArr;
            try {
                iArr[EdgeStack.TEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[EdgeStack.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // o.aUE, o.AbstractC1968aUz
    public String P() {
        if (d) {
            int i = AnonymousClass4.e[C1816aPh.b(AbstractApplicationC1040Mh.d()).ordinal()];
            return (i == 1 || i == 2) ? "https://ichnaea.test.netflix.com/cl2" : "https://ichnaea.staging.netflix.com/cl2";
        }
        return ((AbstractC1968aUz) this).a.d("/ichnaea/cl2");
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.LOG_CLV2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: h */
    public void a(String str) {
        Q();
        aUA aua = this.j;
        if (aua != null) {
            aua.onEventsDelivered(this.h);
        }
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        c(status);
        aUA aua = this.j;
        if (aua != null) {
            aua.onEventsDeliveryFailed(this.h);
        }
    }

    private void c(Status status) {
        Error error;
        if (Config_FastProperty_RetryPolicyCL.shouldLogDetailsOnErrorToDeliverEvents()) {
            C1044Mm.e("nf_log_cl", "Logging details on failure");
            if (status instanceof NetflixStatus) {
                error = ((NetflixStatus) status).a();
            } else {
                C1044Mm.d("nf_log_cl", "It should be NetflixStatus. This should NOT happen!");
                error = null;
            }
            ExtLogger.INSTANCE.logError(new Error("clv2DeliveryFailure", error, null));
        }
        if (Config_FastProperty_RetryPolicyCL.shouldCountFailuresToDeliverEvents()) {
            LoggingErrorReporter.INSTANCE.e(LoggingErrorReporter.LoggingType.CLV2, status.c());
        }
    }

    private void Q() {
        if (Config_FastProperty_RetryPolicyCL.shouldCountFailuresToDeliverEvents()) {
            LoggingErrorReporter.INSTANCE.e(LoggingErrorReporter.LoggingType.CLV2);
        }
    }
}
