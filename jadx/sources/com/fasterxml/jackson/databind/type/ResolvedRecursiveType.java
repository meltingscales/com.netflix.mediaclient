package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes5.dex */
public class ResolvedRecursiveType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected JavaType h;

    public JavaType F() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType I() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType a(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType b(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType c(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType d(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e(JavaType javaType) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean x() {
        return false;
    }

    public ResolvedRecursiveType(Class<?> cls, TypeBindings typeBindings) {
        super(cls, typeBindings, null, null, 0, null, null, false);
    }

    public void d(JavaType javaType) {
        if (this.h == null) {
            this.h = javaType;
            return;
        }
        throw new IllegalStateException("Trying to re-set self reference; old value = " + this.h + ", new = " + javaType);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public JavaType n() {
        JavaType javaType = this.h;
        if (javaType != null) {
            return javaType.n();
        }
        return super.n();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public TypeBindings a() {
        JavaType javaType = this.h;
        if (javaType != null) {
            return javaType.a();
        }
        return super.a();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder b(StringBuilder sb) {
        JavaType javaType = this.h;
        if (javaType != null) {
            return javaType.d(sb);
        }
        sb.append("?");
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder d(StringBuilder sb) {
        JavaType javaType = this.h;
        return javaType != null ? javaType.d(sb) : sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[recursive type; ");
        JavaType javaType = this.h;
        if (javaType == null) {
            sb.append("UNRESOLVED");
        } else {
            sb.append(javaType.h().getName());
        }
        return sb.toString();
    }
}
