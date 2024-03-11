package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import java.util.Map;
import o.C1044Mm;
import o.C8123deT;
import o.C8168dfL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class OnRampEligibility {
    private static final String FIELD_IS_ELIGIBLE = "onrampEligibilty";
    private static final String FIELD_STATUS_CODE = "statusCode";
    private static final String STATUS_CODE_SUCCESS = "success";
    private static final String TAG = "OnRampEligibility";
    boolean onRampEligibility;
    String statusCode;

    public String getStatusCode() {
        return this.statusCode;
    }

    /* loaded from: classes6.dex */
    public enum Action {
        FETCH,
        RECORD,
        UNKNOWN;

        public static Action fromString(String str) {
            try {
                return valueOf(str.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    public boolean isEligible() {
        return this.onRampEligibility && STATUS_CODE_SUCCESS.equals(this.statusCode);
    }

    public OnRampEligibility(JsonElement jsonElement) {
        populate(jsonElement);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FIELD_IS_ELIGIBLE, this.onRampEligibility);
            jSONObject.put(FIELD_STATUS_CODE, this.statusCode);
        } catch (JSONException e) {
            C1044Mm.e(TAG, "failed in json string " + e);
        }
        C1044Mm.e(TAG, "user string=" + jSONObject.toString());
        return jSONObject.toString();
    }

    public OnRampEligibility(String str) {
        try {
            JSONObject jSONObject = C8168dfL.g(str) ? new JSONObject() : new JSONObject(str);
            this.onRampEligibility = C8123deT.a(jSONObject, FIELD_IS_ELIGIBLE, false);
            this.statusCode = C8123deT.a(jSONObject, FIELD_STATUS_CODE, (String) null);
        } catch (JSONException e) {
            C1044Mm.e(TAG, "failed to create json string=" + str + " exception =" + e);
        }
    }

    public void populate(JsonElement jsonElement) {
        if (jsonElement == null) {
            return;
        }
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            if (key.equals(FIELD_IS_ELIGIBLE)) {
                this.onRampEligibility = value.getAsBoolean();
            } else if (key.equals(FIELD_STATUS_CODE)) {
                this.statusCode = value.getAsString();
            }
        }
    }
}
