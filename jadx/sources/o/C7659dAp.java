package o;

import kotlin.Result;

/* renamed from: o.dAp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7659dAp {
    private static final boolean e = false;

    public static final boolean a() {
        return e;
    }

    static {
        Object e2;
        try {
            Result.c cVar = Result.e;
            e2 = Result.e(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e2 = Result.e(C8556dpz.a(th));
        }
        Result.h(e2);
    }
}
