package com.netflix.mediaclient.acquisition.components.tou;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class TouSettingsFactory {
    public static final int $stable = 0;

    public final TouSettings createTouSettings(String str) {
        String str2;
        if (str != null) {
            str2 = str.toLowerCase();
            C8632dsu.a(str2, "");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != 3139) {
                if (hashCode != 3248) {
                    if (hashCode != 3276) {
                        if (hashCode != 3431) {
                            if (hashCode != 3518) {
                                if (hashCode == 3742 && str2.equals(SignupConstants.Field.REGION_US)) {
                                    return TouSettings.US;
                                }
                            } else if (str2.equals(SignupConstants.Field.REGION_NL)) {
                                return TouSettings.NL;
                            }
                        } else if (str2.equals(SignupConstants.Field.REGION_KR)) {
                            return TouSettings.KR;
                        }
                    } else if (str2.equals(SignupConstants.Field.REGION_FR)) {
                        return TouSettings.FR;
                    }
                } else if (str2.equals(SignupConstants.Field.REGION_EU)) {
                    return TouSettings.EU;
                }
            } else if (str2.equals(SignupConstants.Field.REGION_BE)) {
                return TouSettings.BE;
            }
        }
        return TouSettings.RoW;
    }
}
