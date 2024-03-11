package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import o.C1822aPn;
import o.aRW;

/* loaded from: classes.dex */
public class Config_FastProperty_MdxOnlyDeviceEsnPrefixes extends aRW {
    @SerializedName("mdxOnlyDeviceEsnPrefixes")
    public String[] mdxOnlyDeviceEsnPrefixes = new String[0];

    @Override // o.aRW
    public String getName() {
        return "mdxOnlyDeviceEsnPrefixes";
    }

    public static String[] getMdxOnlyDeviceEsnPrefixes() {
        Config_FastProperty_MdxOnlyDeviceEsnPrefixes config_FastProperty_MdxOnlyDeviceEsnPrefixes = (Config_FastProperty_MdxOnlyDeviceEsnPrefixes) C1822aPn.b("mdxOnlyDeviceEsnPrefixes");
        return config_FastProperty_MdxOnlyDeviceEsnPrefixes != null ? config_FastProperty_MdxOnlyDeviceEsnPrefixes.mdxOnlyDeviceEsnPrefixes : new String[0];
    }
}
