package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfigData;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aWL {
    public static String d(ABTestConfigData aBTestConfigData) {
        StringBuilder sb = new StringBuilder();
        if (aBTestConfigData != null) {
            for (String str : aBTestConfigData.keySet()) {
                ABTestConfig configForId = aBTestConfigData.getConfigForId(str);
                if (configForId != null && configForId.isExplicit() && configForId.getCell() != null) {
                    sb.append(String.format("Test%s.Cell%s|", str, Integer.valueOf(configForId.getCell().getCellId())));
                }
            }
        }
        return sb.toString();
    }

    public static String c(ABTestConfigData aBTestConfigData) {
        JSONObject jSONObject = new JSONObject();
        if (aBTestConfigData != null) {
            for (String str : aBTestConfigData.keySet()) {
                ABTestConfig configForId = aBTestConfigData.getConfigForId(str);
                if (configForId != null && configForId.isExplicit() && configForId.getCell() != null) {
                    try {
                        jSONObject.put(str, configForId.getCell().getCellId());
                    } catch (JSONException e) {
                        C1044Mm.j("MdxLoggingUtil", "Failed to add group name to JSON Object.", e);
                    }
                }
            }
        }
        return jSONObject.toString();
    }
}
