package o;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
public final class dDT {
    public static final <T> dBT<T> a(InterfaceC8660dtv<T> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        return d((InterfaceC8660dtv) interfaceC8660dtv, (dBT<Object>[]) new dBT[0]);
    }

    public static final <T, E extends T> E[] a(ArrayList<E> arrayList, InterfaceC8660dtv<T> interfaceC8660dtv) {
        C8632dsu.c((Object) arrayList, "");
        C8632dsu.c((Object) interfaceC8660dtv, "");
        Object newInstance = Array.newInstance(drI.e(interfaceC8660dtv), arrayList.size());
        C8632dsu.d(newInstance);
        E[] eArr = (E[]) arrayList.toArray((Object[]) newInstance);
        C8632dsu.a(eArr, "");
        return eArr;
    }

    public static final Void e(InterfaceC8660dtv<?> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        dDR.c(interfaceC8660dtv);
        throw new KotlinNothingValueException();
    }

    public static final <T> dBT<T> d(InterfaceC8660dtv<T> interfaceC8660dtv, dBT<Object>... dbtArr) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) dbtArr, "");
        return e(drI.e(interfaceC8660dtv), (dBT[]) Arrays.copyOf(dbtArr, dbtArr.length));
    }

    public static final <T> dBT<T> e(Class<T> cls, dBT<Object>... dbtArr) {
        dBT<T> b;
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) dbtArr, "");
        if (cls.isEnum() && c(cls)) {
            return d(cls);
        }
        if (!cls.isInterface() || (b = b(cls)) == null) {
            dBT<T> a = a((Class<?>) cls, (dBT<Object>[]) Arrays.copyOf(dbtArr, dbtArr.length));
            if (a != null) {
                return a;
            }
            dBT<T> e = e(cls);
            if (e != null) {
                return e;
            }
            dBT<T> c = c(cls, (dBT[]) Arrays.copyOf(dbtArr, dbtArr.length));
            if (c != null) {
                return c;
            }
            if (g(cls)) {
                return new dBU(drI.b(cls));
            }
            return null;
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r2 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> o.dBT<T> c(java.lang.Class<T> r7, o.dBT<java.lang.Object>... r8) {
        /*
            java.lang.Object r0 = a(r7)
            if (r0 == 0) goto L14
            int r1 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r1)
            o.dBT[] r8 = (o.dBT[]) r8
            o.dBT r8 = d(r0, r8)
            if (r8 == 0) goto L14
            return r8
        L14:
            r8 = 0
            java.lang.Class[] r7 = r7.getDeclaredClasses()     // Catch: java.lang.NoSuchFieldException -> L57
            java.lang.String r0 = ""
            o.C8632dsu.a(r7, r0)     // Catch: java.lang.NoSuchFieldException -> L57
            int r0 = r7.length     // Catch: java.lang.NoSuchFieldException -> L57
            r1 = 0
            r3 = r8
            r2 = r1
        L22:
            if (r1 >= r0) goto L3a
            r4 = r7[r1]     // Catch: java.lang.NoSuchFieldException -> L57
            java.lang.String r5 = r4.getSimpleName()     // Catch: java.lang.NoSuchFieldException -> L57
            java.lang.String r6 = "$serializer"
            boolean r5 = o.C8632dsu.c(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L57
            if (r5 == 0) goto L37
            if (r2 == 0) goto L35
            goto L3c
        L35:
            r2 = 1
            r3 = r4
        L37:
            int r1 = r1 + 1
            goto L22
        L3a:
            if (r2 != 0) goto L3d
        L3c:
            r3 = r8
        L3d:
            r7 = r3
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.NoSuchFieldException -> L57
            if (r3 == 0) goto L4f
            java.lang.String r7 = "INSTANCE"
            java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.NoSuchFieldException -> L57
            if (r7 == 0) goto L4f
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.NoSuchFieldException -> L57
            goto L50
        L4f:
            r7 = r8
        L50:
            boolean r0 = r7 instanceof o.dBT     // Catch: java.lang.NoSuchFieldException -> L57
            if (r0 == 0) goto L57
            o.dBT r7 = (o.dBT) r7     // Catch: java.lang.NoSuchFieldException -> L57
            r8 = r7
        L57:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dDT.c(java.lang.Class, o.dBT[]):o.dBT");
    }

    private static final <T> Object a(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        C8632dsu.a(declaredClasses, "");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            if (cls2.getAnnotation(dDH.class) != null) {
                break;
            }
            i++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        C8632dsu.a(simpleName, "");
        return e((Class<?>) cls, simpleName);
    }

    private static final <T> boolean c(Class<T> cls) {
        return cls.getAnnotation(InterfaceC7700dCc.class) == null && cls.getAnnotation(dBV.class) == null;
    }

    private static final <T> boolean g(Class<T> cls) {
        if (cls.getAnnotation(dBV.class) != null) {
            return true;
        }
        InterfaceC7700dCc interfaceC7700dCc = (InterfaceC7700dCc) cls.getAnnotation(InterfaceC7700dCc.class);
        return interfaceC7700dCc != null && C8632dsu.c(dsA.a(interfaceC7700dCc.e()), dsA.a(dBU.class));
    }

    private static final <T> dBT<T> b(Class<T> cls) {
        InterfaceC7700dCc interfaceC7700dCc = (InterfaceC7700dCc) cls.getAnnotation(InterfaceC7700dCc.class);
        if (interfaceC7700dCc == null || C8632dsu.c(dsA.a(interfaceC7700dCc.e()), dsA.a(dBU.class))) {
            return new dBU(drI.b(cls));
        }
        return null;
    }

    private static final <T> dBT<T> a(Class<?> cls, dBT<Object>... dbtArr) {
        Object e = e(cls, "Companion");
        if (e == null) {
            return null;
        }
        return d(e, (dBT[]) Arrays.copyOf(dbtArr, dbtArr.length));
    }

    private static final <T> dBT<T> d(Object obj, dBT<Object>... dbtArr) {
        Class[] clsArr;
        try {
            if (dbtArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = dbtArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = dBT.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(dbtArr, dbtArr.length));
            if (invoke instanceof dBT) {
                return (dBT) invoke;
            }
        } catch (NoSuchMethodException unused) {
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
        return null;
    }

    private static final Object e(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final <T> dBT<T> d(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        C8632dsu.a(canonicalName, "");
        C8632dsu.d(enumConstants);
        return new C7731dDg(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r6 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r6 == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> o.dBT<T> e(java.lang.Class<T> r12) {
        /*
            java.lang.reflect.Field[] r0 = r12.getDeclaredFields()
            java.lang.String r1 = ""
            o.C8632dsu.a(r0, r1)
            int r2 = r0.length
            r3 = 0
            r4 = 0
            r7 = r3
            r5 = r4
            r6 = r5
        Lf:
            r8 = 1
            if (r5 >= r2) goto L3c
            r9 = r0[r5]
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "INSTANCE"
            boolean r10 = o.C8632dsu.c(r10, r11)
            if (r10 == 0) goto L39
            java.lang.Class r10 = r9.getType()
            boolean r10 = o.C8632dsu.c(r10, r12)
            if (r10 == 0) goto L39
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 == 0) goto L39
            if (r6 == 0) goto L37
            goto L3e
        L37:
            r6 = r8
            r7 = r9
        L39:
            int r5 = r5 + 1
            goto Lf
        L3c:
            if (r6 != 0) goto L3f
        L3e:
            r7 = r3
        L3f:
            r0 = r7
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r7 != 0) goto L45
            return r3
        L45:
            java.lang.Object r0 = r7.get(r3)
            java.lang.reflect.Method[] r12 = r12.getMethods()
            o.C8632dsu.a(r12, r1)
            int r2 = r12.length
            r7 = r3
            r5 = r4
            r6 = r5
        L54:
            if (r5 >= r2) goto L82
            r9 = r12[r5]
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "serializer"
            boolean r10 = o.C8632dsu.c(r10, r11)
            if (r10 == 0) goto L7f
            java.lang.Class[] r10 = r9.getParameterTypes()
            o.C8632dsu.a(r10, r1)
            int r10 = r10.length
            if (r10 != 0) goto L7f
            java.lang.Class r10 = r9.getReturnType()
            java.lang.Class<o.dBT> r11 = o.dBT.class
            boolean r10 = o.C8632dsu.c(r10, r11)
            if (r10 == 0) goto L7f
            if (r6 == 0) goto L7d
            goto L84
        L7d:
            r6 = r8
            r7 = r9
        L7f:
            int r5 = r5 + 1
            goto L54
        L82:
            if (r6 != 0) goto L85
        L84:
            r7 = r3
        L85:
            r12 = r7
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r7 != 0) goto L8b
            return r3
        L8b:
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Object r12 = r7.invoke(r0, r12)
            boolean r0 = r12 instanceof o.dBT
            if (r0 == 0) goto L98
            r3 = r12
            o.dBT r3 = (o.dBT) r3
        L98:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dDT.e(java.lang.Class):o.dBT");
    }

    public static final boolean d(InterfaceC8660dtv<Object> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        return drI.e(interfaceC8660dtv).isArray();
    }
}
