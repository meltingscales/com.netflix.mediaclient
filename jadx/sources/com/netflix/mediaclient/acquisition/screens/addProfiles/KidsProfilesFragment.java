package com.netflix.mediaclient.acquisition.screens.addProfiles;

import com.netflix.cl.model.AppView;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class KidsProfilesFragment extends Hilt_KidsProfilesFragment {
    public static final int $stable = 0;
    private final AppView appView = AppView.updateProfilesKids;

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }
}
