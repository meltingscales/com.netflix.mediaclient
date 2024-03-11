package o;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.gk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8970gk {
    public static /* synthetic */ Bundle c(InterfaceC8888fH interfaceC8888fH, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(interfaceC8888fH, z);
    }

    public static final <T extends InterfaceC8888fH> Bundle b(T t, boolean z) {
        C8632dsu.c((Object) t, "");
        Class<?> cls = t.getClass();
        Constructor<?> b = b(cls);
        if (b == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        Annotation[][] parameterAnnotations = b.getParameterAnnotations();
        C8632dsu.a(parameterAnnotations, "");
        int length = parameterAnnotations.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Annotation[] annotationArr = parameterAnnotations[i];
            C8632dsu.a(annotationArr, "");
            int length2 = annotationArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                } else if (annotationArr[i3] instanceof InterfaceC8969gj) {
                    Object invoke = e(cls, i2).invoke(t, new Object[0]);
                    if (z) {
                        a(invoke);
                    }
                    d(bundle, String.valueOf(i2), invoke);
                } else {
                    i3++;
                }
            }
            i++;
            i2++;
        }
        return bundle;
    }

    private static final <T extends InterfaceC8888fH> Constructor<?> b(Class<? extends T> cls) {
        Constructor<?>[] constructors = cls.getConstructors();
        C8632dsu.a(constructors, "");
        for (Constructor<?> constructor : constructors) {
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            C8632dsu.a(parameterAnnotations, "");
            for (Annotation[] annotationArr : parameterAnnotations) {
                C8632dsu.a(annotationArr, "");
                for (Annotation annotation : annotationArr) {
                    if (annotation instanceof InterfaceC8969gj) {
                        return constructor;
                    }
                }
            }
        }
        return null;
    }

    private static final <T extends InterfaceC8888fH> Method e(Class<? extends T> cls, int i) {
        Method method;
        boolean i2;
        String str = "component" + (i + 1);
        try {
            method = cls.getDeclaredMethod(str, new Class[0]);
        } catch (NoSuchMethodException unused) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            C8632dsu.a(declaredMethods, "");
            int length = declaredMethods.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    method = null;
                    break;
                }
                Method method2 = declaredMethods[i3];
                String name = method2.getName();
                C8632dsu.a(name, "");
                i2 = C8691duz.i(name, str + '$', false, 2, null);
                if (i2) {
                    method = method2;
                    break;
                }
                i3++;
            }
        }
        if (method != null) {
            method.setAccessible(true);
            return method;
        }
        throw new IllegalStateException(("Unable to find function " + str + " in " + cls.getClass().getName()).toString());
    }

    private static final void a(Object obj) {
        List<Object> G;
        if (obj instanceof Collection) {
            G = C8576dqs.G((Iterable) obj);
            for (Object obj2 : G) {
                e(obj2);
            }
        } else if (obj instanceof Map) {
            ArrayList<Object> arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    arrayList.add(value);
                }
            }
            for (Object obj3 : arrayList) {
                e(obj3);
            }
        }
    }

    private static final void e(Object obj) {
        if ((obj instanceof Serializable) || (obj instanceof Parcelable)) {
            return;
        }
        throw new IllegalStateException(("Cannot parcel " + obj.getClass().getName()).toString());
    }

    private static final <T> Bundle d(Bundle bundle, String str, T t) {
        if (t instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) t);
        } else if (t instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) t);
        } else if (t == null) {
            bundle.putString(str, null);
        } else {
            throw new IllegalStateException(("Cannot persist " + str + ". It must be null, Serializable, or Parcelable.").toString());
        }
        return bundle;
    }

    public static /* synthetic */ InterfaceC8888fH a(Bundle bundle, InterfaceC8888fH interfaceC8888fH, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return d(bundle, interfaceC8888fH, z);
    }

    public static final <T extends InterfaceC8888fH> T d(Bundle bundle, T t, boolean z) {
        Integer[] j;
        C8632dsu.c((Object) bundle, "");
        C8632dsu.c((Object) t, "");
        Class<?> cls = t.getClass();
        Constructor<?> b = b(cls);
        if (b == null) {
            return t;
        }
        bundle.setClassLoader(cls.getClassLoader());
        Method[] declaredMethods = cls.getDeclaredMethods();
        C8632dsu.a(declaredMethods, "");
        for (Method method : declaredMethods) {
            if (C8632dsu.c((Object) method.getName(), (Object) "copy$default")) {
                int length = b.getParameterTypes().length;
                int[] iArr = new int[(int) Math.ceil(length / 32.0d)];
                Object[] objArr = new Object[length];
                objArr[0] = t;
                for (int i = 0; i < length; i++) {
                    String valueOf = String.valueOf(i);
                    if (bundle.containsKey(valueOf)) {
                        objArr[i] = bundle.get(valueOf);
                    } else {
                        if (z) {
                            Annotation[] annotationArr = b.getParameterAnnotations()[i];
                            C8632dsu.a(annotationArr, "");
                            for (Annotation annotation : annotationArr) {
                                if (annotation instanceof InterfaceC8969gj) {
                                    throw new IllegalStateException(("savedInstanceState bundle should have a key for state property at position " + i + " but it was missing.").toString());
                                }
                            }
                        }
                        int i2 = i / 32;
                        iArr[i2] = iArr[i2] | (1 << (i % 32));
                        Class<?> cls2 = method.getParameterTypes()[i + 1];
                        C8632dsu.a(cls2, "");
                        objArr[i] = a(cls2);
                    }
                }
                dsD dsd = new dsD(4);
                dsd.e(t);
                dsd.d(objArr);
                j = C8564dqg.j(iArr);
                dsd.d(j);
                dsd.e(null);
                Object invoke = method.invoke(null, dsd.b(new Object[dsd.c()]));
                C8632dsu.d(invoke);
                return (T) invoke;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final Object a(Class<?> cls) {
        if (C8632dsu.c(cls, Integer.TYPE)) {
            return 0;
        }
        if (C8632dsu.c(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (C8632dsu.c(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (C8632dsu.c(cls, Character.TYPE)) {
            return 'A';
        }
        if (C8632dsu.c(cls, Byte.TYPE)) {
            return Byte.MIN_VALUE;
        }
        if (C8632dsu.c(cls, Short.TYPE)) {
            return Short.MIN_VALUE;
        }
        if (C8632dsu.c(cls, Long.TYPE)) {
            return 0L;
        }
        if (C8632dsu.c(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        return null;
    }
}
