package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class ConfigData {
    public ABTestConfigData abTestConfigData;
    public AccountConfigData accountConfig;
    public DeviceConfigData deviceConfig;
    public String featureConfigJson;
    public String fpConfigJson;
    public FtlConfig ftlConfigData;
    public String hendrixConfigJson;
    @SerializedName("nrmInfo")
    public UserCookies nrmInfo;
    @SerializedName("nrmLanguages")
    public NrmLanguagesData nrmLang;
    @SerializedName("signInConfig")
    public SignInConfigData signInConfigData;
    public String streamingConfigJson;
    public String syntheticAllocationJson;

    public ABTestConfigData getABTestConfigData() {
        return this.abTestConfigData;
    }

    public AccountConfigData getAccountConfig() {
        return this.accountConfig;
    }

    public DeviceConfigData getDeviceConfig() {
        return this.deviceConfig;
    }

    public String getFeatureConfigJson() {
        return this.featureConfigJson;
    }

    public String getFpConfig() {
        return this.fpConfigJson;
    }

    public FtlConfig getFtlConfigData() {
        return this.ftlConfigData;
    }

    public String getHendrixConfig() {
        return this.hendrixConfigJson;
    }

    public UserCookies getNrmConfigData() {
        return this.nrmInfo;
    }

    public NrmLanguagesData getNrmLanguagesData() {
        return this.nrmLang;
    }

    public SignInConfigData getSignInConfigData() {
        return this.signInConfigData;
    }

    public String getStreamingConfig() {
        return this.streamingConfigJson;
    }

    public String getSyntheticAllocationConfig() {
        return this.syntheticAllocationJson;
    }

    public String toString() {
        return "ConfigData{deviceConfig=" + this.deviceConfig + ", accountConfig=" + this.accountConfig + ", abTestConfigData=" + this.abTestConfigData + ", streamingConfigJson='" + this.streamingConfigJson + "', ftlConfigData=" + this.ftlConfigData + ", nrmInfo=" + this.nrmInfo + ", nrmLang=" + this.nrmLang + ", signInConfigData=" + this.signInConfigData + ", fpConfigJson='" + this.fpConfigJson + "', featureConfig=" + this.featureConfigJson + ", hendrixConfigJson='" + this.hendrixConfigJson + "'}";
    }
}
