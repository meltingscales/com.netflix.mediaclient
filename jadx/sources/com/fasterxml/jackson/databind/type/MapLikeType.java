package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;

/* loaded from: classes5.dex */
public class MapLikeType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected final JavaType i;
    protected final JavaType j;

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean B() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType f() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType j() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean x() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MapLikeType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.hashCode() ^ javaType3.hashCode(), obj, obj2, z);
        this.j = javaType2;
        this.i = javaType3;
    }

    public MapLikeType b(JavaType javaType) {
        return javaType == this.j ? this : new MapLikeType(this.d, this.l, this.m, this.k, javaType, this.i, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType e(JavaType javaType) {
        return this.i == javaType ? this : new MapLikeType(this.d, this.l, this.m, this.k, this.j, javaType, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: i */
    public MapLikeType b(Object obj) {
        return new MapLikeType(this.d, this.l, this.m, this.k, this.j, this.i, this.c, obj, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: e */
    public MapLikeType d(Object obj) {
        return new MapLikeType(this.d, this.l, this.m, this.k, this.j, this.i.b(obj), this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: h */
    public MapLikeType a(Object obj) {
        return new MapLikeType(this.d, this.l, this.m, this.k, this.j, this.i, obj, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: f */
    public MapLikeType c(Object obj) {
        return new MapLikeType(this.d, this.l, this.m, this.k, this.j, this.i.a(obj), this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType c(JavaType javaType) {
        JavaType c;
        JavaType c2;
        JavaType c3 = super.c(javaType);
        JavaType f = javaType.f();
        if ((c3 instanceof MapLikeType) && f != null && (c2 = this.j.c(f)) != this.j) {
            c3 = ((MapLikeType) c3).b(c2);
        }
        JavaType j = javaType.j();
        return (j == null || (c = this.i.c(j)) == this.i) ? c3 : c3.e(c);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: G */
    public MapLikeType I() {
        return this.a ? this : new MapLikeType(this.d, this.l, this.m, this.k, this.j, this.i.I(), this.c, this.e, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapLikeType(cls, typeBindings, javaType, javaTypeArr, this.j, this.i, this.c, this.e, this.a);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    protected String H() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.getName());
        if (this.j != null) {
            sb.append('<');
            sb.append(this.j.e());
            sb.append(',');
            sb.append(this.i.e());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean q() {
        return super.q() || this.i.q() || this.j.q();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder d(StringBuilder sb) {
        return TypeBase.b(this.d, sb, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder b(StringBuilder sb) {
        TypeBase.b(this.d, sb, false);
        sb.append('<');
        this.j.b(sb);
        this.i.b(sb);
        sb.append(">;");
        return sb;
    }

    public MapLikeType g(Object obj) {
        return new MapLikeType(this.d, this.l, this.m, this.k, this.j.a(obj), this.i, this.c, this.e, this.a);
    }

    public boolean F() {
        return Map.class.isAssignableFrom(this.d);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this.d.getName(), this.j, this.i);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            MapLikeType mapLikeType = (MapLikeType) obj;
            return this.d == mapLikeType.d && this.j.equals(mapLikeType.j) && this.i.equals(mapLikeType.i);
        }
        return false;
    }
}
