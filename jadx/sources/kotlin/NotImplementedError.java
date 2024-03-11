package kotlin;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class NotImplementedError extends Error {
    public NotImplementedError() {
        this(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String str) {
        super(str);
        C8632dsu.c((Object) str, "");
    }

    public /* synthetic */ NotImplementedError(String str, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
