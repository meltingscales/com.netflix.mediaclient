package com.netflix.mediaclient.acquisition.screens.onRamp;

import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.components.steps.StepsViewModel;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class OnRampParsedData {
    public static final int $stable = 8;
    private final String headerSubtitleKey;
    private final ActionField nextAction;
    private final String profileName;
    private final StringField selections;
    private final StepsViewModel stepsViewModel;
    private final List<VideoParsedData> videos;

    public static /* synthetic */ OnRampParsedData copy$default(OnRampParsedData onRampParsedData, String str, ActionField actionField, StringField stringField, List list, String str2, StepsViewModel stepsViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onRampParsedData.profileName;
        }
        if ((i & 2) != 0) {
            actionField = onRampParsedData.nextAction;
        }
        ActionField actionField2 = actionField;
        if ((i & 4) != 0) {
            stringField = onRampParsedData.selections;
        }
        StringField stringField2 = stringField;
        List<VideoParsedData> list2 = list;
        if ((i & 8) != 0) {
            list2 = onRampParsedData.videos;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str2 = onRampParsedData.headerSubtitleKey;
        }
        String str3 = str2;
        if ((i & 32) != 0) {
            stepsViewModel = onRampParsedData.stepsViewModel;
        }
        return onRampParsedData.copy(str, actionField2, stringField2, list3, str3, stepsViewModel);
    }

    public final String component1() {
        return this.profileName;
    }

    public final ActionField component2() {
        return this.nextAction;
    }

    public final StringField component3() {
        return this.selections;
    }

    public final List<VideoParsedData> component4() {
        return this.videos;
    }

    public final String component5() {
        return this.headerSubtitleKey;
    }

    public final StepsViewModel component6() {
        return this.stepsViewModel;
    }

    public final OnRampParsedData copy(String str, ActionField actionField, StringField stringField, List<VideoParsedData> list, String str2, StepsViewModel stepsViewModel) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) stepsViewModel, "");
        return new OnRampParsedData(str, actionField, stringField, list, str2, stepsViewModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnRampParsedData) {
            OnRampParsedData onRampParsedData = (OnRampParsedData) obj;
            return C8632dsu.c((Object) this.profileName, (Object) onRampParsedData.profileName) && C8632dsu.c(this.nextAction, onRampParsedData.nextAction) && C8632dsu.c(this.selections, onRampParsedData.selections) && C8632dsu.c(this.videos, onRampParsedData.videos) && C8632dsu.c((Object) this.headerSubtitleKey, (Object) onRampParsedData.headerSubtitleKey) && C8632dsu.c(this.stepsViewModel, onRampParsedData.stepsViewModel);
        }
        return false;
    }

    public final String getHeaderSubtitleKey() {
        return this.headerSubtitleKey;
    }

    public final ActionField getNextAction() {
        return this.nextAction;
    }

    public final String getProfileName() {
        return this.profileName;
    }

    public final StringField getSelections() {
        return this.selections;
    }

    public final StepsViewModel getStepsViewModel() {
        return this.stepsViewModel;
    }

    public final List<VideoParsedData> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        String str = this.profileName;
        int hashCode = str == null ? 0 : str.hashCode();
        ActionField actionField = this.nextAction;
        int hashCode2 = actionField == null ? 0 : actionField.hashCode();
        StringField stringField = this.selections;
        int hashCode3 = stringField == null ? 0 : stringField.hashCode();
        int hashCode4 = this.videos.hashCode();
        String str2 = this.headerSubtitleKey;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.stepsViewModel.hashCode();
    }

    public String toString() {
        String str = this.profileName;
        ActionField actionField = this.nextAction;
        StringField stringField = this.selections;
        List<VideoParsedData> list = this.videos;
        String str2 = this.headerSubtitleKey;
        StepsViewModel stepsViewModel = this.stepsViewModel;
        return "OnRampParsedData(profileName=" + str + ", nextAction=" + actionField + ", selections=" + stringField + ", videos=" + list + ", headerSubtitleKey=" + str2 + ", stepsViewModel=" + stepsViewModel + ")";
    }

    public OnRampParsedData(String str, ActionField actionField, StringField stringField, List<VideoParsedData> list, String str2, StepsViewModel stepsViewModel) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) stepsViewModel, "");
        this.profileName = str;
        this.nextAction = actionField;
        this.selections = stringField;
        this.videos = list;
        this.headerSubtitleKey = str2;
        this.stepsViewModel = stepsViewModel;
    }
}
