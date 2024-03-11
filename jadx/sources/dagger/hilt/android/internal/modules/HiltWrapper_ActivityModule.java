package dagger.hilt.android.internal.modules;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;

@OriginatingElement(topLevelClass = ActivityModule.class)
@Module(includes = {ActivityModule.class})
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public final class HiltWrapper_ActivityModule {
}
