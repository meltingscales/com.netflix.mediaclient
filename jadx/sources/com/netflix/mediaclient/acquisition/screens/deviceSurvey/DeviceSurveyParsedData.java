package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import com.netflix.android.moneyball.fields.ActionField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class DeviceSurveyParsedData {
    public static final int $stable = 8;
    private final ActionField nextAction;

    public static /* synthetic */ DeviceSurveyParsedData copy$default(DeviceSurveyParsedData deviceSurveyParsedData, ActionField actionField, int i, Object obj) {
        if ((i & 1) != 0) {
            actionField = deviceSurveyParsedData.nextAction;
        }
        return deviceSurveyParsedData.copy(actionField);
    }

    public final ActionField component1() {
        return this.nextAction;
    }

    public final DeviceSurveyParsedData copy(ActionField actionField) {
        return new DeviceSurveyParsedData(actionField);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceSurveyParsedData) && C8632dsu.c(this.nextAction, ((DeviceSurveyParsedData) obj).nextAction);
    }

    public final ActionField getNextAction() {
        return this.nextAction;
    }

    public int hashCode() {
        ActionField actionField = this.nextAction;
        if (actionField == null) {
            return 0;
        }
        return actionField.hashCode();
    }

    public String toString() {
        ActionField actionField = this.nextAction;
        return "DeviceSurveyParsedData(nextAction=" + actionField + ")";
    }

    public DeviceSurveyParsedData(ActionField actionField) {
        this.nextAction = actionField;
    }
}
