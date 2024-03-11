package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaDrm;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.provider.Settings;
import com.google.android.gms.common.GoogleApiAvailability;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Crypto;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import o.C8382djn;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aUY {
    public static final aUY c = new aUY();

    private aUY() {
    }

    public static final JSONObject e() {
        C1044Mm.e("startup_logblob", "getDrmInfo::");
        long currentTimeMillis = System.currentTimeMillis();
        UUID fromString = UUID.fromString("9a04f079-9840-4286-ab92-e65be0885f95");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playready", MediaDrm.isCryptoSchemeSupported(fromString));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        jSONObject.put("timeMs", currentTimeMillis2);
        C1044Mm.e("startup_logblob", "getDrmInfo:: done in " + currentTimeMillis2 + ", status " + jSONObject);
        return jSONObject;
    }

    public static final float a() {
        try {
            return Settings.System.getFloat(AbstractApplicationC1040Mh.d().getContentResolver(), "font_scale");
        } catch (Throwable th) {
            C1044Mm.b("startup_logblob", th, "Settings not found!", new Object[0]);
            return 0.0f;
        }
    }

    public static final DeviceCategory c() {
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

    public static final JSONObject c(aOV aov) {
        C8632dsu.c((Object) aov, "");
        JSONObject jSONObject = new JSONObject();
        C1842aQg c1842aQg = C1842aQg.a;
        String i = c1842aQg.i();
        if (i == null) {
            i = "";
        }
        jSONObject.put("L1Approved", aov.o().e());
        jSONObject.put("L1Supported", c1842aQg.f());
        jSONObject.put("L1Capable", c1842aQg.l());
        jSONObject.put("securityLevelReported", i);
        jSONObject.put("maxSecurityLevelOriginal", c1842aQg.e());
        C1834aPz c1834aPz = C1834aPz.a;
        aPY o2 = aov.o();
        C8632dsu.a(o2, "");
        jSONObject.put("L3ShouldKeep", c1834aPz.c(o2));
        jSONObject.put("forcedToL3", C8157dfA.b(AbstractApplicationC1040Mh.d(), "disable_widevine", false));
        String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "disable_widevine_l1_reason", (String) null);
        if (e != null) {
            jSONObject.put("forcedToL3Cause", e);
        }
        C1833aPy b = aPB.e().b();
        C8632dsu.a(b, "");
        jSONObject.put("maxSecurityLevel", b.e());
        jSONObject.put(NetflixMediaDrm.PROPERTY_RESOURCE_RATING_TIER, b.b());
        jSONObject.put(NetflixMediaDrm.PROPERTY_OEM_CRYPTO_API_VERSION, b.d());
        jSONObject.put(NetflixMediaDrm.PROPERTY_MAX_NUMBER_OF_SESSIONS, b.a());
        String e2 = C8157dfA.e(AbstractApplicationC1040Mh.d(), "disable_widevine_l1_evidence", (String) null);
        if (e2 != null) {
            try {
                jSONObject.put("evidence", new JSONArray(e2));
            } catch (JSONException e3) {
                String message = e3.getMessage();
                jSONObject.put("evidence", "[\"JSONException: " + message + "\"]");
            }
        }
        return jSONObject;
    }

    public static final JSONObject b() {
        InterfaceC5132bsw interfaceC5132bsw = (InterfaceC5132bsw) C1332Xp.b(InterfaceC5132bsw.class);
        if (interfaceC5132bsw == null) {
            return null;
        }
        return interfaceC5132bsw.a();
    }

    public static final String c(InterfaceC1843aQh interfaceC1843aQh) {
        if (interfaceC1843aQh == null) {
            C1044Mm.e("startup_logblob", "getDeviceIdSafely:: no esn provider returning empty");
            return "";
        } else if (Config_FastProperty_Crypto.Companion.h()) {
            String f = interfaceC1843aQh.f();
            C8632dsu.a(f, "");
            C1044Mm.a("startup_logblob", "getDeviceIdSafely:: wea: add unique device ID %s", f);
            return f;
        } else {
            C1044Mm.e("startup_logblob", "getDeviceIdSafely:: reporting disabled by FP");
            return "";
        }
    }

    @TargetApi(26)
    public static final void b(Context context, JSONObject jSONObject) {
        UUID uuidForPath;
        long cacheSizeBytes;
        long cacheQuotaBytes;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) jSONObject, "");
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager != null) {
            try {
                uuidForPath = storageManager.getUuidForPath(context.getCacheDir());
                C8632dsu.a(uuidForPath, "");
                cacheSizeBytes = storageManager.getCacheSizeBytes(uuidForPath);
                cacheQuotaBytes = storageManager.getCacheQuotaBytes(uuidForPath);
                jSONObject.put("cacheUsed", cacheSizeBytes);
                jSONObject.put("cacheQuota", cacheQuotaBytes);
            } catch (IOException unused) {
            }
        }
    }

    public static final boolean e(Context context) {
        boolean createNewFile;
        C8632dsu.c((Object) context, "");
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

    public static final JSONObject e(C4394bdg c4394bdg) {
        Map d;
        Map k;
        Throwable th;
        if (c4394bdg == null || !c4394bdg.d()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Context d2 = AbstractApplicationC1040Mh.d();
            C8632dsu.a(d2, "");
            ConnectivityUtils.NetType netType = ConnectivityUtils.NetType.wifi;
            String c2 = C1613aHu.c(AbstractApplicationC1040Mh.d());
            C8632dsu.a(c2, "");
            C4400bdm c4400bdm = new C4400bdm(d2, c4394bdg, netType, c2);
            jSONObject.putOpt("VP9SupportedOnDevice", Boolean.valueOf(c4400bdm.q()));
            jSONObject.putOpt("HevcSupportedOnDevice", Boolean.valueOf(c4400bdm.t()));
            jSONObject.putOpt("AvcHighSupportedOnDevice", Boolean.valueOf(c4400bdm.n()));
            jSONObject.putOpt("Hd10SupportedOnDevice", Boolean.valueOf(c4400bdm.s()));
            jSONObject.putOpt("DolbyVisionSupportedOnDevice", Boolean.valueOf(c4400bdm.k()));
            jSONObject.putOpt("AV1SupportedOnDevice", Boolean.valueOf(c4400bdm.o()));
            jSONObject.putOpt("Hdr10PlusSupportedOnDevice", Boolean.valueOf(c4400bdm.h()));
            return jSONObject;
        } catch (JSONException e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("getFeaturesUsed", e, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c3 = errorType.c();
                    c1596aHd.a(c3 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
                return null;
            }
            dVar.e().b(c1596aHd, th);
            return null;
        }
    }

    public static final void b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        try {
            float j = c.j();
            jSONObject.put("fontScale", j);
            C1044Mm.a("startup_logblob", "Font size: %f, %f", Float.valueOf(j), Float.valueOf(a()));
        } catch (Throwable unused) {
        }
    }

    private final float j() {
        return AbstractApplicationC1040Mh.d().getResources().getConfiguration().fontScale;
    }

    public static final void e(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        try {
            String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "preference_logging_delivery_stats", (String) null);
            if (C8168dfL.g(e)) {
                return;
            }
            jSONObject.put("loggingDeliveryStats", new JSONArray(e));
        } catch (JSONException unused) {
        }
    }

    public static final JSONObject b(aOV aov) {
        if (aov == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            StreamingCodecPrefData U = aov.U();
            if (U != null) {
                jSONObject.putOpt("VP9HWCodecEnabled", Boolean.valueOf(U.isVP9HWCodecEnabled()));
                jSONObject.putOpt("AVCHighCodecEnabled", Boolean.valueOf(U.isAVCHighCodecEnabled()));
                jSONObject.putOpt("AV1CodecEnabled", Boolean.valueOf(U.isAV1CodecEnabled()));
            }
            jSONObject.putOpt("enableHdr10", Boolean.valueOf(aov.ar()));
            jSONObject.putOpt("enableDolbyVision", Boolean.valueOf(aov.ap()));
            jSONObject.putOpt("enableAV1", Boolean.valueOf(aov.af()));
            jSONObject.putOpt("enableHdr10Plus", Boolean.valueOf(aov.ae()));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final void d(Context context, aOV aov, JSONObject jSONObject) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) jSONObject, "");
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

    public static final void d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put("deviceStartTimeInMs", System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }

    public static final void e(JSONObject jSONObject, aOV aov) {
        C8632dsu.c((Object) jSONObject, "");
        C8632dsu.c((Object) aov, "");
        String I = aov.I();
        if (I != null) {
            jSONObject.put("teeInfo", I);
        }
    }

    public static final void d(JSONObject jSONObject, InterfaceC5129bst interfaceC5129bst) {
        C8632dsu.c((Object) jSONObject, "");
        C8632dsu.c((Object) interfaceC5129bst, "");
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

    public static final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        C8632dsu.a(googleApiAvailability, "");
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(AbstractApplicationC1040Mh.d());
        C1044Mm.e("startup_logblob", "Google Play status: " + isGooglePlayServicesAvailable);
        try {
            if (isGooglePlayServicesAvailable == 0) {
                C1044Mm.e("startup_logblob", "Success!");
                jSONObject.put("certified", true);
            } else if (1 == isGooglePlayServicesAvailable) {
                C1044Mm.e("startup_logblob", "Device is not Google certified, skip");
                jSONObject.put("certified", false);
                jSONObject.put("code", isGooglePlayServicesAvailable);
            } else if (9 == isGooglePlayServicesAvailable) {
                C1044Mm.e("startup_logblob", "Device is not Google certified, skip");
                jSONObject.put("certified", false);
                jSONObject.put("code", isGooglePlayServicesAvailable);
            } else {
                C1044Mm.e("startup_logblob", "Device is Google certified, problem with Google Play Services");
                jSONObject.put("certified", true);
                jSONObject.put("code", isGooglePlayServicesAvailable);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
