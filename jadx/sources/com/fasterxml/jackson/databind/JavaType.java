package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import o.AbstractC9380oW;

/* loaded from: classes5.dex */
public abstract class JavaType extends AbstractC9380oW implements Serializable, Type {
    private static final long serialVersionUID = 1;
    public final boolean a;
    protected final int b;
    public final Object c;
    public final Class<?> d;
    public final Object e;

    public boolean B() {
        return false;
    }

    public final boolean D() {
        return this.d == Object.class;
    }

    public abstract JavaType I();

    public abstract JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr);

    public abstract JavaType a(Object obj);

    public abstract TypeBindings a();

    public abstract int b();

    public abstract JavaType b(Object obj);

    public abstract StringBuilder b(StringBuilder sb);

    public abstract JavaType c(Class<?> cls);

    public abstract JavaType c(Object obj);

    public abstract JavaType d(Object obj);

    public abstract StringBuilder d(StringBuilder sb);

    public final boolean d(Class<?> cls) {
        return this.d == cls;
    }

    public abstract JavaType e(int i);

    public abstract JavaType e(JavaType javaType);

    public abstract boolean equals(Object obj);

    public JavaType f() {
        return null;
    }

    public final Class<?> h() {
        return this.d;
    }

    public final int hashCode() {
        return this.b;
    }

    public abstract List<JavaType> i();

    public JavaType j() {
        return null;
    }

    public boolean k() {
        return true;
    }

    public <T> T l() {
        return (T) this.c;
    }

    public <T> T m() {
        return (T) this.e;
    }

    public abstract JavaType n();

    @Override // o.AbstractC9380oW
    /* renamed from: o */
    public JavaType c() {
        return null;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return (this.e == null && this.c == null) ? false : true;
    }

    public boolean r() {
        return false;
    }

    public abstract String toString();

    public abstract boolean x();

    public final boolean z() {
        return this.a;
    }

    public JavaType(Class<?> cls, int i, Object obj, Object obj2, boolean z) {
        this.d = cls;
        this.b = cls.getName().hashCode() + i;
        this.c = obj;
        this.e = obj2;
        this.a = z;
    }

    public JavaType c(JavaType javaType) {
        Object m = javaType.m();
        JavaType b = m != this.e ? b(m) : this;
        Object l = javaType.l();
        return l != this.c ? b.a(l) : b;
    }

    public final boolean e(Class<?> cls) {
        Class<?> cls2 = this.d;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean b(Class<?> cls) {
        Class<?> cls2 = this.d;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public boolean s() {
        return Modifier.isAbstract(this.d.getModifiers());
    }

    public boolean w() {
        if ((this.d.getModifiers() & 1536) == 0) {
            return true;
        }
        return this.d.isPrimitive();
    }

    public boolean A() {
        return Throwable.class.isAssignableFrom(this.d);
    }

    public final boolean u() {
        return this.d.isEnum();
    }

    public final boolean y() {
        return this.d.isInterface();
    }

    public final boolean C() {
        return this.d.isPrimitive();
    }

    public final boolean v() {
        return Modifier.isFinal(this.d.getModifiers());
    }

    public boolean t() {
        return b() > 0;
    }

    public JavaType a(int i) {
        JavaType e = e(i);
        return e == null ? TypeFactory.b() : e;
    }

    public String g() {
        StringBuilder sb = new StringBuilder(40);
        b(sb);
        return sb.toString();
    }
}
