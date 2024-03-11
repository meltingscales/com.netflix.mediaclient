package com.netflix.android.org.json;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes5.dex */
public class JSONWriter {
    private static final int maxdepth = 200;
    private boolean comma = false;
    protected char mode = 'i';
    private final JSONObject[] stack = new JSONObject[maxdepth];
    private int top = 0;
    protected Writer writer;

    public JSONWriter(Writer writer) {
        this.writer = writer;
    }

    private JSONWriter append(String str) {
        if (str != null) {
            char c = this.mode;
            if (c == 'o' || c == 'a') {
                try {
                    if (this.comma && c == 'a') {
                        this.writer.write(44);
                    }
                    this.writer.write(str);
                    if (this.mode == 'o') {
                        this.mode = 'k';
                    }
                    this.comma = true;
                    return this;
                } catch (IOException e) {
                    throw new JSONException(e);
                }
            }
            throw new JSONException("Value out of sequence.");
        }
        throw new JSONException("Null pointer");
    }

    public JSONWriter array() {
        char c = this.mode;
        if (c == 'i' || c == 'o' || c == 'a') {
            push(null);
            append("[");
            this.comma = false;
            return this;
        }
        throw new JSONException("Misplaced array.");
    }

    private JSONWriter end(char c, char c2) {
        if (this.mode != c) {
            throw new JSONException(c == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
        }
        pop(c);
        try {
            this.writer.write(c2);
            this.comma = true;
            return this;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    public JSONWriter endArray() {
        return end('a', ']');
    }

    public JSONWriter endObject() {
        return end('k', '}');
    }

    public JSONWriter key(String str) {
        if (str != null) {
            if (this.mode == 'k') {
                try {
                    this.stack[this.top - 1].putOnce(str, Boolean.TRUE);
                    if (this.comma) {
                        this.writer.write(44);
                    }
                    this.writer.write(JSONObject.quote(str));
                    this.writer.write(58);
                    this.comma = false;
                    this.mode = 'o';
                    return this;
                } catch (IOException e) {
                    throw new JSONException(e);
                }
            }
            throw new JSONException("Misplaced key.");
        }
        throw new JSONException("Null key.");
    }

    public JSONWriter object() {
        if (this.mode == 'i') {
            this.mode = 'o';
        }
        char c = this.mode;
        if (c == 'o' || c == 'a') {
            append("{");
            push(new JSONObject());
            this.comma = false;
            return this;
        }
        throw new JSONException("Misplaced object.");
    }

    private void pop(char c) {
        int i = this.top;
        if (i <= 0) {
            throw new JSONException("Nesting error.");
        }
        JSONObject[] jSONObjectArr = this.stack;
        int i2 = i - 1;
        char c2 = 'a';
        if ((jSONObjectArr[i2] == null ? 'a' : 'k') != c) {
            throw new JSONException("Nesting error.");
        }
        this.top = i2;
        if (i2 == 0) {
            c2 = 'd';
        } else if (jSONObjectArr[i - 2] != null) {
            c2 = 'k';
        }
        this.mode = c2;
    }

    private void push(JSONObject jSONObject) {
        int i = this.top;
        if (i >= maxdepth) {
            throw new JSONException("Nesting too deep.");
        }
        this.stack[i] = jSONObject;
        this.mode = jSONObject == null ? 'a' : 'k';
        this.top = i + 1;
    }

    public JSONWriter value(boolean z) {
        return append(z ? "true" : "false");
    }

    public JSONWriter value(double d) {
        return value(new Double(d));
    }

    public JSONWriter value(long j) {
        return append(Long.toString(j));
    }

    public JSONWriter value(Object obj) {
        return append(JSONObject.valueToString(obj));
    }
}
