package com.netflix.mediaclient.acquisition.screens.addProfiles;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckboxViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEViewModel_Ab31697;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class AddProfilesViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final ErrorMessageViewModelInitializer errorMessageViewModelInitializer;
    private final FlowMode flowMode;
    private final ProfileEntryEditTextCheckboxViewModelInitializer profileEntryEditTextCheckboxViewModelInitializer;
    private final SignupNetworkManager signupNetworkManager;
    private final StepsViewModelInitializer stepsViewModelInitializer;
    private final StringProvider stringProvider;
    private final ViewModelProvider.Factory viewModelProviderFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public AddProfilesViewModelInitializer(FlowMode flowMode, SignupErrorReporter signupErrorReporter, SignupNetworkManager signupNetworkManager, StringProvider stringProvider, ViewModelProvider.Factory factory, StepsViewModelInitializer stepsViewModelInitializer, ErrorMessageViewModelInitializer errorMessageViewModelInitializer, ProfileEntryEditTextCheckboxViewModelInitializer profileEntryEditTextCheckboxViewModelInitializer) {
        super(signupErrorReporter);
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) stepsViewModelInitializer, "");
        C8632dsu.c((Object) errorMessageViewModelInitializer, "");
        C8632dsu.c((Object) profileEntryEditTextCheckboxViewModelInitializer, "");
        this.flowMode = flowMode;
        this.signupNetworkManager = signupNetworkManager;
        this.stringProvider = stringProvider;
        this.viewModelProviderFactory = factory;
        this.stepsViewModelInitializer = stepsViewModelInitializer;
        this.errorMessageViewModelInitializer = errorMessageViewModelInitializer;
        this.profileEntryEditTextCheckboxViewModelInitializer = profileEntryEditTextCheckboxViewModelInitializer;
    }

    public final AddProfilesParsedData extractAddProfilesParsedData() {
        ActionField actionField;
        FlowMode flowMode = this.flowMode;
        if (C8632dsu.c((Object) (flowMode != null ? flowMode.getMode() : null), (Object) SignupConstants.Mode.KIDS_PROFILES)) {
            return extractKidsProfilesParsedData();
        }
        FlowMode flowMode2 = this.flowMode;
        if (flowMode2 != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field = flowMode2.getField(SignupConstants.Action.NEXT_ACTION);
            if (field == null || !(field instanceof ActionField)) {
                field = null;
            }
            actionField = (ActionField) field;
        } else {
            actionField = null;
        }
        FlowMode flowMode3 = this.flowMode;
        return new AddProfilesParsedData(actionField, C8632dsu.c((Object) (flowMode3 != null ? flowMode3.getMode() : null), (Object) SignupConstants.Mode.KIDS_PROFILES), StepsViewModelInitializer.createStepsViewModel$default(this.stepsViewModelInitializer, false, 1, null));
    }

    public final AddProfilesParsedData extractKidsProfilesParsedData() {
        ActionField actionField;
        FlowMode flowMode = this.flowMode;
        if (flowMode != null) {
            BaseViewModelInitializer.access$getSignupErrorReporter(this);
            Field field = flowMode.getField(SignupConstants.Action.NEXT_ACTION);
            if (field == null || !(field instanceof ActionField)) {
                field = null;
            }
            actionField = (ActionField) field;
        } else {
            actionField = null;
        }
        FlowMode flowMode2 = this.flowMode;
        return new AddProfilesParsedData(actionField, C8632dsu.c((Object) (flowMode2 != null ? flowMode2.getMode() : null), (Object) SignupConstants.Mode.KIDS_PROFILES), StepsViewModelInitializer.createStepsViewModel$default(this.stepsViewModelInitializer, false, 1, null));
    }

    public final AddProfilesViewModel createAddProfilesViewModel(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        AddProfilesLifecycleData addProfilesLifecycleData = (AddProfilesLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(AddProfilesLifecycleData.class);
        return new AddProfilesViewModel(this.stringProvider, extractAddProfilesParsedData(), addProfilesLifecycleData, this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_OWNER_NAME, null), this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_1_NAME, SignupConstants.Field.PROFILE_1_IS_KIDS), this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_2_NAME, SignupConstants.Field.PROFILE_2_IS_KIDS), this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_3_NAME, SignupConstants.Field.PROFILE_3_IS_KIDS), this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_4_NAME, SignupConstants.Field.PROFILE_4_IS_KIDS), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }

    public final AddProfilesEEViewModel_Ab31697 createAddProfilesViewModel_Ab31697(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        AddProfilesLifecycleData addProfilesLifecycleData = (AddProfilesLifecycleData) new ViewModelProvider(fragment, this.viewModelProviderFactory).get(AddProfilesLifecycleData.class);
        return new AddProfilesEEViewModel_Ab31697(this.stringProvider, extractAddProfilesParsedData(), addProfilesLifecycleData, this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_OWNER_NAME, null), this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_1_NAME, SignupConstants.Field.PROFILE_1_IS_KIDS), this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_2_NAME, SignupConstants.Field.PROFILE_2_IS_KIDS), this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_3_NAME, SignupConstants.Field.PROFILE_3_IS_KIDS), this.profileEntryEditTextCheckboxViewModelInitializer.extractProfileEntryEditTextCheckboxViewModel(SignupConstants.Field.PROFILE_4_NAME, SignupConstants.Field.PROFILE_4_IS_KIDS), this.signupNetworkManager, this.errorMessageViewModelInitializer.createErrorMessageViewModel());
    }
}
