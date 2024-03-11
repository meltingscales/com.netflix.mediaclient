package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class ConfigFastPropertyInitialRequestSize extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("requestSize")
    private int requestSize = 4096;
    @SerializedName("useAseConfig")
    private boolean useAseConfig;

    public static final int requestSize() {
        return Companion.e();
    }

    public static final boolean useAseConfig() {
        return Companion.a();
    }

    @Override // o.aRW
    public String getName() {
        return "initialRequestSize";
    }

    public final int getRequestSize() {
        return this.requestSize;
    }

    public final boolean getUseAseConfig() {
        return this.useAseConfig;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean a() {
            return ((ConfigFastPropertyInitialRequestSize) C1822aPn.b("initialRequestSize")).getUseAseConfig();
        }

        public final int e() {
            return ((ConfigFastPropertyInitialRequestSize) C1822aPn.b("initialRequestSize")).getRequestSize();
        }
    }
}
