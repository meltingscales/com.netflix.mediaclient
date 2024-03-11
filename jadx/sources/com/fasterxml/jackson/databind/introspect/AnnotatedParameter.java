package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import o.C9513qx;
import o.C9537rU;
import o.InterfaceC9470qG;

/* loaded from: classes5.dex */
public final class AnnotatedParameter extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final int a;
    protected final JavaType b;
    protected final AnnotatedWithParams d;

    @Override // o.AbstractC9509qt
    public JavaType a() {
        return this.b;
    }

    @Override // o.AbstractC9509qt
    public AnnotatedElement b() {
        return null;
    }

    public int c() {
        return this.a;
    }

    @Override // o.AbstractC9509qt
    public String d() {
        return "";
    }

    public AnnotatedWithParams f() {
        return this.d;
    }

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, InterfaceC9470qG interfaceC9470qG, C9513qx c9513qx, int i) {
        super(interfaceC9470qG, c9513qx);
        this.d = annotatedWithParams;
        this.b = javaType;
        this.a = i;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    /* renamed from: c */
    public AnnotatedParameter e(C9513qx c9513qx) {
        return c9513qx == this.c ? this : this.d.d(this.a, c9513qx);
    }

    @Override // o.AbstractC9509qt
    public Class<?> e() {
        return this.b.h();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> g() {
        return this.d.g();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member h() {
        return this.d.h();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void c(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + g().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object d(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + g().getName());
    }

    @Override // o.AbstractC9509qt
    public int hashCode() {
        return this.d.hashCode() + this.a;
    }

    @Override // o.AbstractC9509qt
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (C9537rU.c(obj, AnnotatedParameter.class)) {
            AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
            return annotatedParameter.d.equals(this.d) && annotatedParameter.a == this.a;
        }
        return false;
    }

    @Override // o.AbstractC9509qt
    public String toString() {
        return "[parameter #" + c() + ", annotations: " + this.c + "]";
    }
}
