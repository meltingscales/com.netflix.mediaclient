package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public final class ArrayType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected final Object f;
    protected final JavaType i;

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType j() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean p() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean s() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean w() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean x() {
        return true;
    }

    protected ArrayType(JavaType javaType, TypeBindings typeBindings, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), typeBindings, null, null, javaType.hashCode(), obj2, obj3, z);
        this.i = javaType;
        this.f = obj;
    }

    public static ArrayType e(JavaType javaType, TypeBindings typeBindings) {
        return d(javaType, typeBindings, null, null);
    }

    public static ArrayType d(JavaType javaType, TypeBindings typeBindings, Object obj, Object obj2) {
        return new ArrayType(javaType, typeBindings, Array.newInstance(javaType.h(), 0), obj, obj2, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e(JavaType javaType) {
        return new ArrayType(javaType, this.l, Array.newInstance(javaType.h(), 0), this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: h */
    public ArrayType b(Object obj) {
        return obj == this.e ? this : new ArrayType(this.i, this.l, this.f, this.c, obj, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: e */
    public ArrayType d(Object obj) {
        return obj == this.i.m() ? this : new ArrayType(this.i.b(obj), this.l, this.f, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: g */
    public ArrayType a(Object obj) {
        return obj == this.c ? this : new ArrayType(this.i, this.l, this.f, obj, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: i */
    public ArrayType c(Object obj) {
        return obj == this.i.l() ? this : new ArrayType(this.i.a(obj), this.l, this.f, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: G */
    public ArrayType I() {
        return this.a ? this : new ArrayType(this.i.I(), this.l, this.f, this.c, this.e, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean t() {
        return this.i.t();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean q() {
        return super.q() || this.i.q();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder b(StringBuilder sb) {
        sb.append('[');
        return this.i.b(sb);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder d(StringBuilder sb) {
        sb.append('[');
        return this.i.d(sb);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[array type, component type: " + this.i + "]";
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == ArrayType.class) {
            return this.i.equals(((ArrayType) obj).i);
        }
        return false;
    }
}
