package com.netflix.android.org.json;

import java.util.HashMap;

/* loaded from: classes5.dex */
public class XMLTokener extends JSONTokener {
    public static final HashMap entity;

    static {
        HashMap hashMap = new HashMap(8);
        entity = hashMap;
        hashMap.put("amp", XML.AMP);
        hashMap.put("apos", XML.APOS);
        hashMap.put("gt", XML.GT);
        hashMap.put("lt", XML.LT);
        hashMap.put("quot", XML.QUOT);
    }

    public XMLTokener(String str) {
        super(str);
    }

    public String nextCDATA() {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            char next = next();
            if (end()) {
                throw syntaxError("Unclosed CDATA");
            }
            stringBuffer.append(next);
            int length = stringBuffer.length();
            int i = length - 3;
            if (i >= 0 && stringBuffer.charAt(i) == ']' && stringBuffer.charAt(length - 2) == ']' && stringBuffer.charAt(length - 1) == '>') {
                stringBuffer.setLength(i);
                return stringBuffer.toString();
            }
        }
    }

    public Object nextContent() {
        char next;
        do {
            next = next();
        } while (Character.isWhitespace(next));
        if (next == 0) {
            return null;
        }
        if (next == '<') {
            return XML.LT;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (next != '<' && next != 0) {
            if (next == '&') {
                stringBuffer.append(nextEntity(next));
            } else {
                stringBuffer.append(next);
            }
            next = next();
        }
        back();
        return stringBuffer.toString().trim();
    }

    public Object nextEntity(char c) {
        char next;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            next = next();
            if (!Character.isLetterOrDigit(next) && next != '#') {
                break;
            }
            stringBuffer.append(Character.toLowerCase(next));
        }
        if (next != ';') {
            throw syntaxError("Missing ';' in XML entity: &" + ((Object) stringBuffer));
        }
        String stringBuffer2 = stringBuffer.toString();
        Object obj = entity.get(stringBuffer2);
        if (obj != null) {
            return obj;
        }
        return c + stringBuffer2 + ";";
    }

    public Object nextMeta() {
        char next;
        char next2;
        do {
            next = next();
        } while (Character.isWhitespace(next));
        if (next != 0) {
            if (next != '\'') {
                if (next == '/') {
                    return XML.SLASH;
                }
                if (next == '!') {
                    return XML.BANG;
                }
                if (next != '\"') {
                    switch (next) {
                        case '<':
                            return XML.LT;
                        case '=':
                            return XML.EQ;
                        case '>':
                            return XML.GT;
                        case '?':
                            return XML.QUEST;
                    }
                    while (true) {
                        char next3 = next();
                        if (Character.isWhitespace(next3)) {
                            return Boolean.TRUE;
                        }
                        if (next3 != 0 && next3 != '\'' && next3 != '/' && next3 != '!' && next3 != '\"') {
                            switch (next3) {
                            }
                        }
                    }
                    back();
                    return Boolean.TRUE;
                }
            }
            do {
                next2 = next();
                if (next2 == 0) {
                    throw syntaxError("Unterminated string");
                }
            } while (next2 != next);
            return Boolean.TRUE;
        }
        throw syntaxError("Misshaped meta tag");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006b, code lost:
        throw syntaxError("Bad character in a name");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object nextToken() {
        /*
            r7 = this;
        L0:
            char r0 = r7.next()
            boolean r1 = java.lang.Character.isWhitespace(r0)
            if (r1 != 0) goto L0
            if (r0 == 0) goto La0
            r1 = 39
            if (r0 == r1) goto L77
            r2 = 47
            if (r0 == r2) goto L74
            r3 = 33
            if (r0 == r3) goto L71
            r4 = 34
            if (r0 == r4) goto L77
            switch(r0) {
                case 60: goto L2e;
                case 61: goto L2b;
                case 62: goto L28;
                case 63: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            goto L35
        L25:
            java.lang.Character r0 = com.netflix.android.org.json.XML.QUEST
            return r0
        L28:
            java.lang.Character r0 = com.netflix.android.org.json.XML.GT
            return r0
        L2b:
            java.lang.Character r0 = com.netflix.android.org.json.XML.EQ
            return r0
        L2e:
            java.lang.String r0 = "Misplaced '<'"
            com.netflix.android.org.json.JSONException r0 = r7.syntaxError(r0)
            throw r0
        L35:
            r5.append(r0)
            char r0 = r7.next()
            boolean r6 = java.lang.Character.isWhitespace(r0)
            if (r6 == 0) goto L47
            java.lang.String r0 = r5.toString()
            return r0
        L47:
            if (r0 == 0) goto L6c
            if (r0 == r1) goto L65
            if (r0 == r2) goto L5d
            r6 = 91
            if (r0 == r6) goto L5d
            r6 = 93
            if (r0 == r6) goto L5d
            if (r0 == r3) goto L5d
            if (r0 == r4) goto L65
            switch(r0) {
                case 60: goto L65;
                case 61: goto L5d;
                case 62: goto L5d;
                case 63: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L35
        L5d:
            r7.back()
            java.lang.String r0 = r5.toString()
            return r0
        L65:
            java.lang.String r0 = "Bad character in a name"
            com.netflix.android.org.json.JSONException r0 = r7.syntaxError(r0)
            throw r0
        L6c:
            java.lang.String r0 = r5.toString()
            return r0
        L71:
            java.lang.Character r0 = com.netflix.android.org.json.XML.BANG
            return r0
        L74:
            java.lang.Character r0 = com.netflix.android.org.json.XML.SLASH
            return r0
        L77:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
        L7c:
            char r2 = r7.next()
            if (r2 == 0) goto L99
            if (r2 != r0) goto L89
            java.lang.String r0 = r1.toString()
            return r0
        L89:
            r3 = 38
            if (r2 != r3) goto L95
            java.lang.Object r2 = r7.nextEntity(r2)
            r1.append(r2)
            goto L7c
        L95:
            r1.append(r2)
            goto L7c
        L99:
            java.lang.String r0 = "Unterminated string"
            com.netflix.android.org.json.JSONException r0 = r7.syntaxError(r0)
            throw r0
        La0:
            java.lang.String r0 = "Misshaped element"
            com.netflix.android.org.json.JSONException r0 = r7.syntaxError(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.org.json.XMLTokener.nextToken():java.lang.Object");
    }

    public boolean skipPast(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            char next = next();
            if (next == 0) {
                return false;
            }
            cArr[i] = next;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            for (int i4 = 0; i4 < length; i4++) {
                if (cArr[i3] != str.charAt(i4)) {
                    char next2 = next();
                    if (next2 == 0) {
                        return false;
                    }
                    cArr[i2] = next2;
                    i2++;
                    if (i2 >= length) {
                        i2 -= length;
                    }
                } else {
                    i3++;
                    if (i3 >= length) {
                        i3 -= length;
                    }
                }
            }
            return true;
        }
    }
}
