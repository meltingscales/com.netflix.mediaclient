package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.aPj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1818aPj {
    public static final HashMap<Class<? extends aRM>, aRM> a = new HashMap<>();
    private static HashMap<String, aRM> d = new HashMap<>();
    private static c e;

    /* renamed from: o.aPj$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a(ABTestConfig aBTestConfig, aRM arm);
    }

    public static c d() {
        return e;
    }

    @SafeVarargs
    public static void c(Class<? extends aRM>... clsArr) {
        System.nanoTime();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Context d2 = AbstractApplicationC1040Mh.d();
        boolean f = C8151dev.f();
        boolean i = C8055ddE.i(d2);
        for (Class<? extends aRM> cls : clsArr) {
            try {
                aRM newInstance = cls.newInstance();
                d("prefKey", newInstance.t(), hashMap, cls);
                d("testId", newInstance.d(), hashMap2, cls);
                a.put(cls, newInstance);
                d.put(newInstance.d(), newInstance);
                if (i) {
                    newInstance.a(d2, f);
                }
            } catch (IllegalAccessException | InstantiationException e2) {
                throw new RuntimeException("Unable to instantiate " + cls.getName() + ", make sure it is has a default constructor", e2);
            }
        }
        System.nanoTime();
    }

    private static void d(String str, String str2, Map<String, String> map, Class<? extends aRM> cls) {
        if (map.containsKey(str2)) {
            throw new RuntimeException(String.format(Locale.ENGLISH, "Unable to register %s, same %s as %s", cls.getName(), str, map.get(str2)));
        }
        map.put(str2, cls.getName());
    }

    public static aRM d(String str) {
        return d.get(str);
    }

    public static Collection<aRM> e() {
        return a.values();
    }

    public static Collection<aRM> d(Context context) {
        ArrayList arrayList = new ArrayList();
        for (aRM arm : a.values()) {
            if (arm.L_() && arm.a(context)) {
                arrayList.add(arm);
            }
        }
        return arrayList;
    }

    public static void e(Context context, aOV aov) {
        if (aov == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("nfxpref", 0).edit();
        for (aRM arm : a.values()) {
            arm.c(edit, aov.a(), e);
        }
        edit.apply();
    }

    public static ABTestConfig.Cell e(Class<? extends aRM> cls) {
        return a(cls).c(AbstractApplicationC1040Mh.d());
    }

    public static <T extends aRM> T a(Class<T> cls) {
        T t = (T) a.get(cls);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("You forgot to add " + cls.getSimpleName() + " to registerAllAbTests() in ABTestUtils!!!");
    }

    public static void c(Context context) {
        for (aRM arm : a.values()) {
            arm.b(context);
        }
    }
}
