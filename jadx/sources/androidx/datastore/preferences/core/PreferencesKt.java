package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes2.dex */
public final class PreferencesKt {
    public static final Object edit(DataStore<Preferences> dataStore, drX<? super MutablePreferences, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super Preferences> interfaceC8585dra) {
        return dataStore.updateData(new PreferencesKt$edit$2(drx, null), interfaceC8585dra);
    }
}
