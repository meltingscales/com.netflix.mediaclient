package o;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.iW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9062iW {
    public static final boolean c(C9018hf c9018hf, Map<String, ? extends Object> map) {
        C8632dsu.c((Object) c9018hf, "");
        C8632dsu.c((Object) map, "");
        return d(c9018hf.c(), map);
    }

    public static final boolean d(C9017he c9017he, Map<String, ? extends Object> map) {
        C8632dsu.c((Object) c9017he, "");
        C8632dsu.c((Object) map, "");
        return d(c9017he.d(), map);
    }

    private static final boolean d(List<C9020hh> list, Map<String, ? extends Object> map) {
        boolean booleanValue;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                return false;
            }
            C9020hh c9020hh = (C9020hh) it.next();
            Object obj = map.get(c9020hh.e());
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            booleanValue = bool != null ? bool.booleanValue() : false;
            if (c9020hh.c()) {
                booleanValue = !booleanValue;
                continue;
            }
        } while (booleanValue);
        return true;
    }
}
