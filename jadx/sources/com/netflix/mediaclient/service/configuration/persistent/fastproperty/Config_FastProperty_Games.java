package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Games extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("isGamesBillboardBaselineUiEnabled")
    private boolean isGamesBillboardBaselineUiEnabled;
    @SerializedName("lowestSupportedMaturityLevel")
    private int lowestSupportedMaturityLevel = 80;
    @SerializedName("isGdpModesUpdateEnabled")
    private boolean isGdpModesUpdateEnabled = true;

    public final int getLowestSupportedMaturityLevel() {
        return this.lowestSupportedMaturityLevel;
    }

    @Override // o.aRW
    public String getName() {
        return "games_config";
    }

    public final boolean isGamesBillboardBaselineUiEnabled() {
        return this.isGamesBillboardBaselineUiEnabled;
    }

    public final boolean isGdpModesUpdateEnabled() {
        return this.isGdpModesUpdateEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_Games");
        }

        public final int b() {
            return ((Config_FastProperty_Games) C1822aPn.b("games_config")).getLowestSupportedMaturityLevel();
        }

        public final boolean d() {
            return ((Config_FastProperty_Games) C1822aPn.b("games_config")).isGamesBillboardBaselineUiEnabled();
        }

        public final boolean e() {
            return ((Config_FastProperty_Games) C1822aPn.b("games_config")).isGdpModesUpdateEnabled();
        }
    }
}
