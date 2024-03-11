package o;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.mj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9287mj {
    public static final List<Throwable> b(Throwable th) {
        List<Throwable> U;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th != null && linkedHashSet.add(th)) {
            th = th.getCause();
        }
        U = C8576dqs.U(linkedHashSet);
        return U;
    }
}
