package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import o.C9513qx;
import o.C9537rU;
import o.InterfaceC9470qG;

/* loaded from: classes5.dex */
public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    private static final long serialVersionUID = 1;
    protected Serialization a;
    protected Class<?>[] b;
    protected final transient Method d;

    @Override // o.AbstractC9509qt
    /* renamed from: i */
    public Method b() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* renamed from: k */
    public Method h() {
        return this.d;
    }

    public AnnotatedMethod(InterfaceC9470qG interfaceC9470qG, Method method, C9513qx c9513qx, C9513qx[] c9513qxArr) {
        super(interfaceC9470qG, c9513qx, c9513qxArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.d = method;
    }

    protected AnnotatedMethod(Serialization serialization) {
        super(null, null, null);
        this.d = null;
        this.a = serialization;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* renamed from: a */
    public AnnotatedMethod e(C9513qx c9513qx) {
        return new AnnotatedMethod(this.e, this.d, c9513qx, this.i);
    }

    @Override // o.AbstractC9509qt
    public String d() {
        return this.d.getName();
    }

    @Override // o.AbstractC9509qt
    public JavaType a() {
        return this.e.e(this.d.getGenericReturnType());
    }

    @Override // o.AbstractC9509qt
    public Class<?> e() {
        return this.d.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object c() {
        return this.d.invoke(null, new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object c(Object[] objArr) {
        return this.d.invoke(null, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object c(Object obj) {
        return this.d.invoke(null, obj);
    }

    public final Object b(Object obj, Object... objArr) {
        return this.d.invoke(obj, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int f() {
        return m().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> e(int i) {
        Class<?>[] m = m();
        if (i >= m.length) {
            return null;
        }
        return m[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType c(int i) {
        Type[] genericParameterTypes = this.d.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.e.e(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> g() {
        return this.d.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void c(Object obj, Object obj2) {
        try {
            this.d.invoke(obj, obj2);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to setValue() with method " + l() + ": " + e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object d(Object obj) {
        try {
            return this.d.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to getValue() with method " + l() + ": " + e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public String l() {
        return String.format("%s(%d params)", super.l(), Integer.valueOf(f()));
    }

    public Class<?>[] m() {
        if (this.b == null) {
            this.b = this.d.getParameterTypes();
        }
        return this.b;
    }

    public Class<?> n() {
        return this.d.getReturnType();
    }

    public boolean o() {
        Class<?> n = n();
        return (n == Void.TYPE || n == Void.class) ? false : true;
    }

    @Override // o.AbstractC9509qt
    public String toString() {
        return "[method " + l() + "]";
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
        return C9537rU.c(obj, AnnotatedMethod.class) && ((AnnotatedMethod) obj).d == this.d;
    }

    Object writeReplace() {
        return new AnnotatedMethod(new Serialization(this.d));
    }

    Object readResolve() {
        Serialization serialization = this.a;
        Class<?> cls = serialization.b;
        try {
            Method declaredMethod = cls.getDeclaredMethod(serialization.e, serialization.d);
            if (!declaredMethod.isAccessible()) {
                C9537rU.b((Member) declaredMethod, false);
            }
            return new AnnotatedMethod(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this.a.e + "' from Class '" + cls.getName());
        }
    }

    /* loaded from: classes5.dex */
    static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?> b;
        protected Class<?>[] d;
        protected String e;

        public Serialization(Method method) {
            this.b = method.getDeclaringClass();
            this.e = method.getName();
            this.d = method.getParameterTypes();
        }
    }
}
