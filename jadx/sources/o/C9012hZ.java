package o;

import java.util.List;
import java.util.Map;

/* renamed from: o.hZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9012hZ {
    public static final void c(InterfaceC9069id interfaceC9069id, Object obj) {
        C8632dsu.c((Object) interfaceC9069id, "");
        if (obj == null) {
            interfaceC9069id.j();
        } else if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                if (obj instanceof Boolean) {
                    interfaceC9069id.d(((Boolean) obj).booleanValue());
                    return;
                } else if (obj instanceof Integer) {
                    interfaceC9069id.e(((Number) obj).intValue());
                    return;
                } else if (obj instanceof Long) {
                    interfaceC9069id.d(((Number) obj).longValue());
                    return;
                } else if (obj instanceof Double) {
                    interfaceC9069id.a(((Number) obj).doubleValue());
                    return;
                } else if (obj instanceof C9071if) {
                    interfaceC9069id.a((C9071if) obj);
                    return;
                } else if (!(obj instanceof String)) {
                    throw new IllegalStateException(("Cannot write " + obj + " of class '" + dsA.a(obj.getClass()) + "' to Json").toString());
                } else {
                    interfaceC9069id.d((String) obj);
                    return;
                }
            }
            interfaceC9069id.c();
            for (Object obj2 : (Iterable) obj) {
                c(interfaceC9069id, obj2);
            }
            interfaceC9069id.a();
        } else {
            interfaceC9069id.e();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                interfaceC9069id.e(String.valueOf(key));
                c(interfaceC9069id, value);
            }
            interfaceC9069id.d();
        }
    }
}
