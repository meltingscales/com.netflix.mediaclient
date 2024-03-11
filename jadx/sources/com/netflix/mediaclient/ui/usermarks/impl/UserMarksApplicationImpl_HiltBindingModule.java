package com.netflix.mediaclient.ui.usermarks.impl;

import com.netflix.mediaclient.startup.ApplicationStartupListener;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import o.C8032dci;

@OriginatingElement(topLevelClass = C8032dci.class)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface UserMarksApplicationImpl_HiltBindingModule {
    @Binds
    @IntoSet
    ApplicationStartupListener c(C8032dci c8032dci);
}
