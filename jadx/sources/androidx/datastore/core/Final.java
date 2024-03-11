package androidx.datastore.core;

import o.C8632dsu;

/* loaded from: classes2.dex */
final class Final<T> extends State<T> {
    private final Throwable finalException;

    public final Throwable getFinalException() {
        return this.finalException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(Throwable th) {
        super(null);
        C8632dsu.c((Object) th, "");
        this.finalException = th;
    }
}
