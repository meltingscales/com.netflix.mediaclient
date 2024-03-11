package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import o.C9513qx;
import o.C9537rU;
import o.InterfaceC9470qG;

/* loaded from: classes5.dex */
public final class AnnotatedConstructor extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;
    protected Serialization a;
    protected final Constructor<?> d;

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member h() {
        return this.d;
    }

    @Override // o.AbstractC9509qt
    /* renamed from: i */
    public Constructor<?> b() {
        return this.d;
    }

    public AnnotatedConstructor(InterfaceC9470qG interfaceC9470qG, Constructor<?> constructor, C9513qx c9513qx, C9513qx[] c9513qxArr) {
        super(interfaceC9470qG, c9513qx, c9513qxArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.d = constructor;
    }

    protected AnnotatedConstructor(Serialization serialization) {
        super(null, null, null);
        this.d = null;
        this.a = serialization;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* renamed from: a */
    public AnnotatedConstructor e(C9513qx c9513qx) {
        return new AnnotatedConstructor(this.e, this.d, c9513qx, this.i);
    }

    @Override // o.AbstractC9509qt
    public String d() {
        return this.d.getName();
    }

    @Override // o.AbstractC9509qt
    public JavaType a() {
        return this.e.e(e());
    }

    @Override // o.AbstractC9509qt
    public Class<?> e() {
        return this.d.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int f() {
        return this.d.getParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> e(int i) {
        Class<?>[] parameterTypes = this.d.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType c(int i) {
        Type[] genericParameterTypes = this.d.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.e.e(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object c() {
        return this.d.newInstance(new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object c(Object[] objArr) {
        return this.d.newInstance(objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object c(Object obj) {
        return this.d.newInstance(obj);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> g() {
        return this.d.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void c(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + g().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object d(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + g().getName());
    }

    @Override // o.AbstractC9509qt
    public String toString() {
        return "[constructor for " + d() + ", annotations: " + this.c + "]";
    }

    @Override // o.AbstractC9509qt
    public int hashCode() {
        return this.d.getName().hashCode();
    }

    @Override // o.AbstractC9509qt
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return C9537rU.c(obj, AnnotatedConstructor.class) && ((AnnotatedConstructor) obj).d == this.d;
    }

    Object writeReplace() {
        return new AnnotatedConstructor(new Serialization(this.d));
    }

    Object readResolve() {
        Serialization serialization = this.a;
        Class<?> cls = serialization.a;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(serialization.b);
            if (!declaredConstructor.isAccessible()) {
                C9537rU.b((Member) declaredConstructor, false);
            }
            return new AnnotatedConstructor(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this.a.b.length + " args from Class '" + cls.getName());
        }
    }

    /* loaded from: classes5.dex */
    static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?> a;
        protected Class<?>[] b;

        public Serialization(Constructor<?> constructor) {
            this.a = constructor.getDeclaringClass();
            this.b = constructor.getParameterTypes();
        }
    }
}
