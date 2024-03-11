package o;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.dsP;

/* loaded from: classes.dex */
public class dsH {
    private static <T extends Throwable> T a(T t) {
        return (T) C8632dsu.a((Throwable) t, dsH.class.getName());
    }

    public static void a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        c(name + " cannot be cast to " + str);
    }

    public static void c(String str) {
        throw e(new ClassCastException(str));
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) a(classCastException));
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof dsK) && !(obj instanceof dsM)) {
            a(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw e(e);
        }
    }

    public static Collection b(Object obj) {
        if ((obj instanceof dsK) && !(obj instanceof dsL)) {
            a(obj, "kotlin.collections.MutableCollection");
        }
        return e(obj);
    }

    public static Collection e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw e(e);
        }
    }

    public static List a(Object obj) {
        if ((obj instanceof dsK) && !(obj instanceof dsI)) {
            a(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw e(e);
        }
    }

    public static boolean m(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof dsK) || (obj instanceof dsQ));
    }

    public static boolean f(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof dsK) || (obj instanceof dsP));
    }

    public static Map d(Object obj) {
        if ((obj instanceof dsK) && !(obj instanceof dsP)) {
            a(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw e(e);
        }
    }

    public static boolean k(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof dsK) || (obj instanceof dsP.b));
    }

    public static int j(Object obj) {
        if (obj instanceof InterfaceC8633dsv) {
            return ((InterfaceC8633dsv) obj).getArity();
        }
        if (obj instanceof drO) {
            return 0;
        }
        if (obj instanceof drM) {
            return 1;
        }
        if (obj instanceof drX) {
            return 2;
        }
        if (obj instanceof InterfaceC8612dsa) {
            return 3;
        }
        if (obj instanceof InterfaceC8613dsb) {
            return 4;
        }
        if (obj instanceof InterfaceC8615dsd) {
            return 5;
        }
        if (obj instanceof InterfaceC8619dsh) {
            return 6;
        }
        if (obj instanceof InterfaceC8620dsi) {
            return 7;
        }
        if (obj instanceof InterfaceC8618dsg) {
            return 8;
        }
        if (obj instanceof InterfaceC8617dsf) {
            return 9;
        }
        if (obj instanceof drK) {
            return 10;
        }
        if (obj instanceof drL) {
            return 11;
        }
        if (obj instanceof drT) {
            return 12;
        }
        if (obj instanceof drP) {
            return 13;
        }
        if (obj instanceof drQ) {
            return 14;
        }
        if (obj instanceof drR) {
            return 15;
        }
        if (obj instanceof drS) {
            return 16;
        }
        if (obj instanceof drW) {
            return 17;
        }
        if (obj instanceof drV) {
            return 18;
        }
        if (obj instanceof drY) {
            return 19;
        }
        if (obj instanceof drU) {
            return 20;
        }
        if (obj instanceof InterfaceC8614dsc) {
            return 21;
        }
        return obj instanceof drZ ? 22 : -1;
    }

    public static boolean c(Object obj, int i) {
        return (obj instanceof InterfaceC8555dpy) && j(obj) == i;
    }

    public static Object a(Object obj, int i) {
        if (obj != null && !c(obj, i)) {
            a(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }
}
