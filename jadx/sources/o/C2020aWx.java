package o;

import android.os.Build;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Ddr;
import java.net.InetAddress;
import java.util.List;
import o.C2019aWw;
import o.aWE;
import o.aWG;
import org.json.JSONObject;

/* renamed from: o.aWx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2020aWx {
    public static final C2020aWx c = new C2020aWx();

    private C2020aWx() {
    }

    private final String c() {
        return String.valueOf(System.currentTimeMillis());
    }

    private final Integer e(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.optInt(str));
        }
        return null;
    }

    public final aWD c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        Integer e = e(jSONObject, "msgId");
        if (e == null) {
            C1044Mm.a("nf_ddr_helper", "createZuulChallengeResponse msgId is null, not responding.");
            return null;
        }
        String optString = jSONObject.optString("sourceDeviceAddr");
        if (C8168dfL.g(optString)) {
            C1044Mm.a("nf_ddr_helper", "createZuulChallengeResponse remoteUrl is null, not responding.");
            return null;
        }
        String optString2 = jSONObject.optString("response");
        if (C8168dfL.g(optString2)) {
            C1044Mm.d("nf_ddr_helper", "createZuulChallengeResponse can't respond without zuul challenge.");
            return null;
        }
        int intValue = e.intValue();
        long currentTimeMillis = System.currentTimeMillis();
        C8632dsu.d((Object) optString);
        return new aWD(intValue, optString2, String.valueOf(currentTimeMillis), optString);
    }

    public final aWD a(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        Integer e = e(jSONObject, "m");
        if (e == null) {
            C1044Mm.a("nf_ddr_helper", "createZuulChallengeResponse msgId is null, not responding.");
            return null;
        }
        String optString = jSONObject.optString("s");
        if (C8168dfL.g(optString)) {
            C1044Mm.a("nf_ddr_helper", "createZuulChallengeResponse remoteUrl is null, not responding.");
            return null;
        }
        String optString2 = jSONObject.optString("r");
        if (C8168dfL.g(optString2)) {
            C1044Mm.d("nf_ddr_helper", "createZuulChallengeResponse can't respond without zuul challenge.");
            return null;
        }
        int intValue = e.intValue();
        long currentTimeMillis = System.currentTimeMillis();
        C8632dsu.d((Object) optString);
        return new aWD(intValue, optString2, String.valueOf(currentTimeMillis), optString);
    }

    public final String e(String str) {
        C8632dsu.c((Object) str, "");
        aWG awg = (aWG) C8118deO.a().fromJson(str, (Class<Object>) aWG.class);
        C1044Mm.a("nf_ddr_helper", "handleZuulInfoMessage " + awg);
        if (awg.a() == null) {
            C1044Mm.a("nf_ddr_helper", "handleZuulInfoMessage no payload");
            return null;
        }
        aWG.e a = awg.a();
        if ((a != null ? a.d() : null) == null) {
            C1044Mm.a("nf_ddr_helper", "handleZuulInfoMessage no token");
            return null;
        }
        aWG.e a2 = awg.a();
        String d = a2 != null ? a2.d() : null;
        C1044Mm.a("nf_ddr_helper", "handleZuulInfoMessage token=" + d);
        return d;
    }

    public final C2022aWz c(String str) {
        aWE.c c2;
        aWE.c c3;
        C8632dsu.c((Object) str, "");
        aWE awe = (aWE) C8118deO.a().fromJson(str, (Class<Object>) aWE.class);
        C1044Mm.a("nf_ddr_helper", "createDdrAssociateRequest2 " + awe);
        aWJ c4 = aWI.a.c();
        String b = (awe == null || (c3 = awe.c()) == null) ? null : c3.b();
        if (!aWI.b(c4, b)) {
            InetAddress a = c4 != null ? c4.a() : null;
            C1044Mm.d("nf_ddr_helper", "Unable to reach remote URL " + b + ". Not on same network as " + a);
            return null;
        }
        Integer e = (awe == null || (c2 = awe.c()) == null) ? null : c2.e();
        if ((c4 != null ? c4.b() : null) != null && b != null && e != null) {
            return new C2022aWz(c4.b(), b, String.valueOf(System.currentTimeMillis()), e.intValue(), "dcq", 2);
        }
        C1044Mm.a("nf_ddr_helper", "createDdrAssociateRequest can't send associate request " + c4 + " " + b + " " + e);
        return null;
    }

    public final C2022aWz a(String str) {
        aWE.c c2;
        aWE.c c3;
        C8632dsu.c((Object) str, "");
        aWE awe = (aWE) C8118deO.a().fromJson(str, (Class<Object>) aWE.class);
        C1044Mm.a("nf_ddr_helper", "createDdrAssociateRequest " + awe);
        aWJ c4 = aWI.a.c();
        String b = (awe == null || (c3 = awe.c()) == null) ? null : c3.b();
        if (!aWI.b(c4, b)) {
            InetAddress a = c4 != null ? c4.a() : null;
            C1044Mm.d("nf_ddr_helper", "Unable to reach remote URL " + b + ". Not on same network as " + a);
            return null;
        }
        Integer e = (awe == null || (c2 = awe.c()) == null) ? null : c2.e();
        if ((c4 != null ? c4.b() : null) != null && b != null && e != null) {
            return new C2022aWz(c4.b(), b, String.valueOf(System.currentTimeMillis()), e.intValue(), "deviceChallengeRequest", 1);
        }
        C1044Mm.a("nf_ddr_helper", "createDdrAssociateRequest can't send associate request " + c4 + " " + b + " " + e);
        return null;
    }

    public final C2021aWy c(JSONObject jSONObject, String str) {
        C8632dsu.c((Object) jSONObject, "");
        Integer e = e(jSONObject, "msgId");
        if (e == null) {
            C1044Mm.a("nf_ddr_helper", "handleDdrRequestFromLocalDevice msgId is null, not responding.");
            return null;
        }
        aWJ c2 = aWI.a.c();
        if ((c2 != null ? c2.b() : null) == null) {
            C1044Mm.a("nf_ddr_helper", "handleDdrRequestFromLocalDevice localIp is null, not responding.");
            return null;
        }
        String optString = jSONObject.optString("sourceDeviceAddr");
        if (C8168dfL.g(optString)) {
            C1044Mm.a("nf_ddr_helper", "handleDdrRequestFromLocalDevice remoteUrl is null, not responding.");
            return null;
        } else if (str == null) {
            C1044Mm.d("nf_ddr_helper", "handleDdrRequestFromLocalDevice can't respond without zuulToken.");
            return null;
        } else {
            String b = c2.b();
            C8632dsu.d((Object) optString);
            return new C2021aWy(b, optString, str, String.valueOf(System.currentTimeMillis()), e.intValue(), "deviceChallengeResponse", 1);
        }
    }

    public final C2021aWy d(JSONObject jSONObject, String str) {
        C8632dsu.c((Object) jSONObject, "");
        Integer e = e(jSONObject, "m");
        if (e == null) {
            C1044Mm.a("nf_ddr_helper", "handleDdrRequestFromLocalDevice msgId is null, not responding.");
            return null;
        }
        aWJ c2 = aWI.a.c();
        if ((c2 != null ? c2.b() : null) == null) {
            C1044Mm.a("nf_ddr_helper", "handleDdrRequestFromLocalDevice localIp is null, not responding.");
            return null;
        }
        String optString = jSONObject.optString("s");
        if (C8168dfL.g(optString)) {
            C1044Mm.a("nf_ddr_helper", "handleDdrRequestFromLocalDevice remoteUrl is null, not responding.");
            return null;
        } else if (str == null) {
            C1044Mm.d("nf_ddr_helper", "handleDdrRequestFromLocalDevice can't respond without zuulToken.");
            return null;
        } else {
            String b = c2.b();
            C8632dsu.d((Object) optString);
            return new C2021aWy(b, optString, str, String.valueOf(System.currentTimeMillis()), e.intValue(), "dcr", 2);
        }
    }

    private final Boolean d(String str) {
        if (str == null) {
            return Boolean.FALSE;
        }
        Config_FastProperty_Ddr.e eVar = Config_FastProperty_Ddr.Companion;
        if (eVar.g()) {
            List<String> e = eVar.e();
            boolean e2 = C8135def.e.e(e, str, true);
            C1044Mm.e("nf_ddr_helper", "shouldDisableLocalDiscovery:: for signup country " + str + " is in list " + e + " : " + e2);
            return Boolean.valueOf(e2);
        }
        return null;
    }

    public final String e(int i, String str) {
        Boolean d = d(str);
        aWI awi = aWI.a;
        aWJ c2 = awi.c();
        if ((c2 != null ? c2.b() : null) != null) {
            String e = C8055ddE.e(AbstractApplicationC1040Mh.d());
            int i2 = Config_FastProperty_Ddr.Companion.a() ? 2 : 1;
            Boolean bool = Boolean.TRUE;
            String b = C8632dsu.c(d, bool) ? "" : c2.b();
            String e2 = C8632dsu.c(d, bool) ? "" : awi.e();
            String c3 = c();
            int i3 = Build.VERSION.SDK_INT;
            C8632dsu.d((Object) e);
            String d2 = new C2019aWw(i, b, c3, new C2019aWw.b(String.valueOf(i3), e, e2, i2, d != null ? d.toString() : null)).d();
            C1044Mm.a("nf_ddr_helper", "createLocalInfoForZuul jsonData=" + d2);
            return d2;
        }
        C1044Mm.j("nf_ddr_helper", "createLocalInfoForZuul can't get my own ip.");
        return null;
    }
}
