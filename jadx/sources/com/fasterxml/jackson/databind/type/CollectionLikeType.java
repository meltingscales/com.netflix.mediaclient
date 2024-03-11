package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;

/* loaded from: classes5.dex */
public class CollectionLikeType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected final JavaType h;

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType j() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean r() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean x() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CollectionLikeType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.hashCode(), obj, obj2, z);
        this.h = javaType2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e(JavaType javaType) {
        return this.h == javaType ? this : new CollectionLikeType(this.d, this.l, this.m, this.k, javaType, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: g */
    public CollectionLikeType b(Object obj) {
        return new CollectionLikeType(this.d, this.l, this.m, this.k, this.h, this.c, obj, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: e */
    public CollectionLikeType d(Object obj) {
        return new CollectionLikeType(this.d, this.l, this.m, this.k, this.h.b(obj), this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: h */
    public CollectionLikeType a(Object obj) {
        return new CollectionLikeType(this.d, this.l, this.m, this.k, this.h, obj, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: j */
    public CollectionLikeType c(Object obj) {
        return new CollectionLikeType(this.d, this.l, this.m, this.k, this.h.a(obj), this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType c(JavaType javaType) {
        JavaType c;
        JavaType c2 = super.c(javaType);
        JavaType j = javaType.j();
        return (j == null || (c = this.h.c(j)) == this.h) ? c2 : c2.e(c);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: E */
    public CollectionLikeType I() {
        return this.a ? this : new CollectionLikeType(this.d, this.l, this.m, this.k, this.h.I(), this.c, this.e, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionLikeType(cls, typeBindings, javaType, javaTypeArr, this.h, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean q() {
        return super.q() || this.h.q();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder d(StringBuilder sb) {
        return TypeBase.b(this.d, sb, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder b(StringBuilder sb) {
        TypeBase.b(this.d, sb, false);
        sb.append('<');
        this.h.b(sb);
        sb.append(">;");
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String H() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.getName());
        if (this.h != null) {
            sb.append('<');
            sb.append(this.h.e());
            sb.append('>');
        }
        return sb.toString();
    }

    public boolean F() {
        return Collection.class.isAssignableFrom(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            CollectionLikeType collectionLikeType = (CollectionLikeType) obj;
            return this.d == collectionLikeType.d && this.h.equals(collectionLikeType.h);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[collection-like type; class " + this.d.getName() + ", contains " + this.h + "]";
    }
}
