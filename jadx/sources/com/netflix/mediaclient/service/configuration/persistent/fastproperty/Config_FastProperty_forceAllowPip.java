package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_forceAllowPip extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("forceEnablePip")
    private boolean forceEnablePip;

    public static final boolean isEnabled() {
        return Companion.c();
    }

    public final boolean getForceEnablePip() {
        return this.forceEnablePip;
    }

    @Override // o.aRW
    public String getName() {
        return "forceAllowPip";
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("Config_FastProperty_forceAllowPip");
        }

        public final boolean c() {
            return ((Config_FastProperty_forceAllowPip) C1822aPn.b("forceAllowPip")).getForceEnablePip();
        }
    }
}
