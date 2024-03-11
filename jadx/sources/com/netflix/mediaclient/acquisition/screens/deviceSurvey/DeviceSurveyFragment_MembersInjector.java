package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment_MembersInjector;
import com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import o.InterfaceC1573aGh;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DeviceSurveyFragment_MembersInjector implements MembersInjector<DeviceSurveyFragment> {
    private final Provider<DeviceSurveyDeviceContainerViewFactory> deviceSurveyDeviceContainerViewFactoryProvider;
    private final Provider<DeviceSurveyLogger> deviceSurveyLoggerProvider;
    private final Provider<FormDataObserverFactory> formDataObserverFactoryProvider;
    private final Provider<KeyboardController> keyboardControllerProvider;
    private final Provider<SignupMoneyballEntryPoint> moneyballEntryPointProvider;
    private final Provider<InterfaceC1573aGh> uiLatencyTrackerProvider;

    public DeviceSurveyFragment_MembersInjector(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<DeviceSurveyDeviceContainerViewFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4, Provider<FormDataObserverFactory> provider5, Provider<DeviceSurveyLogger> provider6) {
        this.uiLatencyTrackerProvider = provider;
        this.keyboardControllerProvider = provider2;
        this.deviceSurveyDeviceContainerViewFactoryProvider = provider3;
        this.moneyballEntryPointProvider = provider4;
        this.formDataObserverFactoryProvider = provider5;
        this.deviceSurveyLoggerProvider = provider6;
    }

    public static MembersInjector<DeviceSurveyFragment> create(Provider<InterfaceC1573aGh> provider, Provider<KeyboardController> provider2, Provider<DeviceSurveyDeviceContainerViewFactory> provider3, Provider<SignupMoneyballEntryPoint> provider4, Provider<FormDataObserverFactory> provider5, Provider<DeviceSurveyLogger> provider6) {
        return new DeviceSurveyFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DeviceSurveyFragment deviceSurveyFragment) {
        SignupFragment_MembersInjector.injectUiLatencyTracker(deviceSurveyFragment, DoubleCheck.lazy(this.uiLatencyTrackerProvider));
        AbstractNetworkFragment2_MembersInjector.injectKeyboardController(deviceSurveyFragment, this.keyboardControllerProvider.get());
        injectDeviceSurveyDeviceContainerViewFactory(deviceSurveyFragment, this.deviceSurveyDeviceContainerViewFactoryProvider.get());
        injectMoneyballEntryPoint(deviceSurveyFragment, this.moneyballEntryPointProvider.get());
        injectFormDataObserverFactory(deviceSurveyFragment, this.formDataObserverFactoryProvider.get());
        injectDeviceSurveyLogger(deviceSurveyFragment, this.deviceSurveyLoggerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment.deviceSurveyDeviceContainerViewFactory")
    public static void injectDeviceSurveyDeviceContainerViewFactory(DeviceSurveyFragment deviceSurveyFragment, DeviceSurveyDeviceContainerViewFactory deviceSurveyDeviceContainerViewFactory) {
        deviceSurveyFragment.deviceSurveyDeviceContainerViewFactory = deviceSurveyDeviceContainerViewFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment.moneyballEntryPoint")
    public static void injectMoneyballEntryPoint(DeviceSurveyFragment deviceSurveyFragment, SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        deviceSurveyFragment.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment.formDataObserverFactory")
    public static void injectFormDataObserverFactory(DeviceSurveyFragment deviceSurveyFragment, FormDataObserverFactory formDataObserverFactory) {
        deviceSurveyFragment.formDataObserverFactory = formDataObserverFactory;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment.deviceSurveyLogger")
    public static void injectDeviceSurveyLogger(DeviceSurveyFragment deviceSurveyFragment, DeviceSurveyLogger deviceSurveyLogger) {
        deviceSurveyFragment.deviceSurveyLogger = deviceSurveyLogger;
    }
}
