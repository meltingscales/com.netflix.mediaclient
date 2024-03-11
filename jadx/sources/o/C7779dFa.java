package o;

import kotlin.Result;

/* renamed from: o.dFa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7779dFa {
    private static final int c;

    static {
        Object e;
        Integer n;
        try {
            Result.c cVar = Result.e;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            C8632dsu.a(property, "");
            n = C8689dux.n(property);
            e = Result.e(n);
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        if (Result.a(e)) {
            e = null;
        }
        Integer num = (Integer) e;
        c = num != null ? num.intValue() : 2097152;
    }
}
