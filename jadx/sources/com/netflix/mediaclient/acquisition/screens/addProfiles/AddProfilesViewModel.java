package com.netflix.mediaclient.acquisition.screens.addProfiles;

import androidx.lifecycle.MutableLiveData;
import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.cl.model.ProfileSettings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckboxViewModel;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModel;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.screens.AbstractNetworkViewModel2;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import java.util.ArrayList;
import java.util.List;
import o.C8168dfL;
import o.C8569dql;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class AddProfilesViewModel extends AbstractNetworkViewModel2 {
    public static final int $stable = 8;
    private final String headingText;
    private final MutableLiveData<Boolean> loadingSubmitProfiles;
    private final String ownerProfileHint;
    private final ProfileEntryEditTextCheckboxViewModel ownerProfileViewModel;
    private final AddProfilesParsedData parsedData;
    private final String profileHint;
    private final StepsViewModel stepsViewModel;
    private String subheadingString;
    private final ProfileEntryEditTextCheckboxViewModel userProfile1ViewModel;
    private final ProfileEntryEditTextCheckboxViewModel userProfile2ViewModel;
    private final ProfileEntryEditTextCheckboxViewModel userProfile3ViewModel;
    private final ProfileEntryEditTextCheckboxViewModel userProfile4ViewModel;

    public final String getHeadingText() {
        return this.headingText;
    }

    public final MutableLiveData<Boolean> getLoadingSubmitProfiles() {
        return this.loadingSubmitProfiles;
    }

    public final String getOwnerProfileHint() {
        return this.ownerProfileHint;
    }

    public final ProfileEntryEditTextCheckboxViewModel getOwnerProfileViewModel() {
        return this.ownerProfileViewModel;
    }

    public final String getProfileHint() {
        return this.profileHint;
    }

    public final StepsViewModel getStepsViewModel() {
        return this.stepsViewModel;
    }

    public final String getSubheadingString() {
        return this.subheadingString;
    }

    public final ProfileEntryEditTextCheckboxViewModel getUserProfile1ViewModel() {
        return this.userProfile1ViewModel;
    }

    public final ProfileEntryEditTextCheckboxViewModel getUserProfile2ViewModel() {
        return this.userProfile2ViewModel;
    }

    public final ProfileEntryEditTextCheckboxViewModel getUserProfile3ViewModel() {
        return this.userProfile3ViewModel;
    }

    public final ProfileEntryEditTextCheckboxViewModel getUserProfile4ViewModel() {
        return this.userProfile4ViewModel;
    }

    public final void setSubheadingString(String str) {
        C8632dsu.c((Object) str, "");
        this.subheadingString = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddProfilesViewModel(StringProvider stringProvider, AddProfilesParsedData addProfilesParsedData, AddProfilesLifecycleData addProfilesLifecycleData, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel2, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel3, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel4, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel5, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel) {
        super(signupNetworkManager, stringProvider, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) addProfilesParsedData, "");
        C8632dsu.c((Object) addProfilesLifecycleData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        this.parsedData = addProfilesParsedData;
        this.ownerProfileViewModel = profileEntryEditTextCheckboxViewModel;
        this.userProfile1ViewModel = profileEntryEditTextCheckboxViewModel2;
        this.userProfile2ViewModel = profileEntryEditTextCheckboxViewModel3;
        this.userProfile3ViewModel = profileEntryEditTextCheckboxViewModel4;
        this.userProfile4ViewModel = profileEntryEditTextCheckboxViewModel5;
        this.ownerProfileHint = stringProvider.getString(R.string.label_profile_owner);
        this.profileHint = stringProvider.getString(R.string.label_profile_name);
        this.stepsViewModel = addProfilesParsedData.getStepsViewModel();
        this.headingText = stringProvider.getString(addProfilesParsedData.isKidsProfilesMode() ? R.string.add_profiles_kids_header : R.string.add_profile_header);
        this.subheadingString = stringProvider.getString(addProfilesParsedData.isKidsProfilesMode() ? R.string.add_profiles_kids_subheader : R.string.add_profile_subheader_tweak);
        this.loadingSubmitProfiles = addProfilesLifecycleData.getSubmitProfiles();
    }

    public final void submitProfiles(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        performAction(this.parsedData.getNextAction(), this.loadingSubmitProfiles, networkRequestResponseListener);
    }

    public final List<ProfileSettings> getProfileSettings() {
        List<ProfileEntryEditTextCheckboxViewModel> j;
        ArrayList arrayList = new ArrayList();
        j = C8569dql.j(this.ownerProfileViewModel, this.userProfile1ViewModel, this.userProfile2ViewModel, this.userProfile3ViewModel, this.userProfile4ViewModel);
        for (ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel : j) {
            if (profileEntryEditTextCheckboxViewModel != null && profileEntryEditTextCheckboxViewModel.getProfileNameValue() != null) {
                String profileNameValue = profileEntryEditTextCheckboxViewModel.getProfileNameValue();
                BooleanField isKidsProfile = profileEntryEditTextCheckboxViewModel.isKidsProfile();
                arrayList.add(new ProfileSettings(null, profileNameValue, null, null, null, null, null, Boolean.valueOf(isKidsProfile != null ? C8632dsu.c(isKidsProfile.getValue(), Boolean.TRUE) : false)));
            }
        }
        return arrayList;
    }

    public boolean isFormValid() {
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel;
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel2;
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel3;
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel4;
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel5 = this.ownerProfileViewModel;
        boolean h = C8168dfL.h(profileEntryEditTextCheckboxViewModel5 != null ? profileEntryEditTextCheckboxViewModel5.getProfileNameValue() : null);
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel6 = this.ownerProfileViewModel;
        return h && !((profileEntryEditTextCheckboxViewModel6 != null && profileEntryEditTextCheckboxViewModel6.isDuplicate()) || (((profileEntryEditTextCheckboxViewModel = this.userProfile1ViewModel) != null && profileEntryEditTextCheckboxViewModel.isDuplicate()) || (((profileEntryEditTextCheckboxViewModel2 = this.userProfile2ViewModel) != null && profileEntryEditTextCheckboxViewModel2.isDuplicate()) || (((profileEntryEditTextCheckboxViewModel3 = this.userProfile3ViewModel) != null && profileEntryEditTextCheckboxViewModel3.isDuplicate()) || ((profileEntryEditTextCheckboxViewModel4 = this.userProfile4ViewModel) != null && profileEntryEditTextCheckboxViewModel4.isDuplicate())))));
    }
}
