package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import o.C1822aPn;
import o.C8569dql;
import o.C8627dsp;
import o.aRW;

/* loaded from: classes.dex */
public final class Config_FastProperty_Localization extends aRW {
    public static final d Companion = new d(null);
    @SerializedName("isEnabled")
    private boolean isEnabled = true;
    @SerializedName("removeLocales")
    private List<String> removeLocales = new ArrayList();

    @Override // o.aRW
    public String getName() {
        return "localization";
    }

    public final List<String> getRemoveLocales() {
        return this.removeLocales;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* loaded from: classes.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean a() {
            Config_FastProperty_Localization e = e();
            if (e != null) {
                return e.isEnabled();
            }
            return false;
        }

        public final List<String> d() {
            List<String> i;
            List<String> removeLocales;
            Config_FastProperty_Localization e = e();
            if (e == null || (removeLocales = e.getRemoveLocales()) == null) {
                i = C8569dql.i();
                return i;
            }
            return removeLocales;
        }

        private final Config_FastProperty_Localization e() {
            return (Config_FastProperty_Localization) C1822aPn.b("localization");
        }
    }
}
