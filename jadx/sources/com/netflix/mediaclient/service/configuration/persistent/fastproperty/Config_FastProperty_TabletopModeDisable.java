package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_TabletopModeDisable extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("TabletopModeDisabled")
    private boolean TabletopModeDisabled;

    @Override // o.aRW
    public String getName() {
        return "tabletop_mode_disable";
    }

    public final boolean getTabletopModeDisabled() {
        return this.TabletopModeDisabled;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_TabletopModeDisable");
        }

        public final boolean b() {
            return ((Config_FastProperty_TabletopModeDisable) C1822aPn.b("tabletop_mode_disable")).getTabletopModeDisabled();
        }
    }
}
