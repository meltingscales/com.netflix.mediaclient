package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.media.subtitles.BaseSubtitle;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_SmartLockConfig extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("enabled")
    private boolean enabled = true;
    @SerializedName(BaseSubtitle.IMPL)
    private String impl = "ONETOUCH";

    public static final boolean isEnabled() {
        return Companion.b();
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // o.aRW
    public String getName() {
        return "smartLockConfig";
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean b() {
            return ((Config_FastProperty_SmartLockConfig) C1822aPn.b("smartLockConfig")).getEnabled();
        }
    }
}
