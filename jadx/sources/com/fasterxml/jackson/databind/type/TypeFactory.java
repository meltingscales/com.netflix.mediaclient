package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC9378oU;
import o.AbstractC9454pr;
import o.AbstractC9525rI;
import o.C9526rJ;
import o.C9537rU;

/* loaded from: classes5.dex */
public class TypeFactory implements Serializable {
    protected static final SimpleType a;
    protected static final SimpleType b;
    protected static final SimpleType c;
    protected static final SimpleType d;
    protected static final SimpleType e;
    protected static final SimpleType f;
    protected static final SimpleType h;
    protected static final SimpleType i;
    protected static final SimpleType j;
    private static final Class<?> p;
    private static final Class<?> s;
    private static final long serialVersionUID = 1;
    private static final Class<?> x;
    protected final LRUMap<Object, JavaType> l;
    protected final AbstractC9525rI[] m;
    protected final TypeParser n;

    /* renamed from: o  reason: collision with root package name */
    protected final ClassLoader f13113o;
    private static final JavaType[] v = new JavaType[0];
    protected static final TypeFactory k = new TypeFactory();
    protected static final TypeBindings g = TypeBindings.a();
    private static final Class<?> y = String.class;
    private static final Class<?> u = Object.class;
    private static final Class<?> t = Comparable.class;
    private static final Class<?> r = Class.class;
    private static final Class<?> q = Enum.class;
    private static final Class<?> w = AbstractC9454pr.class;

    public static TypeFactory a() {
        return k;
    }

    protected JavaType d() {
        return j;
    }

    public ClassLoader e() {
        return this.f13113o;
    }

    static {
        Class<?> cls = Boolean.TYPE;
        s = cls;
        Class<?> cls2 = Integer.TYPE;
        p = cls2;
        Class<?> cls3 = Long.TYPE;
        x = cls3;
        d = new SimpleType(cls);
        e = new SimpleType(cls2);
        h = new SimpleType(cls3);
        i = new SimpleType(String.class);
        j = new SimpleType(Object.class);
        a = new SimpleType(Comparable.class);
        c = new SimpleType(Enum.class);
        b = new SimpleType(Class.class);
        f = new SimpleType(AbstractC9454pr.class);
    }

    private TypeFactory() {
        this(null);
    }

    protected TypeFactory(LRUMap<Object, JavaType> lRUMap) {
        this.l = lRUMap == null ? new LRUMap<>(16, 200) : lRUMap;
        this.n = new TypeParser(this);
        this.m = null;
        this.f13113o = null;
    }

    public static JavaType b() {
        return a().d();
    }

    public Class<?> d(String str) {
        Throwable th;
        Class<?> a2;
        if (str.indexOf(46) >= 0 || (a2 = a(str)) == null) {
            ClassLoader e2 = e();
            if (e2 == null) {
                e2 = Thread.currentThread().getContextClassLoader();
            }
            if (e2 != null) {
                try {
                    return b(str, true, e2);
                } catch (Exception e3) {
                    th = C9537rU.c((Throwable) e3);
                }
            } else {
                th = null;
            }
            try {
                return b(str);
            } catch (Exception e4) {
                if (th == null) {
                    th = C9537rU.c((Throwable) e4);
                }
                C9537rU.h(th);
                throw new ClassNotFoundException(th.getMessage(), th);
            }
        }
        return a2;
    }

    protected Class<?> b(String str, boolean z, ClassLoader classLoader) {
        return Class.forName(str, true, classLoader);
    }

    protected Class<?> b(String str) {
        return Class.forName(str);
    }

    protected Class<?> a(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    public JavaType d(JavaType javaType, Class<?> cls) {
        JavaType a2;
        Class<?> h2 = javaType.h();
        if (h2 == cls) {
            return javaType;
        }
        if (h2 == Object.class) {
            a2 = a((C9526rJ) null, cls, g);
        } else if (!h2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(String.format("Class %s not subtype of %s", cls.getName(), javaType));
        } else {
            if (javaType.a().c()) {
                a2 = a((C9526rJ) null, cls, g);
            } else {
                if (javaType.x()) {
                    if (javaType.B()) {
                        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                            a2 = a((C9526rJ) null, cls, TypeBindings.c(cls, javaType.f(), javaType.j()));
                        }
                    } else if (javaType.r()) {
                        if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                            a2 = a((C9526rJ) null, cls, TypeBindings.b(cls, javaType.j()));
                        } else if (h2 == EnumSet.class) {
                            return javaType;
                        }
                    }
                }
                int length = cls.getTypeParameters().length;
                if (length == 0) {
                    a2 = a((C9526rJ) null, cls, g);
                } else {
                    a2 = a((C9526rJ) null, cls, a(javaType, length, cls));
                }
            }
        }
        return a2.c(javaType);
    }

    private TypeBindings a(JavaType javaType, int i2, Class<?> cls) {
        PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            placeholderForTypeArr[i3] = new PlaceholderForType(i3);
        }
        JavaType c2 = a((C9526rJ) null, cls, TypeBindings.c(cls, placeholderForTypeArr)).c(javaType.h());
        if (c2 == null) {
            throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", javaType.h().getName(), cls.getName()));
        }
        String e2 = e(javaType, c2);
        if (e2 != null) {
            throw new IllegalArgumentException("Failed to specialize base type " + javaType.e() + " as " + cls.getName() + ", problem: " + e2);
        }
        JavaType[] javaTypeArr = new JavaType[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            JavaType F = placeholderForTypeArr[i4].F();
            if (F == null) {
                F = b();
            }
            javaTypeArr[i4] = F;
        }
        return TypeBindings.c(cls, javaTypeArr);
    }

    private String e(JavaType javaType, JavaType javaType2) {
        List<JavaType> d2 = javaType.a().d();
        List<JavaType> d3 = javaType2.a().d();
        int size = d2.size();
        for (int i2 = 0; i2 < size; i2++) {
            JavaType javaType3 = d2.get(i2);
            JavaType javaType4 = d3.get(i2);
            if (!d(javaType3, javaType4) && !javaType3.d(Object.class) && ((i2 != 0 || !javaType.B() || !javaType4.d(Object.class)) && (!javaType3.y() || !javaType3.b(javaType4.h())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i2 + 1), Integer.valueOf(size), javaType3.e(), javaType4.e());
            }
        }
        return null;
    }

    private boolean d(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).b(javaType);
            return true;
        } else if (javaType.h() != javaType2.h()) {
            return false;
        } else {
            List<JavaType> d2 = javaType.a().d();
            List<JavaType> d3 = javaType2.a().d();
            int size = d2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!d(d2.get(i2), d3.get(i2))) {
                    return false;
                }
            }
            return true;
        }
    }

    public JavaType a(JavaType javaType, Class<?> cls) {
        Class<?> h2 = javaType.h();
        if (h2 == cls) {
            return javaType;
        }
        JavaType c2 = javaType.c(cls);
        if (c2 == null) {
            if (!cls.isAssignableFrom(h2)) {
                throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
            }
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
        }
        return c2;
    }

    public JavaType c(String str) {
        return this.n.b(str);
    }

    public JavaType[] b(JavaType javaType, Class<?> cls) {
        JavaType c2 = javaType.c(cls);
        return c2 == null ? v : c2.a().b();
    }

    public JavaType d(Type type) {
        return b((C9526rJ) null, type, g);
    }

    public JavaType e(Type type, TypeBindings typeBindings) {
        return b((C9526rJ) null, type, typeBindings);
    }

    public JavaType a(AbstractC9378oU<?> abstractC9378oU) {
        return b((C9526rJ) null, abstractC9378oU.b(), g);
    }

    public CollectionType b(Class<? extends Collection> cls, Class<?> cls2) {
        return e(cls, a((C9526rJ) null, cls2, g));
    }

    public CollectionType e(Class<? extends Collection> cls, JavaType javaType) {
        TypeBindings d2 = TypeBindings.d(cls, javaType);
        CollectionType collectionType = (CollectionType) a((C9526rJ) null, cls, d2);
        if (d2.c() && javaType != null) {
            JavaType j2 = collectionType.c(Collection.class).j();
            if (!j2.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", C9537rU.u(cls), javaType, j2));
            }
        }
        return collectionType;
    }

    public MapType a(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType a2;
        JavaType a3;
        if (cls == Properties.class) {
            a2 = i;
            a3 = a2;
        } else {
            TypeBindings typeBindings = g;
            a2 = a((C9526rJ) null, cls2, typeBindings);
            a3 = a((C9526rJ) null, cls3, typeBindings);
        }
        return e(cls, a2, a3);
    }

    public MapType e(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        TypeBindings d2 = TypeBindings.d(cls, new JavaType[]{javaType, javaType2});
        MapType mapType = (MapType) a((C9526rJ) null, cls, d2);
        if (d2.c()) {
            JavaType c2 = mapType.c(Map.class);
            JavaType f2 = c2.f();
            if (!f2.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", C9537rU.u(cls), javaType, f2));
            }
            JavaType j2 = c2.j();
            if (!j2.equals(javaType2)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", C9537rU.u(cls), javaType2, j2));
            }
        }
        return mapType;
    }

    @Deprecated
    public JavaType c(Class<?> cls) {
        return e(cls, g, null, null);
    }

    private JavaType d(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType d2;
        JavaType javaType2;
        JavaType javaType3;
        if (cls == Properties.class) {
            d2 = i;
        } else {
            List<JavaType> d3 = typeBindings.d();
            int size = d3.size();
            if (size != 0) {
                if (size == 2) {
                    javaType2 = d3.get(1);
                    javaType3 = d3.get(0);
                    return MapType.d(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
                }
                throw new IllegalArgumentException("Strange Map type " + cls.getName() + ": cannot determine type parameters");
            }
            d2 = d();
        }
        javaType3 = d2;
        javaType2 = javaType3;
        return MapType.d(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
    }

    private JavaType a(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List<JavaType> d2 = typeBindings.d();
        if (d2.isEmpty()) {
            javaType2 = d();
        } else if (d2.size() == 1) {
            javaType2 = d2.get(0);
        } else {
            throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
        }
        return CollectionType.b(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    private JavaType b(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List<JavaType> d2 = typeBindings.d();
        if (d2.isEmpty()) {
            javaType2 = d();
        } else if (d2.size() == 1) {
            javaType2 = d2.get(0);
        } else {
            throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
        }
        return ReferenceType.a(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    protected JavaType e(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType d2;
        return (!typeBindings.c() || (d2 = d(cls)) == null) ? c(cls, typeBindings, javaType, javaTypeArr) : d2;
    }

    protected JavaType c(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    protected JavaType d(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == s) {
                return d;
            }
            if (cls == p) {
                return e;
            }
            if (cls == x) {
                return h;
            }
            return null;
        } else if (cls == y) {
            return i;
        } else {
            if (cls == u) {
                return j;
            }
            if (cls == w) {
                return f;
            }
            return null;
        }
    }

    protected JavaType b(C9526rJ c9526rJ, Type type, TypeBindings typeBindings) {
        JavaType a2;
        if (type instanceof Class) {
            a2 = a(c9526rJ, (Class) type, g);
        } else if (type instanceof ParameterizedType) {
            a2 = a(c9526rJ, (ParameterizedType) type, typeBindings);
        } else if (type instanceof JavaType) {
            return (JavaType) type;
        } else {
            if (type instanceof GenericArrayType) {
                a2 = d(c9526rJ, (GenericArrayType) type, typeBindings);
            } else if (type instanceof TypeVariable) {
                a2 = b(c9526rJ, (TypeVariable) type, typeBindings);
            } else if (type instanceof WildcardType) {
                a2 = a(c9526rJ, (WildcardType) type, typeBindings);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized Type: ");
                sb.append(type == null ? "[null]" : type.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (this.m != null) {
            TypeBindings a3 = a2.a();
            if (a3 == null) {
                a3 = g;
            }
            AbstractC9525rI[] abstractC9525rIArr = this.m;
            int length = abstractC9525rIArr.length;
            int i2 = 0;
            while (i2 < length) {
                AbstractC9525rI abstractC9525rI = abstractC9525rIArr[i2];
                JavaType b2 = abstractC9525rI.b(a2, type, a3, this);
                if (b2 == null) {
                    throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", abstractC9525rI, abstractC9525rI.getClass().getName(), a2));
                }
                i2++;
                a2 = b2;
            }
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JavaType a(C9526rJ c9526rJ, Class<?> cls, TypeBindings typeBindings) {
        C9526rJ b2;
        JavaType d2;
        JavaType[] b3;
        JavaType c2;
        JavaType d3 = d(cls);
        if (d3 != null) {
            return d3;
        }
        Object d4 = (typeBindings == null || typeBindings.c()) ? cls : typeBindings.d(cls);
        JavaType a2 = this.l.a(d4);
        if (a2 != null) {
            return a2;
        }
        if (c9526rJ == null) {
            b2 = new C9526rJ(cls);
        } else {
            C9526rJ a3 = c9526rJ.a(cls);
            if (a3 != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, g);
                a3.a(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            b2 = c9526rJ.b(cls);
        }
        if (cls.isArray()) {
            c2 = ArrayType.e(b(b2, (Type) cls.getComponentType(), typeBindings), typeBindings);
        } else {
            if (cls.isInterface()) {
                b3 = b(b2, cls, typeBindings);
                d2 = null;
            } else {
                d2 = d(b2, cls, typeBindings);
                b3 = b(b2, cls, typeBindings);
            }
            JavaType[] javaTypeArr = b3;
            JavaType javaType = d2;
            if (cls == Properties.class) {
                SimpleType simpleType = i;
                a2 = MapType.d(cls, typeBindings, javaType, javaTypeArr, simpleType, simpleType);
            } else if (javaType != null) {
                a2 = javaType.a(cls, typeBindings, javaType, javaTypeArr);
            }
            c2 = (a2 == null && (a2 = d(b2, cls, typeBindings, javaType, javaTypeArr)) == null && (a2 = b(b2, cls, typeBindings, javaType, javaTypeArr)) == null) ? c(cls, typeBindings, javaType, javaTypeArr) : a2;
        }
        b2.a(c2);
        if (!c2.q()) {
            this.l.e(d4, c2);
        }
        return c2;
    }

    protected JavaType d(C9526rJ c9526rJ, Class<?> cls, TypeBindings typeBindings) {
        Type k2 = C9537rU.k(cls);
        if (k2 == null) {
            return null;
        }
        return b(c9526rJ, k2, typeBindings);
    }

    protected JavaType[] b(C9526rJ c9526rJ, Class<?> cls, TypeBindings typeBindings) {
        Type[] f2 = C9537rU.f(cls);
        if (f2 == null || f2.length == 0) {
            return v;
        }
        int length = f2.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i2 = 0; i2 < length; i2++) {
            javaTypeArr[i2] = b(c9526rJ, f2[i2], typeBindings);
        }
        return javaTypeArr;
    }

    protected JavaType d(C9526rJ c9526rJ, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        if (typeBindings == null) {
            typeBindings = g;
        }
        if (cls == Map.class) {
            return d(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return a(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return b(cls, typeBindings, javaType, javaTypeArr);
        }
        return null;
    }

    protected JavaType b(C9526rJ c9526rJ, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType javaType2 : javaTypeArr) {
            JavaType a2 = javaType2.a(cls, typeBindings, javaType, javaTypeArr);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    protected JavaType a(C9526rJ c9526rJ, ParameterizedType parameterizedType, TypeBindings typeBindings) {
        TypeBindings c2;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == q) {
            return c;
        }
        if (cls == t) {
            return a;
        }
        if (cls == r) {
            return b;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            c2 = g;
        } else {
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i2 = 0; i2 < length; i2++) {
                javaTypeArr[i2] = b(c9526rJ, actualTypeArguments[i2], typeBindings);
            }
            c2 = TypeBindings.c(cls, javaTypeArr);
        }
        return a(c9526rJ, cls, c2);
    }

    protected JavaType d(C9526rJ c9526rJ, GenericArrayType genericArrayType, TypeBindings typeBindings) {
        return ArrayType.e(b(c9526rJ, genericArrayType.getGenericComponentType(), typeBindings), typeBindings);
    }

    protected JavaType b(C9526rJ c9526rJ, TypeVariable<?> typeVariable, TypeBindings typeBindings) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (typeBindings == null) {
            throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
        }
        JavaType e2 = typeBindings.e(name);
        if (e2 != null) {
            return e2;
        }
        if (typeBindings.c(name)) {
            return j;
        }
        TypeBindings b2 = typeBindings.b(name);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return b(c9526rJ, bounds[0], b2);
    }

    protected JavaType a(C9526rJ c9526rJ, WildcardType wildcardType, TypeBindings typeBindings) {
        return b(c9526rJ, wildcardType.getUpperBounds()[0], typeBindings);
    }
}
