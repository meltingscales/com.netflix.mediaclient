package com.netflix.mediaclient.service.configuration.persistent.fastproperty;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C1822aPn;
import o.aRW;

/* loaded from: classes.dex */
public class Config_FastProperty_PlaybackConfig extends aRW {
    @SerializedName("enableLiveHevcOnCapableDevices")
    public Boolean enableLiveHevcOnCapableDevices;
    @SerializedName("maxSegmentsToProbe404")
    public Integer maxSegmentsToProbe404;
    @SerializedName("nocacheLive")
    public Boolean nocacheLive;
    @SerializedName("requestLive")
    public Boolean requestLive;
    @SerializedName("useLiveEventOffset")
    public Boolean useLiveEventOffset;
    @SerializedName("licensedManifestPrefetch")
    public boolean licensedManifestPrefetch = true;
    @SerializedName("licensedManifestStandard")
    public boolean licensedManifestStandard = true;
    @SerializedName("useInAppWidevineForStreamingAsDefault")
    public boolean useInAppWidevineForStreamingAsDefault = false;
    @SerializedName("useInAppWidevineForOfflineAsDefault")
    public boolean useInAppWidevineForOfflineAsDefault = false;
    @SerializedName("playbackRetryErrors")
    public Map<String, List<String>> playbackRetryErrors = Collections.emptyMap();

    @Override // o.aRW
    public String getName() {
        return "playbackconfig";
    }

    public Config_FastProperty_PlaybackConfig() {
        Boolean bool = Boolean.TRUE;
        this.requestLive = bool;
        this.nocacheLive = bool;
        this.useLiveEventOffset = bool;
        this.maxSegmentsToProbe404 = 30;
        this.enableLiveHevcOnCapableDevices = Boolean.FALSE;
    }

    public static boolean licensedManifestPrefetch() {
        Config_FastProperty_PlaybackConfig config_FastProperty_PlaybackConfig = (Config_FastProperty_PlaybackConfig) C1822aPn.b("playbackconfig");
        if (config_FastProperty_PlaybackConfig != null) {
            return config_FastProperty_PlaybackConfig.licensedManifestPrefetch;
        }
        return true;
    }

    public static boolean licensedManifestStandard() {
        Config_FastProperty_PlaybackConfig config_FastProperty_PlaybackConfig = (Config_FastProperty_PlaybackConfig) C1822aPn.b("playbackconfig");
        if (config_FastProperty_PlaybackConfig != null) {
            return config_FastProperty_PlaybackConfig.licensedManifestStandard;
        }
        return true;
    }

    public static boolean requestLive() {
        Config_FastProperty_PlaybackConfig config_FastProperty_PlaybackConfig = (Config_FastProperty_PlaybackConfig) C1822aPn.b("playbackconfig");
        if (config_FastProperty_PlaybackConfig != null) {
            return config_FastProperty_PlaybackConfig.requestLive.booleanValue();
        }
        return true;
    }

    public static boolean nocacheLive() {
        Config_FastProperty_PlaybackConfig config_FastProperty_PlaybackConfig = (Config_FastProperty_PlaybackConfig) C1822aPn.b("playbackconfig");
        if (config_FastProperty_PlaybackConfig != null) {
            return config_FastProperty_PlaybackConfig.nocacheLive.booleanValue();
        }
        return true;
    }

    public static boolean useLiveEventOffset() {
        Config_FastProperty_PlaybackConfig config_FastProperty_PlaybackConfig = (Config_FastProperty_PlaybackConfig) C1822aPn.b("playbackconfig");
        if (config_FastProperty_PlaybackConfig != null) {
            return config_FastProperty_PlaybackConfig.useLiveEventOffset.booleanValue();
        }
        return true;
    }

    public static int maxSegmentsToProbe404() {
        Config_FastProperty_PlaybackConfig config_FastProperty_PlaybackConfig = (Config_FastProperty_PlaybackConfig) C1822aPn.b("playbackconfig");
        if (config_FastProperty_PlaybackConfig != null) {
            return config_FastProperty_PlaybackConfig.maxSegmentsToProbe404.intValue();
        }
        return 30;
    }

    public static boolean enableLiveHevcOnCapableDevices() {
        Config_FastProperty_PlaybackConfig config_FastProperty_PlaybackConfig = (Config_FastProperty_PlaybackConfig) C1822aPn.b("playbackconfig");
        if (config_FastProperty_PlaybackConfig != null) {
            return config_FastProperty_PlaybackConfig.enableLiveHevcOnCapableDevices.booleanValue();
        }
        return false;
    }

    public static boolean shouldRetryPlaybackError(String str, String str2) {
        for (String str3 : getErrorCodePrefixList(str)) {
            if (str2.startsWith(str3)) {
                return true;
            }
        }
        for (String str4 : getErrorCodePrefixList("common")) {
            if (str2.startsWith(str4)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> getErrorCodePrefixList(String str) {
        List<String> list;
        Config_FastProperty_PlaybackConfig config_FastProperty_PlaybackConfig = (Config_FastProperty_PlaybackConfig) C1822aPn.b("playbackconfig");
        return (config_FastProperty_PlaybackConfig == null || (list = config_FastProperty_PlaybackConfig.playbackRetryErrors.get(str)) == null) ? Collections.emptyList() : list;
    }
}
