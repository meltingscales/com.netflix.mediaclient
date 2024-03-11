package o;

import java.util.Map;

/* renamed from: o.dFn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7792dFn {
    private final Map<InterfaceC7707dCj, Map<c<Object>, Object>> e = C7796dFr.d(16);

    /* renamed from: o.dFn$c */
    /* loaded from: classes5.dex */
    public static final class c<T> {
    }

    public final <T> T c(InterfaceC7707dCj interfaceC7707dCj, c<T> cVar, drO<? extends T> dro) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) dro, "");
        T t = (T) a(interfaceC7707dCj, cVar);
        if (t != null) {
            return t;
        }
        T invoke = dro.invoke();
        d(interfaceC7707dCj, cVar, invoke);
        return invoke;
    }

    public final <T> T a(InterfaceC7707dCj interfaceC7707dCj, c<T> cVar) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) cVar, "");
        Map<c<Object>, Object> map = this.e.get(interfaceC7707dCj);
        Object obj = map != null ? map.get(cVar) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final <T> void d(InterfaceC7707dCj interfaceC7707dCj, c<T> cVar, T t) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) t, "");
        Map<InterfaceC7707dCj, Map<c<Object>, Object>> map = this.e;
        Map<c<Object>, Object> map2 = map.get(interfaceC7707dCj);
        if (map2 == null) {
            map2 = C7796dFr.d(2);
            map.put(interfaceC7707dCj, map2);
        }
        map2.put(cVar, t);
    }
}
