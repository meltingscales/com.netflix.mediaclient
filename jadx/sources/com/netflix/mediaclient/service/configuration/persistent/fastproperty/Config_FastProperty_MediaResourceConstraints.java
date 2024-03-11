package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_MediaResourceConstraints extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("hasLowAudioResources")
    private boolean hasLowAudioResources;

    public final boolean getHasLowAudioResources() {
        return this.hasLowAudioResources;
    }

    @Override // o.aRW
    public String getName() {
        return "media_resource_constraints";
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean b() {
            return ((Config_FastProperty_MediaResourceConstraints) C1822aPn.b("media_resource_constraints")).getHasLowAudioResources();
        }
    }
}
