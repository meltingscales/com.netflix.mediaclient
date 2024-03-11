package o;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
public final class dnT {
    private static final Map<Class<?>, Class<?>> a;
    public static final Type[] b;
    public static final Set<Annotation> c;
    public static final Class<?> d;
    private static final Class<? extends Annotation> e;

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:10:0x001a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            java.util.Set r0 = java.util.Collections.emptySet()
            o.dnT.c = r0
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            o.dnT.b = r0
            r0 = 0
            java.lang.String r1 = getKotlinMetadataClassName()     // Catch: java.lang.ClassNotFoundException -> L15
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L15
            goto L16
        L15:
            r1 = r0
        L16:
            o.dnT.e = r1
            java.lang.Class<o.dsp> r0 = o.C8627dsp.class
        L1a:
            o.dnT.d = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r0.<init>(r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            o.dnT.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dnT.<clinit>():void");
    }

    public static String e(String str, AnnotatedElement annotatedElement) {
        return d(str, (InterfaceC8501dny) annotatedElement.getAnnotation(InterfaceC8501dny.class));
    }

    public static String d(String str, InterfaceC8501dny interfaceC8501dny) {
        if (interfaceC8501dny == null) {
            return str;
        }
        String a2 = interfaceC8501dny.a();
        return "\u0000".equals(a2) ? str : a2;
    }

    public static Set<? extends Annotation> d(AnnotatedElement annotatedElement) {
        return a(annotatedElement.getAnnotations());
    }

    public static Set<? extends Annotation> a(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(dnE.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : c;
    }

    public static boolean d(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static RuntimeException c(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new e(b((Type) cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof a) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new a(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof e ? type : new e(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof d)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new d(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static Type c(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return type;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length != 1) {
                throw new IllegalArgumentException();
            }
            return upperBounds[0];
        }
        return type;
    }

    public static Type b(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new LinkedHashSet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable<?>> r11) {
        /*
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L18
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto Le
            return r10
        Le:
            r11.add(r0)
            java.lang.reflect.Type r10 = d(r8, r9, r0)
            if (r10 != r0) goto L0
            return r10
        L18:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L35
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L35
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = a(r8, r9, r10, r11)
            if (r10 != r8) goto L30
            goto L34
        L30:
            java.lang.reflect.GenericArrayType r0 = o.dnO.d(r8)
        L34:
            return r0
        L35:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L4b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = a(r8, r9, r0, r11)
            if (r0 != r8) goto L46
            goto L4a
        L46:
            java.lang.reflect.GenericArrayType r10 = o.dnO.d(r8)
        L4a:
            return r10
        L4b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = a(r8, r9, r0, r11)
            if (r3 == r0) goto L5f
            r0 = r1
            goto L60
        L5f:
            r0 = r2
        L60:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L65:
            if (r2 >= r5) goto L80
            r6 = r4[r2]
            java.lang.reflect.Type r6 = a(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L7d
            if (r0 != 0) goto L7b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L7b:
            r4[r2] = r6
        L7d:
            int r2 = r2 + 1
            goto L65
        L80:
            if (r0 == 0) goto L8c
            o.dnT$a r8 = new o.dnT$a
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L8c:
            return r10
        L8d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lbf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto Lad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = a(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto Lbf
            java.lang.reflect.WildcardType r8 = o.dnO.j(r8)
            return r8
        Lad:
            int r0 = r3.length
            if (r0 != r1) goto Lbf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = a(r8, r9, r0, r11)
            r9 = r3[r2]
            if (r8 == r9) goto Lbf
            java.lang.reflect.WildcardType r8 = o.dnO.a(r8)
            return r8
        Lbf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dnT.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    static Type d(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a2 = a(typeVariable);
        if (a2 == null) {
            return typeVariable;
        }
        Type e2 = e(type, cls, a2);
        if (e2 instanceof ParameterizedType) {
            return ((ParameterizedType) e2).getActualTypeArguments()[a(a2.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static int b(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    static String a(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static int a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    static Class<?> a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static void e(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* loaded from: classes5.dex */
    public static final class a implements ParameterizedType {
        private final Type b;
        public final Type[] c;
        private final Type d;

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.d;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.b;
        }

        public a(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || dnO.c(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.d = type == null ? null : dnT.b(type);
            this.b = dnT.b(type2);
            this.c = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.c;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i].getClass();
                dnT.e(this.c[i]);
                Type[] typeArr3 = this.c;
                typeArr3[i] = dnT.b(typeArr3[i]);
                i++;
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.c.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && dnO.a(this, (ParameterizedType) obj);
        }

        public int hashCode() {
            return (Arrays.hashCode(this.c) ^ this.b.hashCode()) ^ dnT.b((Object) this.d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.c.length + 1) * 30);
            sb.append(dnT.a(this.b));
            if (this.c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(dnT.a(this.c[0]));
            for (int i = 1; i < this.c.length; i++) {
                sb.append(", ");
                sb.append(dnT.a(this.c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements GenericArrayType {
        private final Type a;

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.a;
        }

        public e(Type type) {
            this.a = dnT.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && dnO.a(this, (GenericArrayType) obj);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return dnT.a(this.a) + "[]";
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements WildcardType {
        private final Type a;
        private final Type b;

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.b};
        }

        public d(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                dnT.e(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.a = dnT.b(typeArr2[0]);
                this.b = Object.class;
                return;
            }
            typeArr[0].getClass();
            dnT.e(typeArr[0]);
            this.a = null;
            this.b = dnT.b(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.a;
            return type != null ? new Type[]{type} : dnT.b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && dnO.a(this, (WildcardType) obj);
        }

        public int hashCode() {
            Type type = this.a;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.b.hashCode() + 31);
        }

        public String toString() {
            if (this.a != null) {
                return "? super " + dnT.a(this.a);
            } else if (this.b == Object.class) {
                return "?";
            } else {
                return "? extends " + dnT.a(this.b);
            }
        }
    }

    public static String d(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static dnD<?> d(dnN dnn, Type type, Class<?> cls) {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        dnF dnf = (dnF) cls.getAnnotation(dnF.class);
        Class<?> cls2 = null;
        if (dnf == null || !dnf.c()) {
            return null;
        }
        try {
            try {
                cls2 = Class.forName(dnO.b(cls.getName()), true, cls.getClassLoader());
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(dnN.class, Type[].class);
                        objArr = new Object[]{dnn, actualTypeArguments};
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                        objArr = new Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(dnN.class);
                        objArr = new Object[]{dnn};
                    } catch (NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                        objArr = new Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((dnD) declaredConstructor.newInstance(objArr)).c();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e4);
            } catch (InvocationTargetException e5) {
                throw c(e5);
            }
        } catch (NoSuchMethodException e6) {
            if (!(type instanceof ParameterizedType) && cls2.getTypeParameters().length != 0) {
                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e6);
            }
            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e6);
        }
    }

    public static boolean e(Class<?> cls) {
        Class<? extends Annotation> cls2 = e;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static JsonDataException b(String str, String str2, JsonReader jsonReader) {
        String format;
        String d2 = jsonReader.d();
        if (str2.equals(str)) {
            format = String.format("Required value '%s' missing at %s", str, d2);
        } else {
            format = String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, d2);
        }
        return new JsonDataException(format);
    }

    public static JsonDataException d(String str, String str2, JsonReader jsonReader) {
        String format;
        String d2 = jsonReader.d();
        if (str2.equals(str)) {
            format = String.format("Non-null value '%s' was null at %s", str, d2);
        } else {
            format = String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, d2);
        }
        return new JsonDataException(format);
    }
}
