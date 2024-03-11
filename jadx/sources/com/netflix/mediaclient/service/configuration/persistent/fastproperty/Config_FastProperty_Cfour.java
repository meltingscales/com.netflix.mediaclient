package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Cfour extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("useSafeModalCopy")
    private boolean useSafeModalCopy;

    @Override // o.aRW
    public String getName() {
        return "cfour";
    }

    public final boolean getUseSafeModalCopy() {
        return this.useSafeModalCopy;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("Config_FastProperty_Cfour");
        }

        public final boolean a() {
            return ((Config_FastProperty_Cfour) C1822aPn.b("cfour")).getUseSafeModalCopy();
        }
    }
}
