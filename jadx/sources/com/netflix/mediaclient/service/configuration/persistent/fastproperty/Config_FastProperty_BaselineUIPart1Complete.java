package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_BaselineUIPart1Complete extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "baseline_ui_part_1_complete";
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean c() {
            aRW b = C1822aPn.b("baseline_ui_part_1_complete");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_BaselineUIPart1Complete) b).isEnabled;
        }
    }
}
