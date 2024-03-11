package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.dft  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8202dft {
    public static final <T extends InterfaceC5154btR> List<T> e(List<? extends T> list) {
        C8632dsu.c((Object) list, "");
        return e(list, 0, 2, null);
    }

    public static /* synthetic */ List e(List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return c(list, i);
    }

    public static final <T extends InterfaceC5154btR> List<T> c(List<? extends T> list, int i) {
        List<T> j;
        C8632dsu.c((Object) list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        C8575dqr.c(arrayList, C8199dfq.b.d());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((InterfaceC5154btR) obj).read()) {
                arrayList2.add(obj);
            }
        }
        j = C8576dqs.j((Iterable) arrayList2, i);
        return j;
    }

    public static final <T extends InterfaceC5154btR> int a(List<? extends T> list) {
        C8632dsu.c((Object) list, "");
        return c(list, Integer.MAX_VALUE).size();
    }
}
