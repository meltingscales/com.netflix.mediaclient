package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class ConfigFastPropertyC4PlayerControls extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("updateOnNetworkChange")
    private final boolean updateOnNetworkChange;
    @SerializedName("skipOnLoadError")
    private final boolean skipOnLoadError = true;
    @SerializedName("skipOnMissingManifest")
    private final boolean skipOnMissingManifest = true;
    @SerializedName("deepLinkAsSeek")
    private final boolean deepLinkAsSeek = true;
    @SerializedName("frontPaddingDuration")
    private final long frontPaddingDuration = 1000;
    @SerializedName("rearPaddingDuration")
    private final long rearPaddingDuration = 1000;
    @SerializedName("enableAdBreakHydration")
    private final boolean enableAdBreakHydration = true;

    public static final boolean skipOnMissingManifest() {
        return Companion.g();
    }

    public static final boolean updateOnNetworkChange() {
        return Companion.i();
    }

    public final boolean getDeepLinkAsSeek() {
        return this.deepLinkAsSeek;
    }

    public final boolean getEnableAdBreakHydration() {
        return this.enableAdBreakHydration;
    }

    public final long getFrontPaddingDuration() {
        return this.frontPaddingDuration;
    }

    @Override // o.aRW
    public String getName() {
        return "C4PlayerControls";
    }

    public final long getRearPaddingDuration() {
        return this.rearPaddingDuration;
    }

    public final boolean getSkipOnLoadError() {
        return this.skipOnLoadError;
    }

    public final boolean getSkipOnMissingManifest() {
        return this.skipOnMissingManifest;
    }

    public final boolean getUpdateOnNetworkChange() {
        return this.updateOnNetworkChange;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean c() {
            return ((ConfigFastPropertyC4PlayerControls) C1822aPn.b("C4PlayerControls")).getSkipOnLoadError();
        }

        public final boolean g() {
            return ((ConfigFastPropertyC4PlayerControls) C1822aPn.b("C4PlayerControls")).getSkipOnMissingManifest();
        }

        public final boolean i() {
            return ((ConfigFastPropertyC4PlayerControls) C1822aPn.b("C4PlayerControls")).getUpdateOnNetworkChange();
        }

        public final boolean b() {
            return ((ConfigFastPropertyC4PlayerControls) C1822aPn.b("C4PlayerControls")).getDeepLinkAsSeek();
        }

        public final long a() {
            return ((ConfigFastPropertyC4PlayerControls) C1822aPn.b("C4PlayerControls")).getFrontPaddingDuration();
        }

        public final long d() {
            return ((ConfigFastPropertyC4PlayerControls) C1822aPn.b("C4PlayerControls")).getRearPaddingDuration();
        }

        public final boolean e() {
            return ((ConfigFastPropertyC4PlayerControls) C1822aPn.b("C4PlayerControls")).getEnableAdBreakHydration();
        }
    }
}
