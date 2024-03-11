package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_MdxDiscoveryLogging extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("isEnabled")
    private boolean isEnabled;

    @Override // o.aRW
    public String getName() {
        return "mdxDiscoveryLogging";
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_MdxDiscoveryLogging");
        }

        public final boolean d() {
            return ((Config_FastProperty_MdxDiscoveryLogging) C1822aPn.b("mdxDiscoveryLogging")).isEnabled();
        }
    }
}
