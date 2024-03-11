package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.rU  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9537rU {
    private static final Class<?> b = Object.class;
    private static final Annotation[] c = new Annotation[0];
    private static final a[] a = new a[0];
    private static final Iterator<?> e = Collections.emptyIterator();

    public static <T> T a(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static String a(String str) {
        return str == null ? "" : str;
    }

    public static <T> Iterator<T> c() {
        return (Iterator<T>) e;
    }

    public static boolean l(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == C9414pD.class;
    }

    public static List<JavaType> e(JavaType javaType, Class<?> cls, boolean z) {
        if (javaType == null || javaType.d(cls) || javaType.d(Object.class)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        c(javaType, cls, arrayList, z);
        return arrayList;
    }

    public static List<Class<?>> c(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        c(cls, cls2, arrayList, z);
        return arrayList;
    }

    public static List<Class<?>> e(Class<?> cls, Class<?> cls2, boolean z) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    private static void c(JavaType javaType, Class<?> cls, Collection<JavaType> collection, boolean z) {
        Class<?> h;
        if (javaType == null || (h = javaType.h()) == cls || h == Object.class) {
            return;
        }
        if (z) {
            if (collection.contains(javaType)) {
                return;
            }
            collection.add(javaType);
        }
        for (JavaType javaType2 : javaType.i()) {
            c(javaType2, cls, collection, true);
        }
        c(javaType.n(), cls, collection, true);
    }

    private static void c(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z) {
        if (cls == cls2 || cls == null || cls == Object.class) {
            return;
        }
        if (z) {
            if (collection.contains(cls)) {
                return;
            }
            collection.add(cls);
        }
        for (Class<?> cls3 : x(cls)) {
            c(cls3, cls2, collection, true);
        }
        c((Class<?>) cls.getSuperclass(), cls2, collection, true);
    }

    public static String c(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static String c(Class<?> cls, boolean z) {
        try {
            if (o(cls)) {
                return "local/anonymous";
            }
            if (z || Modifier.isStatic(cls.getModifiers())) {
                return null;
            }
            if (g(cls) != null) {
                return "non-static member class";
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static Class<?> n(Class<?> cls) {
        try {
            if (!o(cls) && !Modifier.isStatic(cls.getModifiers())) {
                return g(cls);
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    public static boolean y(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static boolean q(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean r(Class<?> cls) {
        return (Modifier.isStatic(cls.getModifiers()) || g(cls) == null) ? false : true;
    }

    public static boolean p(Class<?> cls) {
        return cls == b || cls.isPrimitive();
    }

    public static boolean c(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static void c(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
        }
    }

    public static Throwable b(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th;
    }

    public static Throwable h(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        return th;
    }

    public static Throwable e(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        return th;
    }

    public static Throwable c(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static Throwable j(Throwable th) {
        return e(c(th));
    }

    public static void a(Throwable th) {
        b(th, th.getMessage());
    }

    public static void b(Throwable th, String str) {
        h(th);
        b(th);
        throw new IllegalArgumentException(str, th);
    }

    public static <T> T d(DeserializationContext deserializationContext, IOException iOException) {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException c2 = JsonMappingException.c(deserializationContext, iOException.getMessage());
        c2.initCause(iOException);
        throw c2;
    }

    public static void i(Throwable th) {
        a(c(th));
    }

    public static void e(Throwable th, String str) {
        b(c(th), str);
    }

    public static void a(JsonGenerator jsonGenerator, Exception exc) {
        jsonGenerator.a(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e2) {
            exc.addSuppressed(e2);
        }
        e((Throwable) exc);
        h(exc);
        throw new RuntimeException(exc);
    }

    public static void e(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) {
        if (jsonGenerator != null) {
            jsonGenerator.a(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e3) {
                exc.addSuppressed(e3);
            }
        }
        e((Throwable) exc);
        h(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T b(Class<T> cls, boolean z) {
        Constructor d2 = d(cls, z);
        if (d2 == null) {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
        try {
            return (T) d2.newInstance(new Object[0]);
        } catch (Exception e2) {
            e(e2, "Failed to instantiate class " + cls.getName() + ", problem: " + e2.getMessage());
            return null;
        }
    }

    public static <T> Constructor<T> d(Class<T> cls, boolean z) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                b(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e2) {
            e(e2, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e2.getMessage());
            return null;
        }
    }

    public static Class<?> a(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static Class<?> d(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.h();
    }

    public static String c(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static String b(Object obj, String str) {
        return obj == null ? str : String.format("\"%s\"", obj);
    }

    public static String e(Object obj) {
        if (obj == null) {
            return "unknown";
        }
        return u(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static String e(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(javaType.e());
        sb.append('`');
        return sb.toString();
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return u(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static String u(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append("[]");
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        return b(simpleName);
    }

    public static String a(InterfaceC9539rW interfaceC9539rW) {
        return interfaceC9539rW == null ? "[null]" : b(interfaceC9539rW.a());
    }

    public static String b(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    public static String d(Throwable th) {
        if (th instanceof JsonProcessingException) {
            return ((JsonProcessingException) th).g();
        }
        return th.getMessage();
    }

    public static Object d(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static Class<?> w(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static Class<?> v(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void b(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e2) {
                if (accessibleObject.isAccessible()) {
                    return;
                }
                Class<?> declaringClass = member.getDeclaringClass();
                throw new IllegalArgumentException("Cannot access " + member + " (from class " + declaringClass.getName() + "; failed to set access: " + e2.getMessage());
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static boolean t(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static Class<? extends Enum<?>> a(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return c((Enum<?>) enumSet.iterator().next());
        }
        return d.d.b(enumSet);
    }

    public static Class<? extends Enum<?>> c(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return c((Enum<?>) enumMap.keySet().iterator().next());
        }
        return d.d.a(enumMap);
    }

    public static Class<? extends Enum<?>> c(Enum<?> r2) {
        Class cls = r2.getClass();
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Enum<?>> b(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static <T extends Annotation> Enum<?> c(Class<Enum<?>> cls, Class<T> cls2) {
        Field[] h;
        Enum<?>[] enumConstants;
        for (Field field : h(cls)) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> r8 : cls.getEnumConstants()) {
                    if (name.equals(r8.name())) {
                        return r8;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static boolean b(Object obj) {
        return obj == null || s(obj.getClass());
    }

    public static boolean s(Class<?> cls) {
        return cls.getAnnotation(InterfaceC9458pv.class) != null;
    }

    public static String m(Class<?> cls) {
        Package r0 = cls.getPackage();
        if (r0 == null) {
            return null;
        }
        return r0.getName();
    }

    public static boolean o(Class<?> cls) {
        return (p(cls) || cls.getEnclosingMethod() == null) ? false : true;
    }

    public static Field[] h(Class<?> cls) {
        return cls.getDeclaredFields();
    }

    public static Method[] j(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public static Annotation[] a(Class<?> cls) {
        return p(cls) ? c : cls.getDeclaredAnnotations();
    }

    public static Method[] e(Class<?> cls) {
        try {
            return j(cls);
        } catch (NoClassDefFoundError e2) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                throw e2;
            }
            try {
                return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
            } catch (ClassNotFoundException e3) {
                e2.addSuppressed(e3);
                throw e2;
            }
        }
    }

    public static a[] i(Class<?> cls) {
        if (cls.isInterface() || p(cls)) {
            return a;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            aVarArr[i] = new a(declaredConstructors[i]);
        }
        return aVarArr;
    }

    public static Type k(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Type[] f(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Class<?> g(Class<?> cls) {
        if (p(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    private static Class<?>[] x(Class<?> cls) {
        return cls.getInterfaces();
    }

    /* renamed from: o.rU$d */
    /* loaded from: classes5.dex */
    static class d {
        static final d d = new d();
        private final Field a = c(EnumSet.class, "elementType", Class.class);
        private final Field e = c(EnumMap.class, "elementType", Class.class);

        private d() {
        }

        public Class<? extends Enum<?>> b(EnumSet<?> enumSet) {
            Field field = this.a;
            if (field != null) {
                return (Class) a(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
        }

        public Class<? extends Enum<?>> a(EnumMap<?, ?> enumMap) {
            Field field = this.e;
            if (field != null) {
                return (Class) a(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
        }

        private Object a(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }

        private static Field c(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Field[] h = C9537rU.h(cls);
            int length = h.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = h[i];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i++;
            }
            if (field == null) {
                for (Field field2 : h) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }
    }

    /* renamed from: o.rU$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private int c = -1;
        public final Constructor<?> d;
        private Annotation[][] e;

        public Constructor<?> a() {
            return this.d;
        }

        public a(Constructor<?> constructor) {
            this.d = constructor;
        }

        public int e() {
            int i = this.c;
            if (i < 0) {
                int length = this.d.getParameterTypes().length;
                this.c = length;
                return length;
            }
            return i;
        }

        public Class<?> d() {
            return this.d.getDeclaringClass();
        }

        public Annotation[][] b() {
            Annotation[][] annotationArr = this.e;
            if (annotationArr == null) {
                Annotation[][] parameterAnnotations = this.d.getParameterAnnotations();
                this.e = parameterAnnotations;
                return parameterAnnotations;
            }
            return annotationArr;
        }
    }
}
