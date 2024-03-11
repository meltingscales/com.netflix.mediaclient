package com.netflix.android.org.json;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

/* loaded from: classes5.dex */
public class Property {
    public static JSONObject toJSONObject(Properties properties) {
        JSONObject jSONObject = new JSONObject();
        if (properties != null && !properties.isEmpty()) {
            Enumeration<?> propertyNames = properties.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String str = (String) propertyNames.nextElement();
                jSONObject.put(str, properties.getProperty(str));
            }
        }
        return jSONObject;
    }

    public static Properties toProperties(JSONObject jSONObject) {
        Properties properties = new Properties();
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                properties.put(obj, jSONObject.getString(obj));
            }
        }
        return properties;
    }
}
