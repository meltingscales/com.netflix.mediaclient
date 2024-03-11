package o;

import com.netflix.cl.model.ABTest;
import com.netflix.cl.model.ABTestAllocations;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class aRP {
    private static HashMap<String, aRQ> a = new HashMap<>();
    private static final Object b = new Object();
    private static HashMap<String, Integer> c = new HashMap<>();
    private static final Object e = new Object();

    public static HashMap<String, Integer> a() {
        return c;
    }

    @SafeVarargs
    public static void e(Class<? extends aRQ>... clsArr) {
        System.nanoTime();
        HashMap hashMap = new HashMap();
        for (Class<? extends aRQ> cls : clsArr) {
            try {
                aRQ newInstance = cls.newInstance();
                c("name", newInstance.e(), hashMap, cls);
                a.put(newInstance.e(), newInstance);
            } catch (IllegalAccessException | InstantiationException unused) {
                throw new RuntimeException("Unable to instantiate " + cls.getName() + ", make sure it is has a default constructor");
            }
        }
    }

    public static List<ABTest> b() {
        ArrayList arrayList = new ArrayList();
        synchronized (e) {
            for (Map.Entry<String, Integer> entry : c.entrySet()) {
                arrayList.add(new ABTest(entry.getKey(), entry.getValue().intValue()));
            }
        }
        return arrayList;
    }

    private static void c(String str, String str2, Map<String, String> map, Class<? extends aRQ> cls) {
        if (map.containsKey(str2)) {
            throw new RuntimeException(String.format(Locale.ENGLISH, "Unable to register %s, same %s as %s", cls.getName(), str, map.get(str2)));
        }
        map.put(str2, cls.getName());
    }

    public static <T extends aRQ> T d(String str) {
        T t;
        synchronized (b) {
            t = (T) a.get(str);
        }
        if (t != null) {
            return t;
        }
        throw new NullPointerException("You forgot to add " + str + " in NmAbTestUtils.registerAllNmAbTests()!!!");
    }

    public static void a(int i, int i2) {
        aRQ arq;
        Set<String> keySet = a.keySet();
        String valueOf = String.valueOf(i);
        if (keySet.contains(valueOf) && (arq = a.get(valueOf)) != null) {
            try {
                aRQ arq2 = (aRQ) arq.getClass().newInstance();
                arq2.e(ABTestConfig.Cell.fromInt(i2));
                synchronized (b) {
                    a.put(valueOf, arq2);
                }
            } catch (Exception e2) {
                C1044Mm.e("nf_config_nmAb_persistent", "error populating nonMember AB configs", e2);
            }
        }
        synchronized (e) {
            c.put(valueOf, Integer.valueOf(i2));
        }
    }

    public static ABTestAllocations d() {
        return new ABTestAllocations((ABTest[]) b().toArray(new ABTest[0]));
    }

    public static void c() {
        for (Map.Entry<String, aRQ> entry : a.entrySet()) {
            aRQ value = entry.getValue();
            if (value != null) {
                try {
                    aRQ arq = (aRQ) value.getClass().newInstance();
                    arq.e(ABTestConfig.Cell.fromInt(1));
                    synchronized (b) {
                        a.put(entry.getKey(), arq);
                    }
                } catch (Exception e2) {
                    C1044Mm.e("nf_config_nmAb_persistent", "error resetting nonMember AB configs", e2);
                }
            }
        }
        synchronized (e) {
            c.clear();
        }
    }
}
