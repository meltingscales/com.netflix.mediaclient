package o;

import java.util.Collection;
import java.util.List;
import o.FE;

/* renamed from: o.Ft  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0870Ft {
    public static final boolean e(FE fe) {
        C8632dsu.c((Object) fe, "");
        if (!(fe instanceof FE.m)) {
            return fe instanceof FE.d;
        }
        List<FE> a = ((FE.m) fe).a();
        if (!(a instanceof Collection) || !a.isEmpty()) {
            for (FE fe2 : a) {
                if (e(fe2)) {
                }
            }
        }
    }
}
