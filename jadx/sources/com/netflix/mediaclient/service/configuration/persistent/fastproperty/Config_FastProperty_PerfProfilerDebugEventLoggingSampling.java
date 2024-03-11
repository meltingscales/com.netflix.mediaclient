package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.InterfaceC1730aMc;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_PerfProfilerDebugEventLoggingSampling extends aRW {
    public static final d Companion = new d(null);
    private static Boolean enabled;
    @SerializedName("samplingPercentage")
    private int samplingPercentage = 20;

    @Override // o.aRW
    public String getName() {
        return "perf_debug_event_log_sampling_config";
    }

    public final int getSamplingPercentage() {
        return this.samplingPercentage;
    }

    /* loaded from: classes.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean b() {
            if (Config_FastProperty_PerfProfilerDebugEventLoggingSampling.enabled == null) {
                Config_FastProperty_PerfProfilerDebugEventLoggingSampling.enabled = Boolean.valueOf(InterfaceC1730aMc.c.e(((Config_FastProperty_PerfProfilerDebugEventLoggingSampling) C1822aPn.b("perf_debug_event_log_sampling_config")).getSamplingPercentage()));
            }
            Boolean bool = Config_FastProperty_PerfProfilerDebugEventLoggingSampling.enabled;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }
}
