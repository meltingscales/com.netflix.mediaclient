package o;

import java.lang.reflect.Constructor;
import java.util.NoSuchElementException;

/* renamed from: o.ge  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8964ge {
    public static final <VM extends AbstractC8899fS<?>> Class<? extends InterfaceC8906fZ<VM, ?>> a(Class<VM> cls) {
        Class<? extends InterfaceC8906fZ<VM, ?>> cls2;
        C8632dsu.c((Object) cls, "");
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
            if (InterfaceC8906fZ.class.isAssignableFrom(cls2)) {
                break;
            }
            i++;
        }
        if (cls2 != null) {
            return cls2;
        }
        return null;
    }

    public static final Object e(Class<?> cls) {
        C8632dsu.c((Object) cls, "");
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        C8632dsu.a(declaredConstructors, "");
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterTypes().length == 1) {
                Object newInstance = constructor.newInstance(null);
                C8632dsu.a(newInstance, "");
                return newInstance;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
