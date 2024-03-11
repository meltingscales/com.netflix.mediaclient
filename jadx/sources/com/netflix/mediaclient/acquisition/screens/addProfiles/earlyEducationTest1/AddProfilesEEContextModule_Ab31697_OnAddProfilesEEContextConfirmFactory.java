package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import android.app.Activity;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AddProfilesEEContextModule_Ab31697_OnAddProfilesEEContextConfirmFactory implements Factory<AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener> {
    private final Provider<Activity> activityProvider;
    private final AddProfilesEEContextModule_Ab31697 module;

    public AddProfilesEEContextModule_Ab31697_OnAddProfilesEEContextConfirmFactory(AddProfilesEEContextModule_Ab31697 addProfilesEEContextModule_Ab31697, Provider<Activity> provider) {
        this.module = addProfilesEEContextModule_Ab31697;
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener get() {
        return onAddProfilesEEContextConfirm(this.module, this.activityProvider.get());
    }

    public static AddProfilesEEContextModule_Ab31697_OnAddProfilesEEContextConfirmFactory create(AddProfilesEEContextModule_Ab31697 addProfilesEEContextModule_Ab31697, Provider<Activity> provider) {
        return new AddProfilesEEContextModule_Ab31697_OnAddProfilesEEContextConfirmFactory(addProfilesEEContextModule_Ab31697, provider);
    }

    public static AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener onAddProfilesEEContextConfirm(AddProfilesEEContextModule_Ab31697 addProfilesEEContextModule_Ab31697, Activity activity) {
        return (AddProfilesEEContextFragment_Ab31697.AddProfilesEEContextClickListener) Preconditions.checkNotNullFromProvides(addProfilesEEContextModule_Ab31697.onAddProfilesEEContextConfirm(activity));
    }
}
