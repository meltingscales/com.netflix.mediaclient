package com.netflix.mediaclient.ui.experience;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Named;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes4.dex */
public final class BrowseExperienceModule {
    @Provides
    @Named("browseExperienceIsKids")
    public final boolean c() {
        return BrowseExperience.a();
    }
}
