package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_GameControllerMagicPath extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("deeplinkEnabled")
    private boolean deeplinkEnabled;

    public final boolean getDeeplinkEnabled() {
        return this.deeplinkEnabled;
    }

    @Override // o.aRW
    public String getName() {
        return "game_controller_magic_path";
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("Config_FastProperty_GameControllerMagicPath");
        }

        public final boolean d() {
            return ((Config_FastProperty_GameControllerMagicPath) C1822aPn.b("game_controller_magic_path")).getDeeplinkEnabled();
        }
    }
}
