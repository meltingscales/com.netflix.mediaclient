package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_AutoLogin extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;
    @SerializedName("expirationTime")
    private int expirationTime = 3600000;

    public final int getExpirationTime() {
        return this.expirationTime;
    }

    @Override // o.aRW
    public String getName() {
        return "autologin_config";
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final int b() {
            return ((Config_FastProperty_AutoLogin) C1822aPn.b("autologin_config")).getExpirationTime();
        }

        public final boolean a() {
            return ((Config_FastProperty_AutoLogin) C1822aPn.b("autologin_config")).isEnabled();
        }
    }
}
