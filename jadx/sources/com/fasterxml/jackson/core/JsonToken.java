package com.fasterxml.jackson.core;

/* loaded from: classes2.dex */
public enum JsonToken {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);
    
    final boolean k;

    /* renamed from: o  reason: collision with root package name */
    final int f13096o;
    final boolean p;
    final boolean q;
    final boolean r;
    final boolean s;
    final String t;
    final byte[] w;
    final char[] x;

    public final String a() {
        return this.t;
    }

    public final boolean b() {
        return this.p;
    }

    public final int c() {
        return this.f13096o;
    }

    public final char[] d() {
        return this.x;
    }

    public final boolean e() {
        return this.s;
    }

    public final boolean g() {
        return this.r;
    }

    public final boolean j() {
        return this.q;
    }

    JsonToken(String str, int i) {
        boolean z = false;
        if (str == null) {
            this.t = null;
            this.x = null;
            this.w = null;
        } else {
            this.t = str;
            char[] charArray = str.toCharArray();
            this.x = charArray;
            int length = charArray.length;
            this.w = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.w[i2] = (byte) this.x[i2];
            }
        }
        this.f13096o = i;
        this.k = i == 10 || i == 9;
        this.s = i == 7 || i == 8;
        boolean z2 = i == 1 || i == 3;
        this.q = z2;
        boolean z3 = i == 2 || i == 4;
        this.r = z3;
        if (!z2 && !z3 && i != 5 && i != -1) {
            z = true;
        }
        this.p = z;
    }
}
