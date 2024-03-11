package o;

import java.util.Iterator;
import java.util.List;

/* renamed from: o.If  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0934If {
    public static final <T> AbstractC0935Ig<T> e(Iterator<? extends T> it) {
        C8632dsu.c((Object) it, "");
        if (!it.hasNext()) {
            return C0932Id.d;
        }
        return new C0938Ij(it.next(), e(it));
    }

    public static final <T> AbstractC0935Ig<T> b(List<? extends T> list) {
        C8632dsu.c((Object) list, "");
        return e(list.iterator());
    }
}
