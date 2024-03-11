package com.netflix.mediaclient.acquisition.util;

import android.app.Activity;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.screens.SignupFragment;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment;
import com.netflix.mediaclient.acquisition.screens.addProfiles.KidsProfilesFragment;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697;
import com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697;
import com.netflix.mediaclient.acquisition.screens.confirm.ConfirmFragment;
import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveyFragment;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmFragment;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926.LearnMoreConfirmFragmentAb44926;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab55548.LearnMoreConfirmFragmentAb55548;
import com.netflix.mediaclient.acquisition.screens.maturityPin.MaturityPinFragment;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampForSecondaryProfilesFragmentAb53426;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment;
import com.netflix.mediaclient.acquisition.screens.passwordOnly.PasswordOnlyFragment;
import com.netflix.mediaclient.acquisition.screens.registration.RegistrationFragment;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageForProfileOnboardingFragmentAb53426;
import com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment;
import com.netflix.mediaclient.acquisition.screens.upi.UpiWaitingFragment;
import com.netflix.mediaclient.acquisition.screens.verifyAge.VerifyAgeFragment;
import com.netflix.mediaclient.acquisition.screens.verifyCard.VerifyCardFragment;
import com.netflix.mediaclient.acquisition.screens.verifyCardContext.VerifyCardContextFragment;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.WelcomeFujiFragment;
import com.netflix.mediaclient.acquisition.screens.welcomefuji.ab44926.WelcomeFujiFragmentAb44926;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_LearnMoreConfirmCompose;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInData;
import o.C8632dsu;
import o.C8691duz;
import o.aRN;
import o.aRR;

/* loaded from: classes3.dex */
public final class SignupMode {
    public static final int $stable = 0;
    public static final SignupMode INSTANCE = new SignupMode();

    private SignupMode() {
    }

    public final SignupFragment mapToFragment(FlowMode flowMode, Activity activity) {
        C8632dsu.c((Object) flowMode, "");
        C8632dsu.c((Object) activity, "");
        String flow = flowMode.getFlow();
        String mode = flowMode.getMode();
        String netflixClientPlatform = flowMode.getNetflixClientPlatform();
        if (C8632dsu.c((Object) flow, (Object) SignupConstants.Flow.SIMPLE_SILVER_SIGN_UP) || C8632dsu.c((Object) netflixClientPlatform, (Object) SignupConstants.AndroidPlatform.ANDROID_NATIVE)) {
            if (isSimpleSilverSignUpFlow(flow)) {
                return mapToFragmentForSimpleSilverSignUpMode(mode);
            }
            if (isMobileSignUpFlow(flow)) {
                return mapToFragmentForMobileSignUpMode(mode, activity);
            }
            if (isMobileOnboardingFlow(flow)) {
                return mapToFragmentForMobileOnboarding(mode);
            }
            if (isProfileOnboardingFlow(flow)) {
                return mapToFragmentForProfileOnboarding(mode);
            }
            return null;
        }
        return null;
    }

    public final SignupFragment mapToFragmentForSimpleSilverSignUpMode(String str) {
        C8632dsu.c((Object) str, "");
        if (C8632dsu.c((Object) str, (Object) "welcome")) {
            return new WelcomeFujiFragment();
        }
        return null;
    }

    public final SignupFragment mapToFragmentForMobileSignUpMode(String str, Activity activity) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) activity, "");
        switch (str.hashCode()) {
            case -1350309703:
                if (str.equals("registration")) {
                    return getRegistrationMode();
                }
                break;
            case -1033530583:
                if (str.equals(SignupConstants.Mode.VERIFY_CARD)) {
                    return new VerifyCardFragment();
                }
                break;
            case 162353351:
                if (str.equals("learnMoreConfirm")) {
                    return getLearnMoreConfirmFragment();
                }
                break;
            case 566921447:
                if (str.equals(SignupConstants.Mode.PASSWORD_ONLY)) {
                    return getPasswordOnlyMode();
                }
                break;
            case 764839904:
                if (str.equals(SignupConstants.Mode.UPI_ORDER_CONFIRM)) {
                    return new ConfirmFragment();
                }
                break;
            case 1035930182:
                if (str.equals(SignupConstants.Mode.VERIFY_CARD_CONTEXT)) {
                    return new VerifyCardContextFragment();
                }
                break;
            case 1233099618:
                if (str.equals("welcome")) {
                    return getWelcomeMode();
                }
                break;
        }
        return null;
    }

    private final SignupFragment getWelcomeMode() {
        return aRR.a.b() ? new WelcomeFujiFragmentAb44926() : new WelcomeFujiFragment();
    }

    private final SignupFragment getPasswordOnlyMode() {
        return new PasswordOnlyFragment();
    }

    private final SignupFragment getRegistrationMode() {
        return new RegistrationFragment();
    }

    private final AddProfilesFragment getAddProfileFragment() {
        return aRN.e.e() ? new AddProfilesEEFragment_Ab31697() : new AddProfilesFragment();
    }

    private final SignupFragment getLearnMoreConfirmFragment() {
        return aRR.a.b() ? new LearnMoreConfirmFragmentAb44926() : Config_FastProperty_LearnMoreConfirmCompose.Companion.d() ? new LearnMoreConfirmFragmentAb55548() : new LearnMoreConfirmFragment();
    }

    private final SignupFragment mapToFragmentForProfileOnboarding(String str) {
        if (C8632dsu.c((Object) str, (Object) SignupConstants.Mode.ON_RAMP)) {
            return new OnRampForSecondaryProfilesFragmentAb53426();
        }
        if (C8632dsu.c((Object) str, (Object) SignupConstants.Mode.SECONDARY_LANGUAGES)) {
            return new SecondaryLanguageForProfileOnboardingFragmentAb53426();
        }
        return null;
    }

    public final SignupFragment mapToFragmentForMobileOnboarding(String str) {
        C8632dsu.c((Object) str, "");
        switch (str.hashCode()) {
            case -2041187445:
                if (str.equals(SignupConstants.Mode.ADD_PROFILES)) {
                    return getAddProfileFragment();
                }
                break;
            case -1812870873:
                if (str.equals(SignupConstants.Mode.SECONDARY_LANGUAGES)) {
                    return new SecondaryLanguageFragment();
                }
                break;
            case -1695909434:
                if (str.equals("verifyAge")) {
                    return new VerifyAgeFragment();
                }
                break;
            case -1012051343:
                if (str.equals(SignupConstants.Mode.ON_RAMP)) {
                    return new OnRampFragment();
                }
                break;
            case -996222657:
                if (str.equals(SignupConstants.Mode.UPI_WAITING)) {
                    return new UpiWaitingFragment();
                }
                break;
            case -438312289:
                if (str.equals(SignupConstants.Mode.CONFIRM_MEMBERSHIP_STARTED_SIMPLICITY)) {
                    return new OrderFinalFragment();
                }
                break;
            case -429005756:
                if (str.equals(SignupConstants.Mode.MATURITY_PIN)) {
                    return new MaturityPinFragment();
                }
                break;
            case -10998480:
                if (str.equals(SignupConstants.Mode.DEVICE_SURVEY)) {
                    return new DeviceSurveyFragment();
                }
                break;
            case 348006743:
                if (str.equals(SignupConstants.Mode.KIDS_PROFILES)) {
                    return new KidsProfilesFragment();
                }
                break;
            case 977105278:
                if (str.equals(SignupConstants.Mode.ADD_PROFILES_CONTEXT)) {
                    return new AddProfilesEEContextFragment_Ab31697();
                }
                break;
        }
        return null;
    }

    public final boolean isLoginMode(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) "enterMemberCredentials") || C8632dsu.c((Object) str, (Object) SignupConstants.Mode.SIGNUP_BLOCKED) || C8632dsu.c((Object) str, (Object) SignupConstants.Mode.SIGNUP_UNAVAILABLE) || C8632dsu.c((Object) str, (Object) SignInData.MODE_LOGIN_USER_ID_ENTRY);
    }

    public final boolean isMemberMode(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) "memberHome");
    }

    public final boolean isNonMemberMode(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) SignupConstants.Mode.NON_MEMBER_HOME);
    }

    public final boolean isWelcomeMode(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) "welcome");
    }

    public final boolean isPlanSelectionAndConfirmMode(String str) {
        return C8632dsu.c((Object) str, (Object) "planSelectionAndConfirm");
    }

    public final boolean isRedirectToBrowserMode(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) SignupConstants.Mode.REDIRECT_FROM_ANDROID_TO_WEB);
    }

    public static /* synthetic */ boolean isSimpleSilverSignUpFlow$default(SignupMode signupMode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return signupMode.isSimpleSilverSignUpFlow(str);
    }

    public final boolean isSimpleSilverSignUpFlow(String str) {
        boolean e;
        e = C8691duz.e(str, SignupConstants.Flow.SIMPLE_SILVER_SIGN_UP, false, 2, null);
        return e;
    }

    public final boolean isMobileSignUpFlow(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) SignupConstants.Flow.MOBILE_SIGNUP);
    }

    public final boolean isSignupSimplicityFlow(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) SignupConstants.Flow.SIGNUP_SIMPLICITY);
    }

    public final boolean isMemberSimplicityFlow(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) SignupConstants.Flow.MEMBER_SIMPLICITY);
    }

    public final boolean isMobileOnboardingFlow(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) SignupConstants.Flow.MOBILE_ONBOARDING);
    }

    private final boolean isProfileOnboardingFlow(String str) {
        return C8632dsu.c((Object) str, (Object) SignupConstants.Flow.PROFILE_ONBOARDING);
    }

    public final boolean isSwitchFlowMode(String str) {
        return C8632dsu.c((Object) str, (Object) SignupConstants.Mode.SWITCH_FLOW);
    }

    public final boolean isErrorMode(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) SignupConstants.Mode.WARN_USER) || C8632dsu.c((Object) str, (Object) SignupConstants.Mode.MONEYBALL_EXCEPTION);
    }
}
