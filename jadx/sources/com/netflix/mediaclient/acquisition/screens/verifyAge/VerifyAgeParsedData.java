package com.netflix.mediaclient.acquisition.screens.verifyAge;

import com.netflix.android.moneyball.fields.ActionField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class VerifyAgeParsedData {
    public static final int $stable = 8;
    private final String age;
    private final String pinRequiredRating;
    private final ActionField skipAction;
    private final ActionField verifyAction;

    public static /* synthetic */ VerifyAgeParsedData copy$default(VerifyAgeParsedData verifyAgeParsedData, ActionField actionField, ActionField actionField2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            actionField = verifyAgeParsedData.verifyAction;
        }
        if ((i & 2) != 0) {
            actionField2 = verifyAgeParsedData.skipAction;
        }
        if ((i & 4) != 0) {
            str = verifyAgeParsedData.age;
        }
        if ((i & 8) != 0) {
            str2 = verifyAgeParsedData.pinRequiredRating;
        }
        return verifyAgeParsedData.copy(actionField, actionField2, str, str2);
    }

    public final ActionField component1() {
        return this.verifyAction;
    }

    public final ActionField component2() {
        return this.skipAction;
    }

    public final String component3() {
        return this.age;
    }

    public final String component4() {
        return this.pinRequiredRating;
    }

    public final VerifyAgeParsedData copy(ActionField actionField, ActionField actionField2, String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return new VerifyAgeParsedData(actionField, actionField2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerifyAgeParsedData) {
            VerifyAgeParsedData verifyAgeParsedData = (VerifyAgeParsedData) obj;
            return C8632dsu.c(this.verifyAction, verifyAgeParsedData.verifyAction) && C8632dsu.c(this.skipAction, verifyAgeParsedData.skipAction) && C8632dsu.c((Object) this.age, (Object) verifyAgeParsedData.age) && C8632dsu.c((Object) this.pinRequiredRating, (Object) verifyAgeParsedData.pinRequiredRating);
        }
        return false;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getPinRequiredRating() {
        return this.pinRequiredRating;
    }

    public final ActionField getSkipAction() {
        return this.skipAction;
    }

    public final ActionField getVerifyAction() {
        return this.verifyAction;
    }

    public int hashCode() {
        ActionField actionField = this.verifyAction;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.skipAction;
        return (((((hashCode * 31) + (actionField2 != null ? actionField2.hashCode() : 0)) * 31) + this.age.hashCode()) * 31) + this.pinRequiredRating.hashCode();
    }

    public String toString() {
        ActionField actionField = this.verifyAction;
        ActionField actionField2 = this.skipAction;
        String str = this.age;
        String str2 = this.pinRequiredRating;
        return "VerifyAgeParsedData(verifyAction=" + actionField + ", skipAction=" + actionField2 + ", age=" + str + ", pinRequiredRating=" + str2 + ")";
    }

    public VerifyAgeParsedData(ActionField actionField, ActionField actionField2, String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.verifyAction = actionField;
        this.skipAction = actionField2;
        this.age = str;
        this.pinRequiredRating = str2;
    }
}
