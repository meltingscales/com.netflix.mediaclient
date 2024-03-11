package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class GV {
    public static final String d(AbstractC0935Ig<? extends GW> abstractC0935Ig) {
        C8632dsu.c((Object) abstractC0935Ig, "");
        StringBuilder sb = new StringBuilder();
        while (abstractC0935Ig.b()) {
            sb.append(abstractC0935Ig.d().b());
            abstractC0935Ig = abstractC0935Ig.g();
            if (abstractC0935Ig.b()) {
                sb.append('.');
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public static final AbstractC0935Ig<GW> d(String str) {
        List b;
        C8632dsu.c((Object) str, "");
        b = duD.b((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (true ^ b.isEmpty()) {
            return d(b);
        }
        return null;
    }

    public static final AbstractC0935Ig<GW> c(String... strArr) {
        List p;
        C8632dsu.c((Object) strArr, "");
        p = C8564dqg.p(strArr);
        return d(p);
    }

    public static final AbstractC0935Ig<GW> d(List<String> list) {
        int d;
        C8632dsu.c((Object) list, "");
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (String str : list) {
            arrayList.add(new GS(str));
        }
        return C0934If.b(arrayList);
    }
}
