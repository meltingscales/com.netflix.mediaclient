package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.HashMap;
import java.util.List;
import o.C1044Mm;
import o.C8118deO;
import o.C8168dfL;

/* loaded from: classes.dex */
public class SignInConfigData {
    private static final int MAX_PWD_LEN = 50;
    private static final int MAX_USER_LOGIN_ID_LEN = 50;
    private static final int MIN_PWD_LEN = 4;
    private static final int MIN_USER_LOGIN_ID_LEN = 5;
    private static final String TAG = "nf_config_signin";
    @SerializedName("fields")
    public Fields fields;
    @SerializedName("flwssn")
    public String flwssn;
    @SerializedName("mode")
    public String nextStep;

    /* loaded from: classes4.dex */
    public static class NmAbConfig {
        @SerializedName("cellId")
        public int cellId;
        @SerializedName("testId")
        public int testId;
    }

    /* loaded from: classes.dex */
    public class Fields {
        @SerializedName("abAllocations")
        public List<NmAbConfig> abAllocations;
        @SerializedName(SignupConstants.Action.BACK_ACTION)
        public CachedMode backAction;
        @SerializedName("isPortraitLocked")
        public BooleanField isPortraitLocked;
        @SerializedName(SignupConstants.Field.PASSWORD)
        public Rules password;
        @SerializedName("recaptchaSitekey")
        public StringField recaptchaSiteKey;
        @SerializedName(SignupConstants.Mode.SIGNUP_BLOCKED)
        public BooleanField signupBlocked;
        @SerializedName("startingDisplayEnum")
        public StringField startingDisplayEnum;
        @SerializedName("useAndroidNative")
        public BooleanField useAndroidNative;
        @SerializedName("useDarkHeader")
        public BooleanField useDarkHeader;
        @SerializedName("userLoginId")
        public Rules userLoginId;

        public Fields() {
        }
    }

    /* loaded from: classes4.dex */
    public class Rules {
        @SerializedName("fieldType")
        public String fieldType;
        @SerializedName("maxLength")
        public int maxLength;
        @SerializedName("minLength")
        public int minLength;

        public Rules() {
        }
    }

    /* loaded from: classes4.dex */
    public class StringField {
        @SerializedName("value")
        public String value;

        public StringField() {
        }
    }

    /* loaded from: classes4.dex */
    public class BooleanField {
        @SerializedName("value")
        public Boolean value;

        public BooleanField() {
        }
    }

    /* loaded from: classes6.dex */
    public class CachedMode {
        @SerializedName("cached")
        public HashMap<String, Object> cached;
        @SerializedName("hidden")
        public boolean hidden;

        public CachedMode() {
        }
    }

    public static SignInConfigData fromJsonString(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        return (SignInConfigData) C8118deO.a().fromJson(str, (Class<Object>) SignInConfigData.class);
    }

    public String toJsonString() {
        return C8118deO.a().toJson(this);
    }

    private int getMinUserLoginIdLen() {
        Rules rules;
        int i;
        Fields fields = this.fields;
        if (fields == null || (rules = fields.userLoginId) == null || (i = rules.minLength) <= 0) {
            return 5;
        }
        return i;
    }

    private int getMaxUserLoginIdLen() {
        Rules rules;
        int i;
        Fields fields = this.fields;
        if (fields == null || (rules = fields.userLoginId) == null || (i = rules.maxLength) <= 0) {
            return 50;
        }
        return i;
    }

    private int getMinPwdLen() {
        Rules rules;
        int i;
        Fields fields = this.fields;
        if (fields == null || (rules = fields.password) == null || (i = rules.minLength) <= 0) {
            return 4;
        }
        return i;
    }

    private int getMaxPwdLen() {
        Rules rules;
        int i;
        Fields fields = this.fields;
        if (fields == null || (rules = fields.password) == null || (i = rules.maxLength) <= 0) {
            return 50;
        }
        return i;
    }

    public boolean isUserLoginIdValid(String str) {
        return !C8168dfL.g(str) && str.length() >= getMinUserLoginIdLen();
    }

    public boolean isPasswordValid(String str) {
        return !C8168dfL.g(str) && str.length() >= getMinPwdLen();
    }

    public boolean isPortraitLocked() {
        BooleanField booleanField;
        Boolean bool;
        Fields fields = this.fields;
        if (fields == null || (booleanField = fields.isPortraitLocked) == null || (bool = booleanField.value) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isAndroidNative() {
        BooleanField booleanField;
        Boolean bool;
        Fields fields = this.fields;
        if (fields == null || (booleanField = fields.useAndroidNative) == null || (bool = booleanField.value) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean useDarkHeader() {
        BooleanField booleanField;
        Boolean bool;
        Fields fields = this.fields;
        if (fields == null || (booleanField = fields.useDarkHeader) == null || (bool = booleanField.value) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean isSignupBlocked() {
        BooleanField booleanField;
        Boolean bool;
        Fields fields = this.fields;
        if (fields == null || (booleanField = fields.signupBlocked) == null || (bool = booleanField.value) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public String getRecaptchaSiteKey() {
        StringField stringField;
        Fields fields = this.fields;
        if (fields == null || (stringField = fields.recaptchaSiteKey) == null) {
            return null;
        }
        return stringField.value;
    }

    public OneTimePasscodeLayoutTypeAb54131 getOTPLayoutType() {
        String str = this.nextStep;
        if (str == null || this.fields == null) {
            return OneTimePasscodeLayoutTypeAb54131.NONE;
        }
        if (str.equals(SignInData.MODE_LOGIN_USER_ID_ENTRY)) {
            return OneTimePasscodeLayoutTypeAb54131.SHOW_NEXT_ONLY;
        }
        StringField stringField = this.fields.startingDisplayEnum;
        if (stringField == null) {
            return OneTimePasscodeLayoutTypeAb54131.NONE;
        }
        try {
            return (OneTimePasscodeLayoutTypeAb54131) Enum.valueOf(OneTimePasscodeLayoutTypeAb54131.class, stringField.value);
        } catch (IllegalArgumentException e) {
            C1044Mm.e(TAG, "provided otpLayoutVariant not valid", e);
            return OneTimePasscodeLayoutTypeAb54131.NONE;
        }
    }

    public boolean isOtpFlow() {
        return getOTPLayoutType() != OneTimePasscodeLayoutTypeAb54131.NONE;
    }
}
