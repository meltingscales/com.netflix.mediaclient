package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_SmartDisplay extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("pushNotificationEnabled")
    private boolean pushNotificationEnabled;
    @SerializedName("voipCallEnabled")
    private boolean voipCallEnabled;
    @SerializedName("isEnabled")
    private boolean isEnabled = true;
    @SerializedName("wsPushTokenTtlInMs")
    private int wsPushTokenTtlInMs = 25200000;
    @SerializedName("wsRefreshPushTokenOnOpen")
    private boolean wsRefreshPushTokenOnOpen = true;
    @SerializedName("stopDiscoveryOnBackgrounding")
    private boolean stopDiscoveryOnBackgrounding = true;

    @Override // o.aRW
    public String getName() {
        return "smartdisplay_config";
    }

    public final boolean getPushNotificationEnabled() {
        return this.pushNotificationEnabled;
    }

    public final boolean getVoipCallEnabled() {
        return this.voipCallEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final boolean c() {
            return ((Config_FastProperty_SmartDisplay) C1822aPn.b("smartdisplay_config")).getVoipCallEnabled();
        }

        public final boolean e() {
            return ((Config_FastProperty_SmartDisplay) C1822aPn.b("smartdisplay_config")).getPushNotificationEnabled();
        }
    }
}
