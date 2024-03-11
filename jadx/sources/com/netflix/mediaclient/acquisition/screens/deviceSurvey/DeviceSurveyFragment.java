package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.signupButton.OnrampButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentDeviceSurveyBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8632dsu;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class DeviceSurveyFragment extends Hilt_DeviceSurveyFragment {
    public static final int $stable = 8;
    private final AppView appView = AppView.deviceSurvey;
    private FragmentDeviceSurveyBinding binding;
    @Inject
    public DeviceSurveyDeviceContainerViewFactory deviceSurveyDeviceContainerViewFactory;
    @Inject
    public DeviceSurveyLogger deviceSurveyLogger;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    public DeviceSurveyViewModel viewModel;

    /* loaded from: classes3.dex */
    public interface DeviceSurveyInteractionListener {
        void endSessions();

        void logContinueAction(List<String> list);

        void logSelectedDevices(List<String> list);
    }

    public static /* synthetic */ void getCtaButton$annotations() {
    }

    public static /* synthetic */ void getDeviceSurveyDeviceContainer$annotations() {
    }

    public static /* synthetic */ void getHeader$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getSubheader$annotations() {
    }

    public static /* synthetic */ void getWarningView$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final void setDeviceSurveyDeviceContainerViewFactory(DeviceSurveyDeviceContainerViewFactory deviceSurveyDeviceContainerViewFactory) {
        C8632dsu.c((Object) deviceSurveyDeviceContainerViewFactory, "");
        this.deviceSurveyDeviceContainerViewFactory = deviceSurveyDeviceContainerViewFactory;
    }

    public final void setDeviceSurveyLogger(DeviceSurveyLogger deviceSurveyLogger) {
        C8632dsu.c((Object) deviceSurveyLogger, "");
        this.deviceSurveyLogger = deviceSurveyLogger;
    }

    public final void setFormDataObserverFactory(FormDataObserverFactory formDataObserverFactory) {
        C8632dsu.c((Object) formDataObserverFactory, "");
        this.formDataObserverFactory = formDataObserverFactory;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setViewModel(DeviceSurveyViewModel deviceSurveyViewModel) {
        C8632dsu.c((Object) deviceSurveyViewModel, "");
        this.viewModel = deviceSurveyViewModel;
    }

    public final DeviceSurveyViewModel getViewModel() {
        DeviceSurveyViewModel deviceSurveyViewModel = this.viewModel;
        if (deviceSurveyViewModel != null) {
            return deviceSurveyViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentDeviceSurveyBinding requireBinding() {
        FragmentDeviceSurveyBinding fragmentDeviceSurveyBinding = this.binding;
        if (fragmentDeviceSurveyBinding != null) {
            return fragmentDeviceSurveyBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final View getScrollView() {
        NestedScrollView nestedScrollView = requireBinding().scrollView;
        C8632dsu.a(nestedScrollView, "");
        return nestedScrollView;
    }

    public final SignupBannerView getWarningView() {
        SignupBannerView signupBannerView = requireBinding().warningView;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    public final NetflixSignupButton getCtaButton() {
        OnrampButton onrampButton = requireBinding().ctaButton;
        C8632dsu.a(onrampButton, "");
        return onrampButton;
    }

    public final C1204Sr getHeader() {
        C1204Sr c1204Sr = requireBinding().header;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final C1204Sr getSubheader() {
        C1204Sr c1204Sr = requireBinding().subheader;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final DeviceSurveyDeviceContainer getDeviceSurveyDeviceContainer() {
        DeviceSurveyDeviceContainer deviceSurveyDeviceContainer = requireBinding().deviceSurveyDeviceContainer;
        C8632dsu.a(deviceSurveyDeviceContainer, "");
        return deviceSurveyDeviceContainer;
    }

    public final DeviceSurveyDeviceContainerViewFactory getDeviceSurveyDeviceContainerViewFactory() {
        DeviceSurveyDeviceContainerViewFactory deviceSurveyDeviceContainerViewFactory = this.deviceSurveyDeviceContainerViewFactory;
        if (deviceSurveyDeviceContainerViewFactory != null) {
            return deviceSurveyDeviceContainerViewFactory;
        }
        C8632dsu.d("");
        return null;
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

    public final DeviceSurveyLogger getDeviceSurveyLogger() {
        DeviceSurveyLogger deviceSurveyLogger = this.deviceSurveyLogger;
        if (deviceSurveyLogger != null) {
            return deviceSurveyLogger;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.deviceSurvey.Hilt_DeviceSurveyFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(createDeviceSurveyViewModel());
    }

    public DeviceSurveyViewModel createDeviceSurveyViewModel() {
        return getMoneyballEntryPoint().deviceSurveyViewModelInitializer().createDeviceSurveyViewModel(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentDeviceSurveyBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initSignupHeading();
        initDeviceSurveyComponent();
        initClickListeners();
        TextViewCompat.setTextAppearance(getCtaButton().getButton(), R.style.SignupCtaButton_OnboardingTweaks);
    }

    public void initDeviceSurveyComponent() {
        getDeviceSurveyDeviceContainerViewFactory().createDeviceSurveyDeviceContainerViewBinding(getDeviceSurveyDeviceContainer()).bind(getViewModel().getDeviceSurveySelectorViewModel(), getDeviceSurveyLogger(), getViewModel().getSelectedDevices());
    }

    public final void initSignupHeading() {
        getHeader().setText(getViewModel().getHeadingText());
        getSubheader().setText(getViewModel().getSubheadingStrings());
    }

    private final void initClickListeners() {
        getCtaButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceSurveyFragment.initClickListeners$lambda$1(DeviceSurveyFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$1(final DeviceSurveyFragment deviceSurveyFragment, View view) {
        C8632dsu.c((Object) deviceSurveyFragment, "");
        deviceSurveyFragment.getDeviceSurveyLogger().logContinueAction(deviceSurveyFragment.getDeviceSurveyDeviceContainer().getSelectedDevices());
        deviceSurveyFragment.getViewModel().submitDeviceSurvey(new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment$initClickListeners$1$1
            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onBeforeNetworkAction(Request request) {
                C8632dsu.c((Object) request, "");
            }

            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onAfterNetworkAction(Response response) {
                C8632dsu.c((Object) response, "");
                DeviceSurveyFragment.this.getDeviceSurveyLogger().endSessions();
            }
        });
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createInlineWarningObserver(getWarningView(), getScrollView()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getDeviceSurveyLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getCtaButton()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
        getDeviceSurveyLogger().endSessions();
    }
}
