package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_AnimatedSplashScreen extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "animated_splash_screen";
    }

    /* loaded from: classes.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean e() {
            aRW b = C1822aPn.b("animated_splash_screen");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_AnimatedSplashScreen) b).isEnabled;
        }
    }
}
