package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class ConfigFastPropertyLolomoRowIcon extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("enabled")
    private boolean enabled = true;

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // o.aRW
    public String getName() {
        return "lolomoRowIcon";
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final boolean b() {
            return ((ConfigFastPropertyLolomoRowIcon) C1822aPn.b("lolomoRowIcon")).getEnabled();
        }
    }
}
