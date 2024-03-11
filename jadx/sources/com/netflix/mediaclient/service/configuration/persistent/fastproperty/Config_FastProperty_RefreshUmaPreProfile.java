package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_RefreshUmaPreProfile extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("enabled")
    private boolean enabled = true;

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // o.aRW
    public String getName() {
        return "refresh_uma_pre_profile_gate";
    }

    /* loaded from: classes.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("Config_FastProperty_RefreshUmaPreProfile");
        }

        public final boolean b() {
            return ((Config_FastProperty_RefreshUmaPreProfile) C1822aPn.b("refresh_uma_pre_profile_gate")).getEnabled();
        }
    }
}
