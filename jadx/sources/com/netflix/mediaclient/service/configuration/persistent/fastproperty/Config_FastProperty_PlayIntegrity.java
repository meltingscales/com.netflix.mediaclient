package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_PlayIntegrity extends aRW {
    public static final a Companion = new a(null);
    @SerializedName(VisualStateDefinition.ELEMENT_STATE.DISABLED)
    private boolean disabled;
    @SerializedName("startAttestationWithDelay")
    private boolean startAttestationWithDelay;
    @SerializedName("renewTimeoutInHours")
    private int renewTimeoutInHours = 168;
    @SerializedName("tokenExpirationTimeInDays")
    private int tokenExpirationTimeInDays = 14;
    @SerializedName("attestationTimeoutInMs")
    private long attestationTimeoutInMs = 10000;

    public final boolean getDisabled() {
        return this.disabled;
    }

    @Override // o.aRW
    public String getName() {
        return "playIntegrity";
    }

    public final int getRenewTimeoutInHours() {
        return this.renewTimeoutInHours;
    }

    public final boolean getStartAttestationWithDelay() {
        return this.startAttestationWithDelay;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_PlayIntegrity");
        }

        private final Config_FastProperty_PlayIntegrity b() {
            aRW b = C1822aPn.b("playIntegrity");
            C8632dsu.a(b, "");
            return (Config_FastProperty_PlayIntegrity) b;
        }

        public final boolean e() {
            return b().getDisabled();
        }

        public final int c() {
            return b().getRenewTimeoutInHours();
        }

        public final boolean a() {
            return b().getStartAttestationWithDelay();
        }
    }
}
