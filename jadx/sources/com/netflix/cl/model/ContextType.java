package com.netflix.cl.model;

import com.netflix.cl.Platform;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ContextType implements JsonSerializer {
    public long id;
    public List<String> types = new ArrayList();

    public long getId() {
        return this.id;
    }

    public void addContextType(String str) {
        this.types.add(0, str);
    }

    @Override // com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SignupConstants.Field.LANG_ID, this.id);
        JSONArray jSONArray = new JSONArray();
        jSONObject.put("type", jSONArray);
        for (String str : this.types) {
            jSONArray.put(str);
        }
        return jSONObject;
    }

    public JSONObject addStringToJson(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            jSONObject.put(str, str2);
        }
        return jSONObject;
    }

    public JSONObject addJsonSerializerToJson(JSONObject jSONObject, String str, JsonSerializer jsonSerializer) {
        if (jsonSerializer != null) {
            try {
                jSONObject.put(str, jsonSerializer.toJSONObject());
            } catch (Throwable th) {
                Platform.getErrorReporter().logHandledException("ContextType.addJsonSerializerToJson failed", th);
            }
        }
        return jSONObject;
    }
}
