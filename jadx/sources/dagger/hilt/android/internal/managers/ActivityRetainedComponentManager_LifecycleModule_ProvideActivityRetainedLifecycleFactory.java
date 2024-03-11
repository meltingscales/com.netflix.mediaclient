package dagger.hilt.android.internal.managers;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory implements Factory<ActivityRetainedLifecycle> {
    @Override // javax.inject.Provider
    public ActivityRetainedLifecycle get() {
        return provideActivityRetainedLifecycle();
    }

    public static ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
        return (ActivityRetainedLifecycle) Preconditions.checkNotNullFromProvides(ActivityRetainedComponentManager.LifecycleModule.provideActivityRetainedLifecycle());
    }

    /* loaded from: classes6.dex */
    static final class InstanceHolder {
        private static final ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory INSTANCE = new ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory();

        private InstanceHolder() {
        }
    }
}
