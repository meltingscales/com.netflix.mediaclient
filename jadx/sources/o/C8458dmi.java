package o;

import java.util.List;

/* renamed from: o.dmi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8458dmi {
    public static final C8458dmi a = new C8458dmi();

    private C8458dmi() {
    }

    public static final String d(String str) {
        boolean i;
        List d;
        C8632dsu.c((Object) str, "");
        i = C8691duz.i(str, "uuid:", false, 2, null);
        if (i) {
            str = str.substring(5);
            C8632dsu.a(str, "");
        }
        d = duD.d((CharSequence) str, new String[]{"::"}, false, 0, 6, (Object) null);
        return d.isEmpty() ^ true ? (String) d.get(0) : "";
    }
}
