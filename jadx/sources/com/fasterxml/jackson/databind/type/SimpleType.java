package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes5.dex */
public class SimpleType extends TypeBase {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean k() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean x() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleType(Class<?> cls) {
        this(cls, TypeBindings.a(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, typeBindings, javaType, javaTypeArr, null, null, false);
    }

    protected SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, obj, obj2, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, i, obj, obj2, z);
    }

    public static SimpleType a(Class<?> cls) {
        return new SimpleType(cls, null, null, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: h */
    public SimpleType b(Object obj) {
        return this.e == obj ? this : new SimpleType(this.d, this.l, this.m, this.k, this.c, obj, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType d(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: k */
    public SimpleType a(Object obj) {
        return obj == this.c ? this : new SimpleType(this.d, this.l, this.m, this.k, obj, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: i */
    public SimpleType c(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: F */
    public SimpleType I() {
        return this.a ? this : new SimpleType(this.d, this.l, this.m, this.k, this.c, this.e, true);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String H() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.getName());
        int e = this.l.e();
        if (e > 0) {
            sb.append('<');
            for (int i = 0; i < e; i++) {
                JavaType e2 = e(i);
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(e2.e());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder d(StringBuilder sb) {
        return TypeBase.b(this.d, sb, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder b(StringBuilder sb) {
        TypeBase.b(this.d, sb, false);
        int e = this.l.e();
        if (e > 0) {
            sb.append('<');
            for (int i = 0; i < e; i++) {
                sb = e(i).b(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(H());
        sb.append(']');
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            SimpleType simpleType = (SimpleType) obj;
            if (simpleType.d != this.d) {
                return false;
            }
            return this.l.equals(simpleType.l);
        }
        return false;
    }
}
