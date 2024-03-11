package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C8566dqi;
import o.C8632dsu;
import o.C8691duz;

/* loaded from: classes2.dex */
public final class Lifecycling {
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object obj) {
        C8632dsu.c(obj, "");
        boolean z = obj instanceof LifecycleEventObserver;
        boolean z2 = obj instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (LifecycleEventObserver) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, null);
        }
        if (z) {
            return (LifecycleEventObserver) obj;
        }
        Class<?> cls = obj.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) == 2) {
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
            C8632dsu.d(list);
            List<Constructor<? extends GeneratedAdapter>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), obj));
            }
            int size = list2.size();
            GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
            for (int i = 0; i < size; i++) {
                generatedAdapterArr[i] = INSTANCE.createGeneratedAdapter(list2.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            GeneratedAdapter newInstance = constructor.newInstance(obj);
            C8632dsu.a(newInstance, "");
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            C8632dsu.a(name, "");
            if (name.length() != 0) {
                C8632dsu.a(canonicalName, "");
                canonicalName = canonicalName.substring(name.length() + 1);
                C8632dsu.a(canonicalName, "");
            }
            C8632dsu.a(canonicalName, "");
            String adapterName = getAdapterName(canonicalName);
            if (name.length() != 0) {
                adapterName = name + '.' + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            C8632dsu.d(cls2);
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private final int getObserverConstructorType(Class<?> cls) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int resolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(resolveObserverCallbackType));
        return resolveObserverCallbackType;
    }

    private final int resolveObserverCallbackType(Class<?> cls) {
        ArrayList arrayList;
        List<Constructor<? extends GeneratedAdapter>> e;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> generatedConstructor = generatedConstructor(cls);
        if (generatedConstructor != null) {
            Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> map = classToAdapters;
            e = C8566dqi.e(generatedConstructor);
            map.put(cls, e);
            return 2;
        } else if (ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (isLifecycleParent(superclass)) {
                C8632dsu.a(superclass, "");
                if (getObserverConstructorType(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
                C8632dsu.d(list);
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            C8632dsu.a(interfaces, "");
            for (Class<?> cls2 : interfaces) {
                if (isLifecycleParent(cls2)) {
                    C8632dsu.a(cls2, "");
                    if (getObserverConstructorType(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(cls2);
                    C8632dsu.d(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList != null) {
                classToAdapters.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    public static final String getAdapterName(String str) {
        String b;
        C8632dsu.c((Object) str, "");
        StringBuilder sb = new StringBuilder();
        b = C8691duz.b(str, ".", "_", false, 4, (Object) null);
        sb.append(b);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
}
