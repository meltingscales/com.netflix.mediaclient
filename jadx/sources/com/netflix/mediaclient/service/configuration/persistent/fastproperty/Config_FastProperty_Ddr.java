package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import o.C1822aPn;
import o.C8566dqi;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Ddr extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("dLdc")
    private List<String> disableLocalDiscoveryCountries;
    @SerializedName("sendDLd")
    private boolean sendDisableLocalDiscovery;
    @SerializedName("isEnabled")
    private boolean isEnabled = true;
    @SerializedName("enableV2Send")
    private boolean enableV2Send = true;
    @SerializedName("enableV2Receive")
    private boolean enableV2Receive = true;
    @SerializedName("enableTargetCheck")
    private boolean enableTargetCheck = true;

    public final List<String> getDisableLocalDiscoveryCountries() {
        return this.disableLocalDiscoveryCountries;
    }

    public final boolean getEnableTargetCheck() {
        return this.enableTargetCheck;
    }

    public final boolean getEnableV2Receive() {
        return this.enableV2Receive;
    }

    public final boolean getEnableV2Send() {
        return this.enableV2Send;
    }

    @Override // o.aRW
    public String getName() {
        return "sultana_ddr_config";
    }

    public final boolean getSendDisableLocalDiscovery() {
        return this.sendDisableLocalDiscovery;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public Config_FastProperty_Ddr() {
        List<String> e2;
        e2 = C8566dqi.e("KR");
        this.disableLocalDiscoveryCountries = e2;
        this.sendDisableLocalDiscovery = true;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean c() {
            return ((Config_FastProperty_Ddr) C1822aPn.b("sultana_ddr_config")).isEnabled();
        }

        public final boolean d() {
            return ((Config_FastProperty_Ddr) C1822aPn.b("sultana_ddr_config")).getEnableV2Send();
        }

        public final boolean b() {
            return ((Config_FastProperty_Ddr) C1822aPn.b("sultana_ddr_config")).getEnableV2Receive();
        }

        public final boolean a() {
            return ((Config_FastProperty_Ddr) C1822aPn.b("sultana_ddr_config")).getEnableTargetCheck();
        }

        public final List<String> e() {
            return ((Config_FastProperty_Ddr) C1822aPn.b("sultana_ddr_config")).getDisableLocalDiscoveryCountries();
        }

        public final boolean g() {
            return ((Config_FastProperty_Ddr) C1822aPn.b("sultana_ddr_config")).getSendDisableLocalDiscovery();
        }
    }
}
