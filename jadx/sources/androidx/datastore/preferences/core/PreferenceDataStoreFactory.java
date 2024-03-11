package androidx.datastore.preferences.core;

import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import o.C8569dql;
import o.C8632dsu;
import o.C8752dxf;
import o.drA;
import o.drO;
import o.dwU;
import o.dwY;
import o.dxZ;

/* loaded from: classes2.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, dwU dwu, drO dro, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = C8569dql.i();
        }
        if ((i & 4) != 0) {
            C8752dxf c8752dxf = C8752dxf.b;
            dwu = dwY.c(C8752dxf.a().plus(dxZ.d(null, 1, null)));
        }
        return preferenceDataStoreFactory.create(replaceFileCorruptionHandler, list, dwu, dro);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, dwU dwu, final drO<? extends File> dro) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dro, "");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(PreferencesSerializer.INSTANCE, replaceFileCorruptionHandler, list, dwu, new drO<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final File invoke() {
                String b;
                File invoke = dro.invoke();
                b = drA.b(invoke);
                PreferencesSerializer preferencesSerializer = PreferencesSerializer.INSTANCE;
                if (C8632dsu.c((Object) b, (Object) preferencesSerializer.getFileExtension())) {
                    return invoke;
                }
                throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + preferencesSerializer.getFileExtension()).toString());
            }
        }));
    }
}
