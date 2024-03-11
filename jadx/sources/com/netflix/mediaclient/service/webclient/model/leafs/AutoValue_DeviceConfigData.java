package com.netflix.mediaclient.service.webclient.model.leafs;

import androidx.appcompat.widget.ActivityChooserModel;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData;
import java.util.List;
import org.chromium.net.ConnectionSubtype;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_DeviceConfigData extends C$AutoValue_DeviceConfigData {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_DeviceConfigData(final int i, final int i2, final String str, final boolean z, final String str2, final String str3, final List<ConsolidatedLoggingSessionSpecification> list, final int i3, final List<BreadcrumbLoggingSpecification> list2, final List<ErrorLoggingSpecification> list3, final int i4, final int i5, final int i6, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final int i7, final boolean z8, final VoipConfiguration voipConfiguration, final OfflineConfig offlineConfig, final boolean z9, final String str4, final int i8, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final PdsAndLogblobConfig pdsAndLogblobConfig, final boolean z21, final boolean z22, final int i9, final int i10, final boolean z23, final boolean z24, final boolean z25, final boolean z26, final boolean z27, final int i11, final String str5, final PartnerIntegrationConfig partnerIntegrationConfig, final int i12, final int i13, final int i14, final boolean z28, final List<String> list4, final String str6, final boolean z29, final boolean z30) {
        new DeviceConfigData(i, i2, str, z, str2, str3, list, i3, list2, list3, i4, i5, i6, z2, z3, z4, z5, z6, z7, i7, z8, voipConfiguration, offlineConfig, z9, str4, i8, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, pdsAndLogblobConfig, z21, z22, i9, i10, z23, z24, z25, z26, z27, i11, str5, partnerIntegrationConfig, i12, i13, i14, z28, list4, str6, z29, z30) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_DeviceConfigData
            private final boolean disableAccurateStartPoint;
            private final String forcedDeviceCategory;
            private final int getAppMinVersion;
            private final int getAppRecommendedVersion;
            private final int getAppUpdateDialogFreqDays;
            private final int getAudioFormats;
            private final List<BreadcrumbLoggingSpecification> getBreadcrumbLoggingSpecifications;
            private final String getChannelIdViaConfig;
            private final List<ConsolidatedLoggingSessionSpecification> getConsolidatedloggingSpecification;
            private final boolean getDisableLicensePrefetch;
            private final boolean getEnableLocalPlayback;
            private final boolean getEnableMdxRemoteControlLockScreen;
            private final boolean getEnableMdxRemoteControlNotification;
            private final List<ErrorLoggingSpecification> getErrorLoggingSpecifications;
            private final String getGeoCountryCode;
            private final String getImagePref;
            private final int getLolomoCacheExpirationOverride;
            private final int getLolomoPrefetchIntervalOverride;
            private final int getMaxAppLifeDays;
            private final int getMaxVideoBufferSize;
            private final boolean getMdxDisabled;
            private final int getMobileOnlyMinVersionCode;
            private final OfflineConfig getOfflineConfig;
            private final int getRateLimitForGcmBrowseEvents;
            private final int getRateLimitForGcmNListChangeEvents;
            private final String getSignUpTimeout;
            private final List<String> getSuppressedLogblobs;
            private final int getUserSessionTimeoutDuration;
            private final int getVideoResolutionOverride;
            private final VoipConfiguration getVoipConfiguration;
            private final int getVoipInstallDeadlineInDays;
            private final String getWebsocketDisabled;
            private final boolean isAV1Enabled;
            private final boolean isAV1HDEnabled;
            private final boolean isAV1Hdr10PlusEnabled;
            private final boolean isAllowHevcMobile;
            private final boolean isBlacklisted;
            private final boolean isConsumptionOnly;
            private final boolean isDisableLegacyNetflixMdx;
            private final boolean isDolbyVisionEnabled;
            private final boolean isEnableOfflineSecureDelete;
            private final boolean isEnabledWidevineL3SystemId4266;
            private final boolean isHdr10Enabled;
            private final boolean isHdrBrightnessBoostEnabled;
            private final boolean isPhonePortraitLockEnabled;
            private final boolean isPlayBillingDisabled;
            private final boolean isVoipEnabledOnDevice;
            private final boolean isWidevineL1Enabled;
            private final boolean isWidevineL1ReEnabled;
            private final boolean multiChannelOffline;
            private final PartnerIntegrationConfig partnerIntegrationConfig;
            private final PdsAndLogblobConfig pdsAndLogblobConfig;
            private final boolean shouldAllowTabletPortraitPlayback;
            private final boolean shouldDisableAmazonADM;
            private final boolean shouldDisablePip;
            private final boolean shouldDisableRoar;
            private final boolean shouldForceLegacyCrypto;
            private final boolean shouldGetNrmViaMsl;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("disableAccurateStartPoint")
            public boolean disableAccurateStartPoint() {
                return this.disableAccurateStartPoint;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("forcedDeviceCategory")
            public String forcedDeviceCategory() {
                return this.forcedDeviceCategory;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("min_version")
            public int getAppMinVersion() {
                return this.getAppMinVersion;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("current_version")
            public int getAppRecommendedVersion() {
                return this.getAppRecommendedVersion;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("appUpdateDialogFreqDays")
            public int getAppUpdateDialogFreqDays() {
                return this.getAppUpdateDialogFreqDays;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("audioFormats")
            public int getAudioFormats() {
                return this.getAudioFormats;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("breadcrumb_logging_config")
            public List<BreadcrumbLoggingSpecification> getBreadcrumbLoggingSpecifications() {
                return this.getBreadcrumbLoggingSpecifications;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("channelIdViaConfig")
            public String getChannelIdViaConfig() {
                return this.getChannelIdViaConfig;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("consolidated_logging_specification")
            public List<ConsolidatedLoggingSessionSpecification> getConsolidatedloggingSpecification() {
                return this.getConsolidatedloggingSpecification;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("disableLicensePrefetch")
            public boolean getDisableLicensePrefetch() {
                return this.getDisableLicensePrefetch;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableLocalPlayback")
            public boolean getEnableLocalPlayback() {
                return this.getEnableLocalPlayback;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableMdxRemoteControlLockScreen")
            public boolean getEnableMdxRemoteControlLockScreen() {
                return this.getEnableMdxRemoteControlLockScreen;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableMdxRemoteControlNotification")
            public boolean getEnableMdxRemoteControlNotification() {
                return this.getEnableMdxRemoteControlNotification;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("error_logging_config")
            public List<ErrorLoggingSpecification> getErrorLoggingSpecifications() {
                return this.getErrorLoggingSpecifications;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("geoCountryCode")
            public String getGeoCountryCode() {
                return this.getGeoCountryCode;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("image_pref")
            public String getImagePref() {
                return this.getImagePref;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("lolomoCacheExpirationOverride")
            public int getLolomoCacheExpirationOverride() {
                return this.getLolomoCacheExpirationOverride;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("lolomoPrefetchIntervalOverride")
            public int getLolomoPrefetchIntervalOverride() {
                return this.getLolomoPrefetchIntervalOverride;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("maxAppLifeDays")
            public int getMaxAppLifeDays() {
                return this.getMaxAppLifeDays;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("maxVideoBufferSize")
            public int getMaxVideoBufferSize() {
                return this.getMaxVideoBufferSize;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("disable_mdx")
            public boolean getMdxDisabled() {
                return this.getMdxDisabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("mobileOnlyMinVersionCode")
            public int getMobileOnlyMinVersionCode() {
                return this.getMobileOnlyMinVersionCode;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("offlineConfig")
            public OfflineConfig getOfflineConfig() {
                return this.getOfflineConfig;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("gcmBrowseEventRateLimitInSecs")
            public int getRateLimitForGcmBrowseEvents() {
                return this.getRateLimitForGcmBrowseEvents;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("gcmNListChangeEventRateLimitInSecs")
            public int getRateLimitForGcmNListChangeEvents() {
                return this.getRateLimitForGcmNListChangeEvents;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("signup_timeout")
            public String getSignUpTimeout() {
                return this.getSignUpTimeout;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("suppressedLogblobs")
            public List<String> getSuppressedLogblobs() {
                return this.getSuppressedLogblobs;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("user_session_timeout_duration")
            public int getUserSessionTimeoutDuration() {
                return this.getUserSessionTimeoutDuration;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("videoResolutionOverride")
            public int getVideoResolutionOverride() {
                return this.getVideoResolutionOverride;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("voipConfig")
            public VoipConfiguration getVoipConfiguration() {
                return this.getVoipConfiguration;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("voipInstallDeadlineInDays")
            public int getVoipInstallDeadlineInDays() {
                return this.getVoipInstallDeadlineInDays;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("disable_websocket")
            public String getWebsocketDisabled() {
                return this.getWebsocketDisabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableAV1")
            public boolean isAV1Enabled() {
                return this.isAV1Enabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableAV1HD")
            public boolean isAV1HDEnabled() {
                return this.isAV1HDEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableAV1Hdr10Plus")
            public boolean isAV1Hdr10PlusEnabled() {
                return this.isAV1Hdr10PlusEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("allowHevcMobile")
            public boolean isAllowHevcMobile() {
                return this.isAllowHevcMobile;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("isBlacklisted")
            public boolean isBlacklisted() {
                return this.isBlacklisted;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("isConsumptionOnly")
            public boolean isConsumptionOnly() {
                return this.isConsumptionOnly;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("disableLegacyNetflixMdx")
            public boolean isDisableLegacyNetflixMdx() {
                return this.isDisableLegacyNetflixMdx;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableDolbyVision")
            public boolean isDolbyVisionEnabled() {
                return this.isDolbyVisionEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableOfflineSecureDelete")
            public boolean isEnableOfflineSecureDelete() {
                return this.isEnableOfflineSecureDelete;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableWidevineL3SystemId4266")
            public boolean isEnabledWidevineL3SystemId4266() {
                return this.isEnabledWidevineL3SystemId4266;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableHdr10")
            public boolean isHdr10Enabled() {
                return this.isHdr10Enabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableHdrBrightnessBoost")
            public boolean isHdrBrightnessBoostEnabled() {
                return this.isHdrBrightnessBoostEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("lockPhonePortraitEnabled")
            public boolean isPhonePortraitLockEnabled() {
                return this.isPhonePortraitLockEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("disablePlayBilling")
            public boolean isPlayBillingDisabled() {
                return this.isPlayBillingDisabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("voipEnabledOnDevice")
            public boolean isVoipEnabledOnDevice() {
                return this.isVoipEnabledOnDevice;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("enableWidevineL1")
            public boolean isWidevineL1Enabled() {
                return this.isWidevineL1Enabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("reEnableWidevineL1")
            public boolean isWidevineL1ReEnabled() {
                return this.isWidevineL1ReEnabled;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("multiChannelOffline")
            public boolean multiChannelOffline() {
                return this.multiChannelOffline;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("partnerIntegrationConfig")
            public PartnerIntegrationConfig partnerIntegrationConfig() {
                return this.partnerIntegrationConfig;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("pdsAndLogblobConfig")
            public PdsAndLogblobConfig pdsAndLogblobConfig() {
                return this.pdsAndLogblobConfig;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("allowTabletPortraitPlayback")
            public boolean shouldAllowTabletPortraitPlayback() {
                return this.shouldAllowTabletPortraitPlayback;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("disableAmazonADM")
            public boolean shouldDisableAmazonADM() {
                return this.shouldDisableAmazonADM;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("disablePip")
            public boolean shouldDisablePip() {
                return this.shouldDisablePip;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("disableRoar")
            public boolean shouldDisableRoar() {
                return this.shouldDisableRoar;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("forceLegacyCrypto")
            public boolean shouldForceLegacyCrypto() {
                return this.shouldForceLegacyCrypto;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            @SerializedName("nrmViaMsl")
            public boolean shouldGetNrmViaMsl() {
                return this.shouldGetNrmViaMsl;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.getAppMinVersion = i;
                this.getAppRecommendedVersion = i2;
                this.getWebsocketDisabled = str;
                this.getMdxDisabled = z;
                this.getImagePref = str2;
                this.getSignUpTimeout = str3;
                if (list == null) {
                    throw new NullPointerException("Null getConsolidatedloggingSpecification");
                }
                this.getConsolidatedloggingSpecification = list;
                this.getUserSessionTimeoutDuration = i3;
                if (list2 == null) {
                    throw new NullPointerException("Null getBreadcrumbLoggingSpecifications");
                }
                this.getBreadcrumbLoggingSpecifications = list2;
                if (list3 == null) {
                    throw new NullPointerException("Null getErrorLoggingSpecifications");
                }
                this.getErrorLoggingSpecifications = list3;
                this.getVideoResolutionOverride = i4;
                this.getRateLimitForGcmBrowseEvents = i5;
                this.getRateLimitForGcmNListChangeEvents = i6;
                this.getEnableLocalPlayback = z2;
                this.getEnableMdxRemoteControlLockScreen = z3;
                this.getEnableMdxRemoteControlNotification = z4;
                this.isWidevineL1Enabled = z5;
                this.isWidevineL1ReEnabled = z6;
                this.shouldForceLegacyCrypto = z7;
                this.getAudioFormats = i7;
                this.isVoipEnabledOnDevice = z8;
                if (voipConfiguration == null) {
                    throw new NullPointerException("Null getVoipConfiguration");
                }
                this.getVoipConfiguration = voipConfiguration;
                if (offlineConfig == null) {
                    throw new NullPointerException("Null getOfflineConfig");
                }
                this.getOfflineConfig = offlineConfig;
                this.isPlayBillingDisabled = z9;
                this.getGeoCountryCode = str4;
                this.getMaxVideoBufferSize = i8;
                this.getDisableLicensePrefetch = z10;
                this.shouldDisableRoar = z11;
                this.isAllowHevcMobile = z12;
                this.isHdr10Enabled = z13;
                this.isDolbyVisionEnabled = z14;
                this.isAV1HDEnabled = z15;
                this.isAV1Enabled = z16;
                this.isAV1Hdr10PlusEnabled = z17;
                this.isEnabledWidevineL3SystemId4266 = z18;
                this.isDisableLegacyNetflixMdx = z19;
                this.isPhonePortraitLockEnabled = z20;
                if (pdsAndLogblobConfig == null) {
                    throw new NullPointerException("Null pdsAndLogblobConfig");
                }
                this.pdsAndLogblobConfig = pdsAndLogblobConfig;
                this.isBlacklisted = z21;
                this.isEnableOfflineSecureDelete = z22;
                this.getLolomoPrefetchIntervalOverride = i9;
                this.getLolomoCacheExpirationOverride = i10;
                this.disableAccurateStartPoint = z23;
                this.shouldDisablePip = z24;
                this.shouldAllowTabletPortraitPlayback = z25;
                this.shouldDisableAmazonADM = z26;
                this.shouldGetNrmViaMsl = z27;
                this.getVoipInstallDeadlineInDays = i11;
                this.forcedDeviceCategory = str5;
                if (partnerIntegrationConfig == null) {
                    throw new NullPointerException("Null partnerIntegrationConfig");
                }
                this.partnerIntegrationConfig = partnerIntegrationConfig;
                this.getMaxAppLifeDays = i12;
                this.getAppUpdateDialogFreqDays = i13;
                this.getMobileOnlyMinVersionCode = i14;
                this.isHdrBrightnessBoostEnabled = z28;
                if (list4 == null) {
                    throw new NullPointerException("Null getSuppressedLogblobs");
                }
                this.getSuppressedLogblobs = list4;
                this.getChannelIdViaConfig = str6;
                this.isConsumptionOnly = z29;
                this.multiChannelOffline = z30;
            }

            public String toString() {
                return "DeviceConfigData{getAppMinVersion=" + this.getAppMinVersion + ", getAppRecommendedVersion=" + this.getAppRecommendedVersion + ", getWebsocketDisabled=" + this.getWebsocketDisabled + ", getMdxDisabled=" + this.getMdxDisabled + ", getImagePref=" + this.getImagePref + ", getSignUpTimeout=" + this.getSignUpTimeout + ", getConsolidatedloggingSpecification=" + this.getConsolidatedloggingSpecification + ", getUserSessionTimeoutDuration=" + this.getUserSessionTimeoutDuration + ", getBreadcrumbLoggingSpecifications=" + this.getBreadcrumbLoggingSpecifications + ", getErrorLoggingSpecifications=" + this.getErrorLoggingSpecifications + ", getVideoResolutionOverride=" + this.getVideoResolutionOverride + ", getRateLimitForGcmBrowseEvents=" + this.getRateLimitForGcmBrowseEvents + ", getRateLimitForGcmNListChangeEvents=" + this.getRateLimitForGcmNListChangeEvents + ", getEnableLocalPlayback=" + this.getEnableLocalPlayback + ", getEnableMdxRemoteControlLockScreen=" + this.getEnableMdxRemoteControlLockScreen + ", getEnableMdxRemoteControlNotification=" + this.getEnableMdxRemoteControlNotification + ", isWidevineL1Enabled=" + this.isWidevineL1Enabled + ", isWidevineL1ReEnabled=" + this.isWidevineL1ReEnabled + ", shouldForceLegacyCrypto=" + this.shouldForceLegacyCrypto + ", getAudioFormats=" + this.getAudioFormats + ", isVoipEnabledOnDevice=" + this.isVoipEnabledOnDevice + ", getVoipConfiguration=" + this.getVoipConfiguration + ", getOfflineConfig=" + this.getOfflineConfig + ", isPlayBillingDisabled=" + this.isPlayBillingDisabled + ", getGeoCountryCode=" + this.getGeoCountryCode + ", getMaxVideoBufferSize=" + this.getMaxVideoBufferSize + ", getDisableLicensePrefetch=" + this.getDisableLicensePrefetch + ", shouldDisableRoar=" + this.shouldDisableRoar + ", isAllowHevcMobile=" + this.isAllowHevcMobile + ", isHdr10Enabled=" + this.isHdr10Enabled + ", isDolbyVisionEnabled=" + this.isDolbyVisionEnabled + ", isAV1HDEnabled=" + this.isAV1HDEnabled + ", isAV1Enabled=" + this.isAV1Enabled + ", isAV1Hdr10PlusEnabled=" + this.isAV1Hdr10PlusEnabled + ", isEnabledWidevineL3SystemId4266=" + this.isEnabledWidevineL3SystemId4266 + ", isDisableLegacyNetflixMdx=" + this.isDisableLegacyNetflixMdx + ", isPhonePortraitLockEnabled=" + this.isPhonePortraitLockEnabled + ", pdsAndLogblobConfig=" + this.pdsAndLogblobConfig + ", isBlacklisted=" + this.isBlacklisted + ", isEnableOfflineSecureDelete=" + this.isEnableOfflineSecureDelete + ", getLolomoPrefetchIntervalOverride=" + this.getLolomoPrefetchIntervalOverride + ", getLolomoCacheExpirationOverride=" + this.getLolomoCacheExpirationOverride + ", disableAccurateStartPoint=" + this.disableAccurateStartPoint + ", shouldDisablePip=" + this.shouldDisablePip + ", shouldAllowTabletPortraitPlayback=" + this.shouldAllowTabletPortraitPlayback + ", shouldDisableAmazonADM=" + this.shouldDisableAmazonADM + ", shouldGetNrmViaMsl=" + this.shouldGetNrmViaMsl + ", getVoipInstallDeadlineInDays=" + this.getVoipInstallDeadlineInDays + ", forcedDeviceCategory=" + this.forcedDeviceCategory + ", partnerIntegrationConfig=" + this.partnerIntegrationConfig + ", getMaxAppLifeDays=" + this.getMaxAppLifeDays + ", getAppUpdateDialogFreqDays=" + this.getAppUpdateDialogFreqDays + ", getMobileOnlyMinVersionCode=" + this.getMobileOnlyMinVersionCode + ", isHdrBrightnessBoostEnabled=" + this.isHdrBrightnessBoostEnabled + ", getSuppressedLogblobs=" + this.getSuppressedLogblobs + ", getChannelIdViaConfig=" + this.getChannelIdViaConfig + ", isConsumptionOnly=" + this.isConsumptionOnly + ", multiChannelOffline=" + this.multiChannelOffline + "}";
            }

            public boolean equals(Object obj) {
                String str7;
                String str8;
                String str9;
                String str10;
                String str11;
                String str12;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof DeviceConfigData) {
                    DeviceConfigData deviceConfigData = (DeviceConfigData) obj;
                    return this.getAppMinVersion == deviceConfigData.getAppMinVersion() && this.getAppRecommendedVersion == deviceConfigData.getAppRecommendedVersion() && ((str7 = this.getWebsocketDisabled) != null ? str7.equals(deviceConfigData.getWebsocketDisabled()) : deviceConfigData.getWebsocketDisabled() == null) && this.getMdxDisabled == deviceConfigData.getMdxDisabled() && ((str8 = this.getImagePref) != null ? str8.equals(deviceConfigData.getImagePref()) : deviceConfigData.getImagePref() == null) && ((str9 = this.getSignUpTimeout) != null ? str9.equals(deviceConfigData.getSignUpTimeout()) : deviceConfigData.getSignUpTimeout() == null) && this.getConsolidatedloggingSpecification.equals(deviceConfigData.getConsolidatedloggingSpecification()) && this.getUserSessionTimeoutDuration == deviceConfigData.getUserSessionTimeoutDuration() && this.getBreadcrumbLoggingSpecifications.equals(deviceConfigData.getBreadcrumbLoggingSpecifications()) && this.getErrorLoggingSpecifications.equals(deviceConfigData.getErrorLoggingSpecifications()) && this.getVideoResolutionOverride == deviceConfigData.getVideoResolutionOverride() && this.getRateLimitForGcmBrowseEvents == deviceConfigData.getRateLimitForGcmBrowseEvents() && this.getRateLimitForGcmNListChangeEvents == deviceConfigData.getRateLimitForGcmNListChangeEvents() && this.getEnableLocalPlayback == deviceConfigData.getEnableLocalPlayback() && this.getEnableMdxRemoteControlLockScreen == deviceConfigData.getEnableMdxRemoteControlLockScreen() && this.getEnableMdxRemoteControlNotification == deviceConfigData.getEnableMdxRemoteControlNotification() && this.isWidevineL1Enabled == deviceConfigData.isWidevineL1Enabled() && this.isWidevineL1ReEnabled == deviceConfigData.isWidevineL1ReEnabled() && this.shouldForceLegacyCrypto == deviceConfigData.shouldForceLegacyCrypto() && this.getAudioFormats == deviceConfigData.getAudioFormats() && this.isVoipEnabledOnDevice == deviceConfigData.isVoipEnabledOnDevice() && this.getVoipConfiguration.equals(deviceConfigData.getVoipConfiguration()) && this.getOfflineConfig.equals(deviceConfigData.getOfflineConfig()) && this.isPlayBillingDisabled == deviceConfigData.isPlayBillingDisabled() && ((str10 = this.getGeoCountryCode) != null ? str10.equals(deviceConfigData.getGeoCountryCode()) : deviceConfigData.getGeoCountryCode() == null) && this.getMaxVideoBufferSize == deviceConfigData.getMaxVideoBufferSize() && this.getDisableLicensePrefetch == deviceConfigData.getDisableLicensePrefetch() && this.shouldDisableRoar == deviceConfigData.shouldDisableRoar() && this.isAllowHevcMobile == deviceConfigData.isAllowHevcMobile() && this.isHdr10Enabled == deviceConfigData.isHdr10Enabled() && this.isDolbyVisionEnabled == deviceConfigData.isDolbyVisionEnabled() && this.isAV1HDEnabled == deviceConfigData.isAV1HDEnabled() && this.isAV1Enabled == deviceConfigData.isAV1Enabled() && this.isAV1Hdr10PlusEnabled == deviceConfigData.isAV1Hdr10PlusEnabled() && this.isEnabledWidevineL3SystemId4266 == deviceConfigData.isEnabledWidevineL3SystemId4266() && this.isDisableLegacyNetflixMdx == deviceConfigData.isDisableLegacyNetflixMdx() && this.isPhonePortraitLockEnabled == deviceConfigData.isPhonePortraitLockEnabled() && this.pdsAndLogblobConfig.equals(deviceConfigData.pdsAndLogblobConfig()) && this.isBlacklisted == deviceConfigData.isBlacklisted() && this.isEnableOfflineSecureDelete == deviceConfigData.isEnableOfflineSecureDelete() && this.getLolomoPrefetchIntervalOverride == deviceConfigData.getLolomoPrefetchIntervalOverride() && this.getLolomoCacheExpirationOverride == deviceConfigData.getLolomoCacheExpirationOverride() && this.disableAccurateStartPoint == deviceConfigData.disableAccurateStartPoint() && this.shouldDisablePip == deviceConfigData.shouldDisablePip() && this.shouldAllowTabletPortraitPlayback == deviceConfigData.shouldAllowTabletPortraitPlayback() && this.shouldDisableAmazonADM == deviceConfigData.shouldDisableAmazonADM() && this.shouldGetNrmViaMsl == deviceConfigData.shouldGetNrmViaMsl() && this.getVoipInstallDeadlineInDays == deviceConfigData.getVoipInstallDeadlineInDays() && ((str11 = this.forcedDeviceCategory) != null ? str11.equals(deviceConfigData.forcedDeviceCategory()) : deviceConfigData.forcedDeviceCategory() == null) && this.partnerIntegrationConfig.equals(deviceConfigData.partnerIntegrationConfig()) && this.getMaxAppLifeDays == deviceConfigData.getMaxAppLifeDays() && this.getAppUpdateDialogFreqDays == deviceConfigData.getAppUpdateDialogFreqDays() && this.getMobileOnlyMinVersionCode == deviceConfigData.getMobileOnlyMinVersionCode() && this.isHdrBrightnessBoostEnabled == deviceConfigData.isHdrBrightnessBoostEnabled() && this.getSuppressedLogblobs.equals(deviceConfigData.getSuppressedLogblobs()) && ((str12 = this.getChannelIdViaConfig) != null ? str12.equals(deviceConfigData.getChannelIdViaConfig()) : deviceConfigData.getChannelIdViaConfig() == null) && this.isConsumptionOnly == deviceConfigData.isConsumptionOnly() && this.multiChannelOffline == deviceConfigData.multiChannelOffline();
                }
                return false;
            }

            public int hashCode() {
                int i15 = this.getAppMinVersion;
                int i16 = this.getAppRecommendedVersion;
                String str7 = this.getWebsocketDisabled;
                int hashCode = str7 == null ? 0 : str7.hashCode();
                int i17 = this.getMdxDisabled ? 1231 : 1237;
                String str8 = this.getImagePref;
                int hashCode2 = str8 == null ? 0 : str8.hashCode();
                String str9 = this.getSignUpTimeout;
                int hashCode3 = str9 == null ? 0 : str9.hashCode();
                int hashCode4 = this.getConsolidatedloggingSpecification.hashCode();
                int i18 = this.getUserSessionTimeoutDuration;
                int hashCode5 = this.getBreadcrumbLoggingSpecifications.hashCode();
                int hashCode6 = this.getErrorLoggingSpecifications.hashCode();
                int i19 = this.getVideoResolutionOverride;
                int i20 = this.getRateLimitForGcmBrowseEvents;
                int i21 = this.getRateLimitForGcmNListChangeEvents;
                int i22 = this.getEnableLocalPlayback ? 1231 : 1237;
                int i23 = this.getEnableMdxRemoteControlLockScreen ? 1231 : 1237;
                int i24 = this.getEnableMdxRemoteControlNotification ? 1231 : 1237;
                int i25 = this.isWidevineL1Enabled ? 1231 : 1237;
                int i26 = this.isWidevineL1ReEnabled ? 1231 : 1237;
                int i27 = this.shouldForceLegacyCrypto ? 1231 : 1237;
                int i28 = this.getAudioFormats;
                int i29 = this.isVoipEnabledOnDevice ? 1231 : 1237;
                int hashCode7 = this.getVoipConfiguration.hashCode();
                int hashCode8 = this.getOfflineConfig.hashCode();
                int i30 = this.isPlayBillingDisabled ? 1231 : 1237;
                String str10 = this.getGeoCountryCode;
                int hashCode9 = str10 == null ? 0 : str10.hashCode();
                int i31 = this.getMaxVideoBufferSize;
                int i32 = this.getDisableLicensePrefetch ? 1231 : 1237;
                int i33 = this.shouldDisableRoar ? 1231 : 1237;
                int i34 = this.isAllowHevcMobile ? 1231 : 1237;
                int i35 = this.isHdr10Enabled ? 1231 : 1237;
                int i36 = this.isDolbyVisionEnabled ? 1231 : 1237;
                int i37 = this.isAV1HDEnabled ? 1231 : 1237;
                int i38 = this.isAV1Enabled ? 1231 : 1237;
                int i39 = this.isAV1Hdr10PlusEnabled ? 1231 : 1237;
                int i40 = this.isEnabledWidevineL3SystemId4266 ? 1231 : 1237;
                int i41 = this.isDisableLegacyNetflixMdx ? 1231 : 1237;
                int i42 = this.isPhonePortraitLockEnabled ? 1231 : 1237;
                int hashCode10 = this.pdsAndLogblobConfig.hashCode();
                int i43 = this.isBlacklisted ? 1231 : 1237;
                int i44 = this.isEnableOfflineSecureDelete ? 1231 : 1237;
                int i45 = this.getLolomoPrefetchIntervalOverride;
                int i46 = this.getLolomoCacheExpirationOverride;
                int i47 = this.disableAccurateStartPoint ? 1231 : 1237;
                int i48 = this.shouldDisablePip ? 1231 : 1237;
                int i49 = this.shouldAllowTabletPortraitPlayback ? 1231 : 1237;
                int i50 = this.shouldDisableAmazonADM ? 1231 : 1237;
                int i51 = this.shouldGetNrmViaMsl ? 1231 : 1237;
                int i52 = this.getVoipInstallDeadlineInDays;
                String str11 = this.forcedDeviceCategory;
                int hashCode11 = str11 == null ? 0 : str11.hashCode();
                int hashCode12 = this.partnerIntegrationConfig.hashCode();
                int i53 = this.getMaxAppLifeDays;
                int i54 = this.getAppUpdateDialogFreqDays;
                int i55 = this.getMobileOnlyMinVersionCode;
                int i56 = this.isHdrBrightnessBoostEnabled ? 1231 : 1237;
                int hashCode13 = this.getSuppressedLogblobs.hashCode();
                String str12 = this.getChannelIdViaConfig;
                int hashCode14 = str12 == null ? 0 : str12.hashCode();
                return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i15 ^ 1000003) * 1000003) ^ i16) * 1000003) ^ hashCode) * 1000003) ^ i17) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i18) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ i19) * 1000003) ^ i20) * 1000003) ^ i21) * 1000003) ^ i22) * 1000003) ^ i23) * 1000003) ^ i24) * 1000003) ^ i25) * 1000003) ^ i26) * 1000003) ^ i27) * 1000003) ^ i28) * 1000003) ^ i29) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ i30) * 1000003) ^ hashCode9) * 1000003) ^ i31) * 1000003) ^ i32) * 1000003) ^ i33) * 1000003) ^ i34) * 1000003) ^ i35) * 1000003) ^ i36) * 1000003) ^ i37) * 1000003) ^ i38) * 1000003) ^ i39) * 1000003) ^ i40) * 1000003) ^ i41) * 1000003) ^ i42) * 1000003) ^ hashCode10) * 1000003) ^ i43) * 1000003) ^ i44) * 1000003) ^ i45) * 1000003) ^ i46) * 1000003) ^ i47) * 1000003) ^ i48) * 1000003) ^ i49) * 1000003) ^ i50) * 1000003) ^ i51) * 1000003) ^ i52) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ i53) * 1000003) ^ i54) * 1000003) ^ i55) * 1000003) ^ i56) * 1000003) ^ hashCode13) * 1000003) ^ hashCode14) * 1000003) ^ (this.isConsumptionOnly ? 1231 : 1237)) * 1000003) ^ (this.multiChannelOffline ? 1231 : 1237);
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData
            public DeviceConfigData.Builder toBuilder() {
                return new Builder(this);
            }

            /* renamed from: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_DeviceConfigData$Builder */
            /* loaded from: classes.dex */
            static final class Builder extends DeviceConfigData.Builder {
                private Boolean disableAccurateStartPoint;
                private String forcedDeviceCategory;
                private Integer getAppMinVersion;
                private Integer getAppRecommendedVersion;
                private Integer getAppUpdateDialogFreqDays;
                private Integer getAudioFormats;
                private List<BreadcrumbLoggingSpecification> getBreadcrumbLoggingSpecifications;
                private String getChannelIdViaConfig;
                private List<ConsolidatedLoggingSessionSpecification> getConsolidatedloggingSpecification;
                private Boolean getDisableLicensePrefetch;
                private Boolean getEnableLocalPlayback;
                private Boolean getEnableMdxRemoteControlLockScreen;
                private Boolean getEnableMdxRemoteControlNotification;
                private List<ErrorLoggingSpecification> getErrorLoggingSpecifications;
                private String getGeoCountryCode;
                private String getImagePref;
                private Integer getLolomoCacheExpirationOverride;
                private Integer getLolomoPrefetchIntervalOverride;
                private Integer getMaxAppLifeDays;
                private Integer getMaxVideoBufferSize;
                private Boolean getMdxDisabled;
                private Integer getMobileOnlyMinVersionCode;
                private OfflineConfig getOfflineConfig;
                private Integer getRateLimitForGcmBrowseEvents;
                private Integer getRateLimitForGcmNListChangeEvents;
                private String getSignUpTimeout;
                private List<String> getSuppressedLogblobs;
                private Integer getUserSessionTimeoutDuration;
                private Integer getVideoResolutionOverride;
                private VoipConfiguration getVoipConfiguration;
                private Integer getVoipInstallDeadlineInDays;
                private String getWebsocketDisabled;
                private Boolean isAV1Enabled;
                private Boolean isAV1HDEnabled;
                private Boolean isAV1Hdr10PlusEnabled;
                private Boolean isAllowHevcMobile;
                private Boolean isBlacklisted;
                private Boolean isConsumptionOnly;
                private Boolean isDisableLegacyNetflixMdx;
                private Boolean isDolbyVisionEnabled;
                private Boolean isEnableOfflineSecureDelete;
                private Boolean isEnabledWidevineL3SystemId4266;
                private Boolean isHdr10Enabled;
                private Boolean isHdrBrightnessBoostEnabled;
                private Boolean isPhonePortraitLockEnabled;
                private Boolean isPlayBillingDisabled;
                private Boolean isVoipEnabledOnDevice;
                private Boolean isWidevineL1Enabled;
                private Boolean isWidevineL1ReEnabled;
                private Boolean multiChannelOffline;
                private PartnerIntegrationConfig partnerIntegrationConfig;
                private PdsAndLogblobConfig pdsAndLogblobConfig;
                private Boolean shouldAllowTabletPortraitPlayback;
                private Boolean shouldDisableAmazonADM;
                private Boolean shouldDisablePip;
                private Boolean shouldDisableRoar;
                private Boolean shouldForceLegacyCrypto;
                private Boolean shouldGetNrmViaMsl;

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setForcedDeviceCategory(String str) {
                    this.forcedDeviceCategory = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetChannelIdViaConfig(String str) {
                    this.getChannelIdViaConfig = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetGeoCountryCode(String str) {
                    this.getGeoCountryCode = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetImagePref(String str) {
                    this.getImagePref = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetSignUpTimeout(String str) {
                    this.getSignUpTimeout = str;
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetWebsocketDisabled(String str) {
                    this.getWebsocketDisabled = str;
                    return this;
                }

                Builder() {
                }

                private Builder(DeviceConfigData deviceConfigData) {
                    this.getAppMinVersion = Integer.valueOf(deviceConfigData.getAppMinVersion());
                    this.getAppRecommendedVersion = Integer.valueOf(deviceConfigData.getAppRecommendedVersion());
                    this.getWebsocketDisabled = deviceConfigData.getWebsocketDisabled();
                    this.getMdxDisabled = Boolean.valueOf(deviceConfigData.getMdxDisabled());
                    this.getImagePref = deviceConfigData.getImagePref();
                    this.getSignUpTimeout = deviceConfigData.getSignUpTimeout();
                    this.getConsolidatedloggingSpecification = deviceConfigData.getConsolidatedloggingSpecification();
                    this.getUserSessionTimeoutDuration = Integer.valueOf(deviceConfigData.getUserSessionTimeoutDuration());
                    this.getBreadcrumbLoggingSpecifications = deviceConfigData.getBreadcrumbLoggingSpecifications();
                    this.getErrorLoggingSpecifications = deviceConfigData.getErrorLoggingSpecifications();
                    this.getVideoResolutionOverride = Integer.valueOf(deviceConfigData.getVideoResolutionOverride());
                    this.getRateLimitForGcmBrowseEvents = Integer.valueOf(deviceConfigData.getRateLimitForGcmBrowseEvents());
                    this.getRateLimitForGcmNListChangeEvents = Integer.valueOf(deviceConfigData.getRateLimitForGcmNListChangeEvents());
                    this.getEnableLocalPlayback = Boolean.valueOf(deviceConfigData.getEnableLocalPlayback());
                    this.getEnableMdxRemoteControlLockScreen = Boolean.valueOf(deviceConfigData.getEnableMdxRemoteControlLockScreen());
                    this.getEnableMdxRemoteControlNotification = Boolean.valueOf(deviceConfigData.getEnableMdxRemoteControlNotification());
                    this.isWidevineL1Enabled = Boolean.valueOf(deviceConfigData.isWidevineL1Enabled());
                    this.isWidevineL1ReEnabled = Boolean.valueOf(deviceConfigData.isWidevineL1ReEnabled());
                    this.shouldForceLegacyCrypto = Boolean.valueOf(deviceConfigData.shouldForceLegacyCrypto());
                    this.getAudioFormats = Integer.valueOf(deviceConfigData.getAudioFormats());
                    this.isVoipEnabledOnDevice = Boolean.valueOf(deviceConfigData.isVoipEnabledOnDevice());
                    this.getVoipConfiguration = deviceConfigData.getVoipConfiguration();
                    this.getOfflineConfig = deviceConfigData.getOfflineConfig();
                    this.isPlayBillingDisabled = Boolean.valueOf(deviceConfigData.isPlayBillingDisabled());
                    this.getGeoCountryCode = deviceConfigData.getGeoCountryCode();
                    this.getMaxVideoBufferSize = Integer.valueOf(deviceConfigData.getMaxVideoBufferSize());
                    this.getDisableLicensePrefetch = Boolean.valueOf(deviceConfigData.getDisableLicensePrefetch());
                    this.shouldDisableRoar = Boolean.valueOf(deviceConfigData.shouldDisableRoar());
                    this.isAllowHevcMobile = Boolean.valueOf(deviceConfigData.isAllowHevcMobile());
                    this.isHdr10Enabled = Boolean.valueOf(deviceConfigData.isHdr10Enabled());
                    this.isDolbyVisionEnabled = Boolean.valueOf(deviceConfigData.isDolbyVisionEnabled());
                    this.isAV1HDEnabled = Boolean.valueOf(deviceConfigData.isAV1HDEnabled());
                    this.isAV1Enabled = Boolean.valueOf(deviceConfigData.isAV1Enabled());
                    this.isAV1Hdr10PlusEnabled = Boolean.valueOf(deviceConfigData.isAV1Hdr10PlusEnabled());
                    this.isEnabledWidevineL3SystemId4266 = Boolean.valueOf(deviceConfigData.isEnabledWidevineL3SystemId4266());
                    this.isDisableLegacyNetflixMdx = Boolean.valueOf(deviceConfigData.isDisableLegacyNetflixMdx());
                    this.isPhonePortraitLockEnabled = Boolean.valueOf(deviceConfigData.isPhonePortraitLockEnabled());
                    this.pdsAndLogblobConfig = deviceConfigData.pdsAndLogblobConfig();
                    this.isBlacklisted = Boolean.valueOf(deviceConfigData.isBlacklisted());
                    this.isEnableOfflineSecureDelete = Boolean.valueOf(deviceConfigData.isEnableOfflineSecureDelete());
                    this.getLolomoPrefetchIntervalOverride = Integer.valueOf(deviceConfigData.getLolomoPrefetchIntervalOverride());
                    this.getLolomoCacheExpirationOverride = Integer.valueOf(deviceConfigData.getLolomoCacheExpirationOverride());
                    this.disableAccurateStartPoint = Boolean.valueOf(deviceConfigData.disableAccurateStartPoint());
                    this.shouldDisablePip = Boolean.valueOf(deviceConfigData.shouldDisablePip());
                    this.shouldAllowTabletPortraitPlayback = Boolean.valueOf(deviceConfigData.shouldAllowTabletPortraitPlayback());
                    this.shouldDisableAmazonADM = Boolean.valueOf(deviceConfigData.shouldDisableAmazonADM());
                    this.shouldGetNrmViaMsl = Boolean.valueOf(deviceConfigData.shouldGetNrmViaMsl());
                    this.getVoipInstallDeadlineInDays = Integer.valueOf(deviceConfigData.getVoipInstallDeadlineInDays());
                    this.forcedDeviceCategory = deviceConfigData.forcedDeviceCategory();
                    this.partnerIntegrationConfig = deviceConfigData.partnerIntegrationConfig();
                    this.getMaxAppLifeDays = Integer.valueOf(deviceConfigData.getMaxAppLifeDays());
                    this.getAppUpdateDialogFreqDays = Integer.valueOf(deviceConfigData.getAppUpdateDialogFreqDays());
                    this.getMobileOnlyMinVersionCode = Integer.valueOf(deviceConfigData.getMobileOnlyMinVersionCode());
                    this.isHdrBrightnessBoostEnabled = Boolean.valueOf(deviceConfigData.isHdrBrightnessBoostEnabled());
                    this.getSuppressedLogblobs = deviceConfigData.getSuppressedLogblobs();
                    this.getChannelIdViaConfig = deviceConfigData.getChannelIdViaConfig();
                    this.isConsumptionOnly = Boolean.valueOf(deviceConfigData.isConsumptionOnly());
                    this.multiChannelOffline = Boolean.valueOf(deviceConfigData.multiChannelOffline());
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetAppMinVersion(int i) {
                    this.getAppMinVersion = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetAppRecommendedVersion(int i) {
                    this.getAppRecommendedVersion = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetMdxDisabled(boolean z) {
                    this.getMdxDisabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetConsolidatedloggingSpecification(List<ConsolidatedLoggingSessionSpecification> list) {
                    if (list != null) {
                        this.getConsolidatedloggingSpecification = list;
                        return this;
                    }
                    throw new NullPointerException("Null getConsolidatedloggingSpecification");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetUserSessionTimeoutDuration(int i) {
                    this.getUserSessionTimeoutDuration = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetBreadcrumbLoggingSpecifications(List<BreadcrumbLoggingSpecification> list) {
                    if (list != null) {
                        this.getBreadcrumbLoggingSpecifications = list;
                        return this;
                    }
                    throw new NullPointerException("Null getBreadcrumbLoggingSpecifications");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetErrorLoggingSpecifications(List<ErrorLoggingSpecification> list) {
                    if (list != null) {
                        this.getErrorLoggingSpecifications = list;
                        return this;
                    }
                    throw new NullPointerException("Null getErrorLoggingSpecifications");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetVideoResolutionOverride(int i) {
                    this.getVideoResolutionOverride = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetRateLimitForGcmBrowseEvents(int i) {
                    this.getRateLimitForGcmBrowseEvents = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetRateLimitForGcmNListChangeEvents(int i) {
                    this.getRateLimitForGcmNListChangeEvents = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetEnableLocalPlayback(boolean z) {
                    this.getEnableLocalPlayback = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetEnableMdxRemoteControlLockScreen(boolean z) {
                    this.getEnableMdxRemoteControlLockScreen = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetEnableMdxRemoteControlNotification(boolean z) {
                    this.getEnableMdxRemoteControlNotification = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsWidevineL1Enabled(boolean z) {
                    this.isWidevineL1Enabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsWidevineL1ReEnabled(boolean z) {
                    this.isWidevineL1ReEnabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setShouldForceLegacyCrypto(boolean z) {
                    this.shouldForceLegacyCrypto = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetAudioFormats(int i) {
                    this.getAudioFormats = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsVoipEnabledOnDevice(boolean z) {
                    this.isVoipEnabledOnDevice = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetVoipConfiguration(VoipConfiguration voipConfiguration) {
                    if (voipConfiguration != null) {
                        this.getVoipConfiguration = voipConfiguration;
                        return this;
                    }
                    throw new NullPointerException("Null getVoipConfiguration");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetOfflineConfig(OfflineConfig offlineConfig) {
                    if (offlineConfig != null) {
                        this.getOfflineConfig = offlineConfig;
                        return this;
                    }
                    throw new NullPointerException("Null getOfflineConfig");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsPlayBillingDisabled(boolean z) {
                    this.isPlayBillingDisabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetMaxVideoBufferSize(int i) {
                    this.getMaxVideoBufferSize = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetDisableLicensePrefetch(boolean z) {
                    this.getDisableLicensePrefetch = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setShouldDisableRoar(boolean z) {
                    this.shouldDisableRoar = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsAllowHevcMobile(boolean z) {
                    this.isAllowHevcMobile = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsHdr10Enabled(boolean z) {
                    this.isHdr10Enabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsDolbyVisionEnabled(boolean z) {
                    this.isDolbyVisionEnabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsAV1HDEnabled(boolean z) {
                    this.isAV1HDEnabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsAV1Enabled(boolean z) {
                    this.isAV1Enabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsAV1Hdr10PlusEnabled(boolean z) {
                    this.isAV1Hdr10PlusEnabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsEnabledWidevineL3SystemId4266(boolean z) {
                    this.isEnabledWidevineL3SystemId4266 = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsDisableLegacyNetflixMdx(boolean z) {
                    this.isDisableLegacyNetflixMdx = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsPhonePortraitLockEnabled(boolean z) {
                    this.isPhonePortraitLockEnabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setPdsAndLogblobConfig(PdsAndLogblobConfig pdsAndLogblobConfig) {
                    if (pdsAndLogblobConfig != null) {
                        this.pdsAndLogblobConfig = pdsAndLogblobConfig;
                        return this;
                    }
                    throw new NullPointerException("Null pdsAndLogblobConfig");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsBlacklisted(boolean z) {
                    this.isBlacklisted = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsEnableOfflineSecureDelete(boolean z) {
                    this.isEnableOfflineSecureDelete = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetLolomoPrefetchIntervalOverride(int i) {
                    this.getLolomoPrefetchIntervalOverride = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetLolomoCacheExpirationOverride(int i) {
                    this.getLolomoCacheExpirationOverride = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setDisableAccurateStartPoint(boolean z) {
                    this.disableAccurateStartPoint = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setShouldDisablePip(boolean z) {
                    this.shouldDisablePip = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setShouldAllowTabletPortraitPlayback(boolean z) {
                    this.shouldAllowTabletPortraitPlayback = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setShouldDisableAmazonADM(boolean z) {
                    this.shouldDisableAmazonADM = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setShouldGetNrmViaMsl(boolean z) {
                    this.shouldGetNrmViaMsl = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetVoipInstallDeadlineInDays(int i) {
                    this.getVoipInstallDeadlineInDays = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setPartnerIntegrationConfig(PartnerIntegrationConfig partnerIntegrationConfig) {
                    if (partnerIntegrationConfig != null) {
                        this.partnerIntegrationConfig = partnerIntegrationConfig;
                        return this;
                    }
                    throw new NullPointerException("Null partnerIntegrationConfig");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetMaxAppLifeDays(int i) {
                    this.getMaxAppLifeDays = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetAppUpdateDialogFreqDays(int i) {
                    this.getAppUpdateDialogFreqDays = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetMobileOnlyMinVersionCode(int i) {
                    this.getMobileOnlyMinVersionCode = Integer.valueOf(i);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsHdrBrightnessBoostEnabled(boolean z) {
                    this.isHdrBrightnessBoostEnabled = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setGetSuppressedLogblobs(List<String> list) {
                    if (list != null) {
                        this.getSuppressedLogblobs = list;
                        return this;
                    }
                    throw new NullPointerException("Null getSuppressedLogblobs");
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setIsConsumptionOnly(boolean z) {
                    this.isConsumptionOnly = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData.Builder setMultiChannelOffline(boolean z) {
                    this.multiChannelOffline = Boolean.valueOf(z);
                    return this;
                }

                @Override // com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData.Builder
                public DeviceConfigData build() {
                    String str = "";
                    if (this.getAppMinVersion == null) {
                        str = " getAppMinVersion";
                    }
                    if (this.getAppRecommendedVersion == null) {
                        str = str + " getAppRecommendedVersion";
                    }
                    if (this.getMdxDisabled == null) {
                        str = str + " getMdxDisabled";
                    }
                    if (this.getConsolidatedloggingSpecification == null) {
                        str = str + " getConsolidatedloggingSpecification";
                    }
                    if (this.getUserSessionTimeoutDuration == null) {
                        str = str + " getUserSessionTimeoutDuration";
                    }
                    if (this.getBreadcrumbLoggingSpecifications == null) {
                        str = str + " getBreadcrumbLoggingSpecifications";
                    }
                    if (this.getErrorLoggingSpecifications == null) {
                        str = str + " getErrorLoggingSpecifications";
                    }
                    if (this.getVideoResolutionOverride == null) {
                        str = str + " getVideoResolutionOverride";
                    }
                    if (this.getRateLimitForGcmBrowseEvents == null) {
                        str = str + " getRateLimitForGcmBrowseEvents";
                    }
                    if (this.getRateLimitForGcmNListChangeEvents == null) {
                        str = str + " getRateLimitForGcmNListChangeEvents";
                    }
                    if (this.getEnableLocalPlayback == null) {
                        str = str + " getEnableLocalPlayback";
                    }
                    if (this.getEnableMdxRemoteControlLockScreen == null) {
                        str = str + " getEnableMdxRemoteControlLockScreen";
                    }
                    if (this.getEnableMdxRemoteControlNotification == null) {
                        str = str + " getEnableMdxRemoteControlNotification";
                    }
                    if (this.isWidevineL1Enabled == null) {
                        str = str + " isWidevineL1Enabled";
                    }
                    if (this.isWidevineL1ReEnabled == null) {
                        str = str + " isWidevineL1ReEnabled";
                    }
                    if (this.shouldForceLegacyCrypto == null) {
                        str = str + " shouldForceLegacyCrypto";
                    }
                    if (this.getAudioFormats == null) {
                        str = str + " getAudioFormats";
                    }
                    if (this.isVoipEnabledOnDevice == null) {
                        str = str + " isVoipEnabledOnDevice";
                    }
                    if (this.getVoipConfiguration == null) {
                        str = str + " getVoipConfiguration";
                    }
                    if (this.getOfflineConfig == null) {
                        str = str + " getOfflineConfig";
                    }
                    if (this.isPlayBillingDisabled == null) {
                        str = str + " isPlayBillingDisabled";
                    }
                    if (this.getMaxVideoBufferSize == null) {
                        str = str + " getMaxVideoBufferSize";
                    }
                    if (this.getDisableLicensePrefetch == null) {
                        str = str + " getDisableLicensePrefetch";
                    }
                    if (this.shouldDisableRoar == null) {
                        str = str + " shouldDisableRoar";
                    }
                    if (this.isAllowHevcMobile == null) {
                        str = str + " isAllowHevcMobile";
                    }
                    if (this.isHdr10Enabled == null) {
                        str = str + " isHdr10Enabled";
                    }
                    if (this.isDolbyVisionEnabled == null) {
                        str = str + " isDolbyVisionEnabled";
                    }
                    if (this.isAV1HDEnabled == null) {
                        str = str + " isAV1HDEnabled";
                    }
                    if (this.isAV1Enabled == null) {
                        str = str + " isAV1Enabled";
                    }
                    if (this.isAV1Hdr10PlusEnabled == null) {
                        str = str + " isAV1Hdr10PlusEnabled";
                    }
                    if (this.isEnabledWidevineL3SystemId4266 == null) {
                        str = str + " isEnabledWidevineL3SystemId4266";
                    }
                    if (this.isDisableLegacyNetflixMdx == null) {
                        str = str + " isDisableLegacyNetflixMdx";
                    }
                    if (this.isPhonePortraitLockEnabled == null) {
                        str = str + " isPhonePortraitLockEnabled";
                    }
                    if (this.pdsAndLogblobConfig == null) {
                        str = str + " pdsAndLogblobConfig";
                    }
                    if (this.isBlacklisted == null) {
                        str = str + " isBlacklisted";
                    }
                    if (this.isEnableOfflineSecureDelete == null) {
                        str = str + " isEnableOfflineSecureDelete";
                    }
                    if (this.getLolomoPrefetchIntervalOverride == null) {
                        str = str + " getLolomoPrefetchIntervalOverride";
                    }
                    if (this.getLolomoCacheExpirationOverride == null) {
                        str = str + " getLolomoCacheExpirationOverride";
                    }
                    if (this.disableAccurateStartPoint == null) {
                        str = str + " disableAccurateStartPoint";
                    }
                    if (this.shouldDisablePip == null) {
                        str = str + " shouldDisablePip";
                    }
                    if (this.shouldAllowTabletPortraitPlayback == null) {
                        str = str + " shouldAllowTabletPortraitPlayback";
                    }
                    if (this.shouldDisableAmazonADM == null) {
                        str = str + " shouldDisableAmazonADM";
                    }
                    if (this.shouldGetNrmViaMsl == null) {
                        str = str + " shouldGetNrmViaMsl";
                    }
                    if (this.getVoipInstallDeadlineInDays == null) {
                        str = str + " getVoipInstallDeadlineInDays";
                    }
                    if (this.partnerIntegrationConfig == null) {
                        str = str + " partnerIntegrationConfig";
                    }
                    if (this.getMaxAppLifeDays == null) {
                        str = str + " getMaxAppLifeDays";
                    }
                    if (this.getAppUpdateDialogFreqDays == null) {
                        str = str + " getAppUpdateDialogFreqDays";
                    }
                    if (this.getMobileOnlyMinVersionCode == null) {
                        str = str + " getMobileOnlyMinVersionCode";
                    }
                    if (this.isHdrBrightnessBoostEnabled == null) {
                        str = str + " isHdrBrightnessBoostEnabled";
                    }
                    if (this.getSuppressedLogblobs == null) {
                        str = str + " getSuppressedLogblobs";
                    }
                    if (this.isConsumptionOnly == null) {
                        str = str + " isConsumptionOnly";
                    }
                    if (this.multiChannelOffline == null) {
                        str = str + " multiChannelOffline";
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:" + str);
                    }
                    return new AutoValue_DeviceConfigData(this.getAppMinVersion.intValue(), this.getAppRecommendedVersion.intValue(), this.getWebsocketDisabled, this.getMdxDisabled.booleanValue(), this.getImagePref, this.getSignUpTimeout, this.getConsolidatedloggingSpecification, this.getUserSessionTimeoutDuration.intValue(), this.getBreadcrumbLoggingSpecifications, this.getErrorLoggingSpecifications, this.getVideoResolutionOverride.intValue(), this.getRateLimitForGcmBrowseEvents.intValue(), this.getRateLimitForGcmNListChangeEvents.intValue(), this.getEnableLocalPlayback.booleanValue(), this.getEnableMdxRemoteControlLockScreen.booleanValue(), this.getEnableMdxRemoteControlNotification.booleanValue(), this.isWidevineL1Enabled.booleanValue(), this.isWidevineL1ReEnabled.booleanValue(), this.shouldForceLegacyCrypto.booleanValue(), this.getAudioFormats.intValue(), this.isVoipEnabledOnDevice.booleanValue(), this.getVoipConfiguration, this.getOfflineConfig, this.isPlayBillingDisabled.booleanValue(), this.getGeoCountryCode, this.getMaxVideoBufferSize.intValue(), this.getDisableLicensePrefetch.booleanValue(), this.shouldDisableRoar.booleanValue(), this.isAllowHevcMobile.booleanValue(), this.isHdr10Enabled.booleanValue(), this.isDolbyVisionEnabled.booleanValue(), this.isAV1HDEnabled.booleanValue(), this.isAV1Enabled.booleanValue(), this.isAV1Hdr10PlusEnabled.booleanValue(), this.isEnabledWidevineL3SystemId4266.booleanValue(), this.isDisableLegacyNetflixMdx.booleanValue(), this.isPhonePortraitLockEnabled.booleanValue(), this.pdsAndLogblobConfig, this.isBlacklisted.booleanValue(), this.isEnableOfflineSecureDelete.booleanValue(), this.getLolomoPrefetchIntervalOverride.intValue(), this.getLolomoCacheExpirationOverride.intValue(), this.disableAccurateStartPoint.booleanValue(), this.shouldDisablePip.booleanValue(), this.shouldAllowTabletPortraitPlayback.booleanValue(), this.shouldDisableAmazonADM.booleanValue(), this.shouldGetNrmViaMsl.booleanValue(), this.getVoipInstallDeadlineInDays.intValue(), this.forcedDeviceCategory, this.partnerIntegrationConfig, this.getMaxAppLifeDays.intValue(), this.getAppUpdateDialogFreqDays.intValue(), this.getMobileOnlyMinVersionCode.intValue(), this.isHdrBrightnessBoostEnabled.booleanValue(), this.getSuppressedLogblobs, this.getChannelIdViaConfig, this.isConsumptionOnly.booleanValue(), this.multiChannelOffline.booleanValue());
                }
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<DeviceConfigData> {
        private final TypeAdapter<Boolean> disableAccurateStartPointAdapter;
        private final TypeAdapter<String> forcedDeviceCategoryAdapter;
        private final TypeAdapter<Integer> getAppMinVersionAdapter;
        private final TypeAdapter<Integer> getAppRecommendedVersionAdapter;
        private final TypeAdapter<Integer> getAppUpdateDialogFreqDaysAdapter;
        private final TypeAdapter<Integer> getAudioFormatsAdapter;
        private final TypeAdapter<List<BreadcrumbLoggingSpecification>> getBreadcrumbLoggingSpecificationsAdapter;
        private final TypeAdapter<String> getChannelIdViaConfigAdapter;
        private final TypeAdapter<List<ConsolidatedLoggingSessionSpecification>> getConsolidatedloggingSpecificationAdapter;
        private final TypeAdapter<Boolean> getDisableLicensePrefetchAdapter;
        private final TypeAdapter<Boolean> getEnableLocalPlaybackAdapter;
        private final TypeAdapter<Boolean> getEnableMdxRemoteControlLockScreenAdapter;
        private final TypeAdapter<Boolean> getEnableMdxRemoteControlNotificationAdapter;
        private final TypeAdapter<List<ErrorLoggingSpecification>> getErrorLoggingSpecificationsAdapter;
        private final TypeAdapter<String> getGeoCountryCodeAdapter;
        private final TypeAdapter<String> getImagePrefAdapter;
        private final TypeAdapter<Integer> getLolomoCacheExpirationOverrideAdapter;
        private final TypeAdapter<Integer> getLolomoPrefetchIntervalOverrideAdapter;
        private final TypeAdapter<Integer> getMaxAppLifeDaysAdapter;
        private final TypeAdapter<Integer> getMaxVideoBufferSizeAdapter;
        private final TypeAdapter<Boolean> getMdxDisabledAdapter;
        private final TypeAdapter<Integer> getMobileOnlyMinVersionCodeAdapter;
        private final TypeAdapter<OfflineConfig> getOfflineConfigAdapter;
        private final TypeAdapter<Integer> getRateLimitForGcmBrowseEventsAdapter;
        private final TypeAdapter<Integer> getRateLimitForGcmNListChangeEventsAdapter;
        private final TypeAdapter<String> getSignUpTimeoutAdapter;
        private final TypeAdapter<List<String>> getSuppressedLogblobsAdapter;
        private final TypeAdapter<Integer> getUserSessionTimeoutDurationAdapter;
        private final TypeAdapter<Integer> getVideoResolutionOverrideAdapter;
        private final TypeAdapter<VoipConfiguration> getVoipConfigurationAdapter;
        private final TypeAdapter<Integer> getVoipInstallDeadlineInDaysAdapter;
        private final TypeAdapter<String> getWebsocketDisabledAdapter;
        private final TypeAdapter<Boolean> isAV1EnabledAdapter;
        private final TypeAdapter<Boolean> isAV1HDEnabledAdapter;
        private final TypeAdapter<Boolean> isAV1Hdr10PlusEnabledAdapter;
        private final TypeAdapter<Boolean> isAllowHevcMobileAdapter;
        private final TypeAdapter<Boolean> isBlacklistedAdapter;
        private final TypeAdapter<Boolean> isConsumptionOnlyAdapter;
        private final TypeAdapter<Boolean> isDisableLegacyNetflixMdxAdapter;
        private final TypeAdapter<Boolean> isDolbyVisionEnabledAdapter;
        private final TypeAdapter<Boolean> isEnableOfflineSecureDeleteAdapter;
        private final TypeAdapter<Boolean> isEnabledWidevineL3SystemId4266Adapter;
        private final TypeAdapter<Boolean> isHdr10EnabledAdapter;
        private final TypeAdapter<Boolean> isHdrBrightnessBoostEnabledAdapter;
        private final TypeAdapter<Boolean> isPhonePortraitLockEnabledAdapter;
        private final TypeAdapter<Boolean> isPlayBillingDisabledAdapter;
        private final TypeAdapter<Boolean> isVoipEnabledOnDeviceAdapter;
        private final TypeAdapter<Boolean> isWidevineL1EnabledAdapter;
        private final TypeAdapter<Boolean> isWidevineL1ReEnabledAdapter;
        private final TypeAdapter<Boolean> multiChannelOfflineAdapter;
        private final TypeAdapter<PartnerIntegrationConfig> partnerIntegrationConfigAdapter;
        private final TypeAdapter<PdsAndLogblobConfig> pdsAndLogblobConfigAdapter;
        private final TypeAdapter<Boolean> shouldAllowTabletPortraitPlaybackAdapter;
        private final TypeAdapter<Boolean> shouldDisableAmazonADMAdapter;
        private final TypeAdapter<Boolean> shouldDisablePipAdapter;
        private final TypeAdapter<Boolean> shouldDisableRoarAdapter;
        private final TypeAdapter<Boolean> shouldForceLegacyCryptoAdapter;
        private final TypeAdapter<Boolean> shouldGetNrmViaMslAdapter;
        private int defaultGetAppMinVersion = 0;
        private int defaultGetAppRecommendedVersion = 0;
        private String defaultGetWebsocketDisabled = null;
        private boolean defaultGetMdxDisabled = false;
        private String defaultGetImagePref = null;
        private String defaultGetSignUpTimeout = null;
        private List<ConsolidatedLoggingSessionSpecification> defaultGetConsolidatedloggingSpecification = null;
        private int defaultGetUserSessionTimeoutDuration = 0;
        private List<BreadcrumbLoggingSpecification> defaultGetBreadcrumbLoggingSpecifications = null;
        private List<ErrorLoggingSpecification> defaultGetErrorLoggingSpecifications = null;
        private int defaultGetVideoResolutionOverride = 0;
        private int defaultGetRateLimitForGcmBrowseEvents = 0;
        private int defaultGetRateLimitForGcmNListChangeEvents = 0;
        private boolean defaultGetEnableLocalPlayback = false;
        private boolean defaultGetEnableMdxRemoteControlLockScreen = false;
        private boolean defaultGetEnableMdxRemoteControlNotification = false;
        private boolean defaultIsWidevineL1Enabled = false;
        private boolean defaultIsWidevineL1ReEnabled = false;
        private boolean defaultShouldForceLegacyCrypto = false;
        private int defaultGetAudioFormats = 0;
        private boolean defaultIsVoipEnabledOnDevice = false;
        private VoipConfiguration defaultGetVoipConfiguration = null;
        private OfflineConfig defaultGetOfflineConfig = null;
        private boolean defaultIsPlayBillingDisabled = false;
        private String defaultGetGeoCountryCode = null;
        private int defaultGetMaxVideoBufferSize = 0;
        private boolean defaultGetDisableLicensePrefetch = false;
        private boolean defaultShouldDisableRoar = false;
        private boolean defaultIsAllowHevcMobile = false;
        private boolean defaultIsHdr10Enabled = false;
        private boolean defaultIsDolbyVisionEnabled = false;
        private boolean defaultIsAV1HDEnabled = false;
        private boolean defaultIsAV1Enabled = false;
        private boolean defaultIsAV1Hdr10PlusEnabled = false;
        private boolean defaultIsEnabledWidevineL3SystemId4266 = false;
        private boolean defaultIsDisableLegacyNetflixMdx = false;
        private boolean defaultIsPhonePortraitLockEnabled = false;
        private PdsAndLogblobConfig defaultPdsAndLogblobConfig = null;
        private boolean defaultIsBlacklisted = false;
        private boolean defaultIsEnableOfflineSecureDelete = false;
        private int defaultGetLolomoPrefetchIntervalOverride = 0;
        private int defaultGetLolomoCacheExpirationOverride = 0;
        private boolean defaultDisableAccurateStartPoint = false;
        private boolean defaultShouldDisablePip = false;
        private boolean defaultShouldAllowTabletPortraitPlayback = false;
        private boolean defaultShouldDisableAmazonADM = false;
        private boolean defaultShouldGetNrmViaMsl = false;
        private int defaultGetVoipInstallDeadlineInDays = 0;
        private String defaultForcedDeviceCategory = null;
        private PartnerIntegrationConfig defaultPartnerIntegrationConfig = null;
        private int defaultGetMaxAppLifeDays = 0;
        private int defaultGetAppUpdateDialogFreqDays = 0;
        private int defaultGetMobileOnlyMinVersionCode = 0;
        private boolean defaultIsHdrBrightnessBoostEnabled = false;
        private List<String> defaultGetSuppressedLogblobs = null;
        private String defaultGetChannelIdViaConfig = null;
        private boolean defaultIsConsumptionOnly = false;
        private boolean defaultMultiChannelOffline = false;

        public GsonTypeAdapter setDefaultDisableAccurateStartPoint(boolean z) {
            this.defaultDisableAccurateStartPoint = z;
            return this;
        }

        public GsonTypeAdapter setDefaultForcedDeviceCategory(String str) {
            this.defaultForcedDeviceCategory = str;
            return this;
        }

        public GsonTypeAdapter setDefaultGetAppMinVersion(int i) {
            this.defaultGetAppMinVersion = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetAppRecommendedVersion(int i) {
            this.defaultGetAppRecommendedVersion = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetAppUpdateDialogFreqDays(int i) {
            this.defaultGetAppUpdateDialogFreqDays = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetAudioFormats(int i) {
            this.defaultGetAudioFormats = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetBreadcrumbLoggingSpecifications(List<BreadcrumbLoggingSpecification> list) {
            this.defaultGetBreadcrumbLoggingSpecifications = list;
            return this;
        }

        public GsonTypeAdapter setDefaultGetChannelIdViaConfig(String str) {
            this.defaultGetChannelIdViaConfig = str;
            return this;
        }

        public GsonTypeAdapter setDefaultGetConsolidatedloggingSpecification(List<ConsolidatedLoggingSessionSpecification> list) {
            this.defaultGetConsolidatedloggingSpecification = list;
            return this;
        }

        public GsonTypeAdapter setDefaultGetDisableLicensePrefetch(boolean z) {
            this.defaultGetDisableLicensePrefetch = z;
            return this;
        }

        public GsonTypeAdapter setDefaultGetEnableLocalPlayback(boolean z) {
            this.defaultGetEnableLocalPlayback = z;
            return this;
        }

        public GsonTypeAdapter setDefaultGetEnableMdxRemoteControlLockScreen(boolean z) {
            this.defaultGetEnableMdxRemoteControlLockScreen = z;
            return this;
        }

        public GsonTypeAdapter setDefaultGetEnableMdxRemoteControlNotification(boolean z) {
            this.defaultGetEnableMdxRemoteControlNotification = z;
            return this;
        }

        public GsonTypeAdapter setDefaultGetErrorLoggingSpecifications(List<ErrorLoggingSpecification> list) {
            this.defaultGetErrorLoggingSpecifications = list;
            return this;
        }

        public GsonTypeAdapter setDefaultGetGeoCountryCode(String str) {
            this.defaultGetGeoCountryCode = str;
            return this;
        }

        public GsonTypeAdapter setDefaultGetImagePref(String str) {
            this.defaultGetImagePref = str;
            return this;
        }

        public GsonTypeAdapter setDefaultGetLolomoCacheExpirationOverride(int i) {
            this.defaultGetLolomoCacheExpirationOverride = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetLolomoPrefetchIntervalOverride(int i) {
            this.defaultGetLolomoPrefetchIntervalOverride = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetMaxAppLifeDays(int i) {
            this.defaultGetMaxAppLifeDays = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetMaxVideoBufferSize(int i) {
            this.defaultGetMaxVideoBufferSize = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetMdxDisabled(boolean z) {
            this.defaultGetMdxDisabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultGetMobileOnlyMinVersionCode(int i) {
            this.defaultGetMobileOnlyMinVersionCode = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetOfflineConfig(OfflineConfig offlineConfig) {
            this.defaultGetOfflineConfig = offlineConfig;
            return this;
        }

        public GsonTypeAdapter setDefaultGetRateLimitForGcmBrowseEvents(int i) {
            this.defaultGetRateLimitForGcmBrowseEvents = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetRateLimitForGcmNListChangeEvents(int i) {
            this.defaultGetRateLimitForGcmNListChangeEvents = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetSignUpTimeout(String str) {
            this.defaultGetSignUpTimeout = str;
            return this;
        }

        public GsonTypeAdapter setDefaultGetSuppressedLogblobs(List<String> list) {
            this.defaultGetSuppressedLogblobs = list;
            return this;
        }

        public GsonTypeAdapter setDefaultGetUserSessionTimeoutDuration(int i) {
            this.defaultGetUserSessionTimeoutDuration = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetVideoResolutionOverride(int i) {
            this.defaultGetVideoResolutionOverride = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetVoipConfiguration(VoipConfiguration voipConfiguration) {
            this.defaultGetVoipConfiguration = voipConfiguration;
            return this;
        }

        public GsonTypeAdapter setDefaultGetVoipInstallDeadlineInDays(int i) {
            this.defaultGetVoipInstallDeadlineInDays = i;
            return this;
        }

        public GsonTypeAdapter setDefaultGetWebsocketDisabled(String str) {
            this.defaultGetWebsocketDisabled = str;
            return this;
        }

        public GsonTypeAdapter setDefaultIsAV1Enabled(boolean z) {
            this.defaultIsAV1Enabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsAV1HDEnabled(boolean z) {
            this.defaultIsAV1HDEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsAV1Hdr10PlusEnabled(boolean z) {
            this.defaultIsAV1Hdr10PlusEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsAllowHevcMobile(boolean z) {
            this.defaultIsAllowHevcMobile = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsBlacklisted(boolean z) {
            this.defaultIsBlacklisted = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsConsumptionOnly(boolean z) {
            this.defaultIsConsumptionOnly = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsDisableLegacyNetflixMdx(boolean z) {
            this.defaultIsDisableLegacyNetflixMdx = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsDolbyVisionEnabled(boolean z) {
            this.defaultIsDolbyVisionEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsEnableOfflineSecureDelete(boolean z) {
            this.defaultIsEnableOfflineSecureDelete = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsEnabledWidevineL3SystemId4266(boolean z) {
            this.defaultIsEnabledWidevineL3SystemId4266 = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsHdr10Enabled(boolean z) {
            this.defaultIsHdr10Enabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsHdrBrightnessBoostEnabled(boolean z) {
            this.defaultIsHdrBrightnessBoostEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsPhonePortraitLockEnabled(boolean z) {
            this.defaultIsPhonePortraitLockEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsPlayBillingDisabled(boolean z) {
            this.defaultIsPlayBillingDisabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsVoipEnabledOnDevice(boolean z) {
            this.defaultIsVoipEnabledOnDevice = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsWidevineL1Enabled(boolean z) {
            this.defaultIsWidevineL1Enabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsWidevineL1ReEnabled(boolean z) {
            this.defaultIsWidevineL1ReEnabled = z;
            return this;
        }

        public GsonTypeAdapter setDefaultMultiChannelOffline(boolean z) {
            this.defaultMultiChannelOffline = z;
            return this;
        }

        public GsonTypeAdapter setDefaultPartnerIntegrationConfig(PartnerIntegrationConfig partnerIntegrationConfig) {
            this.defaultPartnerIntegrationConfig = partnerIntegrationConfig;
            return this;
        }

        public GsonTypeAdapter setDefaultPdsAndLogblobConfig(PdsAndLogblobConfig pdsAndLogblobConfig) {
            this.defaultPdsAndLogblobConfig = pdsAndLogblobConfig;
            return this;
        }

        public GsonTypeAdapter setDefaultShouldAllowTabletPortraitPlayback(boolean z) {
            this.defaultShouldAllowTabletPortraitPlayback = z;
            return this;
        }

        public GsonTypeAdapter setDefaultShouldDisableAmazonADM(boolean z) {
            this.defaultShouldDisableAmazonADM = z;
            return this;
        }

        public GsonTypeAdapter setDefaultShouldDisablePip(boolean z) {
            this.defaultShouldDisablePip = z;
            return this;
        }

        public GsonTypeAdapter setDefaultShouldDisableRoar(boolean z) {
            this.defaultShouldDisableRoar = z;
            return this;
        }

        public GsonTypeAdapter setDefaultShouldForceLegacyCrypto(boolean z) {
            this.defaultShouldForceLegacyCrypto = z;
            return this;
        }

        public GsonTypeAdapter setDefaultShouldGetNrmViaMsl(boolean z) {
            this.defaultShouldGetNrmViaMsl = z;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.getAppMinVersionAdapter = gson.getAdapter(Integer.class);
            this.getAppRecommendedVersionAdapter = gson.getAdapter(Integer.class);
            this.getWebsocketDisabledAdapter = gson.getAdapter(String.class);
            this.getMdxDisabledAdapter = gson.getAdapter(Boolean.class);
            this.getImagePrefAdapter = gson.getAdapter(String.class);
            this.getSignUpTimeoutAdapter = gson.getAdapter(String.class);
            this.getConsolidatedloggingSpecificationAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, ConsolidatedLoggingSessionSpecification.class));
            this.getUserSessionTimeoutDurationAdapter = gson.getAdapter(Integer.class);
            this.getBreadcrumbLoggingSpecificationsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, BreadcrumbLoggingSpecification.class));
            this.getErrorLoggingSpecificationsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, ErrorLoggingSpecification.class));
            this.getVideoResolutionOverrideAdapter = gson.getAdapter(Integer.class);
            this.getRateLimitForGcmBrowseEventsAdapter = gson.getAdapter(Integer.class);
            this.getRateLimitForGcmNListChangeEventsAdapter = gson.getAdapter(Integer.class);
            this.getEnableLocalPlaybackAdapter = gson.getAdapter(Boolean.class);
            this.getEnableMdxRemoteControlLockScreenAdapter = gson.getAdapter(Boolean.class);
            this.getEnableMdxRemoteControlNotificationAdapter = gson.getAdapter(Boolean.class);
            this.isWidevineL1EnabledAdapter = gson.getAdapter(Boolean.class);
            this.isWidevineL1ReEnabledAdapter = gson.getAdapter(Boolean.class);
            this.shouldForceLegacyCryptoAdapter = gson.getAdapter(Boolean.class);
            this.getAudioFormatsAdapter = gson.getAdapter(Integer.class);
            this.isVoipEnabledOnDeviceAdapter = gson.getAdapter(Boolean.class);
            this.getVoipConfigurationAdapter = gson.getAdapter(VoipConfiguration.class);
            this.getOfflineConfigAdapter = gson.getAdapter(OfflineConfig.class);
            this.isPlayBillingDisabledAdapter = gson.getAdapter(Boolean.class);
            this.getGeoCountryCodeAdapter = gson.getAdapter(String.class);
            this.getMaxVideoBufferSizeAdapter = gson.getAdapter(Integer.class);
            this.getDisableLicensePrefetchAdapter = gson.getAdapter(Boolean.class);
            this.shouldDisableRoarAdapter = gson.getAdapter(Boolean.class);
            this.isAllowHevcMobileAdapter = gson.getAdapter(Boolean.class);
            this.isHdr10EnabledAdapter = gson.getAdapter(Boolean.class);
            this.isDolbyVisionEnabledAdapter = gson.getAdapter(Boolean.class);
            this.isAV1HDEnabledAdapter = gson.getAdapter(Boolean.class);
            this.isAV1EnabledAdapter = gson.getAdapter(Boolean.class);
            this.isAV1Hdr10PlusEnabledAdapter = gson.getAdapter(Boolean.class);
            this.isEnabledWidevineL3SystemId4266Adapter = gson.getAdapter(Boolean.class);
            this.isDisableLegacyNetflixMdxAdapter = gson.getAdapter(Boolean.class);
            this.isPhonePortraitLockEnabledAdapter = gson.getAdapter(Boolean.class);
            this.pdsAndLogblobConfigAdapter = gson.getAdapter(PdsAndLogblobConfig.class);
            this.isBlacklistedAdapter = gson.getAdapter(Boolean.class);
            this.isEnableOfflineSecureDeleteAdapter = gson.getAdapter(Boolean.class);
            this.getLolomoPrefetchIntervalOverrideAdapter = gson.getAdapter(Integer.class);
            this.getLolomoCacheExpirationOverrideAdapter = gson.getAdapter(Integer.class);
            this.disableAccurateStartPointAdapter = gson.getAdapter(Boolean.class);
            this.shouldDisablePipAdapter = gson.getAdapter(Boolean.class);
            this.shouldAllowTabletPortraitPlaybackAdapter = gson.getAdapter(Boolean.class);
            this.shouldDisableAmazonADMAdapter = gson.getAdapter(Boolean.class);
            this.shouldGetNrmViaMslAdapter = gson.getAdapter(Boolean.class);
            this.getVoipInstallDeadlineInDaysAdapter = gson.getAdapter(Integer.class);
            this.forcedDeviceCategoryAdapter = gson.getAdapter(String.class);
            this.partnerIntegrationConfigAdapter = gson.getAdapter(PartnerIntegrationConfig.class);
            this.getMaxAppLifeDaysAdapter = gson.getAdapter(Integer.class);
            this.getAppUpdateDialogFreqDaysAdapter = gson.getAdapter(Integer.class);
            this.getMobileOnlyMinVersionCodeAdapter = gson.getAdapter(Integer.class);
            this.isHdrBrightnessBoostEnabledAdapter = gson.getAdapter(Boolean.class);
            this.getSuppressedLogblobsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
            this.getChannelIdViaConfigAdapter = gson.getAdapter(String.class);
            this.isConsumptionOnlyAdapter = gson.getAdapter(Boolean.class);
            this.multiChannelOfflineAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, DeviceConfigData deviceConfigData) {
            if (deviceConfigData == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("min_version");
            this.getAppMinVersionAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getAppMinVersion()));
            jsonWriter.name("current_version");
            this.getAppRecommendedVersionAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getAppRecommendedVersion()));
            jsonWriter.name("disable_websocket");
            this.getWebsocketDisabledAdapter.write(jsonWriter, deviceConfigData.getWebsocketDisabled());
            jsonWriter.name("disable_mdx");
            this.getMdxDisabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.getMdxDisabled()));
            jsonWriter.name("image_pref");
            this.getImagePrefAdapter.write(jsonWriter, deviceConfigData.getImagePref());
            jsonWriter.name("signup_timeout");
            this.getSignUpTimeoutAdapter.write(jsonWriter, deviceConfigData.getSignUpTimeout());
            jsonWriter.name("consolidated_logging_specification");
            this.getConsolidatedloggingSpecificationAdapter.write(jsonWriter, deviceConfigData.getConsolidatedloggingSpecification());
            jsonWriter.name("user_session_timeout_duration");
            this.getUserSessionTimeoutDurationAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getUserSessionTimeoutDuration()));
            jsonWriter.name("breadcrumb_logging_config");
            this.getBreadcrumbLoggingSpecificationsAdapter.write(jsonWriter, deviceConfigData.getBreadcrumbLoggingSpecifications());
            jsonWriter.name("error_logging_config");
            this.getErrorLoggingSpecificationsAdapter.write(jsonWriter, deviceConfigData.getErrorLoggingSpecifications());
            jsonWriter.name("videoResolutionOverride");
            this.getVideoResolutionOverrideAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getVideoResolutionOverride()));
            jsonWriter.name("gcmBrowseEventRateLimitInSecs");
            this.getRateLimitForGcmBrowseEventsAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getRateLimitForGcmBrowseEvents()));
            jsonWriter.name("gcmNListChangeEventRateLimitInSecs");
            this.getRateLimitForGcmNListChangeEventsAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getRateLimitForGcmNListChangeEvents()));
            jsonWriter.name("enableLocalPlayback");
            this.getEnableLocalPlaybackAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.getEnableLocalPlayback()));
            jsonWriter.name("enableMdxRemoteControlLockScreen");
            this.getEnableMdxRemoteControlLockScreenAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.getEnableMdxRemoteControlLockScreen()));
            jsonWriter.name("enableMdxRemoteControlNotification");
            this.getEnableMdxRemoteControlNotificationAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.getEnableMdxRemoteControlNotification()));
            jsonWriter.name("enableWidevineL1");
            this.isWidevineL1EnabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isWidevineL1Enabled()));
            jsonWriter.name("reEnableWidevineL1");
            this.isWidevineL1ReEnabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isWidevineL1ReEnabled()));
            jsonWriter.name("forceLegacyCrypto");
            this.shouldForceLegacyCryptoAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.shouldForceLegacyCrypto()));
            jsonWriter.name("audioFormats");
            this.getAudioFormatsAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getAudioFormats()));
            jsonWriter.name("voipEnabledOnDevice");
            this.isVoipEnabledOnDeviceAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isVoipEnabledOnDevice()));
            jsonWriter.name("voipConfig");
            this.getVoipConfigurationAdapter.write(jsonWriter, deviceConfigData.getVoipConfiguration());
            jsonWriter.name("offlineConfig");
            this.getOfflineConfigAdapter.write(jsonWriter, deviceConfigData.getOfflineConfig());
            jsonWriter.name("disablePlayBilling");
            this.isPlayBillingDisabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isPlayBillingDisabled()));
            jsonWriter.name("geoCountryCode");
            this.getGeoCountryCodeAdapter.write(jsonWriter, deviceConfigData.getGeoCountryCode());
            jsonWriter.name("maxVideoBufferSize");
            this.getMaxVideoBufferSizeAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getMaxVideoBufferSize()));
            jsonWriter.name("disableLicensePrefetch");
            this.getDisableLicensePrefetchAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.getDisableLicensePrefetch()));
            jsonWriter.name("disableRoar");
            this.shouldDisableRoarAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.shouldDisableRoar()));
            jsonWriter.name("allowHevcMobile");
            this.isAllowHevcMobileAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isAllowHevcMobile()));
            jsonWriter.name("enableHdr10");
            this.isHdr10EnabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isHdr10Enabled()));
            jsonWriter.name("enableDolbyVision");
            this.isDolbyVisionEnabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isDolbyVisionEnabled()));
            jsonWriter.name("enableAV1HD");
            this.isAV1HDEnabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isAV1HDEnabled()));
            jsonWriter.name("enableAV1");
            this.isAV1EnabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isAV1Enabled()));
            jsonWriter.name("enableAV1Hdr10Plus");
            this.isAV1Hdr10PlusEnabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isAV1Hdr10PlusEnabled()));
            jsonWriter.name("enableWidevineL3SystemId4266");
            this.isEnabledWidevineL3SystemId4266Adapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isEnabledWidevineL3SystemId4266()));
            jsonWriter.name("disableLegacyNetflixMdx");
            this.isDisableLegacyNetflixMdxAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isDisableLegacyNetflixMdx()));
            jsonWriter.name("lockPhonePortraitEnabled");
            this.isPhonePortraitLockEnabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isPhonePortraitLockEnabled()));
            jsonWriter.name("pdsAndLogblobConfig");
            this.pdsAndLogblobConfigAdapter.write(jsonWriter, deviceConfigData.pdsAndLogblobConfig());
            jsonWriter.name("isBlacklisted");
            this.isBlacklistedAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isBlacklisted()));
            jsonWriter.name("enableOfflineSecureDelete");
            this.isEnableOfflineSecureDeleteAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isEnableOfflineSecureDelete()));
            jsonWriter.name("lolomoPrefetchIntervalOverride");
            this.getLolomoPrefetchIntervalOverrideAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getLolomoPrefetchIntervalOverride()));
            jsonWriter.name("lolomoCacheExpirationOverride");
            this.getLolomoCacheExpirationOverrideAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getLolomoCacheExpirationOverride()));
            jsonWriter.name("disableAccurateStartPoint");
            this.disableAccurateStartPointAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.disableAccurateStartPoint()));
            jsonWriter.name("disablePip");
            this.shouldDisablePipAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.shouldDisablePip()));
            jsonWriter.name("allowTabletPortraitPlayback");
            this.shouldAllowTabletPortraitPlaybackAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.shouldAllowTabletPortraitPlayback()));
            jsonWriter.name("disableAmazonADM");
            this.shouldDisableAmazonADMAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.shouldDisableAmazonADM()));
            jsonWriter.name("nrmViaMsl");
            this.shouldGetNrmViaMslAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.shouldGetNrmViaMsl()));
            jsonWriter.name("voipInstallDeadlineInDays");
            this.getVoipInstallDeadlineInDaysAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getVoipInstallDeadlineInDays()));
            jsonWriter.name("forcedDeviceCategory");
            this.forcedDeviceCategoryAdapter.write(jsonWriter, deviceConfigData.forcedDeviceCategory());
            jsonWriter.name("partnerIntegrationConfig");
            this.partnerIntegrationConfigAdapter.write(jsonWriter, deviceConfigData.partnerIntegrationConfig());
            jsonWriter.name("maxAppLifeDays");
            this.getMaxAppLifeDaysAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getMaxAppLifeDays()));
            jsonWriter.name("appUpdateDialogFreqDays");
            this.getAppUpdateDialogFreqDaysAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getAppUpdateDialogFreqDays()));
            jsonWriter.name("mobileOnlyMinVersionCode");
            this.getMobileOnlyMinVersionCodeAdapter.write(jsonWriter, Integer.valueOf(deviceConfigData.getMobileOnlyMinVersionCode()));
            jsonWriter.name("enableHdrBrightnessBoost");
            this.isHdrBrightnessBoostEnabledAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isHdrBrightnessBoostEnabled()));
            jsonWriter.name("suppressedLogblobs");
            this.getSuppressedLogblobsAdapter.write(jsonWriter, deviceConfigData.getSuppressedLogblobs());
            jsonWriter.name("channelIdViaConfig");
            this.getChannelIdViaConfigAdapter.write(jsonWriter, deviceConfigData.getChannelIdViaConfig());
            jsonWriter.name("isConsumptionOnly");
            this.isConsumptionOnlyAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.isConsumptionOnly()));
            jsonWriter.name("multiChannelOffline");
            this.multiChannelOfflineAdapter.write(jsonWriter, Boolean.valueOf(deviceConfigData.multiChannelOffline()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public DeviceConfigData read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.defaultGetAppMinVersion;
            int i2 = this.defaultGetAppRecommendedVersion;
            String str = this.defaultGetWebsocketDisabled;
            boolean z = this.defaultGetMdxDisabled;
            String str2 = this.defaultGetImagePref;
            String str3 = this.defaultGetSignUpTimeout;
            List<ConsolidatedLoggingSessionSpecification> list = this.defaultGetConsolidatedloggingSpecification;
            int i3 = this.defaultGetUserSessionTimeoutDuration;
            List<BreadcrumbLoggingSpecification> list2 = this.defaultGetBreadcrumbLoggingSpecifications;
            List<ErrorLoggingSpecification> list3 = this.defaultGetErrorLoggingSpecifications;
            int i4 = this.defaultGetVideoResolutionOverride;
            int i5 = this.defaultGetRateLimitForGcmBrowseEvents;
            int i6 = this.defaultGetRateLimitForGcmNListChangeEvents;
            boolean z2 = this.defaultGetEnableLocalPlayback;
            boolean z3 = this.defaultGetEnableMdxRemoteControlLockScreen;
            boolean z4 = this.defaultGetEnableMdxRemoteControlNotification;
            boolean z5 = this.defaultIsWidevineL1Enabled;
            boolean z6 = this.defaultIsWidevineL1ReEnabled;
            boolean z7 = this.defaultShouldForceLegacyCrypto;
            int i7 = this.defaultGetAudioFormats;
            boolean z8 = this.defaultIsVoipEnabledOnDevice;
            VoipConfiguration voipConfiguration = this.defaultGetVoipConfiguration;
            OfflineConfig offlineConfig = this.defaultGetOfflineConfig;
            boolean z9 = this.defaultIsPlayBillingDisabled;
            String str4 = this.defaultGetGeoCountryCode;
            int i8 = this.defaultGetMaxVideoBufferSize;
            boolean z10 = this.defaultGetDisableLicensePrefetch;
            boolean z11 = this.defaultShouldDisableRoar;
            boolean z12 = this.defaultIsAllowHevcMobile;
            boolean z13 = this.defaultIsHdr10Enabled;
            boolean z14 = this.defaultIsDolbyVisionEnabled;
            boolean z15 = this.defaultIsAV1HDEnabled;
            boolean z16 = this.defaultIsAV1Enabled;
            boolean z17 = this.defaultIsAV1Hdr10PlusEnabled;
            boolean z18 = this.defaultIsEnabledWidevineL3SystemId4266;
            boolean z19 = this.defaultIsDisableLegacyNetflixMdx;
            boolean z20 = this.defaultIsPhonePortraitLockEnabled;
            PdsAndLogblobConfig pdsAndLogblobConfig = this.defaultPdsAndLogblobConfig;
            boolean z21 = this.defaultIsBlacklisted;
            boolean z22 = this.defaultIsEnableOfflineSecureDelete;
            int i9 = this.defaultGetLolomoPrefetchIntervalOverride;
            int i10 = this.defaultGetLolomoCacheExpirationOverride;
            boolean z23 = this.defaultDisableAccurateStartPoint;
            boolean z24 = this.defaultShouldDisablePip;
            boolean z25 = this.defaultShouldAllowTabletPortraitPlayback;
            boolean z26 = this.defaultShouldDisableAmazonADM;
            boolean z27 = this.defaultShouldGetNrmViaMsl;
            int i11 = this.defaultGetVoipInstallDeadlineInDays;
            String str5 = this.defaultForcedDeviceCategory;
            PartnerIntegrationConfig partnerIntegrationConfig = this.defaultPartnerIntegrationConfig;
            int i12 = this.defaultGetMaxAppLifeDays;
            int i13 = this.defaultGetAppUpdateDialogFreqDays;
            int i14 = this.defaultGetMobileOnlyMinVersionCode;
            boolean z28 = this.defaultIsHdrBrightnessBoostEnabled;
            List<String> list4 = this.defaultGetSuppressedLogblobs;
            String str6 = this.defaultGetChannelIdViaConfig;
            boolean z29 = this.defaultIsConsumptionOnly;
            boolean z30 = this.defaultMultiChannelOffline;
            int i15 = i2;
            String str7 = str;
            boolean z31 = z;
            String str8 = str2;
            String str9 = str3;
            List<ConsolidatedLoggingSessionSpecification> list5 = list;
            int i16 = i3;
            List<BreadcrumbLoggingSpecification> list6 = list2;
            List<ErrorLoggingSpecification> list7 = list3;
            int i17 = i4;
            int i18 = i5;
            int i19 = i6;
            boolean z32 = z2;
            int i20 = i;
            boolean z33 = z3;
            boolean z34 = z4;
            boolean z35 = z5;
            boolean z36 = z6;
            boolean z37 = z7;
            int i21 = i7;
            boolean z38 = z8;
            VoipConfiguration voipConfiguration2 = voipConfiguration;
            OfflineConfig offlineConfig2 = offlineConfig;
            boolean z39 = z9;
            String str10 = str4;
            int i22 = i8;
            boolean z40 = z10;
            boolean z41 = z11;
            boolean z42 = z12;
            boolean z43 = z13;
            boolean z44 = z14;
            boolean z45 = z15;
            boolean z46 = z16;
            boolean z47 = z17;
            boolean z48 = z18;
            boolean z49 = z19;
            boolean z50 = z20;
            PdsAndLogblobConfig pdsAndLogblobConfig2 = pdsAndLogblobConfig;
            boolean z51 = z21;
            boolean z52 = z22;
            int i23 = i9;
            int i24 = i10;
            boolean z53 = z23;
            boolean z54 = z24;
            boolean z55 = z25;
            boolean z56 = z26;
            boolean z57 = z27;
            int i25 = i11;
            String str11 = str5;
            PartnerIntegrationConfig partnerIntegrationConfig2 = partnerIntegrationConfig;
            int i26 = i12;
            int i27 = i13;
            int i28 = i14;
            boolean z58 = z28;
            List<String> list8 = list4;
            String str12 = str6;
            boolean z59 = z29;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2045101788:
                            if (nextName.equals("enableMdxRemoteControlNotification")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1941574539:
                            if (nextName.equals("forceLegacyCrypto")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1911991181:
                            if (nextName.equals("videoResolutionOverride")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1860795327:
                            if (nextName.equals("mobileOnlyMinVersionCode")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1839513339:
                            if (nextName.equals("enableWidevineL1")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1787064875:
                            if (nextName.equals("allowHevcMobile")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1726803809:
                            if (nextName.equals("disablePlayBilling")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1722675216:
                            if (nextName.equals("enableMdxRemoteControlLockScreen")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1618915953:
                            if (nextName.equals("disablePip")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1476442363:
                            if (nextName.equals("offlineConfig")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1457478411:
                            if (nextName.equals("enableAV1HD")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1450534958:
                            if (nextName.equals("enableHdr10")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1442884985:
                            if (nextName.equals("image_pref")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1438090902:
                            if (nextName.equals("disableAccurateStartPoint")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1428865233:
                            if (nextName.equals("user_session_timeout_duration")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1362588080:
                            if (nextName.equals("lolomoPrefetchIntervalOverride")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1280194050:
                            if (nextName.equals("disableAmazonADM")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1203005191:
                            if (nextName.equals("multiChannelOffline")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1139094184:
                            if (nextName.equals("reEnableWidevineL1")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1064119330:
                            if (nextName.equals("breadcrumb_logging_config")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1028471729:
                            if (nextName.equals("voipInstallDeadlineInDays")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1010235978:
                            if (nextName.equals("voipEnabledOnDevice")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case -893447969:
                            if (nextName.equals("consolidated_logging_specification")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case -736504349:
                            if (nextName.equals("enableLocalPlayback")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case -631683527:
                            if (nextName.equals("enableAV1")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case -558909648:
                            if (nextName.equals("disable_websocket")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case -419030912:
                            if (nextName.equals("disableLegacyNetflixMdx")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case -345509118:
                            if (nextName.equals("enableOfflineSecureDelete")) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case -294914069:
                            if (nextName.equals("min_version")) {
                                c = 28;
                                break;
                            }
                            c = 65535;
                            break;
                        case -285016334:
                            if (nextName.equals("isBlacklisted")) {
                                c = 29;
                                break;
                            }
                            c = 65535;
                            break;
                        case -276635984:
                            if (nextName.equals("maxAppLifeDays")) {
                                c = 30;
                                break;
                            }
                            c = 65535;
                            break;
                        case -122259994:
                            if (nextName.equals("suppressedLogblobs")) {
                                c = 31;
                                break;
                            }
                            c = 65535;
                            break;
                        case -31468021:
                            if (nextName.equals("pdsAndLogblobConfig")) {
                                c = ' ';
                                break;
                            }
                            c = 65535;
                            break;
                        case -19679059:
                            if (nextName.equals("forcedDeviceCategory")) {
                                c = '!';
                                break;
                            }
                            c = 65535;
                            break;
                        case -10074311:
                            if (nextName.equals("error_logging_config")) {
                                c = JsonFactory.DEFAULT_QUOTE_CHAR;
                                break;
                            }
                            c = 65535;
                            break;
                        case 302389667:
                            if (nextName.equals("lockPhonePortraitEnabled")) {
                                c = '#';
                                break;
                            }
                            c = 65535;
                            break;
                        case 336204050:
                            if (nextName.equals("channelIdViaConfig")) {
                                c = '$';
                                break;
                            }
                            c = 65535;
                            break;
                        case 376084769:
                            if (nextName.equals("nrmViaMsl")) {
                                c = '%';
                                break;
                            }
                            c = 65535;
                            break;
                        case 473958658:
                            if (nextName.equals("voipConfig")) {
                                c = '&';
                                break;
                            }
                            c = 65535;
                            break;
                        case 517852474:
                            if (nextName.equals("signup_timeout")) {
                                c = '\'';
                                break;
                            }
                            c = 65535;
                            break;
                        case 603715602:
                            if (nextName.equals("current_version")) {
                                c = '(';
                                break;
                            }
                            c = 65535;
                            break;
                        case 706731329:
                            if (nextName.equals("appUpdateDialogFreqDays")) {
                                c = ')';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1112597509:
                            if (nextName.equals("allowTabletPortraitPlayback")) {
                                c = '*';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1152627549:
                            if (nextName.equals("isConsumptionOnly")) {
                                c = '+';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1249366751:
                            if (nextName.equals("enableHdrBrightnessBoost")) {
                                c = ',';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1310004083:
                            if (nextName.equals("gcmNListChangeEventRateLimitInSecs")) {
                                c = '-';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1314074077:
                            if (nextName.equals("enableDolbyVision")) {
                                c = '.';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1353278006:
                            if (nextName.equals("disableRoar")) {
                                c = '/';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1353663466:
                            if (nextName.equals("disable_mdx")) {
                                c = '0';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1532218002:
                            if (nextName.equals("geoCountryCode")) {
                                c = '1';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1597156502:
                            if (nextName.equals("enableAV1Hdr10Plus")) {
                                c = '2';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1717517123:
                            if (nextName.equals("gcmBrowseEventRateLimitInSecs")) {
                                c = '3';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2031167142:
                            if (nextName.equals("audioFormats")) {
                                c = '4';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2060545807:
                            if (nextName.equals("enableWidevineL3SystemId4266")) {
                                c = '5';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2088042832:
                            if (nextName.equals("disableLicensePrefetch")) {
                                c = '6';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2116141646:
                            if (nextName.equals("partnerIntegrationConfig")) {
                                c = '7';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2120661304:
                            if (nextName.equals("maxVideoBufferSize")) {
                                c = '8';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2129675061:
                            if (nextName.equals("lolomoCacheExpirationOverride")) {
                                c = '9';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            z34 = this.getEnableMdxRemoteControlNotificationAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 1:
                            z37 = this.shouldForceLegacyCryptoAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 2:
                            i17 = this.getVideoResolutionOverrideAdapter.read(jsonReader).intValue();
                            continue;
                        case 3:
                            i28 = this.getMobileOnlyMinVersionCodeAdapter.read(jsonReader).intValue();
                            continue;
                        case 4:
                            z35 = this.isWidevineL1EnabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 5:
                            z42 = this.isAllowHevcMobileAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 6:
                            z39 = this.isPlayBillingDisabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 7:
                            z33 = this.getEnableMdxRemoteControlLockScreenAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '\b':
                            z54 = this.shouldDisablePipAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '\t':
                            offlineConfig2 = this.getOfflineConfigAdapter.read(jsonReader);
                            continue;
                        case '\n':
                            z45 = this.isAV1HDEnabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 11:
                            z43 = this.isHdr10EnabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '\f':
                            str8 = this.getImagePrefAdapter.read(jsonReader);
                            continue;
                        case '\r':
                            z53 = this.disableAccurateStartPointAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 14:
                            i16 = this.getUserSessionTimeoutDurationAdapter.read(jsonReader).intValue();
                            continue;
                        case 15:
                            i23 = this.getLolomoPrefetchIntervalOverrideAdapter.read(jsonReader).intValue();
                            continue;
                        case 16:
                            z56 = this.shouldDisableAmazonADMAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 17:
                            z30 = this.multiChannelOfflineAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 18:
                            z36 = this.isWidevineL1ReEnabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 19:
                            list6 = this.getBreadcrumbLoggingSpecificationsAdapter.read(jsonReader);
                            continue;
                        case 20:
                            i25 = this.getVoipInstallDeadlineInDaysAdapter.read(jsonReader).intValue();
                            continue;
                        case 21:
                            z38 = this.isVoipEnabledOnDeviceAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 22:
                            list5 = this.getConsolidatedloggingSpecificationAdapter.read(jsonReader);
                            continue;
                        case 23:
                            z32 = this.getEnableLocalPlaybackAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 24:
                            z46 = this.isAV1EnabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 25:
                            str7 = this.getWebsocketDisabledAdapter.read(jsonReader);
                            continue;
                        case 26:
                            z49 = this.isDisableLegacyNetflixMdxAdapter.read(jsonReader).booleanValue();
                            continue;
                        case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                            z52 = this.isEnableOfflineSecureDeleteAdapter.read(jsonReader).booleanValue();
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                            i20 = this.getAppMinVersionAdapter.read(jsonReader).intValue();
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                            z51 = this.isBlacklistedAdapter.read(jsonReader).booleanValue();
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                            i26 = this.getMaxAppLifeDaysAdapter.read(jsonReader).intValue();
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                            list8 = this.getSuppressedLogblobsAdapter.read(jsonReader);
                            continue;
                        case ' ':
                            pdsAndLogblobConfig2 = this.pdsAndLogblobConfigAdapter.read(jsonReader);
                            continue;
                        case '!':
                            str11 = this.forcedDeviceCategoryAdapter.read(jsonReader);
                            continue;
                        case '\"':
                            list7 = this.getErrorLoggingSpecificationsAdapter.read(jsonReader);
                            continue;
                        case '#':
                            z50 = this.isPhonePortraitLockEnabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '$':
                            str12 = this.getChannelIdViaConfigAdapter.read(jsonReader);
                            continue;
                        case '%':
                            z57 = this.shouldGetNrmViaMslAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '&':
                            voipConfiguration2 = this.getVoipConfigurationAdapter.read(jsonReader);
                            continue;
                        case '\'':
                            str9 = this.getSignUpTimeoutAdapter.read(jsonReader);
                            continue;
                        case JSONzip.substringLimit /* 40 */:
                            i15 = this.getAppRecommendedVersionAdapter.read(jsonReader).intValue();
                            continue;
                        case ')':
                            i27 = this.getAppUpdateDialogFreqDaysAdapter.read(jsonReader).intValue();
                            continue;
                        case '*':
                            z55 = this.shouldAllowTabletPortraitPlaybackAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '+':
                            z59 = this.isConsumptionOnlyAdapter.read(jsonReader).booleanValue();
                            continue;
                        case ',':
                            z58 = this.isHdrBrightnessBoostEnabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '-':
                            i19 = this.getRateLimitForGcmNListChangeEventsAdapter.read(jsonReader).intValue();
                            continue;
                        case '.':
                            z44 = this.isDolbyVisionEnabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '/':
                            z41 = this.shouldDisableRoarAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '0':
                            z31 = this.getMdxDisabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '1':
                            str10 = this.getGeoCountryCodeAdapter.read(jsonReader);
                            continue;
                        case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                            z47 = this.isAV1Hdr10PlusEnabledAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '3':
                            i18 = this.getRateLimitForGcmBrowseEventsAdapter.read(jsonReader).intValue();
                            continue;
                        case '4':
                            i21 = this.getAudioFormatsAdapter.read(jsonReader).intValue();
                            continue;
                        case '5':
                            z48 = this.isEnabledWidevineL3SystemId4266Adapter.read(jsonReader).booleanValue();
                            continue;
                        case '6':
                            z40 = this.getDisableLicensePrefetchAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '7':
                            partnerIntegrationConfig2 = this.partnerIntegrationConfigAdapter.read(jsonReader);
                            continue;
                        case '8':
                            i22 = this.getMaxVideoBufferSizeAdapter.read(jsonReader).intValue();
                            continue;
                        case '9':
                            i24 = this.getLolomoCacheExpirationOverrideAdapter.read(jsonReader).intValue();
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_DeviceConfigData(i20, i15, str7, z31, str8, str9, list5, i16, list6, list7, i17, i18, i19, z32, z33, z34, z35, z36, z37, i21, z38, voipConfiguration2, offlineConfig2, z39, str10, i22, z40, z41, z42, z43, z44, z45, z46, z47, z48, z49, z50, pdsAndLogblobConfig2, z51, z52, i23, i24, z53, z54, z55, z56, z57, i25, str11, partnerIntegrationConfig2, i26, i27, i28, z58, list8, str12, z59, z30);
        }
    }
}
