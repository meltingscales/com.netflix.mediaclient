package o;

import com.airbnb.epoxy.NoOpControllerHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.al  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2702al {
    private static final Map<Class<?>, Constructor<?>> c = new LinkedHashMap();
    private static final NoOpControllerHelper b = new NoOpControllerHelper();

    C2702al() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2269ad c(AbstractC2914ap abstractC2914ap) {
        Constructor<?> d = d(abstractC2914ap.getClass());
        if (d == null) {
            return b;
        }
        try {
            return (AbstractC2269ad) d.newInstance(abstractC2914ap);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + d, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke " + d, e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to get Epoxy helper class.", cause);
        }
    }

    private static Constructor<?> d(Class<?> cls) {
        Constructor<?> d;
        Map<Class<?>, Constructor<?>> map = c;
        Constructor<?> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            d = Class.forName(name + "_EpoxyHelper").getConstructor(cls);
        } catch (ClassNotFoundException unused) {
            d = d(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find Epoxy Helper constructor for " + name, e);
        }
        c.put(cls, d);
        return d;
    }
}
