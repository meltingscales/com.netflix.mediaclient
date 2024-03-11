package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_DisplayCutoutDisable extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("DisplayCutoutIsDisabled")
    private boolean DisplayCutoutDisabled;

    public final boolean getDisplayCutoutDisabled() {
        return this.DisplayCutoutDisabled;
    }

    @Override // o.aRW
    public String getName() {
        return "display_cutout_disable_configuration";
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("Config_FastProperty_DisplayCutoutDisable");
        }

        public final boolean a() {
            return ((Config_FastProperty_DisplayCutoutDisable) C1822aPn.b("display_cutout_disable_configuration")).getDisplayCutoutDisabled();
        }
    }
}
