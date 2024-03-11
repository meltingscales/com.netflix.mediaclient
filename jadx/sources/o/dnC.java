package o;

import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o.dnD;

/* loaded from: classes5.dex */
final class dnC<T> extends dnD<T> {
    public static final dnD.b e = new dnD.b() { // from class: o.dnC.5
        @Override // o.dnD.b
        public dnD<?> a(Type type, Set<? extends Annotation> set, dnN dnn) {
            if ((type instanceof Class) || (type instanceof ParameterizedType)) {
                Class<?> c = dnO.c(type);
                if (c.isInterface() || c.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (dnT.d(c)) {
                    d(type, List.class);
                    d(type, Set.class);
                    d(type, Map.class);
                    d(type, Collection.class);
                    String str = "Platform " + c;
                    if (type instanceof ParameterizedType) {
                        str = str + " in " + type;
                    }
                    throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
                } else if (c.isAnonymousClass()) {
                    throw new IllegalArgumentException("Cannot serialize anonymous class " + c.getName());
                } else if (c.isLocalClass()) {
                    throw new IllegalArgumentException("Cannot serialize local class " + c.getName());
                } else if (c.getEnclosingClass() != null && !Modifier.isStatic(c.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize non-static nested class " + c.getName());
                } else if (Modifier.isAbstract(c.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize abstract class " + c.getName());
                } else if (dnT.e(c)) {
                    throw new IllegalArgumentException("Cannot serialize Kotlin type " + c.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                } else {
                    AbstractC8502dnz e2 = AbstractC8502dnz.e(c);
                    TreeMap treeMap = new TreeMap();
                    while (type != Object.class) {
                        c(dnn, type, treeMap);
                        type = dnO.b(type);
                    }
                    return (dnD<T>) new dnC(e2, treeMap).c();
                }
            }
            return null;
        }

        private void d(Type type, Class<?> cls) {
            Class<?> c = dnO.c(type);
            if (cls.isAssignableFrom(c)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + c.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        private void c(dnN dnn, Type type, Map<String, d<?>> map) {
            Field[] declaredFields;
            InterfaceC8501dny interfaceC8501dny;
            d<?> dVar;
            d<?> put;
            Class<?> c = dnO.c(type);
            boolean d2 = dnT.d(c);
            for (Field field : c.getDeclaredFields()) {
                if (e(d2, field.getModifiers()) && ((interfaceC8501dny = (InterfaceC8501dny) field.getAnnotation(InterfaceC8501dny.class)) == null || !interfaceC8501dny.b())) {
                    Type b = dnT.b(type, c, field.getGenericType());
                    Set<? extends Annotation> d3 = dnT.d(field);
                    String name = field.getName();
                    dnD<T> e2 = dnn.e(b, d3, name);
                    field.setAccessible(true);
                    String d4 = dnT.d(name, interfaceC8501dny);
                    if (map.put(d4, new d<>(d4, field, e2)) != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.e + "\n    " + dVar.e);
                    }
                }
            }
        }

        private boolean e(boolean z, int i) {
            return (Modifier.isStatic(i) || Modifier.isTransient(i) || (!Modifier.isPublic(i) && !Modifier.isProtected(i) && z)) ? false : true;
        }
    };
    private final AbstractC8502dnz<T> a;
    private final d<?>[] c;
    private final JsonReader.c d;

    dnC(AbstractC8502dnz<T> abstractC8502dnz, Map<String, d<?>> map) {
        this.a = abstractC8502dnz;
        this.c = (d[]) map.values().toArray(new d[map.size()]);
        this.d = JsonReader.c.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // o.dnD
    public T d(JsonReader jsonReader) {
        try {
            T e2 = this.a.e();
            try {
                jsonReader.e();
                while (jsonReader.h()) {
                    int d2 = jsonReader.d(this.d);
                    if (d2 == -1) {
                        jsonReader.t();
                        jsonReader.p();
                    } else {
                        this.c[d2].a(jsonReader, e2);
                    }
                }
                jsonReader.b();
                return e2;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw dnT.c(e4);
        }
    }

    @Override // o.dnD
    public void b(dnK dnk, T t) {
        d<?>[] dVarArr;
        try {
            dnk.e();
            for (d<?> dVar : this.c) {
                dnk.d(dVar.c);
                dVar.c(dnk, t);
            }
            dnk.a();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.a + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class d<T> {
        final dnD<T> a;
        final String c;
        final Field e;

        d(String str, Field field, dnD<T> dnd) {
            this.c = str;
            this.e = field;
            this.a = dnd;
        }

        void a(JsonReader jsonReader, Object obj) {
            this.e.set(obj, this.a.d(jsonReader));
        }

        /* JADX WARN: Multi-variable type inference failed */
        void c(dnK dnk, Object obj) {
            this.a.b(dnk, (dnK) this.e.get(obj));
        }
    }
}
