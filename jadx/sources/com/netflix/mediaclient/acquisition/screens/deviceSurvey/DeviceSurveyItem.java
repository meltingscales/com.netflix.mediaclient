package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import com.netflix.mediaclient.acquisition.components.form2.BooleanViewModel;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class DeviceSurveyItem {
    public static final int $stable = 8;
    private final String displayText;
    private final BooleanViewModel field;
    private final int id;
    private final Integer imageRes;

    public static /* synthetic */ DeviceSurveyItem copy$default(DeviceSurveyItem deviceSurveyItem, BooleanViewModel booleanViewModel, int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            booleanViewModel = deviceSurveyItem.field;
        }
        if ((i2 & 2) != 0) {
            i = deviceSurveyItem.id;
        }
        if ((i2 & 4) != 0) {
            str = deviceSurveyItem.displayText;
        }
        if ((i2 & 8) != 0) {
            num = deviceSurveyItem.imageRes;
        }
        return deviceSurveyItem.copy(booleanViewModel, i, str, num);
    }

    public final BooleanViewModel component1() {
        return this.field;
    }

    public final int component2() {
        return this.id;
    }

    public final String component3() {
        return this.displayText;
    }

    public final Integer component4() {
        return this.imageRes;
    }

    public final DeviceSurveyItem copy(BooleanViewModel booleanViewModel, int i, String str, Integer num) {
        C8632dsu.c((Object) booleanViewModel, "");
        return new DeviceSurveyItem(booleanViewModel, i, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceSurveyItem) {
            DeviceSurveyItem deviceSurveyItem = (DeviceSurveyItem) obj;
            return C8632dsu.c(this.field, deviceSurveyItem.field) && this.id == deviceSurveyItem.id && C8632dsu.c((Object) this.displayText, (Object) deviceSurveyItem.displayText) && C8632dsu.c(this.imageRes, deviceSurveyItem.imageRes);
        }
        return false;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final BooleanViewModel getField() {
        return this.field;
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getImageRes() {
        return this.imageRes;
    }

    public int hashCode() {
        int hashCode = this.field.hashCode();
        int hashCode2 = Integer.hashCode(this.id);
        String str = this.displayText;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.imageRes;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        BooleanViewModel booleanViewModel = this.field;
        int i = this.id;
        String str = this.displayText;
        Integer num = this.imageRes;
        return "DeviceSurveyItem(field=" + booleanViewModel + ", id=" + i + ", displayText=" + str + ", imageRes=" + num + ")";
    }

    public DeviceSurveyItem(BooleanViewModel booleanViewModel, int i, String str, Integer num) {
        C8632dsu.c((Object) booleanViewModel, "");
        this.field = booleanViewModel;
        this.id = i;
        this.displayText = str;
        this.imageRes = num;
    }
}
