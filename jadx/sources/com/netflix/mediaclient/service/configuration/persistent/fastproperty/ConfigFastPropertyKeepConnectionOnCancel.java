package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class ConfigFastPropertyKeepConnectionOnCancel extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("enabled")
    private boolean enabled;

    public static final boolean enabled() {
        return Companion.c();
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // o.aRW
    public String getName() {
        return "keepConnectionOnCancel";
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean c() {
            return ((ConfigFastPropertyKeepConnectionOnCancel) C1822aPn.b("keepConnectionOnCancel")).getEnabled();
        }
    }
}
