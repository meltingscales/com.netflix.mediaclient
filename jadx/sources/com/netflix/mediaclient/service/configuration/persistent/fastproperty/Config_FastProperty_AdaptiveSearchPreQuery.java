package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_AdaptiveSearchPreQuery extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "adaptive_search_prequery";
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean b() {
            aRW b = C1822aPn.b("adaptive_search_prequery");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_AdaptiveSearchPreQuery) b).isEnabled;
        }
    }
}
