package androidx.datastore.core;

import java.io.IOException;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class CorruptionException extends IOException {
    public /* synthetic */ CorruptionException(String str, Throwable th, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(String str, Throwable th) {
        super(str, th);
        C8632dsu.c((Object) str, "");
    }
}
