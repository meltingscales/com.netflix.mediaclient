package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_DarkKidsTheme extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    public static final boolean isEnabled() {
        return Companion.b();
    }

    @Override // o.aRW
    public String getName() {
        return "darkkidstheme";
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean b() {
            aRW b = C1822aPn.b("darkkidstheme");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_DarkKidsTheme) b).isEnabled;
        }
    }
}
