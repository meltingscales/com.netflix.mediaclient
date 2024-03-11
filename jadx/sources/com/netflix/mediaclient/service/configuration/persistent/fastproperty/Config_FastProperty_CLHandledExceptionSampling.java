package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_CLHandledExceptionSampling extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("percentage")
    private int monitoringEventsClPercentage = 100;
    @SerializedName("highVolumeMonitoringEventsClPercentage")
    private int highVolumeMonitoringEventsClPercentage = 1;
    @SerializedName("errorEventsClPercentage")
    private int errorEventsClPercentage = 100;
    @SerializedName("highVolumeErrorEventsClPercentage")
    private int highVolumeErrorEventsClPercentage = 1;
    @SerializedName("errorEventsBugsnagPercentage")
    private int errorEventsBugsnagPercentage = 100;
    @SerializedName("highVolumeErrorEventsBugsnagPercentage")
    private int highVolumeErrorEventsBugsnagPercentage = 1;
    @SerializedName("shouldFilterBlocklistedCrashes")
    private boolean shouldFilterBlocklistedCrashes = true;
    @SerializedName("blocklistedMessageKeys")
    private List<String> blocklistedMessageKeys = new ArrayList();

    public final List<String> getBlocklistedMessageKeys() {
        return this.blocklistedMessageKeys;
    }

    public final int getErrorEventsBugsnagPercentage() {
        return this.errorEventsBugsnagPercentage;
    }

    public final int getErrorEventsClPercentage() {
        return this.errorEventsClPercentage;
    }

    public final int getHighVolumeErrorEventsBugsnagPercentage() {
        return this.highVolumeErrorEventsBugsnagPercentage;
    }

    public final int getHighVolumeErrorEventsClPercentage() {
        return this.highVolumeErrorEventsClPercentage;
    }

    public final int getHighVolumeMonitoringEventsClPercentage() {
        return this.highVolumeMonitoringEventsClPercentage;
    }

    public final int getMonitoringEventsClPercentage() {
        return this.monitoringEventsClPercentage;
    }

    @Override // o.aRW
    public String getName() {
        return "clhe_sampling_config";
    }

    public final boolean getShouldFilterBlocklistedCrashes() {
        return this.shouldFilterBlocklistedCrashes;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final Config_FastProperty_CLHandledExceptionSampling a() {
            aRW b = C1822aPn.b("clhe_sampling_config");
            C8632dsu.a(b, "");
            return (Config_FastProperty_CLHandledExceptionSampling) b;
        }
    }
}
