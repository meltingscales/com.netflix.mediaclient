package com.netflix.mediaclient.acquisition.screens.addProfiles;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.ProfileSettings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox;
import com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckboxViewModel;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentAddProfilesBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8168dfL;
import o.C8569dql;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class AddProfilesFragment extends Hilt_AddProfilesFragment {
    public static final int $stable = 8;
    @Inject
    public AddProfilesLogger addProfilesLogger;
    private final AppView appView = AppView.updateProfiles;
    private FragmentAddProfilesBinding binding;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    private final InterfaceC8554dpx profileViewList$delegate;
    public AddProfilesViewModel viewModel;

    /* loaded from: classes3.dex */
    public interface AddProfilesInteractionListener {
        void endSessions();

        void logContinueAction(List<? extends ProfileSettings> list);

        void logProfileFocusChange(boolean z);
    }

    public static /* synthetic */ void getCtaButton$annotations() {
    }

    public static /* synthetic */ void getHeader$annotations() {
    }

    public static /* synthetic */ void getOwnerName$annotations() {
    }

    public static /* synthetic */ void getProfileViewList$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getSubheader$annotations() {
    }

    public static /* synthetic */ void getUserProfile1$annotations() {
    }

    public static /* synthetic */ void getUserProfile2$annotations() {
    }

    public static /* synthetic */ void getUserProfile3$annotations() {
    }

    public static /* synthetic */ void getUserProfile4$annotations() {
    }

    public static /* synthetic */ void getWarningView$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final void setAddProfilesLogger(AddProfilesLogger addProfilesLogger) {
        C8632dsu.c((Object) addProfilesLogger, "");
        this.addProfilesLogger = addProfilesLogger;
    }

    public final void setFormDataObserverFactory(FormDataObserverFactory formDataObserverFactory) {
        C8632dsu.c((Object) formDataObserverFactory, "");
        this.formDataObserverFactory = formDataObserverFactory;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setViewModel(AddProfilesViewModel addProfilesViewModel) {
        C8632dsu.c((Object) addProfilesViewModel, "");
        this.viewModel = addProfilesViewModel;
    }

    public AddProfilesFragment() {
        InterfaceC8554dpx b;
        b = dpB.b(new drO<List<? extends ProfileEntryEditTextCheckbox>>() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment$profileViewList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final List<? extends ProfileEntryEditTextCheckbox> invoke() {
                List<? extends ProfileEntryEditTextCheckbox> j;
                j = C8569dql.j(AddProfilesFragment.this.getOwnerName(), AddProfilesFragment.this.getUserProfile1(), AddProfilesFragment.this.getUserProfile2(), AddProfilesFragment.this.getUserProfile3(), AddProfilesFragment.this.getUserProfile4());
                return j;
            }
        });
        this.profileViewList$delegate = b;
    }

    public final AddProfilesViewModel getViewModel() {
        AddProfilesViewModel addProfilesViewModel = this.viewModel;
        if (addProfilesViewModel != null) {
            return addProfilesViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentAddProfilesBinding requireBinding() {
        FragmentAddProfilesBinding fragmentAddProfilesBinding = this.binding;
        if (fragmentAddProfilesBinding != null) {
            return fragmentAddProfilesBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final NetflixSignupButton getCtaButton() {
        View findViewById = requireView().findViewById(R.id.ctaButton);
        C8632dsu.a(findViewById, "");
        return (NetflixSignupButton) findViewById;
    }

    public final C1204Sr getHeader() {
        View findViewById = requireView().findViewById(R.id.header);
        C8632dsu.a(findViewById, "");
        return (C1204Sr) findViewById;
    }

    public final C1204Sr getSubheader() {
        View findViewById = requireView().findViewById(R.id.subheader);
        C8632dsu.a(findViewById, "");
        return (C1204Sr) findViewById;
    }

    public final NestedScrollView getScrollView() {
        View findViewById = requireView().findViewById(R.id.scrollView);
        C8632dsu.a(findViewById, "");
        return (NestedScrollView) findViewById;
    }

    public final SignupBannerView getWarningView() {
        View findViewById = requireView().findViewById(R.id.warningView);
        C8632dsu.a(findViewById, "");
        return (SignupBannerView) findViewById;
    }

    public final ProfileEntryEditTextCheckbox getOwnerName() {
        View findViewById = requireView().findViewById(R.id.ownerName);
        C8632dsu.a(findViewById, "");
        return (ProfileEntryEditTextCheckbox) findViewById;
    }

    public final ProfileEntryEditTextCheckbox getUserProfile1() {
        View findViewById = requireView().findViewById(R.id.userProfile1);
        C8632dsu.a(findViewById, "");
        return (ProfileEntryEditTextCheckbox) findViewById;
    }

    public final ProfileEntryEditTextCheckbox getUserProfile2() {
        View findViewById = requireView().findViewById(R.id.userProfile2);
        C8632dsu.a(findViewById, "");
        return (ProfileEntryEditTextCheckbox) findViewById;
    }

    public final ProfileEntryEditTextCheckbox getUserProfile3() {
        View findViewById = requireView().findViewById(R.id.userProfile3);
        C8632dsu.a(findViewById, "");
        return (ProfileEntryEditTextCheckbox) findViewById;
    }

    public final ProfileEntryEditTextCheckbox getUserProfile4() {
        View findViewById = requireView().findViewById(R.id.userProfile4);
        C8632dsu.a(findViewById, "");
        return (ProfileEntryEditTextCheckbox) findViewById;
    }

    public final List<ProfileEntryEditTextCheckbox> getProfileViewList() {
        return (List) this.profileViewList$delegate.getValue();
    }

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
        }
        C8632dsu.d("");
        return null;
    }

    public final FormDataObserverFactory getFormDataObserverFactory() {
        FormDataObserverFactory formDataObserverFactory = this.formDataObserverFactory;
        if (formDataObserverFactory != null) {
            return formDataObserverFactory;
        }
        C8632dsu.d("");
        return null;
    }

    public final AddProfilesLogger getAddProfilesLogger() {
        AddProfilesLogger addProfilesLogger = this.addProfilesLogger;
        if (addProfilesLogger != null) {
            return addProfilesLogger;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.Hilt_AddProfilesFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(createAddProfilesViewModel());
    }

    public AddProfilesViewModel createAddProfilesViewModel() {
        return getMoneyballEntryPoint().addProfilesViewModelInitializer().createAddProfilesViewModel(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentAddProfilesBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initSignupHeading();
        initCTAText();
        initForm();
        initClickListeners();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    public void initClickListeners() {
        NetflixSignupButton ctaButton = getCtaButton();
        ctaButton.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddProfilesFragment.initClickListeners$lambda$1(AddProfilesFragment.this, view);
            }
        });
        ctaButton.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$1(AddProfilesFragment addProfilesFragment, View view) {
        C8632dsu.c((Object) addProfilesFragment, "");
        addProfilesFragment.checkForDuplicateNames();
        if (addProfilesFragment.getViewModel().isFormValid()) {
            addProfilesFragment.logAndSubmitProfiles();
        }
    }

    public void initCTAText() {
        getCtaButton().setActivated(true);
        TextViewCompat.setTextAppearance(getCtaButton().getButton(), R.style.SignupCtaButton_OnboardingTweaks);
    }

    public final void logAndSubmitProfiles() {
        getAddProfilesLogger().logContinueAction(getViewModel().getProfileSettings());
        getViewModel().submitProfiles(new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment$logAndSubmitProfiles$1
            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onBeforeNetworkAction(Request request) {
                C8632dsu.c((Object) request, "");
            }

            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onAfterNetworkAction(Response response) {
                C8632dsu.c((Object) response, "");
                AddProfilesFragment.this.getAddProfilesLogger().endSessions();
            }
        });
    }

    public void initForm() {
        ProfileEntryEditTextCheckbox.OnInputChangedListener onInputChangedListener = new ProfileEntryEditTextCheckbox.OnInputChangedListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment$initForm$inputChangeListener$1
            @Override // com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox.OnInputChangedListener
            public void onInputChanged() {
                AddProfilesFragment.this.checkForDuplicateNames();
            }
        };
        ProfileEntryEditTextCheckbox.bind$default(getOwnerName(), getViewModel().getOwnerProfileViewModel(), getViewModel().getOwnerProfileHint(), onInputChangedListener, null, 8, null);
        getUserProfile1().bind(getViewModel().getUserProfile1ViewModel(), getViewModel().getProfileHint(), onInputChangedListener, getString(R.string.accessibility_profile_2));
        getUserProfile2().bind(getViewModel().getUserProfile2ViewModel(), getViewModel().getProfileHint(), onInputChangedListener, getString(R.string.accessibility_profile_3));
        getUserProfile3().bind(getViewModel().getUserProfile3ViewModel(), getViewModel().getProfileHint(), onInputChangedListener, getString(R.string.accessibility_profile_4));
        getUserProfile4().bind(getViewModel().getUserProfile4ViewModel(), getViewModel().getProfileHint(), onInputChangedListener, getString(R.string.accessibility_profile_5));
    }

    public final void checkForDuplicateNames() {
        for (ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox : getProfileViewList()) {
            boolean z = false;
            for (ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox2 : getProfileViewList()) {
                if (!C8632dsu.c(profileEntryEditTextCheckbox, profileEntryEditTextCheckbox2)) {
                    ProfileEntryEditTextCheckboxViewModel viewModel = profileEntryEditTextCheckbox.getViewModel();
                    String profileNameValue = viewModel != null ? viewModel.getProfileNameValue() : null;
                    ProfileEntryEditTextCheckboxViewModel viewModel2 = profileEntryEditTextCheckbox2.getViewModel();
                    String profileNameValue2 = viewModel2 != null ? viewModel2.getProfileNameValue() : null;
                    if (C8168dfL.h(profileNameValue) && C8168dfL.h(profileNameValue2) && C8632dsu.c((Object) profileNameValue, (Object) profileNameValue2)) {
                        z = true;
                    }
                }
                profileEntryEditTextCheckbox.setIsDuplicateName(z);
            }
        }
    }

    public final void initSignupHeading() {
        getHeader().setText(getViewModel().getHeadingText());
        getSubheader().setText(getViewModel().getSubheadingString());
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createInlineWarningObserver(getWarningView(), getScrollView()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getLoadingSubmitProfiles().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getCtaButton()));
    }
}
