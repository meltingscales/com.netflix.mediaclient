package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInConfigData;
import com.netflix.mediaclient.util.net.AuthCookieHolder;
import java.util.List;
import o.C8168dfL;

/* loaded from: classes4.dex */
public class SignInData {
    public static final String ERROR_ACCOUNT_PASSWORD_NOT_SET = "account_password_not_set";
    public static final String ERROR_DVD_MEMBER_REDIRECT = "dvd_member_redirect";
    public static final String ERROR_FORMER_MEMBER_CONSUMPTION = "former_member_consumption_only";
    public static final String ERROR_FORMER_MEMBER_REDIRECT = "former_member_redirect";
    public static final String ERROR_INCORRECT_PASSWORD = "incorrect_password";
    public static final String ERROR_NEVER_MEMBER_CONSUMPTION = "never_member_consumption_only";
    public static final String ERROR_NEVER_MEMBER_REDIRECT = "never_member_redirect";
    public static final String ERROR_THROTTLING = "throttling_failure";
    public static final String ERROR_UNRECOGNIZED_CONSUMPTION = "unrecognized_email_consumption_only";
    public static final String ERROR_UNRECOGNIZED_EMAIL = "unrecognized_email";
    public static final String ERROR_UNRECOGNIZED_PHONE = "unrecognized_phone_number";
    public static final String ERROR_UNRECOGNIZED_REDIRECT = "unrecognized_email_redirect";
    public static final String FIELD_AB_ALLOCATIONS = "abAllocations";
    public static final String FIELD_ERROR_CODE = "errorCode";
    public static final String FIELD_FIELDS = "fields";
    public static final String FIELD_FLOW = "flow";
    public static final String FIELD_FLWSSN = "flwssn";
    public static final String FIELD_MODE = "mode";
    public static final String FIELD_VALUE = "value";
    public static final String FLOW_CLIENT = "client";
    public static final String MODE_ENTER_CREDENTIALS = "enterMemberCredentials";
    public static final String MODE_ENTER_CREDENTIALS_REFRESH = "enterMemberCredentialsRefresh";
    public static final String MODE_LEARN_MORE_CONFIRM = "learnMoreConfirm";
    public static final String MODE_LOGIN_OPTIONS = "loginOptions";
    public static final String MODE_LOGIN_OTP_ENTRY = "loginOtpEntry";
    public static final String MODE_LOGIN_USER_ID_ENTRY = "loginUserIdEntry";
    public static final String MODE_MEMBER_HOME = "memberHome";
    public static final String MODE_WELCOME = "welcome";
    public static final String MODE_WELCOME_BACK_CONFIRM = "welcomeBackConfirm";
    public static final String TAG = "nf_signin";
    public AuthCookieHolder authCookieHolder;
    @SerializedName("fields")
    public Fields fields;
    @SerializedName("flow")
    public String flow;
    @SerializedName("flwssn")
    public String flwssn;
    @SerializedName("mode")
    public String mode;

    public String toString() {
        return "SignInData{mode='" + this.mode + "', flow='" + this.flow + "', flwssn='" + this.flwssn + "', fields=" + this.fields + ", authCookieHolder=" + this.authCookieHolder + '}';
    }

    /* loaded from: classes4.dex */
    public class Fields {
        @SerializedName("abAllocations")
        public List<SignInConfigData.NmAbConfig> abAllocations;
        @SerializedName("errorCode")
        public ErrorCode errorCode;

        public Fields() {
        }
    }

    /* loaded from: classes4.dex */
    class ErrorCode {
        @SerializedName("value")
        public String value;

        ErrorCode() {
        }
    }

    public boolean isSignInSuccessful() {
        return C8168dfL.d(FLOW_CLIENT, this.flow) && C8168dfL.d("memberHome", this.mode);
    }

    public boolean shouldRetrySignIn() {
        return C8168dfL.d("enterMemberCredentials", this.mode);
    }

    public boolean shouldTrySignUp() {
        return C8168dfL.d("welcome", this.mode) || C8168dfL.d("learnMoreConfirm", this.mode) || C8168dfL.d("welcomeBackConfirm", this.mode);
    }

    public boolean isThrottled() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !"throttling_failure".equals(errorCode.value)) ? false : true;
    }

    public boolean isEmailUnrecognised() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_UNRECOGNIZED_EMAIL.equals(errorCode.value)) ? false : true;
    }

    public boolean isPhoneUnrecognized() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_UNRECOGNIZED_PHONE.equals(errorCode.value)) ? false : true;
    }

    public boolean isPasswordIncorrect() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_INCORRECT_PASSWORD.equals(errorCode.value)) ? false : true;
    }

    public boolean isAccountWithNoPasswordSet() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_ACCOUNT_PASSWORD_NOT_SET.equals(errorCode.value)) ? false : true;
    }

    public boolean isConsumptionOnlyFormerMember() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_FORMER_MEMBER_CONSUMPTION.equals(errorCode.value)) ? false : true;
    }

    public boolean isRedirectOnlyFormerMember() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_FORMER_MEMBER_REDIRECT.equals(errorCode.value)) ? false : true;
    }

    public boolean isConsumptionOnlyNeverMember() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_NEVER_MEMBER_CONSUMPTION.equals(errorCode.value)) ? false : true;
    }

    public boolean isRedirectOnlyNeverMember() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_NEVER_MEMBER_REDIRECT.equals(errorCode.value)) ? false : true;
    }

    public boolean isRedirectOnlyDVDMember() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_DVD_MEMBER_REDIRECT.equals(errorCode.value)) ? false : true;
    }

    public boolean isConsumptionOnlyUnrecognizedEmail() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_UNRECOGNIZED_CONSUMPTION.equals(errorCode.value)) ? false : true;
    }

    public boolean isRedirectOnlyUnrecognizedEmail() {
        ErrorCode errorCode;
        Fields fields = this.fields;
        return (fields == null || (errorCode = fields.errorCode) == null || !ERROR_UNRECOGNIZED_REDIRECT.equals(errorCode.value)) ? false : true;
    }

    public boolean isValid() {
        AuthCookieHolder authCookieHolder = this.authCookieHolder;
        return authCookieHolder != null && authCookieHolder.hasCookies();
    }
}
