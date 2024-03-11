package com.netflix.mediaclient.acquisition.lib;

/* loaded from: classes3.dex */
public final class SignupConstants {
    public static final SignupConstants INSTANCE = new SignupConstants();

    private SignupConstants() {
    }

    /* loaded from: classes6.dex */
    public static final class DeepLink {
        public static final String CONFIRM_PAGE_SIGN_OUT = "confirmpageinfosignout";
        public static final DeepLink INSTANCE = new DeepLink();
        public static final String LOGIN_FROM_REGISTRATION = "loginfromregistration";

        private DeepLink() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Error {
        public static final String DATA_MANIPULATION_ERROR = "SignupNativeDataManipulationError";
        public static final String DEBUG_FIELD_INFO = "debugInfo";
        public static final String DEBUG_FIELD_INFO_FLOW = "flow";
        public static final String DEBUG_FIELD_INFO_MODE = "mode";
        public static final String DEBUG_FIELD_KEY = "key";
        public static final String DEBUG_FIELD_MESSAGE = "message";
        public static final String DEBUG_FIELD_STACK_TRACE = "stackTrace";
        public static final String DEBUG_INFO_ACTION = "action";
        public static final Error INSTANCE = new Error();
        public static final String MHU_HOUSEHOLD_DATA_ERROR = "mhu_household_data_error";
        public static final String MISSING_FIELD_ERROR = "SignupNativeFieldError";
        public static final String MISSING_MOP_LOGO_URL = "SignupNativeMissingMopLogoUrl";
        public static final String MULTI_FIELD_MERGE_ERROR = "SignupNativeIncompleteActionError";
        public static final String OTP_CHALLENGE_ALL_ATTEMPTS_EXHAUSTED = "mfa_challenge_all_attempts_exhausted";
        public static final String OTP_CHALLENGE_VERIFICATION_EXHAUSTED = "mfa_challenge_verification_attempts_exhausted";
        public static final String OTP_EMPTY = "challengeOtp_is_empty";
        public static final String OTP_EXPIRED = "mfa_factor_expired";
        public static final String OTP_INVALID = "mfa_factor_invalid";
        public static final String RESEND_ATTEMPTS_EXHASTED = "resend_code_attempts_exceeded";
        public static final int STACK_TRACE_MAX_LINES = 15;
        public static final String THROTTLING_FAILURE = "throttling_failure";
        public static final String UNKNOWN_MODE = "SignupNativeUnknownMode";
        public static final String UNRECOGNIZED_STRING_KEY_ERROR = "SignupNativeMissingKeyError";
        public static final String USER_NOT_LOGGED_IN = "mfa_user_not_logged_in";
        public static final String WARN_USER_MODE = "SignupNativeWarnUserMode";
        public static final String WEB_VIEW_ERROR = "SignupWebViewError";

        private Error() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class PageKey {
        public static final String ADD_PROFILES = "addProfiles";
        public static final String CONFIRM = "confirm";
        public static final PageKey INSTANCE = new PageKey();
        public static final String PLAN_SELECTION_AND_CONFIRM = "planSelectionAndConfirm";
        public static final String REGISTRATION = "registration";
        public static final String VERIFY_AGE = "verifyAge";

        private PageKey() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Flow {
        public static final String ANDROID_MEMBER = "androidMember";
        public static final String DEMOGRAPHIC_SIMPLICITY = "demographicSimplicity";
        public static final Flow INSTANCE = new Flow();
        public static final String MEMBER_SIMPLICITY = "memberSimplicity";
        public static final String MOBILE_ONBOARDING = "mobileOnboarding";
        public static final String MOBILE_SIGNUP = "mobileSignup";
        public static final String PROFILE_ONBOARDING = "profileOnboarding";
        public static final String SIGNUP_SIMPLICITY = "signupSimplicity";
        public static final String SIMPLE_SILVER_SIGN_UP = "simpleSilverSignUp";

        private Flow() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Mode {
        public static final String ADD_PROFILES = "addprofiles";
        public static final String ADD_PROFILES_CONTEXT = "addprofilesWithContext";
        public static final String COLLECT_DEMOGRAPHIC_INFO = "collectDemographicInfo";
        public static final String CONFIRM_MEMBERSHIP_STARTED_SIMPLICITY = "confirmMembershipStartedForSimplicity";
        public static final String DEMOGRAPHIC_INTERSTITIAL_LANDING = "demographicInterstitialLanding";
        public static final String DEVICE_SURVEY = "devicesurvey";
        public static final String ENTER_MEMBER_CREDENTIALS = "enterMemberCredentials";
        public static final String HEADLESS_ACTION_MODE = "headlessActionMode";
        public static final Mode INSTANCE = new Mode();
        public static final String KIDS_PROFILES = "kidsprofiles";
        public static final String LEARN_MORE_CONFIRM = "learnMoreConfirm";
        public static final String MATURITY_PIN = "maturityPin";
        public static final String MEMBER_HOME = "memberHome";
        public static final String MONEYBALL_EXCEPTION = "moneyballException";
        public static final String NON_MEMBER_HOME = "nonMemberHome";
        public static final String ON_RAMP = "onramp";
        public static final String PASSWORD_ONLY = "passwordOnly";
        public static final String PLAN_SELECTION_AND_CONFIRM = "planSelectionAndConfirm";
        public static final String REDIRECT_FROM_ANDROID_TO_WEB = "redirectFromAndroidToWebMode";
        public static final String REGISTRATION = "registration";
        public static final String SECONDARY_LANGUAGES = "secondarylanguages";
        public static final String SIGNUP_BLOCKED = "signupBlocked";
        public static final String SIGNUP_UNAVAILABLE = "signupUnavailable";
        public static final String SWITCH_FLOW = "switchFlow";
        public static final String UPI_ORDER_CONFIRM = "upiOrderConfirm";
        public static final String UPI_WAITING = "upiWaiting";
        public static final String VERIFY_AGE = "verifyAge";
        public static final String VERIFY_CARD = "verifyCard";
        public static final String VERIFY_CARD_CONTEXT = "verifyCardContext";
        public static final String WARN_USER = "warnUser";
        public static final String WELCOME = "welcome";
        public static final String WELCOME_BACK_CONFIRM = "welcomeBackConfirm";

        private Mode() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Field {
        public static final String ACCOUNT_NUMBER_DISPLAY = "accountNumberDisplay";
        public static final String ACS_POST_PARAMS = "acsPostParameters";
        public static final String ACS_URL = "acsURL";
        public static final String ADAPTIVE_FIELDS = "adaptiveFields";
        public static final String AGE = "age";
        public static final String ANDROID_APP_HASH = "androidAppHash";
        public static final String AUTO_LOGIN_TOKEN = "autoLoginToken";
        public static final String AUTO_SUBMIT = "autoSubmit";
        public static final String BANK_NAME = "bankName";
        public static final String BILLING_FREQUENCY = "billingFrequency";
        public static final String BIRTH_DATE = "birthDate";
        public static final String BIRTH_MONTH = "birthMonth";
        public static final String BIRTH_YEAR = "birthYear";
        public static final String CANCEL_MEMBERSHIP_ANYTIME = "cancelMembershipAnytime";
        public static final String CARD_TYPE = "cardType";
        public static final String CASH_PAYMENT_MOP_DISPLAY_NAME = "cashPaymentMopDisplayName";
        public static final String CHALLENGE_OTP = "challengeOtp";
        public static final String CLIENT_THEME = "clientTheme";
        public static final String COPY_SIGN_UP_URL = "copySignUpUrl";
        public static final String COUNTRY_CODE = "countryCode";
        public static final String CTA_FREE_PLAN = "cta_ab36101";
        public static final String CURRENT_EMAIL = "currentEmail";
        public static final String CVV_TRUST_MESSAGE = "cvvTrustMessage";
        public static final String DEMOGRAPHIC_INFO_SCOPE = "demographicInfo";
        public static final String DEMO_COLLECT_BIRTH_DAY = "day";
        public static final String DEMO_COLLECT_BIRTH_MONTH = "month";
        public static final String DEMO_COLLECT_BIRTH_YEAR = "year";
        public static final String DISPLAY_PHONE_NUMBER = "displayPhoneNumber";
        public static final String DISPLAY_SIGN_UP_URL = "displaySignUpUrl";
        public static final String DOB_SCOPE = "dateOfBirth";
        public static final String EMAIL = "email";
        public static final String EMAIL_CONSENT_LABEL_ID = "emailConsentLabelId";
        public static final String EMAIL_PREFERENCE = "emailPreference";
        public static final String EMVCO_3DS_AUTHENTICATION_WINDOW_SIZE = "emvco3dsAuthenticationWindowSize";
        public static final String EMVCO_3DS_DEVICE_DATA_RESPONSE_FALLBACK = "emvco3dsDeviceDataResponseFallback";
        public static final String ERROR_CODE = "errorCode";
        public static final String EXISTING_LANGUAGES = "existingLanguages";
        public static final String EXPIRATION_IN_MINUTES = "expirationInMinutes";
        public static final String EXPIRY_IN_MINUTES = "expiryInMinutes";
        public static final String FIRST_NAME = "firstName";
        public static final String FORMATTED_LOCATION_NAME = "formattedLocationName";
        public static final String FORMATTED_PHONE_NUMBER = "formattedPhoneNumber";
        public static final String FUJI_CTAS = "fuji_ctas";
        public static final String GENDER = "gender";
        public static final String GIFT_AMOUNT = "giftAmount";
        public static final String GIFT_CODE_PLAN = "giftCodePlan";
        public static final String HAS_ACCEPTED_TERMS_OF_USE = "hasAcceptedTermsOfUse";
        public static final String HAS_ADS = "hasAds";
        public static final String HAS_CONSENTED_TO_DEMO_COLLECTION = "hasConsentedToDemographicInfoCollection";
        public static final String HAS_ELIGIBLE_OFFER = "hasEligibleOffer";
        public static final String HAS_LCFM_OFFER = "hasLcfmOffer";
        public static final Field INSTANCE = new Field();
        public static final String INTERNATIONAL_TRANSACTION_MESSAGE = "internationalTransactionMessage";
        public static final String IS_3DS_CHARGE = "is3DSCharge";
        public static final String IS_PAYMENT_PICKER_ERROR = "isPaymentPickerError";
        public static final String IS_PRETAX = "isPretax";
        public static final String IS_REG_READ_ONLY = "isRegReadOnly";
        public static final String IS_SCHUFA = "isSchufa";
        public static final String LANGUAGES = "allLanguages";
        public static final String LANG_ID = "id";
        public static final String LANG_NAME = "name";
        public static final String LAST_FOUR = "lastFour";
        public static final String LAST_NAME = "lastName";
        public static final String LAST_USED_DEVICE_NAME = "lastUsedDeviceName";
        public static final String LAST_USED_PROFILE_NAME = "lastUsedProfileName";
        public static final String LOCALIZED_NAME = "localizedName";
        public static final String LOCALIZED_PLAN_NAME = "localizedPlanName";
        public static final String LOGIN_BANNER = "loginBanner";
        public static final String MD = "md";
        public static final String MESSAGE = "message";
        public static final String MESSAGES = "messages";
        public static final String MESSAGES_FROM_DYNECOM = "messagesFromDynecom";
        public static final String MFA_DELIVERY_TYPE = "mfaDeliveryType";
        public static final String MFA_TARGET_MODE = "mfaTargetMode";
        public static final String MIN_AGE = "minAge";
        public static final String MOBILE_PHONE = "mobilePhone";
        public static final String MOP_SUB_TYPE = "mopSubType";
        public static final String MOP_TYPE = "mopType";
        public static final String NEXT_MODE = "nextMode";
        public static final String NEXT_NUDGE_HOURS = "nextNudgeHours";
        public static final String OFFER_ID = "offerId";
        public static final String OFFER_PRICE = "offerPrice";
        public static final String OFFER_TYPE = "offerType";
        public static final String OWNER_HOUSEHOLDER_SUMMARY = "ownerHouseholdSummary";
        public static final String OWNER_HOUSEHOLD_PROFILE_ICON_URL = "ownerHouseholdProfileIconUrl";
        public static final String PARTNER_DISPLAY_NAME = "partnerDisplayName";
        public static final String PASSWORD = "password";
        public static final String PAYMENT_CHOICE = "paymentChoice";
        public static final String PAYMENT_CHOICE_MODE = "paymentChoiceMode";
        public static final String PAYMENT_PROVIDER_DISPLAY_NAME = "paymentProviderDisplayName";
        public static final String PAYPAL_EMAIL = "paypalEmail";
        public static final String PA_RES = "paRes";
        public static final String PERSONAL_INFO_ABROAD = "personalInfoAbroad";
        public static final String PERSONAL_INFO_GATEWAY = "personalInfoGateway";
        public static final String PERSONAL_INFO_THIRD_PARTIES = "personalInfoThirdParties";
        public static final String PHONE_CODES = "phoneCodes";
        public static final String PHONE_NUMBER = "phoneNumber";
        public static final String PIN = "pin";
        public static final String PIN_REQUIRED_RATING = "pinRequiredRating";
        public static final String PIPC_CONSENT = "pipcConsent";
        public static final String PLAN_CHOICE = "planChoice";
        public static final String PLAN_DESCRIPTION = "planDescription";
        public static final String PLAN_DIALOG_UNAVAILABLE = "showPlanUnavailableDialog";
        public static final String PLAN_DURATION = "planDuration";
        public static final String PLAN_FALLBACK_ENABLED = "planFallbackEnabled";
        public static final String PLAN_ID = "planId";
        public static final String PLAN_OVERRIDEN_BY_GIFT_CODE = "planOverriddenByGiftCode";
        public static final String PLAN_PRICE = "planPrice";
        public static final String PLAN_PRICE_AMOUNT = "planPriceAmount";
        public static final String POLL_AFTER_MS = "pollAfterMS";
        public static final String POSTAL_CODE = "postalCode";
        public static final String PREFERRED_LANGUAGES = "preferredLanguages";
        public static final String PROFILE_1_IS_KIDS = "profile1IsKids";
        public static final String PROFILE_1_NAME = "profile1Name";
        public static final String PROFILE_2_IS_KIDS = "profile2IsKids";
        public static final String PROFILE_2_NAME = "profile2Name";
        public static final String PROFILE_3_IS_KIDS = "profile3IsKids";
        public static final String PROFILE_3_NAME = "profile3Name";
        public static final String PROFILE_4_IS_KIDS = "profile4IsKids";
        public static final String PROFILE_4_NAME = "profile4Name";
        public static final String PROFILE_NAME = "profileName";
        public static final String PROFILE_OWNER_NAME = "ownerName";
        public static final String RECENTLY_REGISTERED = "recentlyRegistered";
        public static final String RECOGNIZED_CURRENT_MEMBER = "recognizedCurrentMember";
        public static final String RECOGNIZED_FORMER_MEMBER = "recognizedFormerMember";
        public static final String RECOGNIZED_NEVER_MEMBER = "recognizedNeverMember";
        public static final String REDIRECT_PATH = "redirectPath";
        public static final String REFUND_DAYS_REMAINING = "refundDaysRemaining";
        public static final String REGION_BE = "be";
        public static final String REGION_EU = "eu";
        public static final String REGION_FR = "fr";
        public static final String REGION_KR = "kr";
        public static final String REGION_NL = "nl";
        public static final String REGION_US = "us";
        public static final String RESENT_MFA_CHALLENGE = "resentMfaChallenge";
        public static final String RIGHT_OF_WITHDRAWAL = "rightOfWithdrawal";
        public static final String SECONDARY_LANGUAGES = "secondaryLanguages";
        public static final String SECURITY_CODE = "securityCode";
        public static final String SELECTIONS = "selections";
        public static final String SERVER_CURRENT_TIME_STAMP = "serverTimestampInMillis";
        public static final String SHOW_CARD_CHAINING_DISCLOSURE = "showCardChainingDisclosure";
        public static final String SHOW_MANDATE_MODIFICATION_TERM_OF_USE = "showMandateModificationTermOfUse";
        public static final String SHOW_MESSAGE = "showMessage";
        public static final String SHOW_OPEN_EMAIL_CLIENT_BUTTON = "showOpenEmailClientButton";
        public static final String SHOW_OPEN_EMAIL_CLIENT_LINK = "showOpenEmailClientLink";
        public static final String SMS_CODE = "smsCode";
        public static final String SMS_CONSENT = "smsConsent";
        public static final String SORT_ORDER = "sortOrder";
        public static final String STEPS = "steps";
        public static final String STRING = "string";
        public static final String TARGET_FLOW = "targetFlow";
        public static final String TARGET_MODE = "targetMode";
        public static final String TARGET_NETFLIX_CLIENT_PLATFORM = "targetNetflixClientPlatform";
        public static final String TERMS_OF_USE = "termsOfUse";
        public static final String TERMS_OF_USE_MINIMUM_VERIFICATION_AGE = "termsOfUseMinimumVerificationAge";
        public static final String TERMS_OF_USE_REGION = "termsOfUseRegion";
        public static final String TRAVEL_DAYS_OF_ACCESS = "travelDaysOfAccess";
        public static final String UPI_ID = "upiId";
        public static final String URL = "url";
        public static final String USER_MESSAGE = "userMessage";
        public static final String VIDEOS = "videos";
        public static final String VIDEO_ID = "videoId";
        public static final String VIDEO_TITLE = "title";
        public static final String WARN_NO_FREE_TRIAL = "warnNoFreeTrial";
        public static final String WILL_START_MEMBERSHIP = "willStartMembership";

        private Field() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Message {
        public static final String CTA_BUTTON = "ctaButton";
        public static final String CTA_BUTTON_FORMER = "ctaButton_former";
        public static final String CTA_BUTTON_LABEL = "ctaButtonLabel";
        public static final String CTA_BUTTON_NEVER = "ctaButton_never";
        public static final String CTA_BUTTON_SUBHEAD = "ctaButtonSubhead";
        public static final Message INSTANCE = new Message();
        public static final String REG_SUBTITLE = "registrationFormSubtitle";
        public static final String REG_TITLE = "registrationFormTitle";
        public static final String STRING = "string";
        public static final String VALUE_PROP_MESSAGE = "valuePropMessage";
        public static final String VALUE_PROP_MESSAGE_SECONDARY = "valuePropMessageSecondary";

        private Message() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Action {
        public static final String BACK_ACTION = "backAction";
        public static final String CONTINUE_ACTION = "continueAction";
        public static final String EMAIL_CALL_TO_ACTION = "EMAIL_CODE_VALIDATION";
        public static final String EMAIL_OTP_ACTION = "createEmailOtpChallengeAction";
        public static final String GO_TO_NON_MEMBER_HOME_ACTION = "goToNonMemberHomeAction";
        public static final Action INSTANCE = new Action();
        public static final String JOIN_NOW = "joinNow";
        public static final String LOGIN_ACTION = "loginAction";
        public static final String LOGIN_FP_ACTION = "loginFPAction";
        public static final String MATURITY_PIN_ACTION = "maturityPinAction";
        public static final String MHU_TROUBLESHOOT_ACTION = "mhuTroubleshootMobileAction";
        public static final String MHU_VERIFY_TRAVEL_ACTION = "mhuVerifyTravelAction";
        public static final String NEXT_ACTION = "nextAction";
        public static final String PREV_ACTION = "prevAction";
        public static final String REGISTER_ONLY_ACTION = "registerOnlyAction";
        public static final String RESEND_CODE_ACTION = "resendCodeAction";
        public static final String RESUME_MEMBERSHIP_ACTION = "resumeMembershipAction";
        public static final String SAVE_ACTION = "saveAction";
        public static final String SAVE_FP_ACTION = "saveFPAction";
        public static final String SIGN_OUT_ACTION = "signOutAction";
        public static final String SKIP_ACTION = "skipAction";
        public static final String SKIP_WAIT_ACTION = "skipWaitAction";
        public static final String SMS_CALL_TO_ACTION = "SMS_CODE_VALIDATION";
        public static final String SMS_OTP_ACTION = "createSmsOtpChallengeAction";
        public static final String START_ACTION = "startAction";
        public static final String START_MEMBERSHIP = "startMembershipAction";
        public static final String TEXT_SIGN_UP_LINK_ACTION = "textSignUpLinkAction";
        public static final String UNPAUSE_MEMBERSHIP_ACTION = "unpauseMembershipAction";
        public static final String UPI_START_MEMBERSHIP_ACTION = "upiStartMembershipAction";
        public static final String VERIFY_ACTION = "verifyAction";

        private Action() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Key {
        public static final String AB_ALLOCATIONS = "abAllocations";
        public static final String CURRENT_STEP = "currentStep";
        public static final String FIELDS = "fields";
        public static final String FIELD_GROUP = "fieldGroup";
        public static final String HEADER_SUBTITLE_MESSAGE = "headerSubtitleMessage";
        public static final String HEADER_TITLE_MESSAGE = "headerTitleMessage";
        public static final Key INSTANCE = new Key();
        public static final String NETFLIX_CLIENT_PLATFORM = "netflixClientPlatform";
        public static final String TOTAL_STEPS = "totalSteps";
        public static final String VALUE = "value";

        private Key() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class AndroidPlatform {
        public static final String ANDROID_NATIVE = "androidNative";
        public static final String ANDROID_WEBVIEW = "androidWebView";
        public static final AndroidPlatform INSTANCE = new AndroidPlatform();

        private AndroidPlatform() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class FujiCardType {
        public static final FujiCardType INSTANCE = new FujiCardType();
        public static final String VLV = "vlv";

        private FujiCardType() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class Language {
        public static final String ENGLISH_EN = "en";
        public static final Language INSTANCE = new Language();
        public static final String SPANISH_ES = "es";

        private Language() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class PaymentMethod {
        public static final String CO_DEBIT = "coDebitOption";
        public static final String CREDIT_CARD = "creditOption";
        public static final String DCB = "dcbOption";
        public static final String DE_DEBIT = "deDebitOption";
        public static final String GIFT_OPTION = "giftOption";
        public static final String IDEAL = "idealOption";
        public static final PaymentMethod INSTANCE = new PaymentMethod();
        public static final String MOBILE_WALLET_OPTION = "mobileWalletOption";
        public static final String PAYPAL = "paypalOption";
        public static final String UPI_PAYMENT_OPTION = "upiPaymentOption";

        private PaymentMethod() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class MopType {
        public static final String EU_DIRECT_DEBIT = "EU_DIRECT_DEBIT";
        public static final MopType INSTANCE = new MopType();

        private MopType() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class WebViewPaths {
        public static final String EMVCO_DATA_COLLECTION_FALLBACK_PATH = "mobilesignup/emvcodevicefallbackdata";
        public static final WebViewPaths INSTANCE = new WebViewPaths();

        private WebViewPaths() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class ErrorStringsWithArg {
        public static final ErrorStringsWithArg INSTANCE = new ErrorStringsWithArg();
        private static final String[] CARRIER = {"invalid_phone", "mop_disallowed", "dcb_pai_already_used", "dcb_insufficient_funds", "invalid_customerid"};

        public final String[] getCARRIER() {
            return CARRIER;
        }

        private ErrorStringsWithArg() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class OfferType {
        public static final OfferType INSTANCE = new OfferType();
        public static final String LOW_COST_FIRST_MONTH = "LCFM";

        private OfferType() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class MemberStatus {
        public static final String CURRENT_MEMBER = "CURRENT_MEMBER";
        public static final MemberStatus INSTANCE = new MemberStatus();

        private MemberStatus() {
        }
    }
}
