package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dqo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8572dqo extends C8569dql {
    public static final <T> Integer u(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static <T> int d(Iterable<? extends T> iterable, int i) {
        C8632dsu.c((Object) iterable, "");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static <T> List<T> A(Iterable<? extends Iterable<? extends T>> iterable) {
        C8632dsu.c((Object) iterable, "");
        ArrayList arrayList = new ArrayList();
        for (Iterable<? extends T> iterable2 : iterable) {
            C8570dqm.c((Collection) arrayList, (Iterable) iterable2);
        }
        return arrayList;
    }
}
