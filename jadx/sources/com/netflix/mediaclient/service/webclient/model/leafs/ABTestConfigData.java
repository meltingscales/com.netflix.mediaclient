package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.C8168dfL;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ABTestConfigData extends HashMap<String, ABTestConfig> {
    private static final String TAG = "nf_config";
    static Gson gson = new GsonBuilder().create();

    public ABTestConfigData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            ABTestConfig aBTestConfig = (ABTestConfig) gson.fromJson(jSONObject.optString(str2), (Class<Object>) ABTestConfig.class);
            if (aBTestConfig != null) {
                put(str2, aBTestConfig);
            }
        }
    }

    public ABTestConfig getConfigForId(String str) {
        return get(str);
    }

    public static ABTestConfigData fromJsonString(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        return new ABTestConfigData(str);
    }

    public String toJsonString(boolean z) {
        HashMap hashMap;
        if (z) {
            hashMap = new HashMap();
            for (Map.Entry<String, ABTestConfig> entry : entrySet()) {
                if (entry.getValue().isExplicit()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            hashMap = this;
        }
        return gson.toJson(hashMap);
    }
}
