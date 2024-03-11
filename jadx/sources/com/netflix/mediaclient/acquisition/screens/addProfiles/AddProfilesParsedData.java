package com.netflix.mediaclient.acquisition.screens.addProfiles;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModel;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class AddProfilesParsedData {
    public static final int $stable = 8;
    private final boolean isKidsProfilesMode;
    private final ActionField nextAction;
    private final StepsViewModel stepsViewModel;

    public static /* synthetic */ AddProfilesParsedData copy$default(AddProfilesParsedData addProfilesParsedData, ActionField actionField, boolean z, StepsViewModel stepsViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            actionField = addProfilesParsedData.nextAction;
        }
        if ((i & 2) != 0) {
            z = addProfilesParsedData.isKidsProfilesMode;
        }
        if ((i & 4) != 0) {
            stepsViewModel = addProfilesParsedData.stepsViewModel;
        }
        return addProfilesParsedData.copy(actionField, z, stepsViewModel);
    }

    public final ActionField component1() {
        return this.nextAction;
    }

    public final boolean component2() {
        return this.isKidsProfilesMode;
    }

    public final StepsViewModel component3() {
        return this.stepsViewModel;
    }

    public final AddProfilesParsedData copy(ActionField actionField, boolean z, StepsViewModel stepsViewModel) {
        C8632dsu.c((Object) stepsViewModel, "");
        return new AddProfilesParsedData(actionField, z, stepsViewModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddProfilesParsedData) {
            AddProfilesParsedData addProfilesParsedData = (AddProfilesParsedData) obj;
            return C8632dsu.c(this.nextAction, addProfilesParsedData.nextAction) && this.isKidsProfilesMode == addProfilesParsedData.isKidsProfilesMode && C8632dsu.c(this.stepsViewModel, addProfilesParsedData.stepsViewModel);
        }
        return false;
    }

    public final ActionField getNextAction() {
        return this.nextAction;
    }

    public final StepsViewModel getStepsViewModel() {
        return this.stepsViewModel;
    }

    public int hashCode() {
        ActionField actionField = this.nextAction;
        return ((((actionField == null ? 0 : actionField.hashCode()) * 31) + Boolean.hashCode(this.isKidsProfilesMode)) * 31) + this.stepsViewModel.hashCode();
    }

    public final boolean isKidsProfilesMode() {
        return this.isKidsProfilesMode;
    }

    public String toString() {
        ActionField actionField = this.nextAction;
        boolean z = this.isKidsProfilesMode;
        StepsViewModel stepsViewModel = this.stepsViewModel;
        return "AddProfilesParsedData(nextAction=" + actionField + ", isKidsProfilesMode=" + z + ", stepsViewModel=" + stepsViewModel + ")";
    }

    public AddProfilesParsedData(ActionField actionField, boolean z, StepsViewModel stepsViewModel) {
        C8632dsu.c((Object) stepsViewModel, "");
        this.nextAction = actionField;
        this.isKidsProfilesMode = z;
        this.stepsViewModel = stepsViewModel;
    }
}
