package o;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dagger.hilt.EntryPoints;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.aPn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1822aPn {
    private static final HashMap<String, aRW> a = new HashMap<>();
    private static final Object e = new Object();

    @SafeVarargs
    public static void d(Class<? extends aRW>... clsArr) {
        System.nanoTime();
        HashMap hashMap = new HashMap();
        synchronized (e) {
            for (Class<? extends aRW> cls : clsArr) {
                try {
                    aRW newInstance = cls.newInstance();
                    a(newInstance.getName(), hashMap, cls);
                    a.put(newInstance.getName(), newInstance);
                } catch (IllegalAccessException | InstantiationException unused) {
                    throw new RuntimeException("Unable to instantiate " + cls.getName() + ", make sure it is has a default constructor");
                }
            }
        }
    }

    private static void a(String str, Map<String, String> map, Class<? extends aRW> cls) {
        if (map.containsKey(str)) {
            throw new RuntimeException(String.format(Locale.ENGLISH, "Unable to register %s, same as %s", cls.getName(), map.get(str)));
        }
        map.put(str, cls.getName());
    }

    public static <T extends aRW> T b(String str) {
        T t;
        synchronized (e) {
            t = (T) a.get(str);
        }
        if (t != null) {
            return t;
        }
        throw new NullPointerException("You forgot to add " + str + " to sConfigs in FastPropertyConfigUtils!!!");
    }

    public static void c(String str) {
        if (C8168dfL.g(str)) {
            return;
        }
        JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
        RuntimeException runtimeException = null;
        for (String str2 : a.keySet()) {
            if (asJsonObject.has(str2)) {
                HashMap<String, aRW> hashMap = a;
                try {
                    aRW arw = (aRW) C8118deO.e(asJsonObject, str2, (Class<Object>) hashMap.get(str2).getClass());
                    if (arw != null) {
                        synchronized (e) {
                            hashMap.put(str2, arw);
                        }
                    }
                } catch (RuntimeException e2) {
                    if (runtimeException == null) {
                        runtimeException = e2;
                    } else {
                        runtimeException.addSuppressed(e2);
                    }
                }
            }
        }
        try {
            ((InterfaceC1549aFk) EntryPoints.get(AbstractApplicationC1040Mh.d(), InterfaceC1549aFk.class)).X().e((dEP) AbstractC7773dEv.a.e(str));
        } catch (RuntimeException e3) {
            if (runtimeException == null) {
                runtimeException = e3;
            } else {
                runtimeException.addSuppressed(e3);
            }
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
