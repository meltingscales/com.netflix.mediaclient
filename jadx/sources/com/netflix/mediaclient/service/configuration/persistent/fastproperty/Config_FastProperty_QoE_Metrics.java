package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1730aMc;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_QoE_Metrics extends aRW {
    public static final c Companion = new c(null);
    private static Boolean sessionEnabled;
    @SerializedName("qoeMetricsSamplingPercentage")
    private int qoeMetricsSamplingPercentage;
    @SerializedName("isImagePerfTraceEnabled")
    private boolean isImagePerfTraceEnabled = true;
    @SerializedName("imagePerfSamplingPercentage")
    private int imagePerfSamplingPercentage = 1;

    public final int getImagePerfSamplingPercentage() {
        return this.imagePerfSamplingPercentage;
    }

    @Override // o.aRW
    public String getName() {
        return "qoe_metrics";
    }

    public final int getQoeMetricsSamplingPercentage() {
        return this.qoeMetricsSamplingPercentage;
    }

    public final boolean isImagePerfTraceEnabled() {
        return this.isImagePerfTraceEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final void d(Boolean bool) {
            Config_FastProperty_QoE_Metrics.sessionEnabled = bool;
        }

        public final Boolean e() {
            return Config_FastProperty_QoE_Metrics.sessionEnabled;
        }

        public final boolean c() {
            if (e() == null) {
                d(Boolean.valueOf(InterfaceC1730aMc.c.e(a().getQoeMetricsSamplingPercentage())));
            }
            Boolean e = e();
            if (e != null) {
                return e.booleanValue();
            }
            return false;
        }

        public final boolean d() {
            return a().isImagePerfTraceEnabled();
        }

        public final int b() {
            return a().getImagePerfSamplingPercentage();
        }

        private final Config_FastProperty_QoE_Metrics a() {
            aRW b = C1822aPn.b("qoe_metrics");
            C8632dsu.a(b, "");
            return (Config_FastProperty_QoE_Metrics) b;
        }
    }
}
