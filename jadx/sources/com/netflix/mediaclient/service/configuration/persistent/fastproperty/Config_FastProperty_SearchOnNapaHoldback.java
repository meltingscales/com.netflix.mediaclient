package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_SearchOnNapaHoldback extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("automationTestOnNapa")
    private final boolean runAutomationOnNapa = true;

    @Override // o.aRW
    public String getName() {
        return "search_on_napa_activate";
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("Config_FastProperty_SearchOnNapaHoldback");
        }
    }
}
