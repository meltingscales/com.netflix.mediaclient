package com.netflix.android.org.json;

import com.netflix.model.leafs.originals.interactive.animations.Ease;

/* loaded from: classes5.dex */
public class Cookie {
    public static String escape(String str) {
        String trim = str.trim();
        StringBuffer stringBuffer = new StringBuffer();
        int length = trim.length();
        for (int i = 0; i < length; i++) {
            char charAt = trim.charAt(i);
            if (charAt < ' ' || charAt == '+' || charAt == '%' || charAt == '=' || charAt == ';') {
                stringBuffer.append('%');
                stringBuffer.append(Character.forDigit((char) ((charAt >>> 4) & 15), 16));
                stringBuffer.append(Character.forDigit((char) (charAt & 15), 16));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static JSONObject toJSONObject(String str) {
        Object unescape;
        JSONObject jSONObject = new JSONObject();
        JSONTokener jSONTokener = new JSONTokener(str);
        jSONObject.put("name", jSONTokener.nextTo('='));
        jSONTokener.next('=');
        jSONObject.put("value", jSONTokener.nextTo(';'));
        jSONTokener.next();
        while (jSONTokener.more()) {
            String unescape2 = unescape(jSONTokener.nextTo("=;"));
            if (jSONTokener.next() != '=') {
                if (!unescape2.equals("secure")) {
                    throw jSONTokener.syntaxError("Missing '=' in cookie parameter.");
                }
                unescape = Boolean.TRUE;
            } else {
                unescape = unescape(jSONTokener.nextTo(';'));
                jSONTokener.next();
            }
            jSONObject.put(unescape2, unescape);
        }
        return jSONObject;
    }

    public static String toString(JSONObject jSONObject) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(escape(jSONObject.getString("name")));
        stringBuffer.append("=");
        stringBuffer.append(escape(jSONObject.getString("value")));
        if (jSONObject.has("expires")) {
            stringBuffer.append(";expires=");
            stringBuffer.append(jSONObject.getString("expires"));
        }
        if (jSONObject.has("domain")) {
            stringBuffer.append(";domain=");
            stringBuffer.append(escape(jSONObject.getString("domain")));
        }
        if (jSONObject.has(Ease.ANIMATION_EASE_TYPE.PATH)) {
            stringBuffer.append(";path=");
            stringBuffer.append(escape(jSONObject.getString(Ease.ANIMATION_EASE_TYPE.PATH)));
        }
        if (jSONObject.optBoolean("secure")) {
            stringBuffer.append(";secure");
        }
        return stringBuffer.toString();
    }

    public static String unescape(String str) {
        int i;
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '+') {
                charAt = ' ';
            } else if (charAt == '%' && (i = i2 + 2) < length) {
                int dehexchar = JSONTokener.dehexchar(str.charAt(i2 + 1));
                int dehexchar2 = JSONTokener.dehexchar(str.charAt(i));
                if (dehexchar >= 0 && dehexchar2 >= 0) {
                    charAt = (char) ((dehexchar * 16) + dehexchar2);
                    i2 = i;
                }
            }
            stringBuffer.append(charAt);
            i2++;
        }
        return stringBuffer.toString();
    }
}
