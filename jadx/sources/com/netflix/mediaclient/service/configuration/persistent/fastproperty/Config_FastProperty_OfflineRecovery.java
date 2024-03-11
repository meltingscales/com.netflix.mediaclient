package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_OfflineRecovery extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("osUpgradeRecoveryEnabled")
    private boolean osUpgradeRecoveryEnabled = true;
    @SerializedName("osUpgradeErrorCount")
    private int osUpgradeErrorCount = 1;
    @SerializedName("playableRecoveryEnabled")
    private boolean playableRecoveryEnabled = true;
    @SerializedName("playableErrorCount")
    private int playableErrorCount = 2;

    @Override // o.aRW
    public String getName() {
        return "offlineRecovery";
    }

    public final int getOsUpgradeErrorCount() {
        return this.osUpgradeErrorCount;
    }

    public final boolean getOsUpgradeRecoveryEnabled() {
        return this.osUpgradeRecoveryEnabled;
    }

    public final int getPlayableErrorCount() {
        return this.playableErrorCount;
    }

    public final boolean getPlayableRecoveryEnabled() {
        return this.playableRecoveryEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("offlineRecovery");
        }

        public final boolean b() {
            return ((Config_FastProperty_OfflineRecovery) C1822aPn.b("offlineRecovery")).getOsUpgradeRecoveryEnabled();
        }

        public final int a() {
            return ((Config_FastProperty_OfflineRecovery) C1822aPn.b("offlineRecovery")).getOsUpgradeErrorCount();
        }

        public final boolean d() {
            return ((Config_FastProperty_OfflineRecovery) C1822aPn.b("offlineRecovery")).getPlayableRecoveryEnabled();
        }

        public final int c() {
            return ((Config_FastProperty_OfflineRecovery) C1822aPn.b("offlineRecovery")).getPlayableErrorCount();
        }
    }
}
