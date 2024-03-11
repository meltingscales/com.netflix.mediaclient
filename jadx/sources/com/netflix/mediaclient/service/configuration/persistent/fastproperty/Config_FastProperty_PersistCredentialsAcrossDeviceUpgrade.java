package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_PersistCredentialsAcrossDeviceUpgrade extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("clearStoredData")
    private boolean clearStoredData;
    @SerializedName("isEnabled")
    private boolean isEnabled = true;
    @SerializedName("tokenRefreshCadence")
    private long tokenRefreshCadence = 604800000;

    @Override // o.aRW
    public String getName() {
        return "persistcredentialsacrossdeviceupgrade";
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean e() {
            aRW b = C1822aPn.b("persistcredentialsacrossdeviceupgrade");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_PersistCredentialsAcrossDeviceUpgrade) b).isEnabled;
        }

        public final long d() {
            aRW b = C1822aPn.b("persistcredentialsacrossdeviceupgrade");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_PersistCredentialsAcrossDeviceUpgrade) b).tokenRefreshCadence;
        }

        public final boolean b() {
            aRW b = C1822aPn.b("persistcredentialsacrossdeviceupgrade");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_PersistCredentialsAcrossDeviceUpgrade) b).clearStoredData;
        }
    }
}
