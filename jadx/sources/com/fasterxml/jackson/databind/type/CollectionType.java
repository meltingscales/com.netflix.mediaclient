package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes5.dex */
public final class CollectionType extends CollectionLikeType {
    private static final long serialVersionUID = 1;

    private CollectionType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2, obj, obj2, z);
    }

    public static CollectionType b(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new CollectionType(cls, typeBindings, javaType, javaTypeArr, javaType2, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public JavaType e(JavaType javaType) {
        return this.h == javaType ? this : new CollectionType(this.d, this.l, this.m, this.k, javaType, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* renamed from: m */
    public CollectionType g(Object obj) {
        return new CollectionType(this.d, this.l, this.m, this.k, this.h, this.c, obj, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* renamed from: i */
    public CollectionType e(Object obj) {
        return new CollectionType(this.d, this.l, this.m, this.k, this.h.b(obj), this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* renamed from: n */
    public CollectionType h(Object obj) {
        return new CollectionType(this.d, this.l, this.m, this.k, this.h, obj, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* renamed from: f */
    public CollectionType j(Object obj) {
        return new CollectionType(this.d, this.l, this.m, this.k, this.h.a(obj), this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    /* renamed from: G */
    public CollectionType I() {
        return this.a ? this : new CollectionType(this.d, this.l, this.m, this.k, this.h.I(), this.c, this.e, true);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionType(cls, typeBindings, javaType, javaTypeArr, this.h, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[collection type; class " + this.d.getName() + ", contains " + this.h + "]";
    }
}
