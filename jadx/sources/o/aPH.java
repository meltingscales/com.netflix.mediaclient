package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.DrmMetricsCollector;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aPH {
    private Map<String, String> a;
    private String b;
    private String c;
    private final DrmMetricsCollector.NfAppStage d;
    private final NetflixMediaDrm e;
    private byte[] h;

    public final Map<String, String> a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final NetflixMediaDrm c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final aPH d(byte[] bArr, String str, String str2) {
        this.h = bArr;
        this.b = str;
        this.c = str2;
        return this;
    }

    public final DrmMetricsCollector.NfAppStage e() {
        return this.d;
    }

    public final byte[] j() {
        return this.h;
    }

    public aPH(NetflixMediaDrm netflixMediaDrm, DrmMetricsCollector.NfAppStage nfAppStage) {
        C8632dsu.c((Object) nfAppStage, "");
        this.e = netflixMediaDrm;
        this.d = nfAppStage;
        this.a = new LinkedHashMap();
    }

    public final aPH b(DrmMetricsCollector.WvApi wvApi) {
        C8632dsu.c((Object) wvApi, "");
        this.a.put("wvApi", wvApi.toString());
        return this;
    }

    public final aPH b(Throwable th) {
        C8632dsu.c((Object) th, "");
        String message = th.getMessage();
        if (message != null) {
            this.a.put("exceptionMessage", message);
        }
        if (DrmMetricsCollector.d.d()) {
            this.a.put(SignupConstants.Error.DEBUG_FIELD_STACK_TRACE, aPD.c(th));
        }
        return this;
    }

    public final aPH c(String str) {
        C8632dsu.c((Object) str, "");
        this.a.put("source_location", str);
        return this;
    }
}
