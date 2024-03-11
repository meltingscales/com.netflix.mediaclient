package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import o.AbstractC9509qt;
import o.C9513qx;
import o.C9537rU;
import o.InterfaceC9470qG;

/* loaded from: classes5.dex */
public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final String a;
    protected final Class<?> b;
    protected final JavaType d;

    @Override // o.AbstractC9509qt
    public JavaType a() {
        return this.d;
    }

    @Override // o.AbstractC9509qt
    /* renamed from: c */
    public Field b() {
        return null;
    }

    @Override // o.AbstractC9509qt
    public String d() {
        return this.a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AbstractC9509qt e(C9513qx c9513qx) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> g() {
        return this.b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member h() {
        return null;
    }

    public VirtualAnnotatedMember(InterfaceC9470qG interfaceC9470qG, Class<?> cls, String str, JavaType javaType) {
        super(interfaceC9470qG, null);
        this.b = cls;
        this.d = javaType;
        this.a = str;
    }

    @Override // o.AbstractC9509qt
    public Class<?> e() {
        return this.d.h();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void c(Object obj, Object obj2) {
        throw new IllegalArgumentException("Cannot set virtual property '" + this.a + "'");
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object d(Object obj) {
        throw new IllegalArgumentException("Cannot get virtual property '" + this.a + "'");
    }

    @Override // o.AbstractC9509qt
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // o.AbstractC9509qt
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (C9537rU.c(obj, getClass())) {
            VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
            return virtualAnnotatedMember.b == this.b && virtualAnnotatedMember.a.equals(this.a);
        }
        return false;
    }

    @Override // o.AbstractC9509qt
    public String toString() {
        return "[virtual " + l() + "]";
    }
}
