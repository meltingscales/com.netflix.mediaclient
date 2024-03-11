package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dqM extends dqN {
    public static <T> Set<T> e(Set<? extends T> set, T t) {
        int e;
        C8632dsu.c((Object) set, "");
        e = dqD.e(set.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(e);
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && C8632dsu.c(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> d(Set<? extends T> set, Iterable<? extends T> iterable) {
        Collection<?> z;
        Set<T> W;
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) iterable, "");
        z = C8571dqn.z(iterable);
        if (z.isEmpty()) {
            W = C8576dqs.W(set);
            return W;
        } else if (!(z instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(z);
            return linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (T t : set) {
                if (!z.contains(t)) {
                    linkedHashSet2.add(t);
                }
            }
            return linkedHashSet2;
        }
    }

    public static <T> Set<T> a(Set<? extends T> set, T t) {
        int e;
        C8632dsu.c((Object) set, "");
        e = dqD.e(set.size() + 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet(e);
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    public static <T> Set<T> c(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        int e;
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) iterable, "");
        Integer u = C8572dqo.u(iterable);
        if (u != null) {
            size = set.size() + u.intValue();
        } else {
            size = set.size() * 2;
        }
        e = dqD.e(size);
        LinkedHashSet linkedHashSet = new LinkedHashSet(e);
        linkedHashSet.addAll(set);
        C8571dqn.b(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
