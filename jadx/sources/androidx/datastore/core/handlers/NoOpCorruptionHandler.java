package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import o.InterfaceC8585dra;

/* loaded from: classes2.dex */
public final class NoOpCorruptionHandler<T> implements CorruptionHandler<T> {
    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, InterfaceC8585dra<? super T> interfaceC8585dra) {
        throw corruptionException;
    }
}
