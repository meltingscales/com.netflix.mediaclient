package o;

import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aPE extends aUI {
    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    public aPE(JSONObject jSONObject, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) str5, "");
        C8632dsu.c((Object) str6, "");
        C8632dsu.c((Object) str7, "");
        C8632dsu.c((Object) str8, "");
        C8632dsu.c((Object) str9, "");
        C8632dsu.c((Object) str10, "");
        C8632dsu.c((Object) str11, "");
        C8632dsu.c((Object) str12, "");
        C8632dsu.c((Object) str13, "");
        C8632dsu.c((Object) str14, "");
        C8632dsu.c((Object) str15, "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("wvMetrics", jSONObject);
        jSONObject2.put("deviceId4", str);
        jSONObject2.put("appStage", str2);
        jSONObject2.put("hasMediaDrm", z);
        jSONObject2.put("app_version", str3);
        jSONObject2.put("device_make", str4);
        jSONObject2.put("device_model", str5);
        jSONObject2.put("chipset_make", str6);
        jSONObject2.put("chipset_model", str7);
        jSONObject2.put("os_version", i);
        jSONObject2.put("os_build", str8);
        jSONObject2.put("error_code", str9);
        jSONObject2.put("severity", str10);
        jSONObject2.put("sid", str11);
        jSONObject2.put("oemCryptoBuildInformation", str12);
        jSONObject2.put("oemCryptoApiMinorVersion", str13);
        jSONObject2.put(NetflixMediaDrm.PROPERTY_OEM_CRYPTO_API_VERSION, str14);
        jSONObject2.put("PROPERTY_VERSION", str15);
        jSONObject2.put("nfAdditionalData", str16);
        jSONObject2.put("fingerprint", str17);
        if (str18 != null) {
            jSONObject2.put("keySetIdState", str18);
        }
        if (str19 != null) {
            jSONObject2.put("offlineLicenseState", str19);
        }
        if (str20 != null) {
            jSONObject2.put("keySetIdStackTrace", str20);
        }
        if (str21 != null) {
            jSONObject2.put("keyRequestData", str21);
        }
        this.i.put("sharedLog", jSONObject2);
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        String a = LogBlobType.WidevineMetrics.a();
        C8632dsu.a(a, "");
        return a;
    }
}
