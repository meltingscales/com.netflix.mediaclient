package o;

import java.util.Collection;

/* renamed from: o.def  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8135def {
    public static final C8135def e = new C8135def();

    private C8135def() {
    }

    public final boolean e(Collection<String> collection, String str, boolean z) {
        boolean a;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) str, "");
        Collection<String> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (String str2 : collection2) {
                a = C8691duz.a(str2, str, z);
                if (a) {
                    return true;
                }
            }
        }
        return false;
    }
}
