package dagger.hilt.android.flags;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@OriginatingElement(topLevelClass = FragmentGetContextFix.class)
@Module(includes = {FragmentGetContextFix.FragmentGetContextFixModule.class})
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public final class HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule {
}
