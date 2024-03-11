package com.netflix.mediaclient.service.configuration.crypto;

import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.drm.NetflixMediaDrmApi29;
import com.netflix.mediaclient.drm.PlatformMediaDrmApi29;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_WidevineFailureHandling;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.AbstractApplicationC1040Mh;
import o.AbstractC1838aQc;
import o.C1044Mm;
import o.C1842aQg;
import o.C8054ddD;
import o.C8055ddE;
import o.C8118deO;
import o.C8159dfC;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.aPD;
import o.aPE;
import o.aPH;
import o.aPJ;
import o.aPX;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class DrmMetricsCollector {
    private static boolean c;
    public static final DrmMetricsCollector d = new DrmMetricsCollector();

    private DrmMetricsCollector() {
    }

    static {
        c = new Random().nextInt(1000) == 1;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String b;
        private final Integer c;
        private final KeySetIdState e;

        public final String a() {
            return this.b;
        }

        public final Integer b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final KeySetIdState d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.e == bVar.e && C8632dsu.c(this.c, bVar.c) && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.b, (Object) bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Integer num = this.c;
            int hashCode2 = num == null ? 0 : num.hashCode();
            String str = this.a;
            int hashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            KeySetIdState keySetIdState = this.e;
            Integer num = this.c;
            String str = this.a;
            String str2 = this.b;
            return "KeySetIdLogData(keySetIdState=" + keySetIdState + ", offlineLicenseState=" + num + ", keyRequestData=" + str + ", stackTrace=" + str2 + ")";
        }

        public b(KeySetIdState keySetIdState, Integer num, String str, String str2) {
            C8632dsu.c((Object) keySetIdState, "");
            this.e = keySetIdState;
            this.c = num;
            this.a = str;
            this.b = str2;
        }

        public /* synthetic */ b(KeySetIdState keySetIdState, Integer num, String str, String str2, int i, C8627dsp c8627dsp) {
            this(keySetIdState, num, str, (i & 8) != 0 ? null : str2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class KeySetIdState {
        private static final /* synthetic */ InterfaceC8598drn b;
        private static final /* synthetic */ KeySetIdState[] d;
        private final String h;
        public static final KeySetIdState a = new KeySetIdState("Found", 0, "found");
        public static final KeySetIdState e = new KeySetIdState("Missing", 1, "missing");
        public static final KeySetIdState c = new KeySetIdState("NotAvailable", 2, "notAvailable");

        private static final /* synthetic */ KeySetIdState[] e() {
            return new KeySetIdState[]{a, e, c};
        }

        public static KeySetIdState valueOf(String str) {
            return (KeySetIdState) Enum.valueOf(KeySetIdState.class, str);
        }

        public static KeySetIdState[] values() {
            return (KeySetIdState[]) d.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.h;
        }

        private KeySetIdState(String str, int i, String str2) {
            this.h = str2;
        }

        static {
            KeySetIdState[] e2 = e();
            d = e2;
            b = C8600drp.e(e2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class WvApi {
        private static final /* synthetic */ WvApi[] u;
        private static final /* synthetic */ InterfaceC8598drn w;
        private final String y;
        public static final WvApi c = new WvApi("CreateMediaDrm", 0, "createMediaDrm");
        public static final WvApi a = new WvApi("GetKeyRequest", 1, "getKeyRequest");
        public static final WvApi p = new WvApi("ProvideKeyResponse", 2, "provideKeyResponse");
        public static final WvApi s = new WvApi("SetProperty", 3, "setProperty");
        public static final WvApi j = new WvApi("GetPropertySecurityLevel", 4, "getPropertySecurityLevel");
        public static final WvApi g = new WvApi("GetPropertyUniqueDeviceId", 5, "getPropertyUniqueDeviceId");
        public static final WvApi h = new WvApi("GetPropertyPropertyVersion", 6, "getPropertyPropertyVersion");
        public static final WvApi f = new WvApi("GettingProvisioningResponse", 7, "gettingProvisioningResponse");
        public static final WvApi q = new WvApi("ProvideProvisioningResponse", 8, "provideProvisioningResponse");
        public static final WvApi t = new WvApi("RestoreKeys", 9, "restoreKeys");
        public static final WvApi r = new WvApi("OpenSession", 10, "openSession");
        public static final WvApi i = new WvApi("GetSystemId", 11, "getSystemId");
        public static final WvApi v = new WvApi("TooMany", 12, "tooMany");
        public static final WvApi m = new WvApi("OpenOrGetKeyRequest", 13, "openOrGetKeyRequest");
        public static final WvApi k = new WvApi("OpenOrGetKeyRequestHybrid", 14, "openOrGetKeyRequestHybrid");
        public static final WvApi l = new WvApi("OpenOrGetKeyRequestRetry", 15, "openOrGetKeyRequestRetry");
        public static final WvApi n = new WvApi("OpenOrRestore", 16, "openOrRestore");

        /* renamed from: o  reason: collision with root package name */
        public static final WvApi f13197o = new WvApi("NewOrOpen", 17, "newOrOpen");
        public static final WvApi e = new WvApi("Close", 18, "close");
        public static final WvApi d = new WvApi("CloseSessionHybrid", 19, "closeSessionHybrid");
        public static final WvApi b = new WvApi("CloseSession", 20, "closeSession");

        private static final /* synthetic */ WvApi[] b() {
            return new WvApi[]{c, a, p, s, j, g, h, f, q, t, r, i, v, m, k, l, n, f13197o, e, d, b};
        }

        public static WvApi valueOf(String str) {
            return (WvApi) Enum.valueOf(WvApi.class, str);
        }

        public static WvApi[] values() {
            return (WvApi[]) u.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.y;
        }

        private WvApi(String str, int i2, String str2) {
            this.y = str2;
        }

        static {
            WvApi[] b2 = b();
            u = b2;
            w = C8600drp.e(b2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class NfAppStage {
        private static final /* synthetic */ InterfaceC8598drn a;
        private static final /* synthetic */ NfAppStage[] h;
        private final String g;
        public static final NfAppStage d = new NfAppStage("AppStart", 0, "appStart");
        public static final NfAppStage b = new NfAppStage("Playback", 1, "playback");
        public static final NfAppStage c = new NfAppStage("Offline", 2, "offline");
        public static final NfAppStage e = new NfAppStage("CryptoSession", 3, "cryptoSession");

        private static final /* synthetic */ NfAppStage[] c() {
            return new NfAppStage[]{d, b, c, e};
        }

        public static NfAppStage valueOf(String str) {
            return (NfAppStage) Enum.valueOf(NfAppStage.class, str);
        }

        public static NfAppStage[] values() {
            return (NfAppStage[]) h.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.g;
        }

        private NfAppStage(String str, int i, String str2) {
            this.g = str2;
        }

        static {
            NfAppStage[] c2 = c();
            h = c2;
            a = C8600drp.e(c2);
        }
    }

    public final JSONObject e(aPH aph) {
        C8632dsu.c((Object) aph, "");
        return d(aph);
    }

    public final JSONObject d(aPH aph) {
        C8632dsu.c((Object) aph, "");
        try {
            if (b(aph)) {
                Context d2 = AbstractApplicationC1040Mh.d();
                NetflixMediaDrm c2 = aph.c();
                C8632dsu.d(d2);
                b a = a(aph, c2, d2);
                JSONObject b2 = b(c2);
                String c3 = AbstractC1838aQc.c(AbstractApplicationC1040Mh.d());
                C8632dsu.a(c3, "");
                String nfAppStage = aph.e().toString();
                boolean z = c2 != null;
                String e = C8055ddE.e(d2);
                C8632dsu.a(e, "");
                String str = Build.MANUFACTURER;
                C8632dsu.a(str, "");
                String str2 = Build.MODEL;
                C8632dsu.a(str2, "");
                String e2 = C8054ddD.e("ro.hardware", "");
                C8632dsu.a(e2, "");
                String e3 = C8054ddD.e("ro.board.platform", "");
                C8632dsu.a(e3, "");
                int i = Build.VERSION.SDK_INT;
                String str3 = Build.ID;
                String str4 = Build.VERSION.INCREMENTAL;
                C8159dfC.c(new aPE(b2, c3, nfAppStage, z, e, str, str2, e2, e3, i, str3 + str4, "", "", C1842aQg.a.h(), d(c2, "oemCryptoBuildInformation"), d(c2, "oemCryptoApiMinorVersion"), d(c2, NetflixMediaDrm.PROPERTY_OEM_CRYPTO_API_VERSION), d(c2, "version"), C8118deO.a().toJson(aph.a()), Build.FINGERPRINT, String.valueOf(a != null ? a.d() : null), String.valueOf(a != null ? a.b() : null), a != null ? a.a() : null, a != null ? a.c() : null));
                return null;
            }
            return null;
        } catch (Exception e4) {
            C1044Mm.b("drmMetrics", e4, "collectMediaDrmMetrics", new Object[0]);
            return null;
        }
    }

    private final b a(aPH aph, NetflixMediaDrm netflixMediaDrm, Context context) {
        KeySetIdState keySetIdState;
        Integer num;
        String str;
        Integer num2;
        KeySetIdState keySetIdState2 = KeySetIdState.c;
        try {
            if (aph.j() == null || netflixMediaDrm == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT < 29 || !(netflixMediaDrm instanceof NetflixMediaDrmApi29)) {
                str = null;
                num2 = null;
            } else {
                List<byte[]> keySetRequestIds = ((NetflixMediaDrmApi29) netflixMediaDrm).getKeySetRequestIds();
                C8632dsu.a(keySetRequestIds, "");
                keySetIdState2 = KeySetIdState.e;
                Iterator<byte[]> it = keySetRequestIds.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Arrays.equals(it.next(), aph.j())) {
                        keySetIdState2 = KeySetIdState.a;
                        break;
                    }
                }
                num2 = Integer.valueOf(((NetflixMediaDrmApi29) netflixMediaDrm).getOfflineLicenseState(aph.j()));
                try {
                    str = keySetIdState2 == KeySetIdState.a ? aPJ.e.b(context, aph.b(), aph.d()) : null;
                } catch (Exception e) {
                    e = e;
                    num = num2;
                    keySetIdState = keySetIdState2;
                    C1044Mm.e("drmMetrics", "exception getting KeySetIdLogData", e);
                    return new b(keySetIdState, num, d() ? aPD.c(e) : null, null, 8, null);
                }
            }
            return new b(keySetIdState2, num2, str, null);
        } catch (Exception e2) {
            e = e2;
            keySetIdState = keySetIdState2;
            num = null;
        }
    }

    private final String d(NetflixMediaDrm netflixMediaDrm, String str) {
        String propertyString;
        if (netflixMediaDrm != null) {
            try {
                propertyString = netflixMediaDrm.getPropertyString(str);
            } catch (Exception unused) {
                return "";
            }
        } else {
            propertyString = null;
        }
        return propertyString == null ? "" : propertyString;
    }

    private final JSONObject b(NetflixMediaDrm netflixMediaDrm) {
        PersistableBundle metrics;
        if (!(netflixMediaDrm instanceof PlatformMediaDrmApi29) || (metrics = ((PlatformMediaDrmApi29) netflixMediaDrm).getMetrics()) == null) {
            return null;
        }
        C8632dsu.d(metrics);
        JSONArray e = aPX.e(metrics);
        C1044Mm.a("drmMetrics", "collectMediaDrmMetricsUsingApi start dump.");
        int length = e.length();
        C1044Mm.a("drmMetrics", "jsonArray length=" + length);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "drmMetrics");
        jSONObject.put("jsonArray", e);
        C1044Mm.a("drmMetrics", "obj=" + jSONObject);
        C1044Mm.a("drmMetrics", "collectMediaDrmMetricsUsingApi end dump.");
        return jSONObject;
    }

    private final boolean b(aPH aph) {
        if (Config_FastProperty_WidevineFailureHandling.Companion.a()) {
            C1044Mm.a("drmMetrics", "collectMediaDrmMetrics " + aph + ".appStage");
            return true;
        }
        C1044Mm.a("drmMetrics", "collectMediaDrmMetrics disabled.");
        return false;
    }

    public final boolean d() {
        return Config_FastProperty_WidevineFailureHandling.Companion.d() && c;
    }
}
