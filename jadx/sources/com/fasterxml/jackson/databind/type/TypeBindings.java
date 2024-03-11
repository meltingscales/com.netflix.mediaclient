package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C9537rU;

/* loaded from: classes5.dex */
public class TypeBindings implements Serializable {
    private static final JavaType[] a;
    private static final TypeBindings b;
    private static final String[] e;
    private static final long serialVersionUID = 1;
    private final int c;
    private final String[] d;
    private final JavaType[] g;
    private final String[] i;

    public static TypeBindings a() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JavaType[] b() {
        return this.g;
    }

    public int hashCode() {
        return this.c;
    }

    static {
        String[] strArr = new String[0];
        e = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        a = javaTypeArr;
        b = new TypeBindings(strArr, javaTypeArr, null);
    }

    private TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? e : strArr;
        this.d = strArr;
        javaTypeArr = javaTypeArr == null ? a : javaTypeArr;
        this.g = javaTypeArr;
        if (strArr.length != javaTypeArr.length) {
            throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + javaTypeArr.length + ")");
        }
        int length = javaTypeArr.length;
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.g[i2].hashCode();
        }
        this.i = strArr2;
        this.c = i;
    }

    protected Object readResolve() {
        String[] strArr = this.d;
        return (strArr == null || strArr.length == 0) ? b : this;
    }

    public static TypeBindings b(Class<?> cls, List<JavaType> list) {
        return c(cls, (list == null || list.isEmpty()) ? a : (JavaType[]) list.toArray(a));
    }

    public static TypeBindings c(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = a;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return b(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return c(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = e;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(javaTypeArr.length);
            sb.append(" type parameter");
            sb.append(javaTypeArr.length == 1 ? "" : "s");
            sb.append(": class expects ");
            sb.append(strArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public static TypeBindings b(Class<?> cls, JavaType javaType) {
        TypeVariable<?>[] a2 = c.a(cls);
        int length = a2 == null ? 0 : a2.length;
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new TypeBindings(new String[]{a2[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static TypeBindings c(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable<?>[] d = c.d(cls);
        int length = d == null ? 0 : d.length;
        if (length != 2) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
        }
        return new TypeBindings(new String[]{d[0].getName(), d[1].getName()}, new JavaType[]{javaType, javaType2}, null);
    }

    public static TypeBindings d(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return b;
        }
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static TypeBindings d(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return b;
        }
        if (javaTypeArr == null) {
            javaTypeArr = a;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeParameters[i].getName();
        }
        if (length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(javaTypeArr.length);
            sb.append(" type parameter");
            sb.append(javaTypeArr.length == 1 ? "" : "s");
            sb.append(": class expects ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public TypeBindings b(String str) {
        String[] strArr = this.i;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new TypeBindings(this.d, this.g, strArr2);
    }

    public JavaType e(String str) {
        JavaType F;
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this.d[i])) {
                JavaType javaType = this.g[i];
                return (!(javaType instanceof ResolvedRecursiveType) || (F = ((ResolvedRecursiveType) javaType).F()) == null) ? javaType : F;
            }
        }
        return null;
    }

    public boolean c() {
        return this.g.length == 0;
    }

    public int e() {
        return this.g.length;
    }

    public JavaType c(int i) {
        if (i >= 0) {
            JavaType[] javaTypeArr = this.g;
            if (i >= javaTypeArr.length) {
                return null;
            }
            return javaTypeArr[i];
        }
        return null;
    }

    public List<JavaType> d() {
        JavaType[] javaTypeArr = this.g;
        if (javaTypeArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(javaTypeArr);
    }

    public boolean c(String str) {
        String[] strArr = this.i;
        if (strArr != null) {
            int length = strArr.length;
            do {
                length--;
                if (length < 0) {
                    return false;
                }
            } while (!str.equals(this.i[length]));
            return true;
        }
        return false;
    }

    public Object d(Class<?> cls) {
        return new b(cls, this.g, this.c);
    }

    public String toString() {
        if (this.g.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int length = this.g.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(this.g[i].g());
        }
        sb.append('>');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (C9537rU.c(obj, getClass())) {
            TypeBindings typeBindings = (TypeBindings) obj;
            int length = this.g.length;
            if (length != typeBindings.e()) {
                return false;
            }
            JavaType[] javaTypeArr = typeBindings.g;
            for (int i = 0; i < length; i++) {
                if (!javaTypeArr[i].equals(this.g[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class c {
        private static final TypeVariable<?>[] d = AbstractList.class.getTypeParameters();
        private static final TypeVariable<?>[] c = Collection.class.getTypeParameters();
        private static final TypeVariable<?>[] b = Iterable.class.getTypeParameters();
        private static final TypeVariable<?>[] g = List.class.getTypeParameters();
        private static final TypeVariable<?>[] a = ArrayList.class.getTypeParameters();
        private static final TypeVariable<?>[] i = Map.class.getTypeParameters();
        private static final TypeVariable<?>[] e = HashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] j = LinkedHashMap.class.getTypeParameters();

        c() {
        }

        public static TypeVariable<?>[] a(Class<?> cls) {
            return cls == Collection.class ? c : cls == List.class ? g : cls == ArrayList.class ? a : cls == AbstractList.class ? d : cls == Iterable.class ? b : cls.getTypeParameters();
        }

        public static TypeVariable<?>[] d(Class<?> cls) {
            return cls == Map.class ? i : cls == HashMap.class ? e : cls == LinkedHashMap.class ? j : cls.getTypeParameters();
        }
    }

    /* loaded from: classes5.dex */
    static final class b {
        private final JavaType[] a;
        private final Class<?> b;
        private final int d;

        public int hashCode() {
            return this.d;
        }

        public b(Class<?> cls, JavaType[] javaTypeArr, int i) {
            this.b = cls;
            this.a = javaTypeArr;
            this.d = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (this.d == bVar.d && this.b == bVar.b) {
                    JavaType[] javaTypeArr = bVar.a;
                    int length = this.a.length;
                    if (length == javaTypeArr.length) {
                        for (int i = 0; i < length; i++) {
                            if (!this.a[i].equals(javaTypeArr[i])) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public String toString() {
            return this.b.getName() + "<>";
        }
    }
}
