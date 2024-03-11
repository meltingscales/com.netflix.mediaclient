package com.netflix.mediaclient.ui.miniplayer.api;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@OriginatingElement(topLevelClass = MiniPlayerVideoGroupViewModel.class)
/* loaded from: classes4.dex */
public final class MiniPlayerVideoGroupViewModel_HiltModules {

    @Module
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes6.dex */
    public static abstract class BindsModule {
        @Binds
        @StringKey("com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel")
        @HiltViewModelMap
        @IntoMap
        public abstract ViewModel a(MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel);
    }

    @Module
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes4.dex */
    public static final class KeyModule {
        @Provides
        @HiltViewModelMap.KeySet
        @IntoSet
        public static String e() {
            return "com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel";
        }
    }
}
