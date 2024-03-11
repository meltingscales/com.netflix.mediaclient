package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_NgpConfig extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("disableNgpDeviceId")
    private boolean disableNgpDeviceId;
    @SerializedName("disableNgpSso")
    private boolean disableNgpSso;
    @SerializedName("disableSharedLogout")
    private boolean disableSharedLogout;

    public final boolean getDisableNgpDeviceId() {
        return this.disableNgpDeviceId;
    }

    public final boolean getDisableNgpSso() {
        return this.disableNgpSso;
    }

    public final boolean getDisableSharedLogout() {
        return this.disableSharedLogout;
    }

    @Override // o.aRW
    public String getName() {
        return "ngpConfig";
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean a() {
            return ((Config_FastProperty_NgpConfig) C1822aPn.b("ngpConfig")).getDisableNgpDeviceId();
        }

        public final boolean c() {
            return ((Config_FastProperty_NgpConfig) C1822aPn.b("ngpConfig")).getDisableNgpSso();
        }

        public final boolean d() {
            return ((Config_FastProperty_NgpConfig) C1822aPn.b("ngpConfig")).getDisableSharedLogout();
        }
    }
}
