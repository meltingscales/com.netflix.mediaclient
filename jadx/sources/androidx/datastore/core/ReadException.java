package androidx.datastore.core;

import o.C8632dsu;

/* loaded from: classes2.dex */
final class ReadException<T> extends State<T> {
    private final Throwable readException;

    public final Throwable getReadException() {
        return this.readException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable th) {
        super(null);
        C8632dsu.c((Object) th, "");
        this.readException = th;
    }
}
