package dagger.hilt.android.internal.lifecycle;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.codegen.OriginatingElement;

@OriginatingElement(topLevelClass = DefaultViewModelFactories.class)
@Module(includes = {DefaultViewModelFactories.ActivityModule.class})
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public final class HiltWrapper_DefaultViewModelFactories_ActivityModule {
}
