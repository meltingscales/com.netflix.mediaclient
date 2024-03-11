package o;

import android.util.Pair;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.deT  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8123deT {
    public static JSONObject a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        return !jSONObject.isNull(str) ? jSONObject.getJSONObject(str) : jSONObject2;
    }

    public static JSONArray c(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getJSONArray(str);
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        return !jSONObject.isNull(str) ? jSONObject.getString(str) : str2;
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        return !jSONObject.isNull(str) ? jSONObject.getInt(str) : i;
    }

    public static long d(JSONObject jSONObject, String str, long j) {
        return !jSONObject.isNull(str) ? jSONObject.getLong(str) : j;
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        return !jSONObject.isNull(str) ? jSONObject.getBoolean(str) : z;
    }

    public static JSONObject c(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Name and/or value are null");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject e(Pair<String, String>[] pairArr) {
        if (pairArr == null) {
            throw new IllegalArgumentException("Name and/or value are null");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static List<String> c(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList(jsonArray.size());
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAsString());
        }
        return arrayList;
    }

    public static int c(JsonElement jsonElement) {
        if (jsonElement.isJsonNull()) {
            return 0;
        }
        if (jsonElement.isJsonPrimitive() && "null".equals(jsonElement.getAsString())) {
            return 0;
        }
        return jsonElement.getAsInt();
    }

    public static String b(JsonElement jsonElement) {
        if (jsonElement.isJsonNull()) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public static boolean a(JsonElement jsonElement) {
        if (jsonElement.isJsonNull()) {
            return false;
        }
        return jsonElement.getAsBoolean();
    }

    public static JSONObject a(JsonObject jsonObject) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            jSONObject.put(entry.getKey(), d(entry.getValue()));
        }
        return jSONObject;
    }

    public static JSONArray a(JsonArray jsonArray) {
        JSONArray jSONArray = new JSONArray();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            jSONArray.put(d(it.next()));
        }
        return jSONArray;
    }

    public static Object e(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive.isBoolean()) {
            return Boolean.valueOf(jsonPrimitive.getAsBoolean());
        }
        if (jsonPrimitive.isNumber()) {
            return jsonPrimitive.getAsNumber();
        }
        if (jsonPrimitive.isString()) {
            return jsonPrimitive.getAsString();
        }
        return null;
    }

    public static Object d(JsonElement jsonElement) {
        if (jsonElement.isJsonObject()) {
            return a(jsonElement.getAsJsonObject());
        }
        if (jsonElement.isJsonArray()) {
            return a(jsonElement.getAsJsonArray());
        }
        if (jsonElement.isJsonPrimitive()) {
            return e(jsonElement.getAsJsonPrimitive());
        }
        return null;
    }

    public static boolean e(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() < 1;
    }
}
