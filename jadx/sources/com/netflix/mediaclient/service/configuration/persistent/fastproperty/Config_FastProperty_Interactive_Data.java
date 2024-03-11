package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Interactive_Data extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("isEnabled")
    private boolean enabled;

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // o.aRW
    public String getName() {
        return "interactive_data";
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_Interactive");
        }

        public final boolean c() {
            return ((Config_FastProperty_Interactive_Data) C1822aPn.b("interactive_data")).getEnabled();
        }
    }
}
