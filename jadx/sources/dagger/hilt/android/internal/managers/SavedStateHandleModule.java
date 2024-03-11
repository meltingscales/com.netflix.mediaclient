package dagger.hilt.android.internal.managers;

import androidx.lifecycle.SavedStateHandle;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.lifecycle.ActivityRetainedSavedState;
import dagger.hilt.android.scopes.ActivityRetainedScoped;

@Module
@InstallIn({ActivityRetainedComponent.class})
/* loaded from: classes6.dex */
abstract class SavedStateHandleModule {
    SavedStateHandleModule() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @ActivityRetainedScoped
    @ActivityRetainedSavedState
    public static SavedStateHandle provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        return savedStateHandleHolder.getSavedStateHandle();
    }
}
