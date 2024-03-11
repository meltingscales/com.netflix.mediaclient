package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_EnableCTAsForGamesBillboardOnTablet extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("isEnabled")
    private boolean isEnabled;

    @Override // o.aRW
    public String getName() {
        return "enable_ctas_for_games_billboard_on_tablet";
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("Config_FastProperty_EnableCTAsForGamesBillboardOnTablet");
        }

        public final boolean b() {
            return ((Config_FastProperty_EnableCTAsForGamesBillboardOnTablet) C1822aPn.b("enable_ctas_for_games_billboard_on_tablet")).isEnabled();
        }
    }
}
