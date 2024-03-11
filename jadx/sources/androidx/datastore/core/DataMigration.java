package androidx.datastore.core;

import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes2.dex */
public interface DataMigration<T> {
    Object cleanUp(InterfaceC8585dra<? super dpR> interfaceC8585dra);

    Object migrate(T t, InterfaceC8585dra<? super T> interfaceC8585dra);

    Object shouldMigrate(T t, InterfaceC8585dra<? super Boolean> interfaceC8585dra);
}
