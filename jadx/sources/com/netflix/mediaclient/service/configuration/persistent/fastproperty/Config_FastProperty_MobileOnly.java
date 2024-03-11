package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_MobileOnly extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("enableClientCheck")
    private boolean enableClientCheck;
    @SerializedName("safetyNetTokenExpirationTimeInDays")
    private int safetyNetTokenExpirationTimeInDays = 7;

    public static final boolean isClientCheckEnabled() {
        return Companion.c();
    }

    public final boolean getEnableClientCheck() {
        return this.enableClientCheck;
    }

    @Override // o.aRW
    public String getName() {
        return "mobileOnly";
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_MobileOnly");
        }

        public final boolean c() {
            return ((Config_FastProperty_MobileOnly) C1822aPn.b("mobileOnly")).getEnableClientCheck();
        }
    }
}
