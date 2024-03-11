package o;

import java.util.LinkedHashMap;

/* renamed from: o.aFy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1563aFy {
    private final aFW b;

    public final aFW c() {
        return this.b;
    }

    public C1563aFy(aFW afw) {
        C8632dsu.c((Object) afw, "");
        this.b = afw;
    }

    public final dEI e(String str) {
        C8632dsu.c((Object) str, "");
        return (dEI) this.b.e().get(str);
    }

    public final C1563aFy c(String... strArr) {
        C8632dsu.c((Object) strArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : strArr) {
            dEI dei = (dEI) this.b.e().get(str);
            if (dei != null) {
                linkedHashMap.put(str, dei);
            }
        }
        return new C1563aFy(aFW.c(this.b, null, null, new dEP(linkedHashMap), null, 11, null));
    }
}
