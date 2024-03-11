package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import o.C1044Mm;
import o.C8123deT;
import o.C8168dfL;
import o.InterfaceC5282bvn;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class UserAccount implements InterfaceC5282bvn {
    private static final String TAG = "UserAccount";
    public SubtitlePreference subtitleDefaults;
    public Summary summary = new Summary();

    public SubtitlePreference getSubtitleDefaults() {
        return this.subtitleDefaults;
    }

    /* loaded from: classes4.dex */
    public class Summary {
        private boolean canCreateUserProfile;
        private String countryOfSignUp;
        public boolean isAgeVerified;
        @SerializedName(UserAccountConstants.FIELD_NOT_ACTIVE_OR_HOLD)
        private boolean isNotActiveOrOnHold;
        private long memberSince;
        private boolean mobileOnlyPlan;
        private String userGuid;

        public Summary() {
        }
    }

    @Override // o.InterfaceC5282bvn
    public String getCountryOfSignUp() {
        Summary summary = this.summary;
        if (summary == null) {
            return null;
        }
        return summary.countryOfSignUp;
    }

    @Override // o.InterfaceC5282bvn
    public String getUserGuid() {
        Summary summary = this.summary;
        if (summary == null) {
            return null;
        }
        return summary.userGuid;
    }

    @Override // o.InterfaceC5282bvn
    public long memberSince() {
        Summary summary = this.summary;
        if (summary == null) {
            return 0L;
        }
        return summary.memberSince;
    }

    @Override // o.InterfaceC5282bvn
    public boolean isAgeVerified() {
        Summary summary = this.summary;
        if (summary == null) {
            return false;
        }
        return summary.isAgeVerified;
    }

    @Override // o.InterfaceC5282bvn
    public boolean canCreateUserProfile() {
        Summary summary = this.summary;
        return summary != null && summary.canCreateUserProfile;
    }

    @Override // o.InterfaceC5282bvn
    public InterfaceC5282bvn updateCanCreateUserProfile(boolean z) {
        if (canCreateUserProfile() == z) {
            return null;
        }
        UserAccount userAccount = new UserAccount(toString());
        userAccount.summary.canCreateUserProfile = z;
        return userAccount;
    }

    @Override // o.InterfaceC5282bvn
    public boolean isNotActiveOrOnHold() {
        Summary summary = this.summary;
        if (summary == null) {
            return false;
        }
        return summary.isNotActiveOrOnHold;
    }

    @Override // o.InterfaceC5282bvn
    public boolean isMobileOnlyPlan() {
        Summary summary = this.summary;
        if (summary == null) {
            return false;
        }
        return summary.mobileOnlyPlan;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UserAccountConstants.FIELD_USER_GUID, getUserGuid());
            jSONObject.put(UserAccountConstants.FIELD_MEMBER_SINCE, memberSince());
            jSONObject.put(UserAccountConstants.FIELD_SIGNUP_COUNTRY, getCountryOfSignUp());
            jSONObject.put(UserAccountConstants.FIELD_AGE_VERIFIED, isAgeVerified());
            jSONObject.put(UserAccountConstants.FIELD_MOBILE_ONLY_PLAN, isMobileOnlyPlan());
            jSONObject.put(UserAccountConstants.FIELD_NOT_ACTIVE_OR_HOLD, isNotActiveOrOnHold());
            SubtitlePreference subtitlePreference = this.subtitleDefaults;
            if (subtitlePreference != null) {
                jSONObject.put(SubtitlePreference.FIELD_SUBTITLE_OVERRIDE, subtitlePreference.toString());
            }
            jSONObject.put(UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE, canCreateUserProfile());
        } catch (JSONException e) {
            C1044Mm.e(TAG, "failed in json string " + e);
        }
        C1044Mm.e(TAG, "UserAccount string=" + jSONObject.toString());
        return jSONObject.toString();
    }

    public UserAccount(String str) {
        try {
            JSONObject jSONObject = C8168dfL.g(str) ? new JSONObject() : new JSONObject(str);
            SubtitlePreference subtitlePreference = null;
            this.summary.userGuid = C8123deT.a(jSONObject, UserAccountConstants.FIELD_USER_GUID, (String) null);
            this.summary.memberSince = C8123deT.d(jSONObject, UserAccountConstants.FIELD_MEMBER_SINCE, 0L);
            this.summary.countryOfSignUp = C8123deT.a(jSONObject, UserAccountConstants.FIELD_SIGNUP_COUNTRY, (String) null);
            this.summary.isAgeVerified = C8123deT.a(jSONObject, UserAccountConstants.FIELD_AGE_VERIFIED, false);
            this.summary.isNotActiveOrOnHold = C8123deT.a(jSONObject, UserAccountConstants.FIELD_NOT_ACTIVE_OR_HOLD, false);
            this.summary.mobileOnlyPlan = C8123deT.a(jSONObject, UserAccountConstants.FIELD_MOBILE_ONLY_PLAN, false);
            String a = C8123deT.a(jSONObject, SubtitlePreference.FIELD_SUBTITLE_OVERRIDE, (String) null);
            if (!C8168dfL.g(a)) {
                subtitlePreference = new SubtitlePreference(a);
            }
            this.subtitleDefaults = subtitlePreference;
            this.summary.canCreateUserProfile = C8123deT.a(jSONObject, UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE, false);
        } catch (JSONException e) {
            C1044Mm.e(TAG, "failed to create json string=" + str + " exception =" + e);
        }
    }

    public UserAccount() {
    }
}
