package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_ConsumptionOnlyHelpCenter extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("showAccountLinks")
    private boolean showAccountLinks = true;

    @Override // o.aRW
    public String getName() {
        return "consumptiononlyhelpcenter";
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final boolean c() {
            aRW b = C1822aPn.b("consumptiononlyhelpcenter");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_ConsumptionOnlyHelpCenter) b).showAccountLinks;
        }
    }
}
