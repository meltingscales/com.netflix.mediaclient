package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C9028hp;
import o.InterfaceC9034hv;

/* renamed from: o.hx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9036hx {
    public static final <D extends InterfaceC9034hv.d> Set<String> e(InterfaceC9034hv<D> interfaceC9034hv, C9028hp c9028hp) {
        C8632dsu.c((Object) interfaceC9034hv, "");
        C8632dsu.c((Object) c9028hp, "");
        Map<String, Object> b = c(interfaceC9034hv, c9028hp, true).b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : b.entrySet()) {
            if (C8632dsu.c(entry.getValue(), Boolean.FALSE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public static final <D extends InterfaceC9034hv.d> InterfaceC9034hv.c c(InterfaceC9034hv<D> interfaceC9034hv, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9034hv, "");
        C8632dsu.c((Object) c9028hp, "");
        C9073ih c9073ih = new C9073ih();
        c9073ih.e();
        interfaceC9034hv.d(c9073ih, c9028hp, z);
        c9073ih.d();
        Object f = c9073ih.f();
        C8632dsu.d(f);
        return new InterfaceC9034hv.c((Map) f);
    }

    public static final <D extends InterfaceC9034hv.d> D d(InterfaceC9034hv<D> interfaceC9034hv, JsonReader jsonReader, C9028hp c9028hp, Set<String> set, Set<C9031hs> set2, List<C9035hw> list) {
        C8632dsu.c((Object) interfaceC9034hv, "");
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        C9028hp.d b = c9028hp.d().a(set).b(set2);
        if (interfaceC9034hv.c()) {
            list = C8569dql.i();
        }
        return (D) C8953gT.d(interfaceC9034hv.e()).b(jsonReader, b.d(list).e());
    }
}
