package com.netflix.mediaclient.acquisition.di;

import com.netflix.mediaclient.acquisition.components.faq.FaqViewModelInitializer;
import com.netflix.mediaclient.acquisition.components.regenold.RegenoldViewModelInitializer;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataComponent;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextViewModelInitializer_Ab31697;
import com.netflix.mediaclient.acquisition.screens.confirm.ConfirmViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926.LearnMoreConfirmViewModelInitializer44926;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmViewModelInitializer55548;
import com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.registration.RegistrationViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiViewModelInitializer;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.WelcomeFujiViewModelInitializerAb44926;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;

@EntryPoint
@InstallIn({MoneyballDataComponent.class})
/* loaded from: classes3.dex */
public interface SignupMoneyballEntryPoint {
    AddProfilesEEContextViewModelInitializer_Ab31697 addProfilesEEContextViewModelInitializer_Ab31697();

    AddProfilesViewModelInitializer addProfilesViewModelInitializer();

    ConfirmViewModelInitializer confirmViewModelInitializer();

    DeviceSurveyViewModelInitializer deviceSurveyViewModelInitializer();

    FaqViewModelInitializer faqViewModelInitializer();

    LearnMoreConfirmViewModelInitializer learnMoreConfirmViewModelInitializer();

    LearnMoreConfirmViewModelInitializer44926 learnMoreConfirmViewModelInitializer44926();

    LearnMoreConfirmViewModelInitializer55548 learnMoreConfirmViewModelInitializer55548();

    MaturityPinViewModelInitializer maturityPinViewModelInitializer();

    OnRampViewModelInitializer onRampViewModelInitializer();

    OrderFinalViewModelInitializer orderFinalViewModelInitializer();

    PasswordOnlyViewModelInitializer passwordOnlyViewModelInitializer();

    RegenoldViewModelInitializer regenoldViewModelInitializer();

    RegistrationViewModelInitializer registrationViewModelInitializer();

    SecondaryLanguageViewModelInitializer secondaryLanguageViewModelInitializer();

    SignupErrorReporter signupErrorReporter();

    SignupNetworkManager signupNetworkManager();

    StringProvider stringProvider();

    UpiWaitingViewModelInitializer upiWaitingViewModelInitializer();

    VerifyAgeViewModelInitializer verifyAgeViewModelInitializer();

    VerifyCardContextViewModelInitializer verifyCardContextViewModelInitializer();

    VerifyCardViewModelInitializer verifyCardViewModelInitializer();

    WelcomeFujiViewModelInitializer welcomeFujiViewModelInitializer();

    WelcomeFujiViewModelInitializerAb44926 welcomeFujiViewModelInitializerAb44926();
}
