package com.netflix.mediaclient.acquisition.components.regenold;

import com.netflix.android.moneyball.fields.ActionField;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class RegenoldParsedData {
    public static final int $stable = 8;
    private final ActionField saveEmailAction;

    public static /* synthetic */ RegenoldParsedData copy$default(RegenoldParsedData regenoldParsedData, ActionField actionField, int i, Object obj) {
        if ((i & 1) != 0) {
            actionField = regenoldParsedData.saveEmailAction;
        }
        return regenoldParsedData.copy(actionField);
    }

    public final ActionField component1() {
        return this.saveEmailAction;
    }

    public final RegenoldParsedData copy(ActionField actionField) {
        return new RegenoldParsedData(actionField);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegenoldParsedData) && C8632dsu.c(this.saveEmailAction, ((RegenoldParsedData) obj).saveEmailAction);
    }

    public final ActionField getSaveEmailAction() {
        return this.saveEmailAction;
    }

    public int hashCode() {
        ActionField actionField = this.saveEmailAction;
        if (actionField == null) {
            return 0;
        }
        return actionField.hashCode();
    }

    public String toString() {
        ActionField actionField = this.saveEmailAction;
        return "RegenoldParsedData(saveEmailAction=" + actionField + ")";
    }

    public RegenoldParsedData(ActionField actionField) {
        this.saveEmailAction = actionField;
    }
}
