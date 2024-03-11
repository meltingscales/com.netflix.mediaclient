package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_PushConsentOnRemindMe extends aRW {
    public static final b Companion = new b(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "pushconsentonremindme";
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean a() {
            aRW b = C1822aPn.b("pushconsentonremindme");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_PushConsentOnRemindMe) b).isEnabled;
        }
    }
}
