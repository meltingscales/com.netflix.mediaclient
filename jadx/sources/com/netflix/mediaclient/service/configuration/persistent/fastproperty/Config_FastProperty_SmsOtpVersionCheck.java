package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_SmsOtpVersionCheck extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("minVersionNumber")
    private int minVersionNumber = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public final int getMinVersionNumber() {
        return this.minVersionNumber;
    }

    @Override // o.aRW
    public String getName() {
        return "smsotpversioncheck";
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("Config_FastProperty_SmsOtpVersionCheck");
        }

        public final int c() {
            return ((Config_FastProperty_SmsOtpVersionCheck) C1822aPn.b("smsotpversioncheck")).getMinVersionNumber();
        }
    }
}
