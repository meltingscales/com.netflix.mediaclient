package com.netflix.mediaclient.util;

import com.netflix.mediaclient.acquisition.screens.deviceSurvey.DeviceSurveySelectorViewModel;

/* loaded from: classes.dex */
public enum DeviceCategory {
    UNKNOWN("unknown"),
    PHONE("phone"),
    TABLET(DeviceSurveySelectorViewModel.TABLET),
    GOOGLE_TV("google-tv"),
    ANDROID_TV("android-tv"),
    CHROME_OS("chrome-os"),
    ANDROID_STB("android-stb"),
    SMART_DISPLAY("smart-display");
    
    private final String g;

    public String c() {
        return this.g;
    }

    DeviceCategory(String str) {
        this.g = str;
    }

    public static DeviceCategory c(String str) {
        if (str == null) {
            return null;
        }
        DeviceCategory deviceCategory = PHONE;
        if (str.equalsIgnoreCase(deviceCategory.g)) {
            return deviceCategory;
        }
        DeviceCategory deviceCategory2 = TABLET;
        if (str.equalsIgnoreCase(deviceCategory2.g)) {
            return deviceCategory2;
        }
        DeviceCategory deviceCategory3 = GOOGLE_TV;
        if (str.equalsIgnoreCase(deviceCategory3.g)) {
            return deviceCategory3;
        }
        DeviceCategory deviceCategory4 = ANDROID_TV;
        if (str.equalsIgnoreCase(deviceCategory4.g)) {
            return deviceCategory4;
        }
        DeviceCategory deviceCategory5 = CHROME_OS;
        if (str.equalsIgnoreCase(deviceCategory5.g)) {
            return deviceCategory5;
        }
        DeviceCategory deviceCategory6 = ANDROID_STB;
        if (str.equalsIgnoreCase(deviceCategory6.g)) {
            return deviceCategory6;
        }
        DeviceCategory deviceCategory7 = SMART_DISPLAY;
        return str.equalsIgnoreCase(deviceCategory7.g) ? deviceCategory7 : UNKNOWN;
    }
}
