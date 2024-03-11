package com.netflix.cl.util;

import com.netflix.cl.model.Error;
import com.netflix.cl.model.JsonSerializer;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ExtCLUtils {
    public static Error toError(String str, Throwable th) {
        return toError(str, null, th);
    }

    public static Error toError(String str, JSONObject jSONObject, Throwable th) {
        if (th == null && str == null) {
            return null;
        }
        if (th != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("className", th.getClass().getName());
                if (th.getMessage() != null) {
                    jSONObject.put("message", th.getMessage());
                }
                if (th.getStackTrace() != null) {
                    jSONObject.put(SignupConstants.Error.DEBUG_FIELD_STACK_TRACE, CLUtils.getStackTraceString(th));
                }
            } catch (JSONException unused) {
            }
        }
        return new Error(str, null, jSONObject);
    }

    public static JSONObject addStringToJson(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            jSONObject.put(str, str2);
        }
        return jSONObject;
    }

    public static JSONObject addEnumToJson(JSONObject jSONObject, String str, Enum r2) {
        if (r2 != null) {
            jSONObject.put(str, r2.name());
        }
        return jSONObject;
    }

    public static JSONObject addJsonSerializerToJson(JSONObject jSONObject, String str, JsonSerializer jsonSerializer) {
        if (jsonSerializer != null) {
            jSONObject.put(str, jsonSerializer.toJSONObject());
        }
        return jSONObject;
    }

    public static JSONObject addJsonToJson(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            jSONObject.put(str, jSONObject2);
        }
        return jSONObject;
    }

    public static JSONObject addJsonSerializerArrayToJson(JSONObject jSONObject, String str, JsonSerializer[] jsonSerializerArr) {
        if (jsonSerializerArr != null) {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(str, jSONArray);
            for (JsonSerializer jsonSerializer : jsonSerializerArr) {
                jSONArray.put(jsonSerializer.toJSONObject());
            }
        }
        return jSONObject;
    }

    public static JSONObject addStringArrayToJson(JSONObject jSONObject, String str, String[] strArr) {
        if (strArr != null) {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(str, jSONArray);
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
        }
        return jSONObject;
    }

    public static JSONObject addLongObjectArrayToJson(JSONObject jSONObject, String str, Long[] lArr) {
        if (lArr != null) {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(str, jSONArray);
            for (Long l : lArr) {
                if (l != null) {
                    jSONArray.put(l.longValue());
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject addBooleanObjectArrayToJson(JSONObject jSONObject, String str, Boolean[] boolArr) {
        if (boolArr != null) {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(str, jSONArray);
            for (Boolean bool : boolArr) {
                if (bool != null) {
                    jSONArray.put(bool.booleanValue());
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject addFloatObjectArrayToJson(JSONObject jSONObject, String str, Float[] fArr) {
        if (fArr != null) {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(str, jSONArray);
            for (Float f : fArr) {
                if (f != null) {
                    jSONArray.put(f);
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject addEnumArrayToJson(JSONObject jSONObject, String str, Enum[] enumArr) {
        if (enumArr != null) {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(str, jSONArray);
            for (Enum r2 : enumArr) {
                jSONArray.put(r2);
            }
        }
        return jSONObject;
    }

    public static JSONObject addObjectToJson(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            return jSONObject;
        }
        if (obj instanceof Long) {
            jSONObject.put(str, ((Long) obj).longValue());
            return jSONObject;
        } else if (obj instanceof Long[]) {
            return addLongObjectArrayToJson(jSONObject, str, (Long[]) obj);
        } else {
            if (obj instanceof Float) {
                jSONObject.put(str, ((Float) obj).floatValue());
                return jSONObject;
            } else if (obj instanceof Float[]) {
                return addFloatObjectArrayToJson(jSONObject, str, (Float[]) obj);
            } else {
                if (obj instanceof Number) {
                    jSONObject.put(str, obj);
                    return jSONObject;
                } else if (obj instanceof String) {
                    jSONObject.put(str, obj);
                    return jSONObject;
                } else if (obj instanceof String[]) {
                    return addStringArrayToJson(jSONObject, str, (String[]) obj);
                } else {
                    if (obj instanceof Boolean) {
                        jSONObject.put(str, ((Boolean) obj).booleanValue());
                        return jSONObject;
                    } else if (obj instanceof Boolean[]) {
                        return addBooleanObjectArrayToJson(jSONObject, str, (Boolean[]) obj);
                    } else {
                        if (obj instanceof Enum) {
                            return addEnumToJson(jSONObject, str, (Enum) obj);
                        }
                        if (obj instanceof Enum[]) {
                            return addEnumArrayToJson(jSONObject, str, (Enum[]) obj);
                        }
                        if (obj instanceof JsonSerializer) {
                            return addJsonSerializerToJson(jSONObject, str, (JsonSerializer) obj);
                        }
                        if (obj instanceof JsonSerializer[]) {
                            return addJsonSerializerArrayToJson(jSONObject, str, (JsonSerializer[]) obj);
                        }
                        jSONObject.put(str, obj.toString());
                        return jSONObject;
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum DebugSessionType {
        Performance("performance"),
        AppRestartError("appRestartError"),
        PreAppWidget("androidWidgetCommand");
        
        private final String mValue;

        public String getValue() {
            return this.mValue;
        }

        DebugSessionType(String str) {
            this.mValue = str;
        }
    }
}
