package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import o.C8566dqi;
import o.C8632dsu;
import o.drO;
import o.dwU;

/* loaded from: classes2.dex */
public final class DataStoreFactory {
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, dwU dwu, drO<? extends File> dro) {
        List e;
        C8632dsu.c((Object) serializer, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dro, "");
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        e = C8566dqi.e(DataMigrationInitializer.Companion.getInitializer(list));
        return new SingleProcessDataStore(dro, serializer, e, replaceFileCorruptionHandler2, dwu);
    }
}
