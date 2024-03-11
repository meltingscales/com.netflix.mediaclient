package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes5.dex */
public final class MapType extends MapLikeType {
    private static final long serialVersionUID = 1;

    private MapType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2, javaType3, obj, obj2, z);
    }

    public static MapType d(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3) {
        return new MapType(cls, typeBindings, javaType, javaTypeArr, javaType2, javaType3, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: l */
    public MapType i(Object obj) {
        return new MapType(this.d, this.l, this.m, this.k, this.j, this.i, this.c, obj, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: j */
    public MapType e(Object obj) {
        return new MapType(this.d, this.l, this.m, this.k, this.j, this.i.b(obj), this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: k */
    public MapType h(Object obj) {
        return new MapType(this.d, this.l, this.m, this.k, this.j, this.i, obj, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: o */
    public MapType f(Object obj) {
        return new MapType(this.d, this.l, this.m, this.k, this.j, this.i.a(obj), this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    /* renamed from: E */
    public MapType I() {
        return this.a ? this : new MapType(this.d, this.l, this.m, this.k, this.j.I(), this.i.I(), this.c, this.e, true);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public JavaType e(JavaType javaType) {
        return this.i == javaType ? this : new MapType(this.d, this.l, this.m, this.k, this.j, javaType, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: d */
    public MapType b(JavaType javaType) {
        return javaType == this.j ? this : new MapType(this.d, this.l, this.m, this.k, javaType, this.i, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapType(cls, typeBindings, javaType, javaTypeArr, this.j, this.i, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: n */
    public MapType g(Object obj) {
        return new MapType(this.d, this.l, this.m, this.k, this.j.a(obj), this.i, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return "[map type; class " + this.d.getName() + ", " + this.j + " -> " + this.i + "]";
    }
}
