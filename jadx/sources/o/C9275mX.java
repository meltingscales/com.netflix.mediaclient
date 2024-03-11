package o;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.mX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C9275mX {
    private final Set<String> d = new HashSet();
    private final ClassLoader[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9275mX(Collection<ClassLoader> collection) {
        this.e = (ClassLoader[]) collection.toArray(new ClassLoader[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls, C9277mZ<?> c9277mZ) {
        ClassLoader[] classLoaderArr;
        Class<?> loadClass;
        synchronized (this) {
            String name = cls.getName();
            if (this.d.add(name)) {
                String[] b = b(name);
                for (ClassLoader classLoader : this.e) {
                    for (String str : b) {
                        try {
                            loadClass = classLoader.loadClass(str);
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                        if (InterfaceC9331na.class.isAssignableFrom(loadClass)) {
                            ((InterfaceC9331na) loadClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).c(c9277mZ);
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
    }

    private String[] b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return new String[]{String.format("_%s_DslJsonConverter", str)};
        }
        String substring = str.substring(0, lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        return new String[]{String.format("%s._%s_DslJsonConverter", substring, substring2), String.format("dsl_json.%s._%s_DslJsonConverter", substring, substring2), String.format("dsl_json.%s.%sDslJsonConverter", substring, substring2)};
    }
}
