package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes5.dex */
public class PlaceholderForType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected final int g;
    protected JavaType h;

    public JavaType F() {
        return this.h;
    }

    public void b(JavaType javaType) {
        this.h = javaType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean x() {
        return false;
    }

    public PlaceholderForType(int i) {
        super(Object.class, TypeBindings.a(), TypeFactory.b(), null, 1, null, null, false);
        this.g = i;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String H() {
        return toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder b(StringBuilder sb) {
        return d(sb);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder d(StringBuilder sb) {
        sb.append('$');
        sb.append(this.g + 1);
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType b(Object obj) {
        return (JavaType) E();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType d(Object obj) {
        return (JavaType) E();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType a(Object obj) {
        return (JavaType) E();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType c(Object obj) {
        return (JavaType) E();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e(JavaType javaType) {
        return (JavaType) E();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType I() {
        return (JavaType) E();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return (JavaType) E();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return d(new StringBuilder()).toString();
    }

    private <T> T E() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }
}
