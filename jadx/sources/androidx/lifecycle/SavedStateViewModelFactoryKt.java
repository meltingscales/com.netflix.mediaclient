package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import o.C8563dqf;
import o.C8566dqi;
import o.C8569dql;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class SavedStateViewModelFactoryKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE;
    private static final List<Class<?>> VIEWMODEL_SIGNATURE;

    public static final <T extends ViewModel> T newInstance(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) constructor, "");
        C8632dsu.c((Object) objArr, "");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }

    static {
        List<Class<?>> j;
        List<Class<?>> e;
        j = C8569dql.j(Application.class, SavedStateHandle.class);
        ANDROID_VIEWMODEL_SIGNATURE = j;
        e = C8566dqi.e(SavedStateHandle.class);
        VIEWMODEL_SIGNATURE = e;
    }

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> cls, List<? extends Class<?>> list) {
        List D;
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) list, "");
        Constructor<?>[] constructors = cls.getConstructors();
        C8632dsu.a(constructors, "");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            C8632dsu.a(parameterTypes, "");
            D = C8563dqf.D(parameterTypes);
            if (C8632dsu.c(list, D)) {
                C8632dsu.d(constructor2);
                return constructor2;
            } else if (list.size() == D.size() && D.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
