package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_AllowHevc extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("isEnabled")
    private boolean enabled;

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // o.aRW
    public String getName() {
        return "allowHevc";
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("Config_FastProperty_AllowHevc");
        }

        public final boolean b() {
            return ((Config_FastProperty_AllowHevc) C1822aPn.b("allowHevc")).getEnabled();
        }
    }
}
