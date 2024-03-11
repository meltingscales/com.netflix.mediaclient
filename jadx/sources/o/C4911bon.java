package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.bon  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4911bon {
    private final Map<String, String> e = Collections.synchronizedMap(new LinkedHashMap());

    public final void c(String str, String str2) {
        if (str != null) {
            Map<String, String> map = this.e;
            C8632dsu.a(map, "");
            map.put(str, str2);
        }
    }

    public final String e(String str) {
        C8632dsu.c((Object) str, "");
        return this.e.get(str);
    }
}
