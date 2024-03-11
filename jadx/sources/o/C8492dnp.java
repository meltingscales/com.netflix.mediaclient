package o;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8485dni;
import o.InterfaceC8488dnl;

/* renamed from: o.dnp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8492dnp {
    private static final ProvidableCompositionLocal<InterfaceC8488dnl> a = CompositionLocalKt.staticCompositionLocalOf(new drO<InterfaceC8488dnl>() { // from class: com.slack.circuit.retained.RetainedStateRegistryKt$LocalRetainedStateRegistry$1
        @Override // o.drO
        /* renamed from: c */
        public final InterfaceC8488dnl invoke() {
            return C8485dni.c;
        }
    });

    public static final ProvidableCompositionLocal<InterfaceC8488dnl> d() {
        return a;
    }

    public static /* synthetic */ InterfaceC8488dnl b(Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = dqE.d();
        }
        return a(map);
    }

    public static final InterfaceC8488dnl a(Map<String, ? extends List<? extends Object>> map) {
        int e;
        Map k;
        List n;
        C8632dsu.c((Object) map, "");
        e = dqD.e(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            n = C8576dqs.n((Collection) entry.getValue());
            linkedHashMap.put(key, n);
        }
        k = dqE.k(linkedHashMap);
        return new C8493dnq(k);
    }
}
