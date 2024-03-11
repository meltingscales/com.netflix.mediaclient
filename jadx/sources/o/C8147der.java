package o;

import android.content.Context;
import java.util.Map;

/* renamed from: o.der  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8147der {
    public static final C8147der c = new C8147der();

    public static final void b(Context context, Map<String, String> map) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) map, "");
    }

    private C8147der() {
    }

    public static final void a(InterfaceC8195dfm<String, String> interfaceC8195dfm) {
        synchronized (C8147der.class) {
            C8632dsu.c((Object) interfaceC8195dfm, "");
            String d = C1842aQg.a.d();
            if (C8168dfL.g(d)) {
                C1044Mm.j("endPointUtils", "Unable to get Widevine L1 System ID");
            } else {
                C1044Mm.a("endPointUtils", "Widevine L1 System ID: %s", d);
                interfaceC8195dfm.put("sid", d);
            }
        }
    }
}
