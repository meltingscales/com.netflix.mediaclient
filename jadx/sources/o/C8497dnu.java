package o;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o.dnD;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dnu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8497dnu implements dnD.b {
    private final List<c> b;
    private final List<c> c;

    C8497dnu(List<c> list, List<c> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // o.dnD.b
    public dnD<?> a(final Type type, final Set<? extends Annotation> set, final dnN dnn) {
        final c a = a(this.b, type, set);
        final c a2 = a(this.c, type, set);
        dnD dnd = null;
        if (a == null && a2 == null) {
            return null;
        }
        if (a == null || a2 == null) {
            try {
                dnd = dnn.b(this, type, set);
            } catch (IllegalArgumentException e) {
                String str = a == null ? "@ToJson" : "@FromJson";
                throw new IllegalArgumentException("No " + str + " adapter for " + dnT.d(type, set), e);
            }
        }
        final dnD dnd2 = dnd;
        if (a != null) {
            a.b(dnn, (dnD.b) this);
        }
        if (a2 != null) {
            a2.b(dnn, (dnD.b) this);
        }
        return new dnD<Object>() { // from class: o.dnu.1
            @Override // o.dnD
            public void b(dnK dnk, Object obj) {
                c cVar = a;
                if (cVar == null) {
                    dnd2.b(dnk, (dnK) obj);
                } else if (!cVar.l && obj == null) {
                    dnk.b();
                } else {
                    try {
                        cVar.b(dnn, dnk, obj);
                    } catch (InvocationTargetException e2) {
                        Throwable cause = e2.getCause();
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        throw new JsonDataException(cause + " at " + dnk.f(), cause);
                    }
                }
            }

            @Override // o.dnD
            public Object d(JsonReader jsonReader) {
                c cVar = a2;
                if (cVar == null) {
                    return dnd2.d(jsonReader);
                }
                if (!cVar.l && jsonReader.l() == JsonReader.Token.NULL) {
                    jsonReader.o();
                    return null;
                }
                try {
                    return a2.b(dnn, jsonReader);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + jsonReader.d(), cause);
                }
            }

            public String toString() {
                return "JsonAdapter" + set + "(" + type + ")";
            }
        };
    }

    public static C8497dnu d(Object obj) {
        Method[] declaredMethods;
        c a;
        c a2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(dnQ.class)) {
                    c a3 = a(obj, method);
                    if (a(arrayList, a3.n, a3.h) != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + a2.g + "\n    " + a3.g);
                    }
                    arrayList.add(a3);
                }
                if (method.isAnnotationPresent(dnB.class)) {
                    c e = e(obj, method);
                    if (a(arrayList2, e.n, e.h) != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + a.g + "\n    " + e.g);
                    }
                    arrayList2.add(e);
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
        }
        return new C8497dnu(arrayList, arrayList2);
    }

    static c a(Object obj, Method method) {
        method.setAccessible(true);
        final Type genericReturnType = method.getGenericReturnType();
        final Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == dnK.class && genericReturnType == Void.TYPE && c(2, genericParameterTypes)) {
            return new c(genericParameterTypes[1], dnT.a(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true) { // from class: o.dnu.4
                @Override // o.C8497dnu.c
                public void b(dnN dnn, dnK dnk, Object obj2) {
                    b(dnk, obj2);
                }
            };
        } else if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            final Set<? extends Annotation> d = dnT.d(method);
            final Set<? extends Annotation> a = dnT.a(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], a, obj, method, genericParameterTypes.length, 1, dnT.d(parameterAnnotations[0])) { // from class: o.dnu.2
                private dnD<Object> d;

                @Override // o.C8497dnu.c
                public void b(dnN dnn, dnD.b bVar) {
                    dnD<Object> e;
                    super.b(dnn, bVar);
                    if (dnO.a(genericParameterTypes[0], genericReturnType) && a.equals(d)) {
                        e = dnn.b(bVar, genericReturnType, d);
                    } else {
                        e = dnn.e(genericReturnType, d);
                    }
                    this.d = e;
                }

                @Override // o.C8497dnu.c
                public void b(dnN dnn, dnK dnk, Object obj2) {
                    this.d.b(dnk, (dnK) b(obj2));
                }
            };
        } else {
            throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
        }
    }

    private static boolean c(int i, Type[] typeArr) {
        int length = typeArr.length;
        while (i < length) {
            Type type = typeArr[i];
            if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != dnD.class) {
                return false;
            }
            i++;
        }
        return true;
    }

    static c e(Object obj, Method method) {
        method.setAccessible(true);
        final Type genericReturnType = method.getGenericReturnType();
        final Set<? extends Annotation> d = dnT.d(method);
        final Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 1 && genericParameterTypes[0] == JsonReader.class && genericReturnType != Void.TYPE && c(1, genericParameterTypes)) {
            return new c(genericReturnType, d, obj, method, genericParameterTypes.length, 1, true) { // from class: o.dnu.3
                @Override // o.C8497dnu.c
                public Object b(dnN dnn, JsonReader jsonReader) {
                    return b(jsonReader);
                }
            };
        }
        if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            final Set<? extends Annotation> a = dnT.a(parameterAnnotations[0]);
            return new c(genericReturnType, d, obj, method, genericParameterTypes.length, 1, dnT.d(parameterAnnotations[0])) { // from class: o.dnu.5
                dnD<Object> d;

                @Override // o.C8497dnu.c
                public void b(dnN dnn, dnD.b bVar) {
                    dnD<Object> e;
                    super.b(dnn, bVar);
                    if (dnO.a(genericParameterTypes[0], genericReturnType) && a.equals(d)) {
                        e = dnn.b(bVar, genericParameterTypes[0], a);
                    } else {
                        e = dnn.e(genericParameterTypes[0], a);
                    }
                    this.d = e;
                }

                @Override // o.C8497dnu.c
                public Object b(dnN dnn, JsonReader jsonReader) {
                    return b(this.d.d(jsonReader));
                }
            };
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    private static c a(List<c> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c cVar = list.get(i);
            if (dnO.a(cVar.n, type) && cVar.h.equals(set)) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dnu$c */
    /* loaded from: classes5.dex */
    public static abstract class c {
        final dnD<?>[] f;
        final Method g;
        final Set<? extends Annotation> h;
        final Object i;
        final int j;
        final boolean l;
        final Type n;

        c(Type type, Set<? extends Annotation> set, Object obj, Method method, int i, int i2, boolean z) {
            this.n = dnT.b(type);
            this.h = set;
            this.i = obj;
            this.g = method;
            this.j = i2;
            this.f = new dnD[i - i2];
            this.l = z;
        }

        public void b(dnN dnn, dnD.b bVar) {
            dnD<?> e;
            if (this.f.length > 0) {
                Type[] genericParameterTypes = this.g.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.g.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i = this.j; i < length; i++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                    Set<? extends Annotation> a = dnT.a(parameterAnnotations[i]);
                    dnD<?>[] dndArr = this.f;
                    int i2 = this.j;
                    if (dnO.a(this.n, type) && this.h.equals(a)) {
                        e = dnn.b(bVar, type, a);
                    } else {
                        e = dnn.e(type, a);
                    }
                    dndArr[i - i2] = e;
                }
            }
        }

        public void b(dnN dnn, dnK dnk, Object obj) {
            throw new AssertionError();
        }

        public Object b(dnN dnn, JsonReader jsonReader) {
            throw new AssertionError();
        }

        protected Object b(Object obj) {
            dnD<?>[] dndArr = this.f;
            Object[] objArr = new Object[dndArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(dndArr, 0, objArr, 1, dndArr.length);
            try {
                return this.g.invoke(this.i, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        protected Object b(Object obj, Object obj2) {
            dnD<?>[] dndArr = this.f;
            Object[] objArr = new Object[dndArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(dndArr, 0, objArr, 2, dndArr.length);
            try {
                return this.g.invoke(this.i, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
    }
}
