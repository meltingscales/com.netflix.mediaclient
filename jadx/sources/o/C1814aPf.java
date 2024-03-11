package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.EdgeStack;
import com.netflix.mediaclient.service.webclient.model.leafs.BreadcrumbLoggingSpecification;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.ErrorLoggingSpecification;
import com.netflix.mediaclient.service.webclient.model.leafs.OfflineConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.PdsAndLogblobConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.aPf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1814aPf {
    private static String d = "nf_configuration_device";
    public static final Boolean e;
    private Context a;
    private Map<String, ConsolidatedLoggingSessionSpecification> b;
    private DeviceConfigData c;

    public void b() {
    }

    static {
        e = Boolean.valueOf(C8054ddD.c() > 8);
    }

    public C1814aPf(Context context) {
        this.b = new HashMap();
        this.a = context;
        this.c = DeviceConfigData.fromJsonString(C8157dfA.e(context, "deviceConfig", (String) null));
        this.b = ac();
        ab();
    }

    private void ab() {
        DeviceConfigData deviceConfigData = this.c;
        C8120deQ.d(deviceConfigData != null ? deviceConfigData.forcedDeviceCategory() : null);
    }

    public String o() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getImagePref();
        }
        return null;
    }

    public int d() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getAppMinVersion();
        }
        return -1;
    }

    public int e() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getAppRecommendedVersion();
        }
        return -1;
    }

    public boolean a() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isWidevineL1Enabled();
        }
        return false;
    }

    public boolean U() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isWidevineL1ReEnabled();
        }
        return false;
    }

    public boolean K() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isHdr10Enabled();
        }
        return false;
    }

    public boolean J() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isDolbyVisionEnabled();
        }
        return false;
    }

    public boolean C() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isAV1Enabled();
        }
        return false;
    }

    public boolean B() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isAV1Hdr10PlusEnabled();
        }
        return false;
    }

    public boolean H() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isDisableLegacyNetflixMdx();
        }
        return false;
    }

    public boolean G() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getMdxDisabled();
        }
        return false;
    }

    public int u() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getVideoResolutionOverride();
        }
        return 0;
    }

    public int t() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getRateLimitForGcmBrowseEvents();
        }
        return 0;
    }

    public int r() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getRateLimitForGcmNListChangeEvents();
        }
        return 0;
    }

    public int z() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getAudioFormats();
        }
        return 0;
    }

    public boolean S() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isPlayBillingDisabled();
        }
        return false;
    }

    public boolean E() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isConsumptionOnly();
        }
        return false;
    }

    public boolean R() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.multiChannelOffline();
        }
        return false;
    }

    public ConsolidatedLoggingSessionSpecification e(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        return this.b.get(str);
    }

    public List<String> w() {
        DeviceConfigData deviceConfigData = this.c;
        return deviceConfigData == null ? Collections.emptyList() : deviceConfigData.getSuppressedLogblobs();
    }

    public void d(DeviceConfigData deviceConfigData) {
        if (deviceConfigData == null) {
            C1044Mm.d(d, "deviceConfig object is null - ignore overwrite");
            return;
        }
        boolean e2 = e(this.a);
        C8157dfA.a(this.a, "deviceConfig", deviceConfigData.toJsonString());
        a(deviceConfigData.shouldDisableRoar());
        b(deviceConfigData.getLolomoCacheExpirationOverride());
        this.c = deviceConfigData;
        this.b = ac();
        if (!(!e2) || this.c.forcedDeviceCategory() == null) {
            return;
        }
        ab();
    }

    public boolean M() {
        return C8157dfA.b(this.a, "nf_device_config_cached", false);
    }

    private static Map<String, ConsolidatedLoggingSessionSpecification> e(List<ConsolidatedLoggingSessionSpecification> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (ConsolidatedLoggingSessionSpecification consolidatedLoggingSessionSpecification : list) {
                if (consolidatedLoggingSessionSpecification != null && consolidatedLoggingSessionSpecification.getSession() != null) {
                    hashMap.put(consolidatedLoggingSessionSpecification.getSession(), consolidatedLoggingSessionSpecification);
                }
            }
        }
        return hashMap;
    }

    private Map<String, ConsolidatedLoggingSessionSpecification> ac() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData == null) {
            return new HashMap();
        }
        return e(deviceConfigData.getConsolidatedloggingSpecification());
    }

    public int y() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getUserSessionTimeoutDuration();
        }
        return Integer.MIN_VALUE;
    }

    public List<BreadcrumbLoggingSpecification> g() {
        DeviceConfigData deviceConfigData = this.c;
        return deviceConfigData != null ? deviceConfigData.getBreadcrumbLoggingSpecifications() : new ArrayList();
    }

    public List<ErrorLoggingSpecification> f() {
        DeviceConfigData deviceConfigData = this.c;
        return deviceConfigData != null ? deviceConfigData.getErrorLoggingSpecifications() : new ArrayList();
    }

    public PdsAndLogblobConfig s() {
        DeviceConfigData deviceConfigData = this.c;
        return (deviceConfigData == null || deviceConfigData.pdsAndLogblobConfig() == null) ? PdsAndLogblobConfig.getDefault() : this.c.pdsAndLogblobConfig();
    }

    public PartnerIntegrationConfig q() {
        DeviceConfigData deviceConfigData = this.c;
        return (deviceConfigData == null || deviceConfigData.partnerIntegrationConfig() == null) ? PartnerIntegrationConfig.getDefault() : this.c.partnerIntegrationConfig();
    }

    public boolean P() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getEnableMdxRemoteControlLockScreen();
        }
        return true;
    }

    public boolean Q() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getEnableMdxRemoteControlNotification();
        }
        return true;
    }

    public boolean O() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getEnableLocalPlayback();
        }
        return true;
    }

    public boolean Y() {
        DeviceConfigData deviceConfigData = this.c;
        return deviceConfigData == null || !deviceConfigData.isVoipEnabledOnDevice();
    }

    public VoipConfiguration x() {
        DeviceConfigData deviceConfigData = this.c;
        return deviceConfigData != null ? deviceConfigData.getVoipConfiguration() : VoipConfiguration.getDefault();
    }

    public OfflineConfig n() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getOfflineConfig();
        }
        return null;
    }

    public boolean A() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isAllowHevcMobile();
        }
        return false;
    }

    public boolean I() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getDisableLicensePrefetch();
        }
        return false;
    }

    public String j() {
        DeviceConfigData deviceConfigData = this.c;
        return deviceConfigData != null ? deviceConfigData.getGeoCountryCode() : "";
    }

    public boolean F() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.disableAccurateStartPoint();
        }
        return false;
    }

    public long v() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData == null) {
            return 120000L;
        }
        String signUpTimeout = deviceConfigData.getSignUpTimeout();
        if (C8168dfL.h(signUpTimeout)) {
            return Long.parseLong(signUpTimeout);
        }
        return 120000L;
    }

    public int m() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getMaxVideoBufferSize();
        }
        return 0;
    }

    public String p() {
        String b;
        String e2 = C8157dfA.e(this.a, "webview_url_preference", "");
        if (e2.length() > 0) {
            b = "https://" + e2;
        } else {
            b = b(this.a);
        }
        C1044Mm.e(d, "mSignUpBootloader: " + b);
        return b;
    }

    public static String b(Context context) {
        return b(C1816aPh.b(context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aPf$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[EdgeStack.values().length];
            d = iArr;
            try {
                iArr[EdgeStack.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[EdgeStack.STAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[EdgeStack.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[EdgeStack.TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String b(EdgeStack edgeStack) {
        int i = AnonymousClass5.d[edgeStack.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "https://release.staging.web.netflix.com";
            }
            if (i == 3) {
                return "https://release.int.web.netflix.com";
            }
            if (i == 4) {
                return "https://develop.test.web.netflix.com";
            }
        }
        return "https://www.netflix.com";
    }

    public boolean L() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.isEnabledWidevineL3SystemId4266();
        }
        return true;
    }

    public void c() {
        if (M()) {
            C8197dfo c8197dfo = new C8197dfo();
            c8197dfo.a("nf_device_config_cached");
            c8197dfo.a("image_pref");
            c8197dfo.a("signup_enabled");
            c8197dfo.a("signup_timeout");
            c8197dfo.a("nf_subtitle_configuraton");
            c8197dfo.a("cl_configuration");
            c8197dfo.a("ip_connectivity_policy_overide");
            c8197dfo.a("apm_user_session_timeout_duration_override");
            c8197dfo.a("breadcrumb_log_configuration");
            c8197dfo.a("error_log_configuration");
            c8197dfo.a("voip_configuration");
            c8197dfo.a("offline_config");
            c8197dfo.a("pt_aggregation_size");
            c8197dfo.a("config_recommended_version");
            c8197dfo.a("config_min_version");
            c8197dfo.a("disable_mdx");
            c8197dfo.a("disable_websocket");
            c8197dfo.a("enable_widevine_l1");
            c8197dfo.a("enable_dynecom_signin");
            c8197dfo.a("enable_voip_on_device");
            c8197dfo.a("memento_enabled_for_world");
            c8197dfo.a("video_resolution_override");
            c8197dfo.a("gcm_browse_rate_limit");
            c8197dfo.a("gcm_tray_change_rate_limit");
            c8197dfo.a("playback_configuration_local_playback_enabled");
            c8197dfo.a("mdx_configuration_remote_lockscreen_enabled");
            c8197dfo.a("mdx_configuration_remote_notification_enabled");
            c8197dfo.a("jplayer_restart_count");
            c8197dfo.a("device_locale_not_supported");
            c8197dfo.a("device_locale_not_supported_msg");
            c8197dfo.a("disable_playbilling");
            c8197dfo.a("ignore_preload_playbilling");
            c8197dfo.a("device_config_geo_country_code");
            c8197dfo.a("subtitle_download_retry_policy");
            c8197dfo.a("disable_cast_faststart");
            c8197dfo.a("disable_data_saver");
            c8197dfo.a("prefs_allow_hevc_mobile");
            c8197dfo.a("prefs_allow_vp9_mobile");
            c8197dfo.a();
        }
    }

    public void V() {
        boolean b = C8157dfA.b(this.a, "enable_widevine_l1", false);
        int d2 = C8157dfA.d(this.a, "config_recommended_version", -1);
        int d3 = C8157dfA.d(this.a, "config_min_version", -1);
        String e2 = C8157dfA.e(this.a, "device_config_geo_country_code", "");
        this.c = this.c.toBuilder().setIsWidevineL1Enabled(b).setGetAppRecommendedVersion(d2).setGetAppMinVersion(d3).setGetGeoCountryCode(e2).build();
        C1044Mm.a(d, "recoverAndClearLegacyConfigs: L1: %b, appRecoVersion: %d, appMinVersion: %d, geo: %s", Boolean.valueOf(b), Integer.valueOf(d2), Integer.valueOf(d3), e2);
        d(this.c);
    }

    public void a(boolean z) {
        C8157dfA.d(this.a, "disable_roar", z);
    }

    public boolean N() {
        return this.c.isEnableOfflineSecureDelete();
    }

    public int l() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData == null) {
            return -1;
        }
        return deviceConfigData.getLolomoPrefetchIntervalOverride();
    }

    public void b(int i) {
        C8157dfA.a(this.a, "lolomo_cache_expiration_hours_override", i);
    }

    public boolean T() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.shouldDisablePip();
        }
        return false;
    }

    public boolean X() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.shouldAllowTabletPortraitPlayback();
        }
        return false;
    }

    public boolean W() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.shouldDisableAmazonADM();
        }
        return false;
    }

    public boolean Z() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.shouldGetNrmViaMsl();
        }
        return false;
    }

    public int D() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData == null) {
            return -1;
        }
        return deviceConfigData.getVoipInstallDeadlineInDays();
    }

    public int k() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData == null) {
            return 90;
        }
        return deviceConfigData.getMaxAppLifeDays();
    }

    public int h() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData == null) {
            return 7;
        }
        return deviceConfigData.getAppUpdateDialogFreqDays();
    }

    public String i() {
        DeviceConfigData deviceConfigData = this.c;
        if (deviceConfigData != null) {
            return deviceConfigData.getChannelIdViaConfig();
        }
        return null;
    }

    public boolean e(Context context) {
        return C8168dfL.h(C8157dfA.e(context, "deviceConfig", (String) null));
    }
}
