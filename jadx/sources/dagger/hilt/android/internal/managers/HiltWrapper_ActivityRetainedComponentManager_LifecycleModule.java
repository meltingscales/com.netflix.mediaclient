package dagger.hilt.android.internal.managers;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;
import dagger.hilt.codegen.OriginatingElement;

@OriginatingElement(topLevelClass = ActivityRetainedComponentManager.class)
@Module(includes = {ActivityRetainedComponentManager.LifecycleModule.class})
@InstallIn({ActivityRetainedComponent.class})
/* loaded from: classes6.dex */
public final class HiltWrapper_ActivityRetainedComponentManager_LifecycleModule {
}
