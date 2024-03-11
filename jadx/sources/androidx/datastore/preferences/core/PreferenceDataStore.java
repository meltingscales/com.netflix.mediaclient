package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.drX;
import o.dyS;

/* loaded from: classes2.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    @Override // androidx.datastore.core.DataStore
    public dyS<Preferences> getData() {
        return this.delegate.getData();
    }

    public PreferenceDataStore(DataStore<Preferences> dataStore) {
        C8632dsu.c((Object) dataStore, "");
        this.delegate = dataStore;
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(drX<? super Preferences, ? super InterfaceC8585dra<? super Preferences>, ? extends Object> drx, InterfaceC8585dra<? super Preferences> interfaceC8585dra) {
        return this.delegate.updateData(new PreferenceDataStore$updateData$2(drx, null), interfaceC8585dra);
    }
}
