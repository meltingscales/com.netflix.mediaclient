package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.dns  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8495dns {
    public static final int c = 8;
    private final Map<InterfaceC8660dtv<?>, Object> b = new LinkedHashMap();
    private final C8495dns d;

    public C8495dns(C8495dns c8495dns) {
        this.d = c8495dns;
    }

    public final <S, T extends S> void a(InterfaceC8660dtv<S> interfaceC8660dtv, T t) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        if (t == null) {
            this.b.remove(interfaceC8660dtv);
        } else {
            this.b.put(interfaceC8660dtv, t);
        }
    }
}
