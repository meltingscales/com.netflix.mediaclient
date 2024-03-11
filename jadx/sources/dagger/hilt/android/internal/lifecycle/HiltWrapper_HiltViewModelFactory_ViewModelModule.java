package dagger.hilt.android.internal.lifecycle;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.codegen.OriginatingElement;

@OriginatingElement(topLevelClass = HiltViewModelFactory.class)
@Module(includes = {HiltViewModelFactory.ViewModelModule.class})
@InstallIn({ViewModelComponent.class})
/* loaded from: classes6.dex */
public final class HiltWrapper_HiltViewModelFactory_ViewModelModule {
}
