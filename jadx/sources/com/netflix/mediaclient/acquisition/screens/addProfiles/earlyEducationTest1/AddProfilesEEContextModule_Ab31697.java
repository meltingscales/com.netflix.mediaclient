package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C8632dsu;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes3.dex */
public final class AddProfilesEEContextModule_Ab31697 {
    public static final int $stable = 0;

    @Provides
    public final AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener onAddProfilesEEContextConfirm(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return (AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener) activity;
    }
}
