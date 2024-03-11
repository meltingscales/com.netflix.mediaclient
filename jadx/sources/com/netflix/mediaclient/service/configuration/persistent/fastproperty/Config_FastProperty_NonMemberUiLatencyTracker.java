package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_NonMemberUiLatencyTracker extends aRW {
    public static final a Companion = new a(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;

    @Override // o.aRW
    public String getName() {
        return "nonmemberuilatencytracker";
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("Config_FastProperty_NonMemberUiLatencyTracker");
        }

        public final boolean b() {
            aRW b = C1822aPn.b("nonmemberuilatencytracker");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_NonMemberUiLatencyTracker) b).isEnabled;
        }
    }
}
