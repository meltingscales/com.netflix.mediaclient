package o;

import com.netflix.model.leafs.advisory.Advisory;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cIL {
    public static final Map<Advisory, Boolean> b(Map<Advisory, Boolean> map, List<? extends Advisory> list) {
        Map k;
        Map<Advisory, Boolean> l;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) list, "");
        k = dqE.k(map);
        for (Advisory advisory : list) {
            if (!map.containsKey(advisory)) {
                k.put(advisory, Boolean.FALSE);
            }
        }
        l = dqE.l(k);
        return l;
    }
}
