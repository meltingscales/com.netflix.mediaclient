package com.netflix.android.org.json;

import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes2.dex */
public class JSONTokener {
    private long character;
    private boolean eof;
    private long index;
    private long line;
    private char previous;
    private Reader reader;
    private boolean usePrevious;

    public static int dehexchar(char c) {
        if (c < '0' || c > '9') {
            if (c < 'A' || c > 'F') {
                if (c < 'a' || c > 'f') {
                    return -1;
                }
                return c - 'W';
            }
            return c - '7';
        }
        return c - '0';
    }

    public boolean end() {
        return this.eof && !this.usePrevious;
    }

    public JSONTokener(Reader reader) {
        this.reader = reader.markSupported() ? reader : new BufferedReader(reader);
        this.eof = false;
        this.usePrevious = false;
        this.previous = (char) 0;
        this.index = 0L;
        this.character = 1L;
        this.line = 1L;
    }

    public JSONTokener(InputStream inputStream) {
        this(new InputStreamReader(inputStream));
    }

    public JSONTokener(String str) {
        this(new StringReader(str));
    }

    public void back() {
        if (!this.usePrevious) {
            long j = this.index;
            if (j > 0) {
                this.index = j - 1;
                this.character--;
                this.usePrevious = true;
                this.eof = false;
                return;
            }
        }
        throw new JSONException("Stepping back two steps is not supported");
    }

    public boolean more() {
        next();
        if (end()) {
            return false;
        }
        back();
        return true;
    }

    public char next() {
        char c = 0;
        if (this.usePrevious) {
            this.usePrevious = false;
            c = this.previous;
        } else {
            try {
                int read = this.reader.read();
                if (read <= 0) {
                    this.eof = true;
                } else {
                    c = read;
                }
            } catch (IOException e) {
                throw new JSONException(e);
            }
        }
        this.index++;
        if (this.previous == '\r') {
            this.line++;
            this.character = c == '\n' ? 0L : 1L;
        } else if (c == '\n') {
            this.line++;
            this.character = 0L;
        } else {
            this.character++;
        }
        char c2 = c;
        this.previous = c2;
        return c2;
    }

    public char next(char c) {
        char next = next();
        if (next == c) {
            return next;
        }
        throw syntaxError("Expected '" + c + "' and instead saw '" + next + "'");
    }

    public String next(int i) {
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = next();
            if (end()) {
                throw syntaxError("Substring bounds error");
            }
        }
        return new String(cArr);
    }

    public char nextClean() {
        char next;
        do {
            next = next();
            if (next == 0) {
                break;
            }
        } while (next <= ' ');
        return next;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
        throw syntaxError("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String nextString(char r7) {
        /*
            r6 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            char r1 = r6.next()
            if (r1 == 0) goto L81
            r2 = 10
            if (r1 == r2) goto L81
            r3 = 13
            if (r1 == r3) goto L81
            r4 = 92
            if (r1 == r4) goto L22
            if (r1 != r7) goto L1e
            java.lang.String r7 = r0.toString()
            return r7
        L1e:
            r0.append(r1)
            goto L5
        L22:
            char r1 = r6.next()
            r5 = 34
            if (r1 == r5) goto L7d
            r5 = 39
            if (r1 == r5) goto L7d
            r5 = 47
            if (r1 == r5) goto L7d
            if (r1 == r4) goto L7d
            r4 = 98
            if (r1 == r4) goto L77
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L71
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 == r4) goto L6d
            r2 = 114(0x72, float:1.6E-43)
            if (r1 == r2) goto L69
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L63
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L5c
            r1 = 4
            java.lang.String r1 = r6.next(r1)
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r1, r2)
            char r1 = (char) r1
            r0.append(r1)
            goto L5
        L5c:
            java.lang.String r7 = "Illegal escape."
            com.netflix.android.org.json.JSONException r7 = r6.syntaxError(r7)
            throw r7
        L63:
            r1 = 9
            r0.append(r1)
            goto L5
        L69:
            r0.append(r3)
            goto L5
        L6d:
            r0.append(r2)
            goto L5
        L71:
            r1 = 12
            r0.append(r1)
            goto L5
        L77:
            r1 = 8
            r0.append(r1)
            goto L5
        L7d:
            r0.append(r1)
            goto L5
        L81:
            java.lang.String r7 = "Unterminated string"
            com.netflix.android.org.json.JSONException r7 = r6.syntaxError(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.org.json.JSONTokener.nextString(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        back();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String nextTo(char r4) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            char r1 = r3.next()
            if (r1 == r4) goto L1a
            if (r1 == 0) goto L1a
            r2 = 10
            if (r1 == r2) goto L1a
            r2 = 13
            if (r1 != r2) goto L16
            goto L1a
        L16:
            r0.append(r1)
            goto L5
        L1a:
            if (r1 == 0) goto L1f
            r3.back()
        L1f:
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.trim()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.org.json.JSONTokener.nextTo(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        back();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String nextTo(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            char r1 = r3.next()
            int r2 = r4.indexOf(r1)
            if (r2 >= 0) goto L1e
            if (r1 == 0) goto L1e
            r2 = 10
            if (r1 == r2) goto L1e
            r2 = 13
            if (r1 != r2) goto L1a
            goto L1e
        L1a:
            r0.append(r1)
            goto L5
        L1e:
            if (r1 == 0) goto L23
            r3.back()
        L23:
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.trim()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.org.json.JSONTokener.nextTo(java.lang.String):java.lang.String");
    }

    public Object nextValue() {
        char nextClean = nextClean();
        if (nextClean == '\"' || nextClean == '\'') {
            return nextString(nextClean);
        }
        if (nextClean == '[') {
            back();
            return new JSONArray(this);
        } else if (nextClean == '{') {
            back();
            return new JSONObject(this);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            while (nextClean >= ' ' && ",:]}/\\\"[{;=#".indexOf(nextClean) < 0) {
                stringBuffer.append(nextClean);
                nextClean = next();
            }
            back();
            String trim = stringBuffer.toString().trim();
            if ("".equals(trim)) {
                throw syntaxError("Missing value");
            }
            return JSONObject.stringToValue(trim);
        }
    }

    public char skipTo(char c) {
        char next;
        try {
            long j = this.index;
            long j2 = this.character;
            long j3 = this.line;
            this.reader.mark(Prefetch.NANOSECONDS_PER_MILLISECOND);
            do {
                next = next();
                if (next == 0) {
                    this.reader.reset();
                    this.index = j;
                    this.character = j2;
                    this.line = j3;
                    return next;
                }
            } while (next != c);
            back();
            return next;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    public JSONException syntaxError(String str) {
        return new JSONException(str + toString());
    }

    public String toString() {
        return " at " + this.index + " [character " + this.character + " line " + this.line + "]";
    }
}
