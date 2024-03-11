package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C9043iD;
import okio.ByteString;

/* renamed from: o.iS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9058iS {
    public static final C9058iS e = new C9058iS();

    private C9058iS() {
    }

    public final String c(C9053iN c9053iN) {
        C8632dsu.c((Object) c9053iN, "");
        return b(c9053iN.d());
    }

    private final String b(Map<String, ? extends Object> map) {
        InterfaceC9069id interfaceC9069id;
        C7872dIo c7872dIo = new C7872dIo();
        Throwable th = null;
        C9072ig c9072ig = new C9072ig(c7872dIo, null, 2, null);
        try {
            c9072ig.e();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                e.a(c9072ig.e(entry.getKey()), entry.getValue());
            }
            interfaceC9069id = c9072ig.d();
            try {
                c9072ig.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                c9072ig.close();
            } catch (Throwable th4) {
                C8553dpw.c(th3, th4);
            }
            th = th3;
            interfaceC9069id = null;
        }
        if (th != null) {
            throw th;
        }
        C8632dsu.d(interfaceC9069id);
        return c7872dIo.v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.LinkedHashMap, java.util.Map] */
    private final Object a(Object obj) {
        ?? arrayList;
        int d;
        int e2;
        if (obj instanceof String) {
            C9043iD.a aVar = C9043iD.a;
            String str = (String) obj;
            return aVar.c(str) ? aVar.b(str) : obj;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return obj;
            }
            Iterable<Object> iterable = (Iterable) obj;
            d = C8572dqo.d(iterable, 10);
            arrayList = new ArrayList(d);
            for (Object obj2 : iterable) {
                arrayList.add(e.a(obj2));
            }
        } else {
            Map map = (Map) obj;
            e2 = dqD.e(map.size());
            arrayList = new LinkedHashMap(e2);
            for (Map.Entry entry : map.entrySet()) {
                arrayList.put(entry.getKey(), e.a(entry.getValue()));
            }
        }
        return arrayList;
    }

    public final C9053iN e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Object a = a(C9011hY.b(new C9068ic(new C7872dIo().b(ByteString.c.e(str2)))));
        Map map = a instanceof Map ? (Map) a : null;
        if (map == null) {
            throw new IllegalStateException(("error deserializing: " + str2).toString());
        }
        return new C9053iN(str, map, null, 4, null);
    }

    private final void a(InterfaceC9069id interfaceC9069id, Object obj) {
        if (obj == null) {
            interfaceC9069id.j();
        } else if (obj instanceof String) {
            interfaceC9069id.d((String) obj);
        } else if (obj instanceof Boolean) {
            interfaceC9069id.d(((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            interfaceC9069id.e(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            interfaceC9069id.d(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            interfaceC9069id.a(((Number) obj).doubleValue());
        } else if (obj instanceof C9043iD) {
            interfaceC9069id.d(((C9043iD) obj).a());
        } else if (obj instanceof List) {
            interfaceC9069id.c();
            for (Object obj2 : (Iterable) obj) {
                e.a(interfaceC9069id, obj2);
            }
            interfaceC9069id.a();
        } else if (!(obj instanceof Map)) {
            throw new IllegalStateException(("Unsupported record value type: '" + obj + '\'').toString());
        } else {
            interfaceC9069id.e();
            C8632dsu.d(obj);
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(interfaceC9069id.e((String) entry.getKey()), entry.getValue());
            }
            interfaceC9069id.d();
        }
    }
}
