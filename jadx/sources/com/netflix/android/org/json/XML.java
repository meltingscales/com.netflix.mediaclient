package com.netflix.android.org.json;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class XML {
    public static final Character AMP = new Character('&');
    public static final Character APOS = new Character('\'');
    public static final Character BANG = new Character('!');
    public static final Character EQ = new Character('=');
    public static final Character GT = new Character('>');
    public static final Character LT = new Character('<');
    public static final Character QUEST = new Character('?');
    public static final Character QUOT = new Character(JsonFactory.DEFAULT_QUOTE_CHAR);
    public static final Character SLASH = new Character('/');

    public static String escape(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                stringBuffer.append("&quot;");
            } else if (charAt == '<') {
                stringBuffer.append("&lt;");
            } else if (charAt == '>') {
                stringBuffer.append("&gt;");
            } else if (charAt == '&') {
                stringBuffer.append("&amp;");
            } else if (charAt == '\'') {
                stringBuffer.append("&apos;");
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static void noSpace(String str) {
        int length = str.length();
        if (length == 0) {
            throw new JSONException("Empty string.");
        }
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                throw new JSONException("'" + str + "' contains a space character.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ee, code lost:
        r6 = r9.nextToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f4, code lost:
        if ((r6 instanceof java.lang.String) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0106, code lost:
        throw r9.syntaxError("Missing value");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean parse(com.netflix.android.org.json.XMLTokener r9, com.netflix.android.org.json.JSONObject r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.org.json.XML.parse(com.netflix.android.org.json.XMLTokener, com.netflix.android.org.json.JSONObject, java.lang.String):boolean");
    }

    public static Object stringToValue(String str) {
        if ("true".equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(str)) {
            return JSONObject.NULL;
        }
        try {
            try {
                char charAt = str.charAt(0);
                if (charAt == '-' || (charAt >= '0' && charAt <= '9')) {
                    Long l = new Long(str);
                    if (l.toString().equals(str)) {
                        return l;
                    }
                }
            } catch (Exception unused) {
                Double d = new Double(str);
                if (d.toString().equals(str)) {
                    return d;
                }
            }
        } catch (Exception unused2) {
        }
        return str;
    }

    public static JSONObject toJSONObject(String str) {
        JSONObject jSONObject = new JSONObject();
        XMLTokener xMLTokener = new XMLTokener(str);
        while (xMLTokener.more() && xMLTokener.skipPast("<")) {
            parse(xMLTokener, jSONObject, null);
        }
        return jSONObject;
    }

    public static String toString(Object obj) {
        return toString(obj, null);
    }

    public static String toString(Object obj, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof JSONObject) {
            if (str != null) {
                stringBuffer.append('<');
                stringBuffer.append(str);
                stringBuffer.append('>');
            }
            JSONObject jSONObject = (JSONObject) obj;
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj2 = keys.next().toString();
                Object opt = jSONObject.opt(obj2);
                if (opt == null) {
                    opt = "";
                }
                if (opt instanceof String) {
                    String str2 = (String) opt;
                }
                if ("content".equals(obj2)) {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) opt;
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            if (i > 0) {
                                stringBuffer.append('\n');
                            }
                            stringBuffer.append(escape(jSONArray.get(i).toString()));
                        }
                    } else {
                        stringBuffer.append(escape(opt.toString()));
                    }
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) opt;
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        Object obj3 = jSONArray2.get(i2);
                        if (obj3 instanceof JSONArray) {
                            stringBuffer.append('<');
                            stringBuffer.append(obj2);
                            stringBuffer.append('>');
                            stringBuffer.append(toString(obj3));
                            stringBuffer.append("</");
                            stringBuffer.append(obj2);
                            stringBuffer.append('>');
                        } else {
                            stringBuffer.append(toString(obj3, obj2));
                        }
                    }
                } else if ("".equals(opt)) {
                    stringBuffer.append('<');
                    stringBuffer.append(obj2);
                    stringBuffer.append("/>");
                } else {
                    stringBuffer.append(toString(opt, obj2));
                }
            }
            if (str != null) {
                stringBuffer.append("</");
                stringBuffer.append(str);
                stringBuffer.append('>');
            }
            return stringBuffer.toString();
        }
        if (obj.getClass().isArray()) {
            obj = new JSONArray(obj);
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray3 = (JSONArray) obj;
            int length3 = jSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                stringBuffer.append(toString(jSONArray3.opt(i3), str == null ? "array" : str));
            }
            return stringBuffer.toString();
        }
        String escape = escape(obj.toString());
        if (str == null) {
            return "\"" + escape + "\"";
        } else if (escape.length() == 0) {
            return "<" + str + "/>";
        } else {
            return "<" + str + ">" + escape + "</" + str + ">";
        }
    }
}
