package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_EnableLottieRemindMeIcons extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "enableLottieRemindMeIcons";
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean b() {
            aRW b = C1822aPn.b("enableLottieRemindMeIcons");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_EnableLottieRemindMeIcons) b).isEnabled;
        }
    }
}
