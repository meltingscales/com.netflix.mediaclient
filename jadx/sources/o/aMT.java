package o;

import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.Moneyball;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.webclient.model.leafs.AUIContextData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.service.webclient.model.leafs.PhoneCodesData;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aMT {
    public static MoneyballData b(String str) {
        Map<String, Object> b;
        MoneyballData moneyballData = new MoneyballData();
        Type type = TypeToken.getParameterized(Map.class, String.class, Object.class).getType();
        JsonObject e = C0946Ir.e("nf_moneyball_data", str);
        if (C8118deO.e(e)) {
            C1044Mm.d("nf_moneyball_data", "Empty response for moneyball request!");
            InterfaceC1598aHf.a(new C1596aHd("Empty response for moneyball request: " + str).b(false));
            throw new FalkorException("Empty response for moneyball request: " + str);
        }
        Map<String, ? extends Object> map = (Map) C8118deO.e(e, "aui", type);
        if (map == null) {
            throw new FalkorException("Couldn't find the aui object in moneyball response: " + str);
        }
        if (map.containsKey(SignupConstants.Field.PHONE_CODES)) {
            moneyballData.setPhoneCodesData(b((List) map.get(SignupConstants.Field.PHONE_CODES)));
        }
        moneyballData.setContextData(b(aMW.e.c("userContext", map), (Map) map.get("requestContext")));
        Map map2 = (Map) map.get("moneyball");
        if (map2 != null && map2.keySet().size() > 0) {
            for (String str2 : map2.keySet()) {
                if (!"userContext".equalsIgnoreCase(str2) && !SignupConstants.Field.PHONE_CODES.equalsIgnoreCase(str2) && !SignupConstants.Field.TERMS_OF_USE.equalsIgnoreCase(str2) && (b = b((Map) map2.get(str2))) != null) {
                    Moneyball.INSTANCE.recursiveSetLongs(b);
                    moneyballData.setFlowMode(new FlowMode(b));
                    Object obj = b.get("flwssn");
                    if (obj != null) {
                        moneyballData.setFlwssn(obj.toString());
                    }
                }
            }
        }
        return moneyballData;
    }

    private static PhoneCodesData b(List<Map<String, String>> list) {
        return new PhoneCodesData(list);
    }

    private static AUIContextData b(Map<String, Object> map, Map<String, Object> map2) {
        String geo_key = AUIContextData.getGEO_KEY();
        Map linkedTreeMap = new LinkedTreeMap();
        if (map2 != null && map2.containsKey(geo_key)) {
            linkedTreeMap = (Map) map2.get(geo_key);
        }
        return new AUIContextData(linkedTreeMap, map);
    }

    private static Map<String, Object> b(Map<String, Object> map) {
        if (map.size() == 0) {
            return new LinkedTreeMap();
        }
        if (map.containsKey(VisualStateDefinition.ELEMENT_STATE.RESULT)) {
            return (Map) map.get(VisualStateDefinition.ELEMENT_STATE.RESULT);
        }
        return b((Map) map.get(map.keySet().toArray()[0]));
    }
}
