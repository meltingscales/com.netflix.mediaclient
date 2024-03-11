package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class AddProfilesEEContextViewModelInitializer_Ab31697 extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public AddProfilesEEContextViewModelInitializer_Ab31697(StringProvider stringProvider, SignupErrorReporter signupErrorReporter) {
        super(signupErrorReporter);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        this.stringProvider = stringProvider;
    }

    public final AddProfilesEEContextViewModel_Ab31697 createAddProfilesEEContextViewModel_Ab31697() {
        return new AddProfilesEEContextViewModel_Ab31697(this.stringProvider);
    }
}
