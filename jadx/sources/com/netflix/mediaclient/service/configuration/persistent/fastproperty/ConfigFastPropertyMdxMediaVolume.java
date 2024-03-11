package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class ConfigFastPropertyMdxMediaVolume extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("enabled")
    private boolean enabled;

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // o.aRW
    public String getName() {
        return "mdxMediaVolume";
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean e() {
            return ((ConfigFastPropertyMdxMediaVolume) C1822aPn.b("mdxMediaVolume")).getEnabled();
        }
    }
}
