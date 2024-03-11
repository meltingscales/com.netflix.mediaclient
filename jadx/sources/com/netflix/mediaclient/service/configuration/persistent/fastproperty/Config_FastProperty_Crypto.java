package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Crypto extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("releaseOnSuspend")
    private boolean releaseOnSuspend = true;
    @SerializedName("releaseOnSuspendForUserInteraction")
    private boolean releaseOnSuspendForUserInteraction = true;
    @SerializedName("releaseOnSuspendForBackgroundLaunch")
    private boolean releaseOnSuspendForBackgroundLaunch = true;
    @SerializedName("enterSuspendForUserInteractionTimeoutInSec")
    private int enterSuspendForUserInteractionTimeoutInMs = 900000;
    @SerializedName("enterSuspendTimeoutForBackgroundLaunchInSec")
    private int enterSuspendForBackgroundLaunchTimeoutInMs = 900000;
    @SerializedName("supportEsnMigrationBetweenDifferentCryptoSecurityLevels")
    private boolean supportEsnMigrationBetweenDifferentCryptoSecurityLevels = true;
    @SerializedName("reportUniqueDeviceIdforWea")
    private boolean reportUniqueDeviceIdforWea = true;
    @SerializedName("enableWidevineV16RecoveryForL1")
    private boolean enableWidevineV16RecoveryForL1 = true;
    @SerializedName("reEnableWidevineL1RecoveryByNewSystemId")
    private boolean reEnableWidevineL1RecoveryByNewSystemId = true;
    @SerializedName("maxNumberOfProvisioningRequest")
    private int maxNumberOfProvisioningRequest = 2;

    public static final int getSuspendTimeoutForBackgroundLaunchInMs() {
        return Companion.b();
    }

    public static final int getSuspendTimeoutForUserInteractionInMs() {
        return Companion.c();
    }

    public static final boolean isEsnMigrationBetweenDifferentCryptoSecurityLevelsSupported() {
        return Companion.e();
    }

    public static final boolean shouldReleaseDrmResourcesOnSuspend() {
        return Companion.j();
    }

    public static final boolean shouldReleaseDrmResourcesOnSuspendForBackgroundLaunch() {
        return Companion.f();
    }

    public static final boolean shouldReleaseDrmResourcesOnSuspendForUserInteraction() {
        return Companion.i();
    }

    public final boolean getEnableWidevineV16RecoveryForL1() {
        return this.enableWidevineV16RecoveryForL1;
    }

    public final int getEnterSuspendForBackgroundLaunchTimeoutInMs() {
        return this.enterSuspendForBackgroundLaunchTimeoutInMs;
    }

    public final int getEnterSuspendForUserInteractionTimeoutInMs() {
        return this.enterSuspendForUserInteractionTimeoutInMs;
    }

    public final int getMaxNumberOfProvisioningRequest() {
        return this.maxNumberOfProvisioningRequest;
    }

    @Override // o.aRW
    public String getName() {
        return "crypto_overrides";
    }

    public final boolean getReEnableWidevineL1RecoveryByNewSystemId() {
        return this.reEnableWidevineL1RecoveryByNewSystemId;
    }

    public final boolean getReleaseOnSuspend() {
        return this.releaseOnSuspend;
    }

    public final boolean getReleaseOnSuspendForBackgroundLaunch() {
        return this.releaseOnSuspendForBackgroundLaunch;
    }

    public final boolean getReleaseOnSuspendForUserInteraction() {
        return this.releaseOnSuspendForUserInteraction;
    }

    public final boolean getReportUniqueDeviceIdforWea() {
        return this.reportUniqueDeviceIdforWea;
    }

    public final boolean getSupportEsnMigrationBetweenDifferentCryptoSecurityLevels() {
        return this.supportEsnMigrationBetweenDifferentCryptoSecurityLevels;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_Config_FastProperty_Crypto");
        }

        public final boolean j() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getReleaseOnSuspend();
        }

        public final boolean i() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getReleaseOnSuspendForUserInteraction();
        }

        public final boolean f() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getReleaseOnSuspendForBackgroundLaunch();
        }

        public final int c() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getEnterSuspendForUserInteractionTimeoutInMs();
        }

        public final int b() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getEnterSuspendForBackgroundLaunchTimeoutInMs();
        }

        public final boolean e() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getSupportEsnMigrationBetweenDifferentCryptoSecurityLevels();
        }

        public final boolean h() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getReportUniqueDeviceIdforWea();
        }

        public final boolean d() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getEnableWidevineV16RecoveryForL1();
        }

        public final boolean g() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getReEnableWidevineL1RecoveryByNewSystemId();
        }

        public final int a() {
            return ((Config_FastProperty_Crypto) C1822aPn.b("crypto_overrides")).getMaxNumberOfProvisioningRequest();
        }
    }
}
