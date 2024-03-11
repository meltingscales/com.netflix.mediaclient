package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import o.C1822aPn;
import o.aRW;

/* loaded from: classes.dex */
public class Config_FastProperty_Ftl extends aRW {
    @SerializedName(VisualStateDefinition.ELEMENT_STATE.DISABLED)
    public boolean disabled = false;

    @Override // o.aRW
    public String getName() {
        return "ftl";
    }

    public static boolean enabled() {
        Config_FastProperty_Ftl config_FastProperty_Ftl = (Config_FastProperty_Ftl) C1822aPn.b("ftl");
        return config_FastProperty_Ftl == null || !config_FastProperty_Ftl.disabled;
    }
}
