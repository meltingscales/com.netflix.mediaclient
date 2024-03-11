package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes5.dex */
public class ReferenceType extends SimpleType {
    private static final long serialVersionUID = 1;
    protected final JavaType g;
    protected final JavaType i;

    @Override // o.AbstractC9380oW
    public boolean d() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType j() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public boolean k() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType, o.AbstractC9380oW
    /* renamed from: o */
    public JavaType c() {
        return this.i;
    }

    protected ReferenceType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.hashCode(), obj, obj2, z);
        this.i = javaType2;
        this.g = javaType3 == null ? this : javaType3;
    }

    public static ReferenceType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new ReferenceType(cls, typeBindings, javaType, javaTypeArr, javaType2, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public JavaType e(JavaType javaType) {
        return this.i == javaType ? this : new ReferenceType(this.d, this.l, this.m, this.k, javaType, this.g, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* renamed from: g */
    public ReferenceType h(Object obj) {
        return obj == this.e ? this : new ReferenceType(this.d, this.l, this.m, this.k, this.i, this.g, this.c, obj, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    /* renamed from: e */
    public ReferenceType d(Object obj) {
        return obj == this.i.m() ? this : new ReferenceType(this.d, this.l, this.m, this.k, this.i.b(obj), this.g, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* renamed from: j */
    public ReferenceType k(Object obj) {
        return obj == this.c ? this : new ReferenceType(this.d, this.l, this.m, this.k, this.i, this.g, obj, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* renamed from: f */
    public ReferenceType i(Object obj) {
        if (obj == this.i.l()) {
            return this;
        }
        return new ReferenceType(this.d, this.l, this.m, this.k, this.i.a(obj), this.g, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    /* renamed from: E */
    public ReferenceType I() {
        return this.a ? this : new ReferenceType(this.d, this.l, this.m, this.k, this.i.I(), this.g, this.c, this.e, true);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new ReferenceType(cls, this.l, javaType, javaTypeArr, this.i, this.g, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.type.TypeBase
    protected String H() {
        return this.d.getName() + '<' + this.i.e() + '>';
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public StringBuilder d(StringBuilder sb) {
        return TypeBase.b(this.d, sb, true);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public StringBuilder b(StringBuilder sb) {
        TypeBase.b(this.d, sb, false);
        sb.append('<');
        StringBuilder b = this.i.b(sb);
        b.append(">;");
        return b;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[reference type, class ");
        sb.append(H());
        sb.append('<');
        sb.append(this.i);
        sb.append('>');
        sb.append(']');
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            ReferenceType referenceType = (ReferenceType) obj;
            if (referenceType.d != this.d) {
                return false;
            }
            return this.i.equals(referenceType.i);
        }
        return false;
    }
}
