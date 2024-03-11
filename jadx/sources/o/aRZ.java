package o;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.NrmLanguagesData;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipCallConfigData;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aRZ {
    public static final String a = String.format("[\"%s\"]", "deviceConfig");
    public static final String j = String.format("[\"%s\"]", "networkScoreConfig");
    static final String b = String.format("[\"%s\"]", "accountConfig");
    public static final String g = String.format("[\"%s\"]", "ftlConfig");
    public static final String d = String.format("[\"%s\"]", "featureConfig");
    public static final String f = String.format("[\"%s\"]", "nrmInfo");
    public static final String c = String.format("[\"%s\"]", "deviceCookies");
    public static final String l = String.format("[\"%s\"]", "nrmLanguages");
    public static final String k = String.format("[\"%s\"]", "signInConfig");
    public static final String h = String.format("[\"%s\"]", "fpConfig");
    public static final String i = String.format("[\"%s\"]", "hendrixConfig");

    /* renamed from: o  reason: collision with root package name */
    public static final String f13440o = String.format("[\"%s\"]", "refreshSignInConfig");
    public static final String n = String.format("[\"%s\"]", "synth");
    static final String e = String.format("[\"%s\"]", "customerSupportVoipConfigData");

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface d {
        aIE m();
    }

    public static ConfigData e(Context context, String str) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonElement jsonElement5;
        aID aid;
        ConfigData configData = new ConfigData();
        JsonObject e2 = C0946Ir.e("nf_config_data", str);
        if (C8118deO.e(e2)) {
            C1044Mm.d("nf_config_data", "Empty response for configuration request!");
            InterfaceC1598aHf.a(new C1596aHd("Empty response for configuration request: " + str).b(false));
            throw new FalkorException("Empty response for configuration request: " + str);
        }
        if (e2.has("deviceConfig")) {
            InterfaceC2092aZo b2 = C2090aZm.d.b(C0946Ir.c(e2, "deviceConfig"));
            if (b2 != null) {
                b2.d();
            }
            configData.deviceConfig = (DeviceConfigData) C8118deO.e(e2, "deviceConfig", (Class<Object>) DeviceConfigData.class);
        }
        if (e2.has("networkScoreConfig") && (aid = (aID) C8118deO.e(e2, "networkScoreConfig", (Class<Object>) aID.class)) != null) {
            ((d) EntryPointAccessors.fromApplication(AbstractApplicationC1040Mh.d(), d.class)).m().b(aid);
        }
        if (e2.has("accountConfig")) {
            configData.accountConfig = (AccountConfigData) C8118deO.e(e2, "accountConfig", (Class<Object>) AccountConfigData.class);
        }
        if (e2.has("abTestConfig")) {
            try {
                configData.abTestConfigData = new ABTestConfigData(e2.get("abTestConfig").toString());
            } catch (Exception unused) {
            }
        }
        if (e2.has("ftlConfig")) {
            configData.ftlConfigData = (FtlConfig) C8118deO.e(e2, "ftlConfig", (Class<Object>) FtlConfig.class);
        }
        if (e2.has("synth") && (jsonElement5 = e2.get("synth")) != null) {
            configData.syntheticAllocationJson = jsonElement5.toString();
        }
        if (e2.has("featureConfig") && (jsonElement4 = e2.get("featureConfig")) != null) {
            configData.featureConfigJson = jsonElement4.toString();
        }
        if (e2.has("streamingConfig") && (jsonElement3 = e2.get("streamingConfig")) != null) {
            configData.streamingConfigJson = jsonElement3.toString();
        }
        if (e2.has("fpConfig") && (jsonElement2 = e2.get("fpConfig")) != null) {
            configData.fpConfigJson = jsonElement2.toString();
        }
        if (e2.has("hendrixConfig") && (jsonElement = e2.get("hendrixConfig")) != null) {
            configData.hendrixConfigJson = jsonElement.toString();
        }
        if (e2.has("nrmInfo")) {
            configData.nrmInfo = (UserCookies) C8118deO.e(e2, "nrmInfo", (Class<Object>) UserCookies.class);
        }
        if (e2.has("nrmLanguages")) {
            configData.nrmLang = (NrmLanguagesData) C8118deO.e(e2, "nrmLanguages", (Class<Object>) NrmLanguagesData.class);
        }
        if (e2.has("signInConfig")) {
            configData.signInConfigData = (SignInConfigData) C8118deO.e(e2, "signInConfig", (Class<Object>) SignInConfigData.class);
        }
        return configData;
    }

    public static List<String> a(List<String> list, boolean z) {
        String str = b;
        if (!list.contains(str)) {
            list.add(str);
        }
        String str2 = g;
        if (!list.contains(str2)) {
            list.add(str2);
        }
        if (!z) {
            String str3 = n;
            if (!list.contains(str3)) {
                list.add(str3);
            }
        }
        String str4 = d;
        if (!list.contains(str4)) {
            list.add(str4);
        }
        String b2 = b();
        if (C8168dfL.g(b2)) {
            list.add(String.format("[[\"%s\", \"%s\"]]", "abTestConfig", "streamingConfig2"));
        } else {
            list.add(String.format("[[\"%s\", \"%s\"], \"%s\"]", "abTestConfig", "streamingConfig2", b2));
        }
        return list;
    }

    public static void d(List<String> list) {
        String str = a;
        if (!list.contains(str)) {
            list.add(str);
        }
        String str2 = h;
        if (!list.contains(str2)) {
            list.add(str2);
        }
        String str3 = i;
        if (!list.contains(str3)) {
            list.add(str3);
        }
        String str4 = j;
        if (list.contains(str4)) {
            return;
        }
        list.add(str4);
    }

    public static void c(List<String> list) {
        String str = f13440o;
        if (list.contains(str) || list.contains(k)) {
            return;
        }
        list.add(str);
    }

    public static VoipCallConfigData a(String str) {
        VoipCallConfigData voipCallConfigData = new VoipCallConfigData();
        JsonObject e2 = C0946Ir.e("nf_config_data", str);
        if (C8118deO.e(e2)) {
            C1044Mm.d("nf_config_data", "Empty response for voip configuration request!");
            InterfaceC1598aHf.a(new C1596aHd("Empty response for voip configuration request: " + str).b(false));
            throw new FalkorException("Empty response for voip configuration request: " + str);
        } else if (e2.has("customerSupportVoipConfigData")) {
            C1044Mm.a("nf_config_data", "Customer Support VOIP config json: %s", e2.get("customerSupportVoipConfigData"));
            return (VoipCallConfigData) C8118deO.e(e2, "customerSupportVoipConfigData", (Class<Object>) VoipCallConfigData.class);
        } else {
            return voipCallConfigData;
        }
    }

    public static List<String> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e);
        return arrayList;
    }

    public static String b() {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        if (!C8159dfC.b()) {
            for (aRM arm : C1818aPj.e()) {
                if (!C8150deu.h() || !arm.N_()) {
                    if (C8150deu.h() || !arm.r()) {
                        if (!arm.b()) {
                            arrayList.add(arm.d());
                        }
                    }
                }
            }
        } else {
            arrayList.add("8505");
        }
        return C8168dfL.c((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public static void c(Map<String, String> map, Context context, boolean z) {
        if (z) {
            map.put("x-netflix.request.skipaballocations", "true");
        }
    }
}
