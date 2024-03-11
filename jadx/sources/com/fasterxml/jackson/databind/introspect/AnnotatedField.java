package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import o.C9513qx;
import o.C9537rU;
import o.InterfaceC9470qG;

/* loaded from: classes5.dex */
public final class AnnotatedField extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient Field a;
    protected Serialization d;

    @Override // o.AbstractC9509qt
    /* renamed from: c */
    public Field b() {
        return this.a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member h() {
        return this.a;
    }

    public AnnotatedField(InterfaceC9470qG interfaceC9470qG, Field field, C9513qx c9513qx) {
        super(interfaceC9470qG, c9513qx);
        this.a = field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* renamed from: c */
    public AnnotatedField e(C9513qx c9513qx) {
        return new AnnotatedField(this.e, this.a, c9513qx);
    }

    protected AnnotatedField(Serialization serialization) {
        super(null, null);
        this.a = null;
        this.d = serialization;
    }

    public int i() {
        return this.a.getModifiers();
    }

    @Override // o.AbstractC9509qt
    public String d() {
        return this.a.getName();
    }

    @Override // o.AbstractC9509qt
    public Class<?> e() {
        return this.a.getType();
    }

    @Override // o.AbstractC9509qt
    public JavaType a() {
        return this.e.e(this.a.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> g() {
        return this.a.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void c(Object obj, Object obj2) {
        try {
            this.a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to setValue() for field " + l() + ": " + e.getMessage(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object d(Object obj) {
        try {
            return this.a.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to getValue() for field " + l() + ": " + e.getMessage(), e);
        }
    }

    public boolean f() {
        return Modifier.isTransient(i());
    }

    @Override // o.AbstractC9509qt
    public int hashCode() {
        return this.a.getName().hashCode();
    }

    @Override // o.AbstractC9509qt
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return C9537rU.c(obj, AnnotatedField.class) && ((AnnotatedField) obj).a == this.a;
    }

    @Override // o.AbstractC9509qt
    public String toString() {
        return "[field " + l() + "]";
    }

    Object writeReplace() {
        return new AnnotatedField(new Serialization(this.a));
    }

    Object readResolve() {
        Serialization serialization = this.d;
        Class<?> cls = serialization.c;
        try {
            Field declaredField = cls.getDeclaredField(serialization.d);
            if (!declaredField.isAccessible()) {
                C9537rU.b((Member) declaredField, false);
            }
            return new AnnotatedField(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this.d.d + "' from Class '" + cls.getName());
        }
    }

    /* loaded from: classes5.dex */
    static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?> c;
        protected String d;

        public Serialization(Field field) {
            this.c = field.getDeclaringClass();
            this.d = field.getName();
        }
    }
}
