package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_EnableFalkorLolomoImagesPrefetchHelper extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("enabled")
    private boolean enabled = true;

    @Override // o.aRW
    public String getName() {
        return "falkor-lolomo-images-prefetcher";
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("Config_FastProperty_EnableFalkorLolomoImagesPrefetchHelper");
        }
    }
}
