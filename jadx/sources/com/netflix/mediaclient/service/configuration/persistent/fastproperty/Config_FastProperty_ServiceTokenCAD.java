package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1045Mp;
import o.C1822aPn;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_ServiceTokenCAD extends aRW {
    public static final c Companion = new c(null);
    @SerializedName("errorCount")
    private int errorCount = 3;
    @SerializedName("isDisabled")
    private boolean isDisabled;

    public final int getErrorCount() {
        return this.errorCount;
    }

    @Override // o.aRW
    public String getName() {
        return "serviceTokenCAD";
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("Config_FastProperty_ServiceTokenCAD");
        }

        public final boolean d() {
            return ((Config_FastProperty_ServiceTokenCAD) C1822aPn.b("serviceTokenCAD")).isDisabled();
        }

        public final int a() {
            return ((Config_FastProperty_ServiceTokenCAD) C1822aPn.b("serviceTokenCAD")).getErrorCount();
        }
    }
}
