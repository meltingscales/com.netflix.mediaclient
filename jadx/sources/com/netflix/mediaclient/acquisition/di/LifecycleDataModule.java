package com.netflix.mediaclient.acquisition.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldLifecycleData;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesLifecycleData;
import com.netflix.mediaclient.acquisition.screens.confirm.ConfirmLifecycleData;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyLifecycleData;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926.LearnMoreConfirmViewModelAb44926;
import com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinLifecycleData;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampLifecycleData;
import com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalLifecycleData;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyLifecycleData;
import com.netflix.mediaclient.acquisition.screens.registration.RegistrationLifecycleData;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageLifecycleData;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModel;
import com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeLifecycleData;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardLifecycleData;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModel;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiLifecycleData;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public abstract class LifecycleDataModule {
    public static final int $stable = 0;

    @LifecycleDataKey(AddProfilesLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindAddProfilesLifecycleData(AddProfilesLifecycleData addProfilesLifecycleData);

    @LifecycleDataKey(ConfirmLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindConfirmLifecycleData(ConfirmLifecycleData confirmLifecycleData);

    @LifecycleDataKey(DeviceSurveyLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindDeviceSurveyLifecycleData(DeviceSurveyLifecycleData deviceSurveyLifecycleData);

    @LifecycleDataKey(LearnMoreConfirmViewModelAb44926.LifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindLearnMoreLifecycleData(LearnMoreConfirmViewModelAb44926.LifecycleData lifecycleData);

    @Binds
    public abstract ViewModelProvider.Factory bindLifecycleDataFactory(DependencyInjectionLifecycleDataFactory dependencyInjectionLifecycleDataFactory);

    @LifecycleDataKey(MaturityPinLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindMaturityPinLifecycleData(MaturityPinLifecycleData maturityPinLifecycleData);

    @LifecycleDataKey(OnRampLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindOnRampLifecycleData(OnRampLifecycleData onRampLifecycleData);

    @LifecycleDataKey(OrderFinalLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindOrderFinalLifecycleData(OrderFinalLifecycleData orderFinalLifecycleData);

    @LifecycleDataKey(PasswordOnlyLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindPasswordOnlyLifecycleData(PasswordOnlyLifecycleData passwordOnlyLifecycleData);

    @LifecycleDataKey(RegenoldLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindRegenoldLifecycleData(RegenoldLifecycleData regenoldLifecycleData);

    @LifecycleDataKey(RegistrationLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindRegistrationLifecycleData(RegistrationLifecycleData registrationLifecycleData);

    @LifecycleDataKey(UpiWaitingViewModel.LifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindUpiWaitingLifecycleData(UpiWaitingViewModel.LifecycleData lifecycleData);

    @LifecycleDataKey(VerifyAgeLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindVerifyAgeLifecycleData(VerifyAgeLifecycleData verifyAgeLifecycleData);

    @LifecycleDataKey(VerifyCardContextViewModel.LifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindVerifyCardContextLifecycleData(VerifyCardContextViewModel.LifecycleData lifecycleData);

    @LifecycleDataKey(VerifyCardLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindVerifyCardLifecycleData(VerifyCardLifecycleData verifyCardLifecycleData);

    @LifecycleDataKey(WelcomeFujiLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindWelcomeFujiLifecycleData(WelcomeFujiLifecycleData welcomeFujiLifecycleData);

    @LifecycleDataKey(SecondaryLanguageLifecycleData.class)
    @Binds
    @IntoMap
    public abstract ViewModel bindsecondaryLangugageLifecycleData(SecondaryLanguageLifecycleData secondaryLanguageLifecycleData);
}
