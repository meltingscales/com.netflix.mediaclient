package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_AmazonSingup extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("isEnabled")
    private boolean isEnabled;

    @Override // o.aRW
    public String getName() {
        return "enableInAppAmazonSignups";
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

        public final boolean e() {
            return ((Config_FastProperty_AmazonSingup) C1822aPn.b("enableInAppAmazonSignups")).isEnabled();
        }
    }
}
