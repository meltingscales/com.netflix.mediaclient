package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Zuul extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("allowOnCellular")
    private boolean allowOnCellular;
    @SerializedName("isEnabled")
    private boolean isEnabled = true;
    @SerializedName("wsMaxRetryCount")
    private int wsMaxRetryCount = 4;
    @SerializedName("wsPingTimeoutInMs")
    private long wsPingTimeoutInMs = 5000;
    @SerializedName("wsPingIntervalInMs")
    private long wsPingIntervalInMs = 300000;
    @SerializedName("useBackoffOnNetworkFailure")
    private boolean useBackoffOnNetworkFailure = true;
    @SerializedName("openNewSocketBeforeClosingOld")
    private boolean openNewSocketBeforeClosingOld = true;

    public final boolean getAllowOnCellular() {
        return this.allowOnCellular;
    }

    @Override // o.aRW
    public String getName() {
        return "zuul_config";
    }

    public final boolean getOpenNewSocketBeforeClosingOld() {
        return this.openNewSocketBeforeClosingOld;
    }

    public final boolean getUseBackoffOnNetworkFailure() {
        return this.useBackoffOnNetworkFailure;
    }

    public final int getWsMaxRetryCount() {
        return this.wsMaxRetryCount;
    }

    public final long getWsPingIntervalInMs() {
        return this.wsPingIntervalInMs;
    }

    public final long getWsPingTimeoutInMs() {
        return this.wsPingTimeoutInMs;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean c() {
            return ((Config_FastProperty_Zuul) C1822aPn.b("zuul_config")).isEnabled();
        }

        public final int d() {
            return ((Config_FastProperty_Zuul) C1822aPn.b("zuul_config")).getWsMaxRetryCount();
        }

        public final long a() {
            return ((Config_FastProperty_Zuul) C1822aPn.b("zuul_config")).getWsPingTimeoutInMs();
        }

        public final long e() {
            return ((Config_FastProperty_Zuul) C1822aPn.b("zuul_config")).getWsPingIntervalInMs();
        }

        public final boolean j() {
            return ((Config_FastProperty_Zuul) C1822aPn.b("zuul_config")).getUseBackoffOnNetworkFailure();
        }

        public final boolean b() {
            return ((Config_FastProperty_Zuul) C1822aPn.b("zuul_config")).getAllowOnCellular();
        }

        public final boolean f() {
            return ((Config_FastProperty_Zuul) C1822aPn.b("zuul_config")).getOpenNewSocketBeforeClosingOld();
        }
    }
}
