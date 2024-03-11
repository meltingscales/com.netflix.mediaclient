package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.C8627dsp;
import o.C8632dsu;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_RecordRdid extends aRW {
    public static final e Companion = new e(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;
    @SerializedName("updateCadence")
    private long updateCadence = 86400000;

    @Override // o.aRW
    public String getName() {
        return "recordrdid";
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean c() {
            aRW b = C1822aPn.b("recordrdid");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_RecordRdid) b).isEnabled;
        }

        public final long b() {
            aRW b = C1822aPn.b("recordrdid");
            C8632dsu.a(b, "");
            return ((Config_FastProperty_RecordRdid) b).updateCadence;
        }
    }
}
