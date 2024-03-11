package o;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.Ir  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946Ir {
    private static final Date e = new Date(System.currentTimeMillis() + 7776000000L);

    public static String c(JsonObject jsonObject, String str) {
        if (jsonObject.has(str)) {
            JsonObject asJsonObject = jsonObject.getAsJsonObject(str);
            if (asJsonObject.has("deviceCommand")) {
                return asJsonObject.get("deviceCommand").getAsString();
            }
            return null;
        }
        return null;
    }

    public static JsonObject e(String str, String str2) {
        try {
            JsonObject asJsonObject = new JsonParser().parse(str2).getAsJsonObject();
            if (b(asJsonObject)) {
                throw new FalkorException(d(asJsonObject, str), null, asJsonObject, null).b(false);
            }
            if (a(asJsonObject)) {
                JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("jsonGraph");
                e(asJsonObject2);
                return asJsonObject2;
            }
            return asJsonObject.getAsJsonObject("value");
        } catch (Exception e2) {
            C1044Mm.b(str, "String response to parse = " + str2);
            throw new FalkorException("Error in creating JsonObject", e2);
        }
    }

    private static void e(JsonObject jsonObject) {
        if (jsonObject != null) {
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                JsonElement jsonElement = jsonObject.get(entry.getKey());
                if (jsonElement != null) {
                    String jsonElement2 = jsonElement.toString();
                    if (jsonElement2.contains("$type") && jsonElement2.contains("value")) {
                        JsonObject jsonObject2 = (JsonObject) jsonElement;
                        c(jsonObject, jsonObject2);
                        if (jsonElement.isJsonObject()) {
                            e(jsonObject2);
                        }
                    }
                }
            }
        }
    }

    private static void c(JsonObject jsonObject, JsonObject jsonObject2) {
        JsonObject jsonObject3;
        JsonElement jsonElement;
        Iterator<Map.Entry<String, JsonElement>> it = jsonObject2.entrySet().iterator();
        loop0: while (true) {
            JsonObject jsonObject4 = jsonObject2;
            jsonObject3 = jsonObject;
            jsonObject = jsonObject4;
            while (jsonObject != null && !jsonObject.has("value") && it.hasNext()) {
                jsonElement = jsonObject.get(it.next().getKey());
                if (jsonElement instanceof JsonObject) {
                    break;
                }
                jsonObject3 = jsonObject;
            }
            jsonObject2 = (JsonObject) jsonElement;
        }
        b(jsonObject3, jsonObject);
    }

    private static void b(JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject2 == null || !jsonObject2.has("value")) {
            return;
        }
        JsonElement jsonElement = jsonObject2.get("value");
        if (jsonElement.isJsonObject()) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                jsonObject2.add(entry.getKey(), entry.getValue());
            }
            jsonObject2.remove("value");
            jsonObject2.remove("$type");
            return;
        }
        jsonObject.add(jsonObject.entrySet().iterator().next().getKey(), jsonElement);
    }

    private static boolean b(JsonObject jsonObject) {
        return jsonObject != null && (jsonObject.has(UmaAlert.ICON_ERROR) || jsonObject.has("innerErrors") || jsonObject.has("errors"));
    }

    public static String d(JsonObject jsonObject, String str) {
        JsonElement asJsonObject;
        if (b(jsonObject)) {
            if (a(jsonObject)) {
                asJsonObject = jsonObject.getAsJsonArray("errors");
            } else {
                asJsonObject = jsonObject.getAsJsonObject(UmaAlert.ICON_ERROR);
            }
            return d(asJsonObject);
        }
        return null;
    }

    public static String d(JsonObject jsonObject) {
        JsonArray asJsonArray;
        if (jsonObject.has("paths") && (asJsonArray = jsonObject.getAsJsonArray("paths")) != null) {
            return d(asJsonArray);
        }
        return null;
    }

    public static boolean a(JsonObject jsonObject) {
        return jsonObject.has("jsonGraph");
    }

    public static boolean b(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("notvalidrequest");
    }

    public static boolean c(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("alreadyinqueue");
    }

    public static boolean d(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("notinqueue");
    }

    public static InterfaceC8322diG d(String str, JsonElement jsonElement, Class<? extends InterfaceC8322diG> cls) {
        try {
            return (InterfaceC8322diG) ((Gson) C1332Xp.b(Gson.class)).fromJson(jsonElement, (Class<Object>) cls);
        } catch (IncompatibleClassChangeError e2) {
            C1044Mm.b("FalkorParseUtils", e2, "spy-8880: IncompatibleClassChangeError - gson reflection fail", new Object[0]);
            InterfaceC1598aHf.a(new C1596aHd("spy-8880: IncompatibleClassChangeError - gson reflection fail").b(ErrorType.m));
            return null;
        }
    }

    private static String d(JsonElement jsonElement) {
        return jsonElement.toString().replace("\n", "").replace("\"", "'");
    }
}
