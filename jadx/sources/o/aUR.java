package o;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.netflix.mediaclient.net.NetflixCronetProvider;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Mdx;
import com.netflix.mediaclient.service.logging.logblob.StartupErrorTracker;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.MediaUtils;
import o.aMN;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aUR extends aUI {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "startup";
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        return this.i;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public aUR(Context context, aOV aov, UserAgent userAgent, InterfaceC5129bst interfaceC5129bst, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str;
        String str2;
        Spatializer spatializer;
        boolean isEnabled;
        Spatializer spatializer2;
        boolean isHeadTrackerAvailable;
        UsageStatsManager usageStatsManager;
        int appStandbyBucket;
        int appStandbyBucket2;
        JSONArray jSONArray;
        DeviceCategory r = aov.r();
        InterfaceC1843aQh w = aov.w();
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        int h = C8150deu.h(context);
        int j = C8150deu.j(context);
        JSONObject e = C4337bcc.e();
        int e2 = C9345no.e(context);
        try {
            JSONObject f = C8150deu.f(context);
            JSONObject e3 = C8150deu.e(context);
            this.i.putOpt("AndroidDeviceID", w.l());
            this.i.put("android_version", Build.VERSION.RELEASE);
            if (InterfaceC1342Xz.b(context).d()) {
                this.i.put("rooted", "true");
            }
            String e4 = C8054ddD.e("ro.modversion", "");
            if (C8168dfL.h(aov.X())) {
                try {
                    str2 = "startup_logblob";
                } catch (Throwable th) {
                    th = th;
                    str2 = "startup_logblob";
                    str = str2;
                    C1044Mm.b(str, th, "Failed to populate Startup logblob", new Object[0]);
                    return;
                }
                try {
                    this.i.put("roBspVer", aov.X());
                } catch (Throwable th2) {
                    th = th2;
                    str = str2;
                    C1044Mm.b(str, th, "Failed to populate Startup logblob", new Object[0]);
                    return;
                }
            } else {
                str2 = "startup_logblob";
            }
            this.i.put("yearClass", e2);
            this.i.put("hwSpec", f);
            this.i.put("displayInfo", e3);
            this.i.put("lowRam", C8054ddD.o(context));
            this.i.put("dalvikVMHeapSize", maxMemory);
            if (e != null) {
                this.i.put("storageInfo", e);
            }
            this.i.put("devicecategory", r.c());
            this.i.put("realdevicecategory", aUY.c().c());
            this.i.put("playerver", "EXO-1.2.0");
            this.i.put("fingerprint", Build.FINGERPRINT);
            this.i.put("gms_client_version", h);
            this.i.put("gms_pkg_version", j);
            aUY.d(context, aov, this.i);
            this.i.put("mdxjs", "1.1.6-android");
            this.i.put("mdxlib_version", "2014.1");
            this.i.put("modversion", C8168dfL.g(e4) ? "stock" : e4);
            this.i.put("platform", C8054ddD.c());
            this.i.put("supported_crypto", C8189dfg.e());
            this.i.put("system_id", w.K_());
            this.i.put("used_crypto", w.J_().d);
            TU d = TU.d(context);
            this.i.put("mediaPerfClass", d.e());
            try {
                this.i.put("video_decoders", MediaUtils.e(d));
                this.i.put("audio_decoders", MediaUtils.a());
                String str3 = str2;
                this.i.putOpt("installType", aov.B());
                String e5 = C8157dfA.e(context, "playReferrer", (String) null);
                if (C8168dfL.h(e5)) {
                    this.i.putOpt("playInstallTime", Long.valueOf(C8157dfA.b(context, "playAppInstallTime", 0L)));
                    this.i.putOpt("playReferrerUrl", e5);
                }
                this.i.put("widevineDeviceId", aUY.c(w));
                this.i.putOpt("configData", aUY.b(aov));
                this.i.putOpt("features", aUY.e(new C4394bdg(aov, userAgent, interfaceC5129bst)));
                this.i.put("securityPatchVersion", Build.VERSION.SECURITY_PATCH);
                if (jSONObject != null) {
                    this.i.put("previous_network_stats", jSONObject);
                }
                this.i.put("mediaCache", jSONObject2);
                this.i.put("voipInstalled", ((aMN) C1332Xp.b(aMN.class)).c(aMN.d.c));
                this.i.put("partnermoduleInstalled", ((aMN) C1332Xp.b(aMN.class)).c(aMN.d.e));
                this.i.put("cronetVersion", NetflixCronetProvider.getUnderlyingCronetVersion(context));
                this.i.put("wasUpgraded", C8055ddE.i(context));
                this.i.put("upgradeTime", C8055ddE.d(context));
                this.i.put("nativeCrash", NetflixCronetProvider.isNativeCrash());
                if (jSONObject3 != null) {
                    this.i.put("moduleStats", jSONObject3);
                }
                String e6 = C8157dfA.e(context, "playback_failure_info", (String) null);
                if (C8168dfL.h(e6)) {
                    this.i.put("play_crash_info", e6);
                }
                C8157dfA.e(context, "playback_failure_info");
                this.i.put("pip_enabled", C8159dfC.f(context));
                this.i.putOpt("appVisibility", C8196dfn.b(AbstractApplicationC1040Mh.d()) ? "foreground" : "background");
                JSONObject b = aUY.b();
                if (b != null) {
                    this.i.put("cad", b);
                }
                this.i.put("googleCertified", aUY.d());
                this.i.put("cacheCleaned", aUY.e(context));
                if (Build.VERSION.SDK_INT >= 26) {
                    aUY.b(context, this.i);
                }
                aUY.e(this.i);
                this.i.put("widevineState", aUY.c(aov));
                this.i.put("drmInfo", aUY.e());
                aUY.b(this.i);
                StartupErrorTracker.c("startuperror", this.i, true);
                C4347bcm.e("eventrepo", this.i);
                this.i.put("isUserLoggedIn", userAgent.v());
                this.i.put("castBackgroundScanType", Config_FastProperty_Mdx.shouldCastScanActivelyAlways() ? AppMeasurementSdk.ConditionalUserProperty.ACTIVE : "passive");
                if (aov.w().q() != null) {
                    if (this.i.has("prevAndroidDeviceIDList")) {
                        jSONArray = this.i.getJSONArray("prevAndroidDeviceIDList");
                    } else {
                        jSONArray = new JSONArray();
                        this.i.putOpt("prevAndroidDeviceIDList", jSONArray);
                    }
                    jSONArray.put(aov.w().q());
                }
                if (Build.VERSION.SDK_INT >= 28 && (usageStatsManager = (UsageStatsManager) context.getSystemService(UsageStatsManager.class)) != null) {
                    appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                    C1044Mm.c(str3, "getAppStandbyBucket=%d", Integer.valueOf(appStandbyBucket));
                    JSONObject jSONObject4 = this.i;
                    appStandbyBucket2 = usageStatsManager.getAppStandbyBucket();
                    jSONObject4.put("appStandbyBucket", appStandbyBucket2);
                }
                this.i.put("entityauth", "wea2");
                aUY.d(this.i, interfaceC5129bst);
                aUY.d(this.i);
                aUY.e(this.i, aov);
                if (C8054ddD.i()) {
                    AudioManager audioManager = (AudioManager) AbstractApplicationC1040Mh.d().getSystemService("audio");
                    JSONObject jSONObject5 = this.i;
                    spatializer = audioManager.getSpatializer();
                    isEnabled = spatializer.isEnabled();
                    jSONObject5.put("audioSpatializer", isEnabled);
                    JSONObject jSONObject6 = this.i;
                    spatializer2 = audioManager.getSpatializer();
                    isHeadTrackerAvailable = spatializer2.isHeadTrackerAvailable();
                    jSONObject6.put("headTracking", isHeadTrackerAvailable);
                }
                if (C8157dfA.b(context, "avif_unsatisfied_link_error", false)) {
                    this.i.put("avifNativeError", true);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            str = "startup_logblob";
        }
    }

    @Override // o.AbstractC5119bsj
    public String h() {
        return this.i.toString();
    }
}
