package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    protected final int c;
    protected String d;
    protected final Class<?> e;

    public Class<?> b() {
        return this.e;
    }

    public boolean c() {
        return this.d != null;
    }

    public String d() {
        return this.d;
    }

    public int hashCode() {
        return this.c;
    }

    public NamedType(Class<?> cls) {
        this(cls, null);
    }

    public NamedType(Class<?> cls, String str) {
        this.e = cls;
        this.c = cls.getName().hashCode();
        a(str);
    }

    public void a(String str) {
        this.d = (str == null || str.length() == 0) ? null : null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == NamedType.class && this.e == ((NamedType) obj).e;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[NamedType, class ");
        sb.append(this.e.getName());
        sb.append(", name: ");
        if (this.d == null) {
            str = "null";
        } else {
            str = "'" + this.d + "'";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
