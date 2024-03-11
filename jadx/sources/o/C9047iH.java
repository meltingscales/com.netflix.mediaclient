package o;

import com.apollographql.apollo3.exception.CacheMissException;
import java.util.Map;
import o.InterfaceC9034hv;

/* renamed from: o.iH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9047iH implements InterfaceC9046iG {
    public static final C9047iH e = new C9047iH();

    private C9047iH() {
    }

    @Override // o.InterfaceC9046iG
    public Object d(C9018hf c9018hf, InterfaceC9034hv.c cVar, Map<String, Object> map, String str) {
        C8632dsu.c((Object) c9018hf, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) str, "");
        String a = c9018hf.a(cVar);
        if (!map.containsKey(a)) {
            throw new CacheMissException(str, a);
        }
        return map.get(a);
    }
}
