package com.fasterxml.jackson.databind.type;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ClassKey implements Comparable<ClassKey>, Serializable {
    private static final long serialVersionUID = 1;
    private int a;
    private Class<?> b;
    private String d;

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return this.d;
    }

    public ClassKey() {
        this.b = null;
        this.d = null;
        this.a = 0;
    }

    public ClassKey(Class<?> cls) {
        this.b = cls;
        String name = cls.getName();
        this.d = name;
        this.a = name.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(ClassKey classKey) {
        return this.d.compareTo(classKey.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == ClassKey.class && ((ClassKey) obj).b == this.b;
    }
}
