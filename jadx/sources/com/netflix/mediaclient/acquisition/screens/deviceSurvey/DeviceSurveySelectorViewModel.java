package com.netflix.mediaclient.acquisition.screens.deviceSurvey;

import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.BooleanViewModel;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class DeviceSurveySelectorViewModel {
    public static final String DESKTOP = "desktop";
    public static final String PLAYSTATION = "playstation";
    public static final String ROKU = "roku";
    public static final String SETTOP = "settop";
    public static final String SMART_TV = "smarttv";
    public static final String STREAMING_MEDIA = "streamingmedia";
    public static final String TABLET = "tablet";
    public static final String WIIU = "wiiu";
    public static final String XBOX = "xbox";
    private final List<BooleanViewModel> deviceViewModels;
    private final StringProvider stringProvider;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DeviceSurveySelectorViewModel(StringProvider stringProvider, List<BooleanViewModel> list) {
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) list, "");
        this.stringProvider = stringProvider;
        this.deviceViewModels = list;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public final List<DeviceSurveyItem> getDeviceSurveyItems() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.deviceViewModels.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c((Object) ((BooleanViewModel) obj).getId(), (Object) SMART_TV)) {
                break;
            }
        }
        BooleanViewModel booleanViewModel = (BooleanViewModel) obj;
        if (booleanViewModel != null) {
            arrayList.add(new DeviceSurveyItem(booleanViewModel, R.id.device_survey_tv, this.stringProvider.getString(R.string.device_display_text_smart_tv), Integer.valueOf(R.drawable.device_survey_tv)));
        }
        Iterator<T> it2 = this.deviceViewModels.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (C8632dsu.c((Object) ((BooleanViewModel) obj2).getId(), (Object) TABLET)) {
                break;
            }
        }
        BooleanViewModel booleanViewModel2 = (BooleanViewModel) obj2;
        if (booleanViewModel2 != null) {
            arrayList.add(new DeviceSurveyItem(booleanViewModel2, R.id.device_survey_phone, this.stringProvider.getString(R.string.device_display_text_phone_tablet), Integer.valueOf(R.drawable.device_survey_phone)));
        }
        if (booleanViewModel2 != null) {
            booleanViewModel2.setValue(true);
        }
        Iterator<T> it3 = this.deviceViewModels.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (C8632dsu.c((Object) ((BooleanViewModel) obj3).getId(), (Object) DESKTOP)) {
                break;
            }
        }
        BooleanViewModel booleanViewModel3 = (BooleanViewModel) obj3;
        if (booleanViewModel3 != null) {
            arrayList.add(new DeviceSurveyItem(booleanViewModel3, R.id.device_survey_laptop, this.stringProvider.getString(R.string.device_display_text_desktop_laptop), Integer.valueOf(R.drawable.device_survey_laptop)));
        }
        Iterator<T> it4 = this.deviceViewModels.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            if (C8632dsu.c((Object) ((BooleanViewModel) obj4).getId(), (Object) SETTOP)) {
                break;
            }
        }
        BooleanViewModel booleanViewModel4 = (BooleanViewModel) obj4;
        if (booleanViewModel4 != null) {
            arrayList.add(new DeviceSurveyItem(booleanViewModel4, R.id.device_survey_settop, this.stringProvider.getString(R.string.device_display_text_settop_box), Integer.valueOf(R.drawable.device_survey_settop)));
        }
        Iterator<T> it5 = this.deviceViewModels.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it5.next();
            if (C8632dsu.c((Object) ((BooleanViewModel) obj5).getId(), (Object) STREAMING_MEDIA)) {
                break;
            }
        }
        BooleanViewModel booleanViewModel5 = (BooleanViewModel) obj5;
        if (booleanViewModel5 != null) {
            arrayList.add(new DeviceSurveyItem(booleanViewModel5, R.id.device_survey_streaming_player, this.stringProvider.getString(R.string.device_display_text_streaming_media), Integer.valueOf(R.drawable.device_survey_streaming_player)));
        }
        Iterator<T> it6 = this.deviceViewModels.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj6 = null;
                break;
            }
            obj6 = it6.next();
            if (C8632dsu.c((Object) ((BooleanViewModel) obj6).getId(), (Object) PLAYSTATION)) {
                break;
            }
        }
        BooleanViewModel booleanViewModel6 = (BooleanViewModel) obj6;
        if (booleanViewModel6 != null) {
            arrayList.add(new DeviceSurveyItem(booleanViewModel6, R.id.device_survey_playstation, null, Integer.valueOf(R.drawable.device_survey_playstation)));
        }
        Iterator<T> it7 = this.deviceViewModels.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj7 = null;
                break;
            }
            obj7 = it7.next();
            if (C8632dsu.c((Object) ((BooleanViewModel) obj7).getId(), (Object) XBOX)) {
                break;
            }
        }
        BooleanViewModel booleanViewModel7 = (BooleanViewModel) obj7;
        if (booleanViewModel7 != null) {
            arrayList.add(new DeviceSurveyItem(booleanViewModel7, R.id.device_survey_xbox, null, Integer.valueOf(R.drawable.device_survey_xbox)));
        }
        Iterator<T> it8 = this.deviceViewModels.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj8 = null;
                break;
            }
            obj8 = it8.next();
            if (C8632dsu.c((Object) ((BooleanViewModel) obj8).getId(), (Object) WIIU)) {
                break;
            }
        }
        BooleanViewModel booleanViewModel8 = (BooleanViewModel) obj8;
        if (booleanViewModel8 != null) {
            arrayList.add(new DeviceSurveyItem(booleanViewModel8, R.id.device_survey_wiiu, null, Integer.valueOf(R.drawable.device_survey_wiiu)));
        }
        Iterator<T> it9 = this.deviceViewModels.iterator();
        while (true) {
            if (!it9.hasNext()) {
                obj9 = null;
                break;
            }
            obj9 = it9.next();
            if (C8632dsu.c((Object) ((BooleanViewModel) obj9).getId(), (Object) ROKU)) {
                break;
            }
        }
        BooleanViewModel booleanViewModel9 = (BooleanViewModel) obj9;
        if (booleanViewModel9 != null) {
            arrayList.add(new DeviceSurveyItem(booleanViewModel9, R.id.device_survey_roku, null, Integer.valueOf(R.drawable.device_survey_roku)));
        }
        return arrayList;
    }
}
