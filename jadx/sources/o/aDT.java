package o;

import java.util.List;
import o.C2328aeF;

/* loaded from: classes3.dex */
public final class aDT {
    public static final C5239bux c(C2328aeF c2328aeF) {
        C2328aeF.d c;
        C2328aeF.d c2;
        List<C2328aeF.b> a;
        Integer b;
        boolean z = false;
        int intValue = (c2328aeF == null || (b = c2328aeF.b()) == null) ? 0 : b.intValue();
        int size = (c2328aeF == null || (a = c2328aeF.a()) == null) ? 0 : a.size();
        if (c2328aeF != null && (c2 = c2328aeF.c()) != null) {
            z = c2.c();
        }
        String a2 = (c2328aeF == null || (c = c2328aeF.c()) == null) ? null : c.a();
        if (a2 == null) {
            a2 = "";
        }
        return new C5239bux(intValue, size, z, a2);
    }
}
