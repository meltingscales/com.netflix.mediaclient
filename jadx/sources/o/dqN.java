package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dqN extends dqP {
    public static <T> Set<T> e() {
        return EmptySet.c;
    }

    public static <T> Set<T> d(T... tArr) {
        Set<T> e;
        Set<T> G;
        C8632dsu.c((Object) tArr, "");
        if (tArr.length > 0) {
            G = C8563dqf.G(tArr);
            return G;
        }
        e = e();
        return e;
    }

    public static <T> Set<T> b(T... tArr) {
        int e;
        Collection d;
        C8632dsu.c((Object) tArr, "");
        e = dqD.e(tArr.length);
        d = C8563dqf.d(tArr, new LinkedHashSet(e));
        return (Set) d;
    }

    public static <T> Set<T> b(T t) {
        Set<T> e;
        Set<T> a;
        if (t != null) {
            a = dqP.a(t);
            return a;
        }
        e = e();
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> d(Set<? extends T> set) {
        Set<T> e;
        Set<T> a;
        C8632dsu.c((Object) set, "");
        int size = set.size();
        if (size == 0) {
            e = e();
            return e;
        } else if (size != 1) {
            return set;
        } else {
            a = dqP.a(set.iterator().next());
            return a;
        }
    }
}
