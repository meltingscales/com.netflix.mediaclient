package com.netflix.mediaclient.acquisition.screens.maturityPin;

import com.netflix.android.moneyball.fields.ActionField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class MaturityPinParsedData {
    public static final int $stable = 8;
    private final String age;
    private final ActionField maturityPinAction;
    private final String pinRequiredRating;
    private final ActionField skipAction;

    public static /* synthetic */ MaturityPinParsedData copy$default(MaturityPinParsedData maturityPinParsedData, ActionField actionField, ActionField actionField2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            actionField = maturityPinParsedData.maturityPinAction;
        }
        if ((i & 2) != 0) {
            actionField2 = maturityPinParsedData.skipAction;
        }
        if ((i & 4) != 0) {
            str = maturityPinParsedData.age;
        }
        if ((i & 8) != 0) {
            str2 = maturityPinParsedData.pinRequiredRating;
        }
        return maturityPinParsedData.copy(actionField, actionField2, str, str2);
    }

    public final ActionField component1() {
        return this.maturityPinAction;
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

    public final MaturityPinParsedData copy(ActionField actionField, ActionField actionField2, String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return new MaturityPinParsedData(actionField, actionField2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MaturityPinParsedData) {
            MaturityPinParsedData maturityPinParsedData = (MaturityPinParsedData) obj;
            return C8632dsu.c(this.maturityPinAction, maturityPinParsedData.maturityPinAction) && C8632dsu.c(this.skipAction, maturityPinParsedData.skipAction) && C8632dsu.c((Object) this.age, (Object) maturityPinParsedData.age) && C8632dsu.c((Object) this.pinRequiredRating, (Object) maturityPinParsedData.pinRequiredRating);
        }
        return false;
    }

    public final String getAge() {
        return this.age;
    }

    public final ActionField getMaturityPinAction() {
        return this.maturityPinAction;
    }

    public final String getPinRequiredRating() {
        return this.pinRequiredRating;
    }

    public final ActionField getSkipAction() {
        return this.skipAction;
    }

    public int hashCode() {
        ActionField actionField = this.maturityPinAction;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.skipAction;
        return (((((hashCode * 31) + (actionField2 != null ? actionField2.hashCode() : 0)) * 31) + this.age.hashCode()) * 31) + this.pinRequiredRating.hashCode();
    }

    public String toString() {
        ActionField actionField = this.maturityPinAction;
        ActionField actionField2 = this.skipAction;
        String str = this.age;
        String str2 = this.pinRequiredRating;
        return "MaturityPinParsedData(maturityPinAction=" + actionField + ", skipAction=" + actionField2 + ", age=" + str + ", pinRequiredRating=" + str2 + ")";
    }

    public MaturityPinParsedData(ActionField actionField, ActionField actionField2, String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.maturityPinAction = actionField;
        this.skipAction = actionField2;
        this.age = str;
        this.pinRequiredRating = str2;
    }
}
