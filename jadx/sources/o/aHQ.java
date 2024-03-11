package o;

import com.netflix.mediaclient.net.NetworkRequestType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aHQ {
    private NetworkRequestType a;
    private Map<String, aHN> c = new HashMap();

    public aHQ(NetworkRequestType networkRequestType) {
        if (networkRequestType == null) {
            throw new IllegalArgumentException("Network type can not be null!");
        }
        this.a = networkRequestType;
    }

    public void e(String str, Long l, Long l2, Map<String, List<String>> map, NetworkRequestType networkRequestType, String str2) {
        synchronized (this) {
            aHN ahn = this.c.get(str);
            if (ahn == null) {
                ahn = new aHN("network");
                this.c.put(str, ahn);
            }
            ahn.d(str, l, l2, map, networkRequestType, str2);
        }
    }

    public JSONObject d() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = new JSONObject();
            jSONObject.put("type", this.a.name());
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("allocation", jSONArray);
            for (String str : this.c.keySet()) {
                JSONObject a = this.c.get(str).a();
                jSONArray.put(a);
                a.put("networkType", str);
            }
        }
        return jSONObject;
    }
}
