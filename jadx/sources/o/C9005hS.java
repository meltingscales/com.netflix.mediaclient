package o;

import java.util.Iterator;
import java.util.List;

/* renamed from: o.hS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9005hS {
    public static final String c(List<C9006hT> list, String str) {
        Object obj;
        boolean a;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a = C8691duz.a(((C9006hT) obj).b(), str, true);
            if (a) {
                break;
            }
        }
        C9006hT c9006hT = (C9006hT) obj;
        if (c9006hT != null) {
            return c9006hT.a();
        }
        return null;
    }
}
