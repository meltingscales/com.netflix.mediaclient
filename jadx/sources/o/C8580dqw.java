package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dqw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8580dqw extends C8579dqv {
    public static <R> List<R> b(Iterable<?> iterable, Class<R> cls) {
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) cls, "");
        return (List) a(iterable, new ArrayList(), cls);
    }

    public static final <C extends Collection<? super R>, R> C a(Iterable<?> iterable, C c, Class<R> cls) {
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) c, "");
        C8632dsu.c((Object) cls, "");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    public static <T> void u(List<T> list) {
        C8632dsu.c((Object) list, "");
        Collections.reverse(list);
    }

    public static <T> SortedSet<T> a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) comparator, "");
        return (SortedSet) C8576dqs.e((Iterable) iterable, new TreeSet(comparator));
    }
}
