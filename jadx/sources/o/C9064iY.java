package o;

import java.util.List;
import java.util.Map;

/* renamed from: o.iY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9064iY {
    public static final C9064iY c = new C9064iY();

    private C9064iY() {
    }

    public static final int d(C9053iN c9053iN) {
        C8632dsu.c((Object) c9053iN, "");
        int length = dIP.a(c9053iN.e()).length + 16;
        for (Map.Entry<String, Object> entry : c9053iN.d().entrySet()) {
            length += dIP.a(entry.getKey()).length + c.c(entry.getValue());
        }
        return length;
    }

    private final int c(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                return dIP.a((String) obj).length;
            }
            int i = 16;
            if (obj instanceof Boolean) {
                return 16;
            }
            if (!(obj instanceof Integer)) {
                if ((obj instanceof Long) || (obj instanceof Double)) {
                    return 8;
                }
                int i2 = 0;
                if (obj instanceof List) {
                    for (Object obj2 : (Iterable) obj) {
                        i2 += c.c(obj2);
                    }
                } else if (obj instanceof C9043iD) {
                    return dIP.a(((C9043iD) obj).c()).length + 16;
                } else {
                    if (!(obj instanceof Map)) {
                        throw new IllegalStateException(("Unknown field type in Record: '" + obj + '\'').toString());
                    }
                    Map map = (Map) obj;
                    int i3 = 0;
                    for (Object obj3 : map.keySet()) {
                        i3 += c.c(obj3);
                    }
                    i = 16 + i3;
                    for (Object obj4 : map.values()) {
                        i2 += c.c(obj4);
                    }
                }
                return i + i2;
            }
        }
        return 4;
    }
}
