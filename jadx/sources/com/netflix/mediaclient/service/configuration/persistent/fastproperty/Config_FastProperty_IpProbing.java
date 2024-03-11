package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.animations.Ease;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_IpProbing extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("killForAll")
    private boolean killForAll;
    @SerializedName("enabled")
    private boolean enabled = true;
    @SerializedName("endpoint")
    private String endpoint = "android.prod.cloud.netflix.com";
    @SerializedName(Ease.ANIMATION_EASE_TYPE.PATH)
    private String path = "/wolfboot";
    @SerializedName("enableIpv6")
    private boolean enableIpv6 = true;
    @SerializedName("enableIpv4")
    private boolean enableIpv4 = true;

    public final boolean getEnableIpv4() {
        return this.enableIpv4;
    }

    public final boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final boolean getKillForAll() {
        return this.killForAll;
    }

    @Override // o.aRW
    public String getName() {
        return "ipprobe";
    }

    public final String getPath() {
        return this.path;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean d() {
            return i().getKillForAll();
        }

        public final boolean a() {
            return i().getEnabled();
        }

        public final boolean c() {
            return i().getEnableIpv4();
        }

        public final boolean f() {
            return i().getEnableIpv6();
        }

        public final String e() {
            return i().getEndpoint();
        }

        public final String b() {
            return i().getPath();
        }

        private final Config_FastProperty_IpProbing i() {
            return (Config_FastProperty_IpProbing) C1822aPn.b("ipprobe");
        }
    }
}
