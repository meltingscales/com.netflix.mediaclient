package o;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.dnz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC8502dnz<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T e();

    AbstractC8502dnz() {
    }

    public static <T> AbstractC8502dnz<T> e(final Class<?> cls) {
        try {
            final Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new AbstractC8502dnz<T>() { // from class: o.dnz.4
                @Override // o.AbstractC8502dnz
                public T e() {
                    return (T) declaredConstructor.newInstance(null);
                }

                public String toString() {
                    return cls.getName();
                }
            };
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                final Object obj = declaredField.get(null);
                final Method method = cls2.getMethod("allocateInstance", Class.class);
                return new AbstractC8502dnz<T>() { // from class: o.dnz.1
                    @Override // o.AbstractC8502dnz
                    public T e() {
                        return (T) method.invoke(obj, cls);
                    }

                    public String toString() {
                        return cls.getName();
                    }
                };
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                try {
                    try {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                        final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new AbstractC8502dnz<T>() { // from class: o.dnz.2
                            @Override // o.AbstractC8502dnz
                            public T e() {
                                return (T) declaredMethod2.invoke(null, cls, Integer.valueOf(intValue));
                            }

                            public String toString() {
                                return cls.getName();
                            }
                        };
                    } catch (IllegalAccessException unused3) {
                        throw new AssertionError();
                    } catch (NoSuchMethodException unused4) {
                        final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                        declaredMethod3.setAccessible(true);
                        return new AbstractC8502dnz<T>() { // from class: o.dnz.3
                            @Override // o.AbstractC8502dnz
                            public T e() {
                                return (T) declaredMethod3.invoke(null, cls, Object.class);
                            }

                            public String toString() {
                                return cls.getName();
                            }
                        };
                    } catch (InvocationTargetException e) {
                        throw dnT.c(e);
                    }
                } catch (Exception unused5) {
                    throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                }
            } catch (IllegalAccessException unused6) {
                throw new AssertionError();
            }
        }
    }
}
