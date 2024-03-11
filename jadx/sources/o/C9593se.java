package o;

import com.fasterxml.jackson.databind.JavaType;

/* renamed from: o.se  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9593se {
    protected int a;
    protected Class<?> b;
    protected boolean c;
    protected JavaType e;

    public JavaType a() {
        return this.e;
    }

    public Class<?> b() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public final int hashCode() {
        return this.a;
    }

    public C9593se() {
    }

    public C9593se(Class<?> cls, boolean z) {
        this.b = cls;
        this.e = null;
        this.c = z;
        this.a = z ? c(cls) : d(cls);
    }

    public C9593se(JavaType javaType, boolean z) {
        this.e = javaType;
        this.b = null;
        this.c = z;
        this.a = z ? a(javaType) : b(javaType);
    }

    public static final int d(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public static final int c(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int b(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public static final int a(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public final String toString() {
        if (this.b != null) {
            return "{class: " + this.b.getName() + ", typed? " + this.c + "}";
        }
        return "{type: " + this.e + ", typed? " + this.c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        C9593se c9593se = (C9593se) obj;
        if (c9593se.c == this.c) {
            Class<?> cls = this.b;
            if (cls != null) {
                return c9593se.b == cls;
            }
            return this.e.equals(c9593se.e);
        }
        return false;
    }
}
