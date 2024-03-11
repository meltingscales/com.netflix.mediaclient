package o;

import android.annotation.TargetApi;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import android.support.v4.media.session.PlaybackStateCompat;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.net.NetflixCronetProvider;
import com.netflix.mediaclient.service.logging.logblob.StartupErrorTracker;
import com.netflix.mediaclient.util.DeviceCategory;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import o.C8382djn;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aUQ extends aUI {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "startuperror";
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public JSONObject c() {
        return this.i;
    }

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public aUQ(Context context, aOV aov, InterfaceC5129bst interfaceC5129bst) {
        String str;
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
            if (w != null) {
                this.i.putOpt("AndroidDeviceID", w.l());
            }
            this.i.put("android_version", Build.VERSION.RELEASE);
            if (InterfaceC1342Xz.b(context).d()) {
                this.i.put("rooted", "true");
            }
            String e4 = C8054ddD.e("ro.modversion", "");
            if (C8168dfL.h(aov.X())) {
                str = "prevAndroidDeviceIDList";
                this.i.put("roBspVer", aov.X());
            } else {
                str = "prevAndroidDeviceIDList";
            }
            if (C8168dfL.h(aov.I())) {
                this.i.put("teeInfo", aov.I());
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
            this.i.put("realdevicecategory", g().c());
            this.i.put("playerver", "EXO-1.2.0");
            this.i.put("fingerprint", Build.FINGERPRINT);
            this.i.put("gms_client_version", h);
            this.i.put("gms_pkg_version", j);
            c(context, aov, this.i);
            this.i.put("mdxjs", "1.1.6-android");
            this.i.put("mdxlib_version", "2014.1");
            this.i.put("modversion", C8168dfL.g(e4) ? "stock" : e4);
            this.i.put("platform", C8054ddD.c());
            this.i.putOpt("installType", aov.B());
            String e5 = C8157dfA.e(context, "playReferrer", (String) null);
            if (C8168dfL.h(e5)) {
                this.i.putOpt("playInstallTime", Long.valueOf(C8157dfA.b(context, "playAppInstallTime", 0L)));
                this.i.putOpt("playReferrerUrl", e5);
            }
            this.i.put("securityPatchVersion", Build.VERSION.SECURITY_PATCH);
            this.i.put("cronetVersion", NetflixCronetProvider.getUnderlyingCronetVersion(context));
            this.i.put("wasUpgraded", C8055ddE.i(context));
            this.i.put("upgradeTime", C8055ddE.d(context));
            this.i.put("nativeCrash", NetflixCronetProvider.isNativeCrash());
            this.i.putOpt("appVisibility", C8196dfn.b(AbstractApplicationC1040Mh.d()) ? "foreground" : "background");
            this.i.put("cacheCleaned", c(context));
            if (Build.VERSION.SDK_INT >= 26) {
                c(context, this.i);
            }
            StartupErrorTracker.c("startuperror", this.i, false);
            this.i.put("isUserLoggedIn", C8159dfC.e(context));
            if (w != null && w.q() != null) {
                String str2 = str;
                if (this.i.has(str2)) {
                    jSONArray = this.i.getJSONArray(str2);
                } else {
                    jSONArray = new JSONArray();
                    this.i.putOpt(str2, jSONArray);
                }
                jSONArray.put(aov.w().q());
            }
            if (Build.VERSION.SDK_INT >= 28 && (usageStatsManager = (UsageStatsManager) context.getSystemService(UsageStatsManager.class)) != null) {
                appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                C1044Mm.c("startup_logblob", "getAppStandbyBucket=%d", Integer.valueOf(appStandbyBucket));
                JSONObject jSONObject = this.i;
                appStandbyBucket2 = usageStatsManager.getAppStandbyBucket();
                jSONObject.put("appStandbyBucket", appStandbyBucket2);
            }
            this.i.put("entityauth", "wea2");
            this.i.put("mediaPerfClass", d(context));
            b(this.i, interfaceC5129bst);
        } catch (Throwable th) {
            C1044Mm.b("startup_logblob", th, "Failed to populate Startup logblob", new Object[0]);
        }
    }

    private void b(JSONObject jSONObject, InterfaceC5129bst interfaceC5129bst) {
        C8382djn a = interfaceC5129bst.a();
        if (a == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("appbootStatus", jSONObject2);
        jSONObject2.put("primaryKeyType", a.e().name());
        jSONObject2.put("failedWithPrimaryKey", a.f());
        C8382djn.c b = a.b();
        if (b != null) {
            jSONObject2.put("primaryConn", b.c());
            Throwable b2 = b.b();
            if (b2 != null) {
                jSONObject2.put("primaryError", CLv2Utils.e(b2));
            }
        }
        if (a.c() != null) {
            jSONObject2.put("fallbackKeyType", a.c().name());
            jSONObject2.put("failedWithFallbackKey", a.a());
            if (a.a()) {
                jSONObject2.put("fallbackConn", a.d().c());
                Throwable b3 = a.d().b();
                if (b3 != null) {
                    jSONObject2.put("fallbackError", CLv2Utils.e(b3));
                }
            }
        }
    }

    private void c(Context context, aOV aov, JSONObject jSONObject) {
        try {
            jSONObject.put("installationsource", C8061ddK.b());
            jSONObject.put("installerName", C8061ddK.a(context));
            String n = aov.n();
            if (C8168dfL.h(n)) {
                jSONObject.putOpt("channelId", n);
                Object e = C8157dfA.e(context, "channelIdSource", (String) null);
                if (e == null) {
                    C1809aPa.d(context);
                    e = C8157dfA.e(context, "channelIdSource", (String) null);
                }
                jSONObject.putOpt("channelIdSource", e);
                jSONObject.putOpt("preloadSignupRoValue", C8054ddD.e());
                jSONObject.putOpt("signupStubPreloaded", Integer.valueOf(C8159dfC.f() ? 1 : 0));
                jSONObject.putOpt("isStubInSystemPartition", Boolean.valueOf(C8054ddD.k(context)));
                jSONObject.putOpt("signupStubLaunchCount", Integer.valueOf(C8157dfA.d(context, "nf_signup_stub_launch_count", 0)));
                String e2 = C8157dfA.e(context, "nf_signup_stub_esn", (String) null);
                if (C8168dfL.h(e2)) {
                    jSONObject.putOpt("signupStubEsn", e2);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(e2);
                    jSONObject.putOpt("prevAndroidDeviceIDList", jSONArray);
                }
            }
            jSONObject.putOpt("activationApkSource", C8054ddD.c(context));
            jSONObject.putOpt("channelIdRo", C8054ddD.e("ro.netflix.channel", ""));
        } catch (JSONException e3) {
            C1044Mm.e("startup_logblob", "error building partnerDistributionInfo ", e3);
        }
    }

    @TargetApi(26)
    private static void c(Context context, JSONObject jSONObject) {
        UUID uuidForPath;
        long cacheSizeBytes;
        long cacheQuotaBytes;
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager != null) {
            try {
                uuidForPath = storageManager.getUuidForPath(context.getCacheDir());
                cacheSizeBytes = storageManager.getCacheSizeBytes(uuidForPath);
                cacheQuotaBytes = storageManager.getCacheQuotaBytes(uuidForPath);
                jSONObject.put("cacheUsed", cacheSizeBytes);
                jSONObject.put("cacheQuota", cacheQuotaBytes);
            } catch (IOException unused) {
            }
        }
    }

    private static boolean c(Context context) {
        boolean createNewFile;
        try {
            createNewFile = new File(context.getCacheDir(), "cacheExists.txt").createNewFile();
        } catch (Exception unused) {
        }
        try {
            if (C8055ddE.d()) {
                return false;
            }
            return createNewFile;
        } catch (Exception unused2) {
            return createNewFile;
        }
    }

    @Override // o.AbstractC5119bsj
    public String h() {
        return this.i.toString();
    }

    private static DeviceCategory g() {
        if (C8150deu.c()) {
            return DeviceCategory.CHROME_OS;
        }
        if (C8150deu.d()) {
            return DeviceCategory.ANDROID_STB;
        }
        if (C8150deu.e()) {
            return DeviceCategory.ANDROID_TV;
        }
        if (C8150deu.h()) {
            return DeviceCategory.TABLET;
        }
        return DeviceCategory.PHONE;
    }

    private int d(Context context) {
        return TU.d(context).e();
    }
}
