package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_WidevineFailureHandling extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("enabledWidevineL1NotReportedButExpectedBackgroundLaunch")
    private boolean enabledWidevineL1NotReportedButExpectedBackgroundLaunch = true;
    @SerializedName("enableWidevineMetrics")
    private boolean enableWidevineMetrics = true;
    @SerializedName("widevineStackSample")
    private boolean enableStackTraceSampling = true;
    @SerializedName("enableSamplingGetKeyRequest")
    private boolean enableSamplingGetKeyRequest = true;

    public final boolean getEnableSamplingGetKeyRequest() {
        return this.enableSamplingGetKeyRequest;
    }

    public final boolean getEnableStackTraceSampling() {
        return this.enableStackTraceSampling;
    }

    public final boolean getEnableWidevineMetrics() {
        return this.enableWidevineMetrics;
    }

    public final boolean getEnabledWidevineL1NotReportedButExpectedBackgroundLaunch() {
        return this.enabledWidevineL1NotReportedButExpectedBackgroundLaunch;
    }

    @Override // o.aRW
    public String getName() {
        return "widevineFailureHandling";
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("Config_FastProperty_WidevineFailureHandling");
        }

        public final boolean c() {
            return ((Config_FastProperty_WidevineFailureHandling) C1822aPn.b("widevineFailureHandling")).getEnabledWidevineL1NotReportedButExpectedBackgroundLaunch();
        }

        public final boolean a() {
            return ((Config_FastProperty_WidevineFailureHandling) C1822aPn.b("widevineFailureHandling")).getEnableWidevineMetrics();
        }

        public final boolean d() {
            return ((Config_FastProperty_WidevineFailureHandling) C1822aPn.b("widevineFailureHandling")).getEnableStackTraceSampling();
        }

        public final boolean e() {
            return ((Config_FastProperty_WidevineFailureHandling) C1822aPn.b("widevineFailureHandling")).getEnableSamplingGetKeyRequest();
        }
    }
}
