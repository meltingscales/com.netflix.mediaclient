package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModel;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class SecondaryLanguageParsedData {
    public static final int $stable = 8;
    private final List<LanguageData> allLanguages;
    private final String existingLanguages;
    private final ActionField nextAction;
    private final List<LanguageData> preferredLanguages;
    private final String profileName;
    private final StringField secondaryLanguages;
    private final StepsViewModel stepsViewModel;

    public static /* synthetic */ SecondaryLanguageParsedData copy$default(SecondaryLanguageParsedData secondaryLanguageParsedData, ActionField actionField, StringField stringField, List list, String str, List list2, String str2, StepsViewModel stepsViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            actionField = secondaryLanguageParsedData.nextAction;
        }
        if ((i & 2) != 0) {
            stringField = secondaryLanguageParsedData.secondaryLanguages;
        }
        StringField stringField2 = stringField;
        List<LanguageData> list3 = list;
        if ((i & 4) != 0) {
            list3 = secondaryLanguageParsedData.preferredLanguages;
        }
        List list4 = list3;
        if ((i & 8) != 0) {
            str = secondaryLanguageParsedData.existingLanguages;
        }
        String str3 = str;
        List<LanguageData> list5 = list2;
        if ((i & 16) != 0) {
            list5 = secondaryLanguageParsedData.allLanguages;
        }
        List list6 = list5;
        if ((i & 32) != 0) {
            str2 = secondaryLanguageParsedData.profileName;
        }
        String str4 = str2;
        if ((i & 64) != 0) {
            stepsViewModel = secondaryLanguageParsedData.stepsViewModel;
        }
        return secondaryLanguageParsedData.copy(actionField, stringField2, list4, str3, list6, str4, stepsViewModel);
    }

    public final ActionField component1() {
        return this.nextAction;
    }

    public final StringField component2() {
        return this.secondaryLanguages;
    }

    public final List<LanguageData> component3() {
        return this.preferredLanguages;
    }

    public final String component4() {
        return this.existingLanguages;
    }

    public final List<LanguageData> component5() {
        return this.allLanguages;
    }

    public final String component6() {
        return this.profileName;
    }

    public final StepsViewModel component7() {
        return this.stepsViewModel;
    }

    public final SecondaryLanguageParsedData copy(ActionField actionField, StringField stringField, List<LanguageData> list, String str, List<LanguageData> list2, String str2, StepsViewModel stepsViewModel) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) stepsViewModel, "");
        return new SecondaryLanguageParsedData(actionField, stringField, list, str, list2, str2, stepsViewModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SecondaryLanguageParsedData) {
            SecondaryLanguageParsedData secondaryLanguageParsedData = (SecondaryLanguageParsedData) obj;
            return C8632dsu.c(this.nextAction, secondaryLanguageParsedData.nextAction) && C8632dsu.c(this.secondaryLanguages, secondaryLanguageParsedData.secondaryLanguages) && C8632dsu.c(this.preferredLanguages, secondaryLanguageParsedData.preferredLanguages) && C8632dsu.c((Object) this.existingLanguages, (Object) secondaryLanguageParsedData.existingLanguages) && C8632dsu.c(this.allLanguages, secondaryLanguageParsedData.allLanguages) && C8632dsu.c((Object) this.profileName, (Object) secondaryLanguageParsedData.profileName) && C8632dsu.c(this.stepsViewModel, secondaryLanguageParsedData.stepsViewModel);
        }
        return false;
    }

    public final List<LanguageData> getAllLanguages() {
        return this.allLanguages;
    }

    public final String getExistingLanguages() {
        return this.existingLanguages;
    }

    public final ActionField getNextAction() {
        return this.nextAction;
    }

    public final List<LanguageData> getPreferredLanguages() {
        return this.preferredLanguages;
    }

    public final String getProfileName() {
        return this.profileName;
    }

    public final StringField getSecondaryLanguages() {
        return this.secondaryLanguages;
    }

    public final StepsViewModel getStepsViewModel() {
        return this.stepsViewModel;
    }

    public int hashCode() {
        ActionField actionField = this.nextAction;
        int hashCode = actionField == null ? 0 : actionField.hashCode();
        StringField stringField = this.secondaryLanguages;
        int hashCode2 = stringField == null ? 0 : stringField.hashCode();
        int hashCode3 = this.preferredLanguages.hashCode();
        String str = this.existingLanguages;
        int hashCode4 = str == null ? 0 : str.hashCode();
        int hashCode5 = this.allLanguages.hashCode();
        String str2 = this.profileName;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.stepsViewModel.hashCode();
    }

    public String toString() {
        ActionField actionField = this.nextAction;
        StringField stringField = this.secondaryLanguages;
        List<LanguageData> list = this.preferredLanguages;
        String str = this.existingLanguages;
        List<LanguageData> list2 = this.allLanguages;
        String str2 = this.profileName;
        StepsViewModel stepsViewModel = this.stepsViewModel;
        return "SecondaryLanguageParsedData(nextAction=" + actionField + ", secondaryLanguages=" + stringField + ", preferredLanguages=" + list + ", existingLanguages=" + str + ", allLanguages=" + list2 + ", profileName=" + str2 + ", stepsViewModel=" + stepsViewModel + ")";
    }

    public SecondaryLanguageParsedData(ActionField actionField, StringField stringField, List<LanguageData> list, String str, List<LanguageData> list2, String str2, StepsViewModel stepsViewModel) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        C8632dsu.c((Object) stepsViewModel, "");
        this.nextAction = actionField;
        this.secondaryLanguages = stringField;
        this.preferredLanguages = list;
        this.existingLanguages = str;
        this.allLanguages = list2;
        this.profileName = str2;
        this.stepsViewModel = stepsViewModel;
    }

    public /* synthetic */ SecondaryLanguageParsedData(ActionField actionField, StringField stringField, List list, String str, List list2, String str2, StepsViewModel stepsViewModel, int i, C8627dsp c8627dsp) {
        this(actionField, stringField, list, str, list2, (i & 32) != 0 ? null : str2, stepsViewModel);
    }
}
