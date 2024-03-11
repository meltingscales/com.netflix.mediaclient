package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_AndroidGamesCustomPlayStoreUrl extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "androidgamescustomplaystoreurl";
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final boolean d() {
            aRW b = C1822aPn.b("androidgamescustomplaystoreurl");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_AndroidGamesCustomPlayStoreUrl) b).isEnabled;
        }
    }
}
