package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_PlaybackSpecificationDiagnostics extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("isEnabled")
    private boolean isEnabled;

    @Override // o.aRW
    public String getName() {
        return "playback_specification_diagnostics";
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("Config_FastProperty_PlaybackSpecificationDiagnostics");
        }

        public final boolean d() {
            return ((Config_FastProperty_PlaybackSpecificationDiagnostics) C1822aPn.b("playback_specification_diagnostics")).isEnabled();
        }
    }
}
