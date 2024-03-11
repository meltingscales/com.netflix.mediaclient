package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_DeviceConfigData;
import java.util.Collections;
import java.util.List;
import o.C8118deO;

/* loaded from: classes.dex */
public abstract class DeviceConfigData {
    public static final boolean DEFAULT_ALLOW_HEVC_MOBILE = false;
    private static final String TAG = "DeviceConfigData";

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract DeviceConfigData build();

        public abstract Builder setDisableAccurateStartPoint(boolean z);

        public abstract Builder setForcedDeviceCategory(String str);

        public abstract Builder setGetAppMinVersion(int i);

        public abstract Builder setGetAppRecommendedVersion(int i);

        public abstract Builder setGetAppUpdateDialogFreqDays(int i);

        public abstract Builder setGetAudioFormats(int i);

        public abstract Builder setGetBreadcrumbLoggingSpecifications(List<BreadcrumbLoggingSpecification> list);

        public abstract Builder setGetChannelIdViaConfig(String str);

        public abstract Builder setGetConsolidatedloggingSpecification(List<ConsolidatedLoggingSessionSpecification> list);

        public abstract Builder setGetDisableLicensePrefetch(boolean z);

        public abstract Builder setGetEnableLocalPlayback(boolean z);

        public abstract Builder setGetEnableMdxRemoteControlLockScreen(boolean z);

        public abstract Builder setGetEnableMdxRemoteControlNotification(boolean z);

        public abstract Builder setGetErrorLoggingSpecifications(List<ErrorLoggingSpecification> list);

        public abstract Builder setGetGeoCountryCode(String str);

        public abstract Builder setGetImagePref(String str);

        public abstract Builder setGetLolomoCacheExpirationOverride(int i);

        public abstract Builder setGetLolomoPrefetchIntervalOverride(int i);

        public abstract Builder setGetMaxAppLifeDays(int i);

        public abstract Builder setGetMaxVideoBufferSize(int i);

        public abstract Builder setGetMdxDisabled(boolean z);

        public abstract Builder setGetMobileOnlyMinVersionCode(int i);

        public abstract Builder setGetOfflineConfig(OfflineConfig offlineConfig);

        public abstract Builder setGetRateLimitForGcmBrowseEvents(int i);

        public abstract Builder setGetRateLimitForGcmNListChangeEvents(int i);

        public abstract Builder setGetSignUpTimeout(String str);

        public abstract Builder setGetSuppressedLogblobs(List<String> list);

        public abstract Builder setGetUserSessionTimeoutDuration(int i);

        public abstract Builder setGetVideoResolutionOverride(int i);

        public abstract Builder setGetVoipConfiguration(VoipConfiguration voipConfiguration);

        public abstract Builder setGetVoipInstallDeadlineInDays(int i);

        public abstract Builder setGetWebsocketDisabled(String str);

        public abstract Builder setIsAV1Enabled(boolean z);

        public abstract Builder setIsAV1HDEnabled(boolean z);

        public abstract Builder setIsAV1Hdr10PlusEnabled(boolean z);

        public abstract Builder setIsAllowHevcMobile(boolean z);

        public abstract Builder setIsBlacklisted(boolean z);

        public abstract Builder setIsConsumptionOnly(boolean z);

        public abstract Builder setIsDisableLegacyNetflixMdx(boolean z);

        public abstract Builder setIsDolbyVisionEnabled(boolean z);

        public abstract Builder setIsEnableOfflineSecureDelete(boolean z);

        public abstract Builder setIsEnabledWidevineL3SystemId4266(boolean z);

        public abstract Builder setIsHdr10Enabled(boolean z);

        public abstract Builder setIsHdrBrightnessBoostEnabled(boolean z);

        public abstract Builder setIsPhonePortraitLockEnabled(boolean z);

        public abstract Builder setIsPlayBillingDisabled(boolean z);

        public abstract Builder setIsVoipEnabledOnDevice(boolean z);

        public abstract Builder setIsWidevineL1Enabled(boolean z);

        public abstract Builder setIsWidevineL1ReEnabled(boolean z);

        public abstract Builder setMultiChannelOffline(boolean z);

        public abstract Builder setPartnerIntegrationConfig(PartnerIntegrationConfig partnerIntegrationConfig);

        public abstract Builder setPdsAndLogblobConfig(PdsAndLogblobConfig pdsAndLogblobConfig);

        public abstract Builder setShouldAllowTabletPortraitPlayback(boolean z);

        public abstract Builder setShouldDisableAmazonADM(boolean z);

        public abstract Builder setShouldDisablePip(boolean z);

        public abstract Builder setShouldDisableRoar(boolean z);

        public abstract Builder setShouldForceLegacyCrypto(boolean z);

        public abstract Builder setShouldGetNrmViaMsl(boolean z);
    }

    @SerializedName("disableAccurateStartPoint")
    public abstract boolean disableAccurateStartPoint();

    @SerializedName("forcedDeviceCategory")
    public abstract String forcedDeviceCategory();

    @SerializedName("min_version")
    public abstract int getAppMinVersion();

    @SerializedName("current_version")
    public abstract int getAppRecommendedVersion();

    @SerializedName("appUpdateDialogFreqDays")
    public abstract int getAppUpdateDialogFreqDays();

    @SerializedName("audioFormats")
    public abstract int getAudioFormats();

    @SerializedName("breadcrumb_logging_config")
    public abstract List<BreadcrumbLoggingSpecification> getBreadcrumbLoggingSpecifications();

    @SerializedName("channelIdViaConfig")
    public abstract String getChannelIdViaConfig();

    @SerializedName("consolidated_logging_specification")
    public abstract List<ConsolidatedLoggingSessionSpecification> getConsolidatedloggingSpecification();

    @SerializedName("disableLicensePrefetch")
    public abstract boolean getDisableLicensePrefetch();

    @SerializedName("enableLocalPlayback")
    public abstract boolean getEnableLocalPlayback();

    @SerializedName("enableMdxRemoteControlLockScreen")
    public abstract boolean getEnableMdxRemoteControlLockScreen();

    @SerializedName("enableMdxRemoteControlNotification")
    public abstract boolean getEnableMdxRemoteControlNotification();

    @SerializedName("error_logging_config")
    public abstract List<ErrorLoggingSpecification> getErrorLoggingSpecifications();

    @SerializedName("geoCountryCode")
    public abstract String getGeoCountryCode();

    @SerializedName("image_pref")
    public abstract String getImagePref();

    @SerializedName("lolomoCacheExpirationOverride")
    public abstract int getLolomoCacheExpirationOverride();

    @SerializedName("lolomoPrefetchIntervalOverride")
    public abstract int getLolomoPrefetchIntervalOverride();

    @SerializedName("maxAppLifeDays")
    public abstract int getMaxAppLifeDays();

    @SerializedName("maxVideoBufferSize")
    public abstract int getMaxVideoBufferSize();

    @SerializedName("disable_mdx")
    public abstract boolean getMdxDisabled();

    @SerializedName("mobileOnlyMinVersionCode")
    public abstract int getMobileOnlyMinVersionCode();

    @SerializedName("offlineConfig")
    public abstract OfflineConfig getOfflineConfig();

    @SerializedName("gcmBrowseEventRateLimitInSecs")
    public abstract int getRateLimitForGcmBrowseEvents();

    @SerializedName("gcmNListChangeEventRateLimitInSecs")
    public abstract int getRateLimitForGcmNListChangeEvents();

    @SerializedName("signup_timeout")
    public abstract String getSignUpTimeout();

    @SerializedName("suppressedLogblobs")
    public abstract List<String> getSuppressedLogblobs();

    @SerializedName("user_session_timeout_duration")
    public abstract int getUserSessionTimeoutDuration();

    @SerializedName("videoResolutionOverride")
    public abstract int getVideoResolutionOverride();

    @SerializedName("voipConfig")
    public abstract VoipConfiguration getVoipConfiguration();

    @SerializedName("voipInstallDeadlineInDays")
    public abstract int getVoipInstallDeadlineInDays();

    @SerializedName("disable_websocket")
    public abstract String getWebsocketDisabled();

    @SerializedName("enableAV1")
    public abstract boolean isAV1Enabled();

    @SerializedName("enableAV1HD")
    public abstract boolean isAV1HDEnabled();

    @SerializedName("enableAV1Hdr10Plus")
    public abstract boolean isAV1Hdr10PlusEnabled();

    @SerializedName("allowHevcMobile")
    public abstract boolean isAllowHevcMobile();

    @SerializedName("isBlacklisted")
    public abstract boolean isBlacklisted();

    @SerializedName("isConsumptionOnly")
    public abstract boolean isConsumptionOnly();

    @SerializedName("disableLegacyNetflixMdx")
    public abstract boolean isDisableLegacyNetflixMdx();

    @SerializedName("enableDolbyVision")
    public abstract boolean isDolbyVisionEnabled();

    @SerializedName("enableOfflineSecureDelete")
    public abstract boolean isEnableOfflineSecureDelete();

    @SerializedName("enableWidevineL3SystemId4266")
    public abstract boolean isEnabledWidevineL3SystemId4266();

    @SerializedName("enableHdr10")
    public abstract boolean isHdr10Enabled();

    @SerializedName("enableHdrBrightnessBoost")
    public abstract boolean isHdrBrightnessBoostEnabled();

    @SerializedName("lockPhonePortraitEnabled")
    public abstract boolean isPhonePortraitLockEnabled();

    @SerializedName("disablePlayBilling")
    public abstract boolean isPlayBillingDisabled();

    @SerializedName("voipEnabledOnDevice")
    public abstract boolean isVoipEnabledOnDevice();

    @SerializedName("enableWidevineL1")
    public abstract boolean isWidevineL1Enabled();

    @SerializedName("reEnableWidevineL1")
    public abstract boolean isWidevineL1ReEnabled();

    @SerializedName("multiChannelOffline")
    public abstract boolean multiChannelOffline();

    @SerializedName("partnerIntegrationConfig")
    public abstract PartnerIntegrationConfig partnerIntegrationConfig();

    @SerializedName("pdsAndLogblobConfig")
    public abstract PdsAndLogblobConfig pdsAndLogblobConfig();

    @SerializedName("allowTabletPortraitPlayback")
    public abstract boolean shouldAllowTabletPortraitPlayback();

    @SerializedName("disableAmazonADM")
    public abstract boolean shouldDisableAmazonADM();

    @SerializedName("disablePip")
    public abstract boolean shouldDisablePip();

    @SerializedName("disableRoar")
    public abstract boolean shouldDisableRoar();

    @SerializedName("forceLegacyCrypto")
    public abstract boolean shouldForceLegacyCrypto();

    @SerializedName("nrmViaMsl")
    public abstract boolean shouldGetNrmViaMsl();

    public abstract Builder toBuilder();

    public String toJsonString() {
        return C8118deO.a().toJson(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData fromJsonString(java.lang.String r5) {
        /*
            com.google.gson.Gson r0 = o.C8118deO.a()
            boolean r1 = o.C8168dfL.g(r5)
            java.lang.Class<com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData> r2 = com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.class
            if (r1 != 0) goto L1e
            java.lang.Object r5 = r0.fromJson(r5, r2)     // Catch: java.lang.Exception -> L13
            com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData r5 = (com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData) r5     // Catch: java.lang.Exception -> L13
            goto L1f
        L13:
            r5 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "DeviceConfigData"
            java.lang.String r4 = "unable to parse device config override"
            o.C1044Mm.b(r3, r5, r4, r1)
        L1e:
            r5 = 0
        L1f:
            if (r5 != 0) goto L2c
            com.google.gson.JsonObject r5 = new com.google.gson.JsonObject
            r5.<init>()
            java.lang.Object r5 = r0.fromJson(r5, r2)
            com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData r5 = (com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData) r5
        L2c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.fromJsonString(java.lang.String):com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData");
    }

    public static TypeAdapter<DeviceConfigData> typeAdapter(Gson gson) {
        return new AutoValue_DeviceConfigData.GsonTypeAdapter(gson).setDefaultGetUserSessionTimeoutDuration(-1).setDefaultGetEnableLocalPlayback(true).setDefaultIsAllowHevcMobile(false).setDefaultIsEnabledWidevineL3SystemId4266(true).setDefaultIsDisableLegacyNetflixMdx(false).setDefaultGetLolomoPrefetchIntervalOverride(-1).setDefaultGetLolomoCacheExpirationOverride(-1).setDefaultGetVoipInstallDeadlineInDays(-1).setDefaultGetEnableMdxRemoteControlLockScreen(true).setDefaultGetEnableMdxRemoteControlNotification(true).setDefaultGetConsolidatedloggingSpecification(Collections.emptyList()).setDefaultGetBreadcrumbLoggingSpecifications(Collections.emptyList()).setDefaultGetErrorLoggingSpecifications(Collections.emptyList()).setDefaultGetVoipConfiguration(VoipConfiguration.getDefault()).setDefaultGetOfflineConfig(OfflineConfig.getDefault()).setDefaultPdsAndLogblobConfig(PdsAndLogblobConfig.getDefault()).setDefaultPartnerIntegrationConfig(PartnerIntegrationConfig.getDefault()).setDefaultGetAppUpdateDialogFreqDays(7).setDefaultGetMaxAppLifeDays(90).setDefaultGetMobileOnlyMinVersionCode(34317).setDefaultGetSuppressedLogblobs(Collections.emptyList()).setDefaultIsConsumptionOnly(false).setDefaultMultiChannelOffline(false).setDefaultShouldAllowTabletPortraitPlayback(false);
    }
}
