package androidx.navigation.compose;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class BackStackEntryIdViewModel extends ViewModel {
    private final String IdKey;
    private final UUID id;
    public WeakReference<SaveableStateHolder> saveableStateHolderRef;

    public final UUID getId() {
        return this.id;
    }

    public final void setSaveableStateHolderRef(WeakReference<SaveableStateHolder> weakReference) {
        C8632dsu.c((Object) weakReference, "");
        this.saveableStateHolderRef = weakReference;
    }

    public BackStackEntryIdViewModel(SavedStateHandle savedStateHandle) {
        C8632dsu.c((Object) savedStateHandle, "");
        this.IdKey = "SaveableStateHolder_BackStackEntryKey";
        UUID uuid = (UUID) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", uuid);
            C8632dsu.a(uuid, "");
        }
        this.id = uuid;
    }

    public final WeakReference<SaveableStateHolder> getSaveableStateHolderRef() {
        WeakReference<SaveableStateHolder> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        SaveableStateHolder saveableStateHolder = getSaveableStateHolderRef().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.id);
        }
        getSaveableStateHolderRef().clear();
    }
}
