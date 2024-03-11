package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import o.InterfaceC8585dra;
import o.drM;

/* loaded from: classes2.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    private final drM<CorruptionException, T> produceNewData;

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return this.produceNewData.invoke(corruptionException);
    }
}
