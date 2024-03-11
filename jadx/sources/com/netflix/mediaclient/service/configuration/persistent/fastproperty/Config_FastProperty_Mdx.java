package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Mdx extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("removeCallbackOnBackground")
    private boolean removeCallbackOnBackground;
    @SerializedName("activeCastScanAlways")
    private boolean activeCastScanAlways = true;
    @SerializedName("retrySelectRouteMaxNumber")
    private int retrySelectRouteMaxNumber = 3;

    public static final int getMaximalNumberOfRetriesForCastSelectRoute() {
        return Companion.e();
    }

    public static final boolean shouldCastScanActivelyAlways() {
        return Companion.b();
    }

    public static final boolean shouldRemoveCallbackOnBackground() {
        return Companion.d();
    }

    public final boolean getActiveCastScanAlways() {
        return this.activeCastScanAlways;
    }

    @Override // o.aRW
    public String getName() {
        return "mdxConfig";
    }

    public final boolean getRemoveCallbackOnBackground() {
        return this.removeCallbackOnBackground;
    }

    public final int getRetrySelectRouteMaxNumber() {
        return this.retrySelectRouteMaxNumber;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("Config_FastProperty_Mdx");
        }

        public final boolean b() {
            return ((Config_FastProperty_Mdx) C1822aPn.b("mdxConfig")).getActiveCastScanAlways();
        }

        public final boolean d() {
            return ((Config_FastProperty_Mdx) C1822aPn.b("mdxConfig")).getRemoveCallbackOnBackground();
        }

        public final int e() {
            return ((Config_FastProperty_Mdx) C1822aPn.b("mdxConfig")).getRetrySelectRouteMaxNumber();
        }
    }
}
