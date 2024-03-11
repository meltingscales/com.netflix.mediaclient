package com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText;

import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import o.C8168dfL;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class ProfileEntryEditTextCheckboxViewModel {
    public static final int $stable = 8;
    private boolean isDuplicate;
    private final BooleanField isKidsProfile;
    private final StringField profileName;
    private boolean showValidationState;
    private final StringProvider stringProvider;

    public final StringField getProfileName() {
        return this.profileName;
    }

    public final boolean getShowValidationState() {
        return this.showValidationState;
    }

    public final boolean isDuplicate() {
        return this.isDuplicate;
    }

    public final BooleanField isKidsProfile() {
        return this.isKidsProfile;
    }

    public final void setDuplicate(boolean z) {
        this.isDuplicate = z;
    }

    public final void setShowValidationState(boolean z) {
        this.showValidationState = z;
    }

    public final boolean showKidsCheckbox() {
        return this.isKidsProfile != null;
    }

    public ProfileEntryEditTextCheckboxViewModel(StringField stringField, BooleanField booleanField, StringProvider stringProvider) {
        C8632dsu.c((Object) stringField, "");
        C8632dsu.c((Object) stringProvider, "");
        this.profileName = stringField;
        this.isKidsProfile = booleanField;
        this.stringProvider = stringProvider;
    }

    public final boolean isValid() {
        return this.profileName.isValid();
    }

    public final void updateIsKidsProfile(boolean z) {
        BooleanField booleanField = this.isKidsProfile;
        if (booleanField == null) {
            return;
        }
        booleanField.setValue(Boolean.valueOf(z));
    }

    public final Integer getInputFieldCharacterLimit() {
        return Integer.valueOf(this.profileName.getMaxLength());
    }

    public final String getProfileNameValue() {
        Object value = this.profileName.getValue();
        if (value instanceof String) {
            return (String) value;
        }
        return null;
    }

    public final void setProfileNameValue(String str) {
        C8632dsu.c((Object) str, "");
        this.profileName.setValue(str);
    }

    public final String getError() {
        if (this.isDuplicate) {
            return this.stringProvider.getString(R.string.add_profiles_duplicate_name_error);
        }
        if (this.profileName.isRequired()) {
            Object value = this.profileName.getValue();
            if (C8168dfL.g(value instanceof String ? (String) value : null) && C8632dsu.c((Object) this.profileName.getId(), (Object) SignupConstants.Field.PROFILE_OWNER_NAME)) {
                return this.stringProvider.getString(R.string.error_profile_must_not_be_deleted);
            }
        }
        return null;
    }
}
