package o;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes5.dex */
public final class dAK {
    private static final String a;
    private static final String b;
    private static final StackTraceElement c = new C5507c().b();

    public static final <E extends Throwable> E e(E e) {
        return e;
    }

    static {
        Object e;
        Object e2;
        try {
            Result.c cVar = Result.e;
            e = Result.e(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        if (Result.d(e) != null) {
            e = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) e;
        try {
            Result.c cVar3 = Result.e;
            e2 = Result.e(dAK.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.c cVar4 = Result.e;
            e2 = Result.e(C8556dpz.a(th2));
        }
        if (Result.d(e2) != null) {
            e2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        b = (String) e2;
    }
}
