package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class JsonUtils {
    private static final Pattern zza = Pattern.compile("\\\\.");
    private static final Pattern zzb = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static boolean areJsonValuesEquivalent(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
            if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                return obj.equals(obj2);
            }
            JSONArray jSONArray = (JSONArray) obj;
            JSONArray jSONArray2 = (JSONArray) obj2;
            if (jSONArray.length() == jSONArray2.length()) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (!areJsonValuesEquivalent(jSONArray.get(i), jSONArray2.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObject2 = (JSONObject) obj2;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (!jSONObject2.has(str)) {
                return false;
            }
            try {
                Preconditions.checkNotNull(str);
            } catch (JSONException unused) {
            }
            if (!areJsonValuesEquivalent(jSONObject.get(str), jSONObject2.get(str))) {
                return false;
            }
        }
        return true;
    }
}
