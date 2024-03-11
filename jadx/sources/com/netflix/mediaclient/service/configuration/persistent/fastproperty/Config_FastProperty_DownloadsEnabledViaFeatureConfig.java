package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_DownloadsEnabledViaFeatureConfig extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("enabled")
    private boolean enabled = true;

    public static final boolean isFeatureConfigDownloadCheckEnabled() {
        return Companion.b();
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // o.aRW
    public String getName() {
        return "downloads_enabled_via_feature_config";
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("Config_FastProperty_DownloadsCheck");
        }

        public final boolean b() {
            return ((Config_FastProperty_DownloadsEnabledViaFeatureConfig) C1822aPn.b("downloads_enabled_via_feature_config")).getEnabled();
        }
    }
}
