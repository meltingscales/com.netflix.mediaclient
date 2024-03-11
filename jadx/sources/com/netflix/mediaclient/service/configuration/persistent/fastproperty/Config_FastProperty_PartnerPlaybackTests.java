package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_PartnerPlaybackTests extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;
    @SerializedName("testProperties")
    private JsonObject testProperties = new JsonObject();

    @Override // o.aRW
    public String getName() {
        return "partnerplaybacktests";
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
