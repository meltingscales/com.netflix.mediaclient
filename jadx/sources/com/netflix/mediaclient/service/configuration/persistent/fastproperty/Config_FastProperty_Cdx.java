package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Cdx extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("isEnabled")
    private boolean isEnabled;
    @SerializedName("numberOfMessageRoundTripsToTriggerLogging")
    private int numberOfMessageRoundTripsToTriggerLogging = 10;
    @SerializedName("logOnFirstMessageResponse")
    private boolean logOnFirstMessageResponse = true;
    @SerializedName("sessionTimeoutInSec")
    private int sessionTimeoutInSec = 900;
    @SerializedName("enabledOnData")
    private boolean enabledOnData = true;
    @SerializedName("promptedPairingEnabled")
    private boolean promptedPairingEnabled = true;
    @SerializedName("implicitPairingEnabled")
    private boolean implicitPairingEnabled = true;
    @SerializedName("timeoutInSec")
    private int timeoutInSec = 30;

    public final boolean getEnabledOnData() {
        return this.enabledOnData;
    }

    public final boolean getImplicitPairingEnabled() {
        return this.implicitPairingEnabled;
    }

    public final boolean getLogOnFirstMessageResponse() {
        return this.logOnFirstMessageResponse;
    }

    @Override // o.aRW
    public String getName() {
        return "cdx_config";
    }

    public final int getNumberOfMessageRoundTripsToTriggerLogging() {
        return this.numberOfMessageRoundTripsToTriggerLogging;
    }

    public final boolean getPromptedPairingEnabled() {
        return this.promptedPairingEnabled;
    }

    public final int getTimeoutInSec() {
        return this.timeoutInSec;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        private final Config_FastProperty_Cdx g() {
            aRW b = C1822aPn.b("cdx_config");
            C8632dsu.a(b, "");
            return (Config_FastProperty_Cdx) b;
        }

        public final boolean d() {
            return g().isEnabled();
        }

        public final int e() {
            return g().getNumberOfMessageRoundTripsToTriggerLogging();
        }

        public final boolean f() {
            return g().getLogOnFirstMessageResponse();
        }

        public final boolean j() {
            return g().getEnabledOnData();
        }

        public final boolean c() {
            return !g().getPromptedPairingEnabled();
        }

        public final boolean a() {
            return !g().getImplicitPairingEnabled();
        }

        public final long b() {
            return g().getTimeoutInSec() * 1000;
        }
    }
}
