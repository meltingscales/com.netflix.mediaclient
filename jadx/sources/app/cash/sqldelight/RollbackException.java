package app.cash.sqldelight;

import o.C8627dsp;

/* loaded from: classes2.dex */
final class RollbackException extends Throwable {
    private final Object a;

    public RollbackException() {
        this(null, 1, null);
    }

    public final Object a() {
        return this.a;
    }

    public RollbackException(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ RollbackException(Object obj, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : obj);
    }
}
