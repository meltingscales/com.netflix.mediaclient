package dagger.hilt.android.internal.managers;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.lifecycle.ActivityRetainedSavedState"})
/* loaded from: classes6.dex */
public final class SavedStateHandleModule_ProvideSavedStateHandleFactory implements Factory<SavedStateHandle> {
    private final Provider<SavedStateHandleHolder> savedStateHandleHolderProvider;

    public SavedStateHandleModule_ProvideSavedStateHandleFactory(Provider<SavedStateHandleHolder> provider) {
        this.savedStateHandleHolderProvider = provider;
    }

    @Override // javax.inject.Provider
    public SavedStateHandle get() {
        return provideSavedStateHandle(this.savedStateHandleHolderProvider.get());
    }

    public static SavedStateHandleModule_ProvideSavedStateHandleFactory create(Provider<SavedStateHandleHolder> provider) {
        return new SavedStateHandleModule_ProvideSavedStateHandleFactory(provider);
    }

    public static SavedStateHandle provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        return (SavedStateHandle) Preconditions.checkNotNullFromProvides(SavedStateHandleModule.provideSavedStateHandle(savedStateHandleHolder));
    }
}
