package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.ContentReference;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class JsonLocation implements Serializable {
    public static final JsonLocation d = new JsonLocation(ContentReference.b(), -1L, -1L, -1, -1);
    private static final long serialVersionUID = 2;
    protected final ContentReference a;
    protected final int b;
    protected transient String c;
    protected final int e;
    protected final long g;
    protected final long i;

    public long e() {
        return this.i;
    }

    public int hashCode() {
        return ((((this.a == null ? 1 : 2) ^ this.e) + this.b) ^ ((int) this.g)) + ((int) this.i);
    }

    public JsonLocation(ContentReference contentReference, long j, int i, int i2) {
        this(contentReference, -1L, j, i, i2);
    }

    public JsonLocation(ContentReference contentReference, long j, long j2, int i, int i2) {
        this.a = contentReference == null ? ContentReference.b() : contentReference;
        this.i = j;
        this.g = j2;
        this.e = i;
        this.b = i2;
    }

    @Deprecated
    public JsonLocation(Object obj, long j, int i, int i2) {
        this(d(obj), j, i, i2);
    }

    @Deprecated
    public JsonLocation(Object obj, long j, long j2, int i, int i2) {
        this(d(obj), j, j2, i, i2);
    }

    protected static ContentReference d(Object obj) {
        if (obj instanceof ContentReference) {
            return (ContentReference) obj;
        }
        return ContentReference.a(false, obj);
    }

    @Deprecated
    public Object d() {
        return this.a.a();
    }

    public String c() {
        if (this.c == null) {
            this.c = this.a.e();
        }
        return this.c;
    }

    public StringBuilder b(StringBuilder sb) {
        if (this.a.h()) {
            sb.append("line: ");
            int i = this.e;
            if (i >= 0) {
                sb.append(i);
            } else {
                sb.append("UNKNOWN");
            }
            sb.append(", column: ");
            int i2 = this.b;
            if (i2 >= 0) {
                sb.append(i2);
            } else {
                sb.append("UNKNOWN");
            }
        } else if (this.e > 0) {
            sb.append("line: ");
            sb.append(this.e);
            if (this.b > 0) {
                sb.append(", column: ");
                sb.append(this.b);
            }
        } else {
            sb.append("byte offset: #");
            long j = this.i;
            if (j >= 0) {
                sb.append(j);
            } else {
                sb.append("UNKNOWN");
            }
        }
        return sb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof JsonLocation)) {
            JsonLocation jsonLocation = (JsonLocation) obj;
            ContentReference contentReference = this.a;
            if (contentReference == null) {
                if (jsonLocation.a != null) {
                    return false;
                }
            } else if (!contentReference.equals(jsonLocation.a)) {
                return false;
            }
            return this.e == jsonLocation.e && this.b == jsonLocation.b && this.g == jsonLocation.g && this.i == jsonLocation.i;
        }
        return false;
    }

    public String toString() {
        String c = c();
        StringBuilder sb = new StringBuilder(c.length() + 40);
        sb.append("[Source: ");
        sb.append(c);
        sb.append("; ");
        StringBuilder b = b(sb);
        b.append(']');
        return b.toString();
    }
}
