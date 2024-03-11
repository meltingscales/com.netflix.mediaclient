package o;

import kotlin.Result;

/* renamed from: o.dpz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8556dpz {
    public static final Object a(Throwable th) {
        C8632dsu.c((Object) th, "");
        return new Result.Failure(th);
    }

    public static final void d(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).d;
        }
    }
}
