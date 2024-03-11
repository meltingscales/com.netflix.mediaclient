package com.netflix.mediaclient.acquisition.screens.passwordOnly;

import com.netflix.android.moneyball.fields.ActionField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PasswordOnlyParsedData {
    public static final int $stable = 8;
    private final String firstName;
    private final String initialEmail;
    private final ActionField loginAction;
    private final boolean warnNoFreeTrial;

    public static /* synthetic */ PasswordOnlyParsedData copy$default(PasswordOnlyParsedData passwordOnlyParsedData, ActionField actionField, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            actionField = passwordOnlyParsedData.loginAction;
        }
        if ((i & 2) != 0) {
            str = passwordOnlyParsedData.initialEmail;
        }
        if ((i & 4) != 0) {
            str2 = passwordOnlyParsedData.firstName;
        }
        if ((i & 8) != 0) {
            z = passwordOnlyParsedData.warnNoFreeTrial;
        }
        return passwordOnlyParsedData.copy(actionField, str, str2, z);
    }

    public final ActionField component1() {
        return this.loginAction;
    }

    public final String component2() {
        return this.initialEmail;
    }

    public final String component3() {
        return this.firstName;
    }

    public final boolean component4() {
        return this.warnNoFreeTrial;
    }

    public final PasswordOnlyParsedData copy(ActionField actionField, String str, String str2, boolean z) {
        return new PasswordOnlyParsedData(actionField, str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PasswordOnlyParsedData) {
            PasswordOnlyParsedData passwordOnlyParsedData = (PasswordOnlyParsedData) obj;
            return C8632dsu.c(this.loginAction, passwordOnlyParsedData.loginAction) && C8632dsu.c((Object) this.initialEmail, (Object) passwordOnlyParsedData.initialEmail) && C8632dsu.c((Object) this.firstName, (Object) passwordOnlyParsedData.firstName) && this.warnNoFreeTrial == passwordOnlyParsedData.warnNoFreeTrial;
        }
        return false;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getInitialEmail() {
        return this.initialEmail;
    }

    public final ActionField getLoginAction() {
        return this.loginAction;
    }

    public final boolean getWarnNoFreeTrial() {
        return this.warnNoFreeTrial;
    }

    public int hashCode() {
        ActionField actionField = this.loginAction;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        String str = this.initialEmail;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.firstName;
        return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.warnNoFreeTrial);
    }

    public String toString() {
        ActionField actionField = this.loginAction;
        String str = this.initialEmail;
        String str2 = this.firstName;
        boolean z = this.warnNoFreeTrial;
        return "PasswordOnlyParsedData(loginAction=" + actionField + ", initialEmail=" + str + ", firstName=" + str2 + ", warnNoFreeTrial=" + z + ")";
    }

    public PasswordOnlyParsedData(ActionField actionField, String str, String str2, boolean z) {
        this.loginAction = actionField;
        this.initialEmail = str;
        this.firstName = str2;
        this.warnNoFreeTrial = z;
    }
}
