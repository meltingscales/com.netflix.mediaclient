package com.netflix.mediaclient.service.webclient.model.leafs;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.user.ProfileType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import o.C1044Mm;
import o.C8123deT;
import o.C8168dfL;
import o.InterfaceC1593aHa;
import o.InterfaceC5283bvo;
import o.InterfaceC5284bvp;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class UserProfile implements InterfaceC5283bvo {
    private static final String FIELD_AUTHORIZATION_TOKENS = "tokens";
    private static final String FIELD_AUTOPLAY_ON = "autoPlayOn";
    private static final String FIELD_AVATAR_KEY = "avatarKey";
    private static final String FIELD_AVATAR_URL = "avatarUrl";
    private static final String FIELD_DISABLE_VIDEO_MERCH_AUTOPLAY = "disableVideoMerchAutoPlay";
    private static final String FIELD_EXPERIENCE = "experienceType";
    private static final String FIELD_HAS_TITLE_RESTRICTIONS = "hasTitleRestrictions";
    private static final String FIELD_IS_DEFAULT_KIDS_PROFILE = "isDefaultKidsProfile";
    private static final String FIELD_IS_PRIMARY = "isPrimaryProfile";
    private static final String FIELD_IS_PROFILE_CREATION_LOCKED = "isProfileCreationLocked";
    private static final String FIELD_IS_PROFILE_LOCKED = "isProfileLocked";
    private static final String FIELD_LANGUAGES = "languages";
    private static final String FIELD_MATURITY_HIGHEST = "isHighest";
    private static final String FIELD_MATURITY_LABEL = "label";
    private static final String FIELD_MATURITY_LEVEL = "level";
    private static final String FIELD_MATURITY_LOWEST = "isLowest";
    private static final String FIELD_MATURITY_OBJECT = "maturity";
    private static final String FIELD_PROFILE_EMAIL = "email";
    private static final String FIELD_PROFILE_GUID = "profileId";
    private static final String FIELD_PROFILE_LOCK_PIN = "profileLockPin";
    private static final String FIELD_PROFILE_NAME = "profileName";
    private static final String FIELD_SECONDARY_LANGUAGES = "secondaryLanguages";
    private static final String TAG = "UserProfile";
    public Operation operation;
    public InterfaceC5284bvp subtitlePreference;
    public Summary summary;

    @Override // o.InterfaceC5283bvo
    public InterfaceC5284bvp getSubtitlePreference() {
        return this.subtitlePreference;
    }

    /* loaded from: classes4.dex */
    public class Summary {
        @SerializedName("avatarName")
        private String avatarKey;
        private String avatarUrl;
        private boolean disableVideoMerchAutoPlay;
        public ProfileType enumType;
        private String experienceType;
        private boolean hasTitleRestrictions;
        private boolean isAutoPlayEnabled;
        private boolean isDefaultKidsProfile;
        private boolean isPrimaryProfile;
        private boolean isProfileCreationLocked;
        private boolean isProfileLocked;
        public List<Language> languages;
        private Maturity maturity;
        @SerializedName("email")
        private String profileEmail;
        @SerializedName(UserProfile.FIELD_PROFILE_GUID)
        private String profileGuid;
        private String profileLockPin;
        private String profileName;
        public List<String> secondaryLanguages;

        public Summary() {
        }
    }

    /* loaded from: classes6.dex */
    public class Operation {
        public String msg;
        public String status;

        public Operation() {
        }
    }

    /* loaded from: classes4.dex */
    public class Language {
        public String code;

        public Language(String str) {
            this.code = str;
        }
    }

    /* loaded from: classes4.dex */
    public class Maturity {
        private boolean isHighest;
        private boolean isLowest;
        private List<String> labels = new ArrayList();
        private int level;

        public Maturity() {
        }
    }

    @Override // o.InterfaceC5283bvo
    public boolean isProfileValid() {
        List<Language> list;
        Summary summary = this.summary;
        return (summary == null || C8168dfL.g(summary.profileGuid) || C8168dfL.g(this.summary.avatarUrl) || (list = this.summary.languages) == null || list.isEmpty() || this.summary.maturity == null) ? false : true;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isProfileGuidValid() {
        Summary summary = this.summary;
        return (summary == null || C8168dfL.g(summary.profileGuid)) ? false : true;
    }

    @Override // o.InterfaceC5283bvo
    public String getProfileName() {
        Summary summary = this.summary;
        return (summary == null || summary.profileName == null) ? "" : C8168dfL.b(this.summary.profileName);
    }

    @Override // o.InterfaceC5283bvo
    public String getProfileEmail() {
        Summary summary = this.summary;
        if (summary == null) {
            return null;
        }
        return summary.profileEmail;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isPrimaryProfile() {
        Summary summary = this.summary;
        return summary != null && summary.isPrimaryProfile;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isDefaultKidsProfile() {
        Summary summary = this.summary;
        return summary != null && summary.isDefaultKidsProfile;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isAutoPlayEnabled() {
        Summary summary = this.summary;
        return summary != null && summary.isAutoPlayEnabled;
    }

    @Override // o.InterfaceC5283bvo
    public int getMaturityValue() {
        Summary summary = this.summary;
        if (summary == null || summary.maturity == null) {
            return -1;
        }
        return this.summary.maturity.level;
    }

    @Override // o.InterfaceC5283bvo
    public List<String> getMaturityLabels() {
        Summary summary = this.summary;
        if (summary == null || summary.maturity == null) {
            return null;
        }
        return this.summary.maturity.labels;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isMaturityLowest() {
        Summary summary = this.summary;
        return (summary == null || summary.maturity == null || !this.summary.maturity.isLowest) ? false : true;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isMaturityHighest() {
        Summary summary = this.summary;
        return (summary == null || summary.maturity == null || !this.summary.maturity.isHighest) ? false : true;
    }

    public String getExperienceType() {
        Summary summary = this.summary;
        if (summary == null) {
            return null;
        }
        return summary.experienceType;
    }

    @Override // o.InterfaceC5283bvo
    public String getProfileGuid() {
        Summary summary = this.summary;
        return (summary == null || summary.profileGuid == null) ? "" : this.summary.profileGuid;
    }

    @Override // o.InterfaceC5283bvo
    public String getAvatarUrl() {
        Summary summary = this.summary;
        if (summary == null) {
            return null;
        }
        return summary.avatarUrl;
    }

    @Override // o.InterfaceC5283bvo
    public String getAvatarKey() {
        Summary summary = this.summary;
        if (summary == null) {
            return null;
        }
        return summary.avatarKey;
    }

    @Override // o.InterfaceC5283bvo
    public ProfileType getProfileType() {
        Summary summary = this.summary;
        if (summary != null) {
            if (summary.enumType == null) {
                summary.enumType = ProfileType.create(summary.experienceType);
            }
            return this.summary.enumType;
        }
        return ProfileType.STANDARD;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isKidsProfile() {
        return getProfileType() == ProfileType.JFK;
    }

    @Override // o.InterfaceC5283bvo
    public List<String> getLanguagesList() {
        if (this.summary == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Language language : this.summary.languages) {
            arrayList.add(language.code);
        }
        return arrayList;
    }

    @Override // o.InterfaceC5283bvo
    public String[] getLanguages() {
        Summary summary = this.summary;
        if (summary == null) {
            return null;
        }
        String[] strArr = new String[summary.languages.size()];
        int i = 0;
        for (Language language : this.summary.languages) {
            strArr[i] = language.code;
            i++;
        }
        return strArr;
    }

    @Override // o.InterfaceC5283bvo
    public String getLanguagesInCsv() {
        if (this.summary == null) {
            return null;
        }
        return TextUtils.join(",", getLanguagesList());
    }

    @Override // o.InterfaceC5283bvo
    public List<String> getSecondaryLanguages() {
        if (this.summary == null) {
            return Collections.emptyList();
        }
        return new ArrayList(this.summary.secondaryLanguages);
    }

    private String getSecondaryLanguagesInCsv() {
        Summary summary = this.summary;
        if (summary == null) {
            return null;
        }
        return TextUtils.join(",", summary.secondaryLanguages);
    }

    @Override // o.InterfaceC5283bvo
    public boolean isProfileLocked() {
        Summary summary = this.summary;
        return summary != null && summary.isProfileLocked;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isProfileCreationLocked() {
        Summary summary = this.summary;
        return summary != null && summary.isProfileCreationLocked;
    }

    @Override // o.InterfaceC5283bvo
    public String getProfileLockPin() {
        Summary summary = this.summary;
        if (summary == null) {
            return null;
        }
        return summary.profileLockPin;
    }

    @Override // o.InterfaceC5283bvo
    public boolean disableVideoMerchAutoPlay() {
        Summary summary = this.summary;
        return summary != null && summary.disableVideoMerchAutoPlay;
    }

    @Override // o.InterfaceC5283bvo
    public boolean hasTitleRestrictions() {
        Summary summary = this.summary;
        return summary != null && summary.hasTitleRestrictions;
    }

    @Override // o.InterfaceC5283bvo
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FIELD_PROFILE_GUID, getProfileGuid());
            jSONObject.put("profileName", getProfileName());
            jSONObject.put("email", getProfileEmail());
            jSONObject.put(FIELD_IS_PRIMARY, isPrimaryProfile());
            jSONObject.put(FIELD_IS_DEFAULT_KIDS_PROFILE, isDefaultKidsProfile());
            jSONObject.put(FIELD_AUTOPLAY_ON, isAutoPlayEnabled());
            jSONObject.put(FIELD_EXPERIENCE, getExperienceType());
            jSONObject.put(FIELD_AVATAR_URL, getAvatarUrl());
            jSONObject.put(FIELD_AVATAR_KEY, getAvatarKey());
            jSONObject.put(FIELD_LANGUAGES, getLanguagesInCsv());
            jSONObject.put("secondaryLanguages", getSecondaryLanguagesInCsv());
            jSONObject.put(FIELD_IS_PROFILE_LOCKED, isProfileLocked());
            jSONObject.put(FIELD_PROFILE_LOCK_PIN, getProfileLockPin());
            jSONObject.put(FIELD_IS_PROFILE_CREATION_LOCKED, isProfileCreationLocked());
            jSONObject.put(FIELD_DISABLE_VIDEO_MERCH_AUTOPLAY, disableVideoMerchAutoPlay());
            jSONObject.put(FIELD_HAS_TITLE_RESTRICTIONS, hasTitleRestrictions());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FIELD_MATURITY_LEVEL, getMaturityValue());
            if (getMaturityLabels() != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : getMaturityLabels()) {
                    jSONArray.put(str);
                }
                jSONObject2.put(FIELD_MATURITY_LABEL, jSONArray);
            }
            jSONObject2.put(FIELD_MATURITY_LOWEST, isMaturityLowest());
            jSONObject2.put(FIELD_MATURITY_HIGHEST, isMaturityHighest());
            jSONObject.put(FIELD_MATURITY_OBJECT, jSONObject2);
            InterfaceC5284bvp interfaceC5284bvp = this.subtitlePreference;
            if (interfaceC5284bvp != null) {
                jSONObject.put(SubtitlePreference.FIELD_SUBTITLE_OVERRIDE, interfaceC5284bvp.toString());
            }
        } catch (JSONException e) {
            C1044Mm.e(TAG, "failed in json string " + e);
        }
        C1044Mm.e(TAG, "user string=" + jSONObject);
        return jSONObject;
    }

    @Override // o.InterfaceC5283bvo
    public String toLoggingString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FIELD_PROFILE_GUID, getProfileGuid());
            jSONObject.put("profileName", getProfileName());
            jSONObject.put(FIELD_IS_PRIMARY, isPrimaryProfile());
            jSONObject.put(FIELD_IS_DEFAULT_KIDS_PROFILE, isDefaultKidsProfile());
            jSONObject.put(FIELD_AUTOPLAY_ON, isAutoPlayEnabled());
            jSONObject.put(FIELD_EXPERIENCE, getExperienceType());
            jSONObject.put(FIELD_AVATAR_URL, getAvatarUrl() == null ? "null" : "exists");
            jSONObject.put(FIELD_AVATAR_KEY, getAvatarKey());
            jSONObject.put(FIELD_LANGUAGES, getLanguagesInCsv());
            jSONObject.put("secondaryLanguages", getSecondaryLanguagesInCsv());
            jSONObject.put(FIELD_DISABLE_VIDEO_MERCH_AUTOPLAY, disableVideoMerchAutoPlay());
            jSONObject.put(FIELD_HAS_TITLE_RESTRICTIONS, hasTitleRestrictions());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FIELD_MATURITY_LEVEL, getMaturityValue());
            if (getMaturityLabels() != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : getMaturityLabels()) {
                    jSONArray.put(str);
                }
                jSONObject2.put(FIELD_MATURITY_LABEL, jSONArray);
            }
            jSONObject2.put(FIELD_MATURITY_LOWEST, isMaturityLowest());
            jSONObject2.put(FIELD_MATURITY_HIGHEST, isMaturityHighest());
            jSONObject.put(FIELD_MATURITY_OBJECT, jSONObject2);
        } catch (JSONException e) {
            C1044Mm.e(TAG, "failed in json string " + e);
        }
        return "Falcor:" + jSONObject;
    }

    public String toString() {
        if (this.summary == null) {
            return "UserProfile summary=null";
        }
        return "UserProfile [guid=" + this.summary.profileGuid + ", name=" + sanitizeString(this.summary.profileName) + ", isKids=" + isKidsProfile() + ", isPrimary=" + this.summary.isPrimaryProfile + ", isAutoPlayEnabled=" + this.summary.isAutoPlayEnabled + ", disableVideoMerchAutoPlay=" + this.summary.disableVideoMerchAutoPlay;
    }

    private String sanitizeString(String str) {
        int length = str.length();
        if (length == 0) {
            return str;
        }
        if (length < 5) {
            return str.charAt(0) + "***" + str.charAt(length - 1);
        }
        return str.substring(0, 2) + "***" + str.substring(length - 2);
    }

    public UserProfile(String str) {
        Summary summary = new Summary();
        this.summary = summary;
        summary.languages = new ArrayList();
        this.summary.secondaryLanguages = new ArrayList();
        this.summary.maturity = new Maturity();
        this.operation = new Operation();
        try {
            JSONObject jSONObject = C8168dfL.g(str) ? new JSONObject() : new JSONObject(str);
            SubtitlePreference subtitlePreference = null;
            this.summary.profileGuid = C8123deT.a(jSONObject, FIELD_PROFILE_GUID, (String) null);
            this.summary.profileName = C8123deT.a(jSONObject, "profileName", (String) null);
            this.summary.profileEmail = C8123deT.a(jSONObject, "email", (String) null);
            this.summary.isPrimaryProfile = C8123deT.a(jSONObject, FIELD_IS_PRIMARY, false);
            this.summary.isDefaultKidsProfile = C8123deT.a(jSONObject, FIELD_IS_DEFAULT_KIDS_PROFILE, false);
            this.summary.isAutoPlayEnabled = C8123deT.a(jSONObject, FIELD_AUTOPLAY_ON, false);
            this.summary.disableVideoMerchAutoPlay = C8123deT.a(jSONObject, FIELD_DISABLE_VIDEO_MERCH_AUTOPLAY, false);
            this.summary.experienceType = C8123deT.a(jSONObject, FIELD_EXPERIENCE, (String) null);
            this.summary.avatarUrl = C8123deT.a(jSONObject, FIELD_AVATAR_URL, (String) null);
            this.summary.avatarKey = C8123deT.a(jSONObject, FIELD_AVATAR_KEY, (String) null);
            this.summary.isProfileLocked = C8123deT.a(jSONObject, FIELD_IS_PROFILE_LOCKED, false);
            this.summary.profileLockPin = C8123deT.a(jSONObject, FIELD_PROFILE_LOCK_PIN, (String) null);
            this.summary.isProfileCreationLocked = C8123deT.a(jSONObject, FIELD_IS_PROFILE_CREATION_LOCKED, false);
            this.summary.hasTitleRestrictions = C8123deT.a(jSONObject, FIELD_HAS_TITLE_RESTRICTIONS, false);
            JSONObject a = C8123deT.a(jSONObject, FIELD_MATURITY_OBJECT, (JSONObject) null);
            if (a != null) {
                this.summary.maturity.level = C8123deT.a(a, FIELD_MATURITY_LEVEL, -1);
                JSONArray c = C8123deT.c(a, FIELD_MATURITY_LABEL);
                if (c != null) {
                    for (int i = 0; i < c.length(); i++) {
                        this.summary.maturity.labels.add(c.getString(i));
                    }
                }
                this.summary.maturity.isLowest = C8123deT.a(a, FIELD_MATURITY_LOWEST, false);
                this.summary.maturity.isHighest = C8123deT.a(a, FIELD_MATURITY_HIGHEST, false);
            }
            String a2 = C8123deT.a(jSONObject, FIELD_LANGUAGES, (String) null);
            if (str != null && a2 != null && a2.length() > 20) {
                addBadLanguagesBreadcrumb(str);
            }
            if (C8168dfL.h(a2)) {
                for (String str2 : TextUtils.split(a2, ",")) {
                    this.summary.languages.add(new Language(str2));
                }
            }
            String a3 = C8123deT.a(jSONObject, "secondaryLanguages", (String) null);
            if (C8168dfL.h(a3)) {
                this.summary.secondaryLanguages.addAll(Arrays.asList(TextUtils.split(a3, ",")));
            }
            String a4 = C8123deT.a(jSONObject, SubtitlePreference.FIELD_SUBTITLE_OVERRIDE, (String) null);
            if (!C8168dfL.g(a4)) {
                subtitlePreference = new SubtitlePreference(a4);
            }
            this.subtitlePreference = subtitlePreference;
        } catch (JSONException e) {
            C1044Mm.e(TAG, "failed to create json string=" + str + " exception =" + e);
        }
    }

    private void addBadLanguagesBreadcrumb(String str) {
        InterfaceC1593aHa.b("SPY-38167 Falcor Languages.length > 20");
        InterfaceC1593aHa.b(UserProfile$$ExternalSyntheticBackport0.m(",", (List) Arrays.stream(str.split(",")).filter(new Predicate() { // from class: com.netflix.mediaclient.service.webclient.model.leafs.UserProfile$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$addBadLanguagesBreadcrumb$0;
                lambda$addBadLanguagesBreadcrumb$0 = UserProfile.lambda$addBadLanguagesBreadcrumb$0((String) obj);
                return lambda$addBadLanguagesBreadcrumb$0;
            }
        }).collect(Collectors.toList())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addBadLanguagesBreadcrumb$0(String str) {
        return (str.startsWith("\"profileName") || str.startsWith("\"email")) ? false : true;
    }

    public UserProfile() {
    }
}
