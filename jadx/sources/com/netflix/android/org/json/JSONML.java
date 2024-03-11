package com.netflix.android.org.json;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class JSONML {
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0186, code lost:
        r6 = r8.nextToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x018c, code lost:
        if ((r6 instanceof java.lang.String) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019f, code lost:
        throw r8.syntaxError("Missing value");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object parse(com.netflix.android.org.json.XMLTokener r8, boolean r9, com.netflix.android.org.json.JSONArray r10) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.org.json.JSONML.parse(com.netflix.android.org.json.XMLTokener, boolean, com.netflix.android.org.json.JSONArray):java.lang.Object");
    }

    public static JSONArray toJSONArray(String str) {
        return toJSONArray(new XMLTokener(str));
    }

    public static JSONArray toJSONArray(XMLTokener xMLTokener) {
        return (JSONArray) parse(xMLTokener, true, null);
    }

    public static JSONObject toJSONObject(XMLTokener xMLTokener) {
        return (JSONObject) parse(xMLTokener, false, null);
    }

    public static JSONObject toJSONObject(String str) {
        return toJSONObject(new XMLTokener(str));
    }

    public static String toString(JSONArray jSONArray) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        String string = jSONArray.getString(0);
        XML.noSpace(string);
        String escape = XML.escape(string);
        stringBuffer.append('<');
        stringBuffer.append(escape);
        Object opt = jSONArray.opt(1);
        if (opt instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) opt;
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                XML.noSpace(obj);
                String optString = jSONObject.optString(obj);
                if (optString != null) {
                    stringBuffer.append(' ');
                    stringBuffer.append(XML.escape(obj));
                    stringBuffer.append('=');
                    stringBuffer.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    stringBuffer.append(XML.escape(optString));
                    stringBuffer.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                }
            }
            i = 2;
        } else {
            i = 1;
        }
        int length = jSONArray.length();
        if (i >= length) {
            stringBuffer.append('/');
            stringBuffer.append('>');
        } else {
            stringBuffer.append('>');
            do {
                Object obj2 = jSONArray.get(i);
                i++;
                if (obj2 != null) {
                    if (obj2 instanceof String) {
                        stringBuffer.append(XML.escape(obj2.toString()));
                        continue;
                    } else if (obj2 instanceof JSONObject) {
                        stringBuffer.append(toString((JSONObject) obj2));
                        continue;
                    } else if (obj2 instanceof JSONArray) {
                        stringBuffer.append(toString((JSONArray) obj2));
                        continue;
                    } else {
                        continue;
                    }
                }
            } while (i < length);
            stringBuffer.append('<');
            stringBuffer.append('/');
            stringBuffer.append(escape);
            stringBuffer.append('>');
        }
        return stringBuffer.toString();
    }

    public static String toString(JSONObject jSONObject) {
        StringBuffer stringBuffer = new StringBuffer();
        String optString = jSONObject.optString("tagName");
        if (optString == null) {
            return XML.escape(jSONObject.toString());
        }
        XML.noSpace(optString);
        String escape = XML.escape(optString);
        stringBuffer.append('<');
        stringBuffer.append(escape);
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String obj = keys.next().toString();
            if (!"tagName".equals(obj) && !"childNodes".equals(obj)) {
                XML.noSpace(obj);
                String optString2 = jSONObject.optString(obj);
                if (optString2 != null) {
                    stringBuffer.append(' ');
                    stringBuffer.append(XML.escape(obj));
                    stringBuffer.append('=');
                    stringBuffer.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    stringBuffer.append(XML.escape(optString2));
                    stringBuffer.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                }
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childNodes");
        if (optJSONArray == null) {
            stringBuffer.append('/');
            stringBuffer.append('>');
        } else {
            stringBuffer.append('>');
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj2 = optJSONArray.get(i);
                if (obj2 != null) {
                    if (obj2 instanceof String) {
                        stringBuffer.append(XML.escape(obj2.toString()));
                    } else if (obj2 instanceof JSONObject) {
                        stringBuffer.append(toString((JSONObject) obj2));
                    } else if (obj2 instanceof JSONArray) {
                        stringBuffer.append(toString((JSONArray) obj2));
                    } else {
                        stringBuffer.append(obj2.toString());
                    }
                }
            }
            stringBuffer.append('<');
            stringBuffer.append('/');
            stringBuffer.append(escape);
            stringBuffer.append('>');
        }
        return stringBuffer.toString();
    }
}
