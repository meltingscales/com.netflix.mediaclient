package com.netflix.mediaclient.acquisition.components.tou;

import com.netflix.mediaclient.acquisition.R;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TouSettings {
    private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
    private static final /* synthetic */ TouSettings[] $VALUES;
    private final int defaultMessageRes;
    private final int freeTrialMessageRes;
    private final int giftOnlyMopRes;
    private final boolean showCheckbox;
    public static final TouSettings US = new TouSettings("US", 0, false, R.string.tou_us_no_trial, R.string.tou_us_freetrial, R.string.tou_us_gift);
    public static final TouSettings FR = new TouSettings("FR", 1, false, R.string.tou_fr_no_trial, R.string.tou_fr_freetrial, R.string.tou_fr_gift);
    public static final TouSettings EU = new TouSettings("EU", 2, false, R.string.tou_eu_no_trial, R.string.tou_eu_freetrial, R.string.tou_eu_gift);
    public static final TouSettings KR = new TouSettings("KR", 3, true, R.string.tou_kr_no_trial, R.string.tou_kr_freetrial, R.string.tou_kr_gift);
    public static final TouSettings BE = new TouSettings("BE", 4, false, R.string.tou_be_no_trial, R.string.tou_be_freetrial, R.string.tou_eu_gift);
    public static final TouSettings NL = new TouSettings("NL", 5, false, R.string.tou_nl_no_trial, R.string.tou_nl_freetrial, R.string.tou_eu_gift);
    public static final TouSettings RoW = new TouSettings("RoW", 6, true, R.string.tou_rest_no_trial, R.string.tou_rest_freetrial, R.string.tou_rest_gift);

    private static final /* synthetic */ TouSettings[] $values() {
        return new TouSettings[]{US, FR, EU, KR, BE, NL, RoW};
    }

    public static InterfaceC8598drn<TouSettings> getEntries() {
        return $ENTRIES;
    }

    public static TouSettings valueOf(String str) {
        return (TouSettings) Enum.valueOf(TouSettings.class, str);
    }

    public static TouSettings[] values() {
        return (TouSettings[]) $VALUES.clone();
    }

    public final int getDefaultMessageRes() {
        return this.defaultMessageRes;
    }

    public final int getFreeTrialMessageRes() {
        return this.freeTrialMessageRes;
    }

    public final int getGiftOnlyMopRes() {
        return this.giftOnlyMopRes;
    }

    public final boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    private TouSettings(String str, int i, boolean z, int i2, int i3, int i4) {
        this.showCheckbox = z;
        this.defaultMessageRes = i2;
        this.freeTrialMessageRes = i3;
        this.giftOnlyMopRes = i4;
    }

    static {
        TouSettings[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C8600drp.e($values);
    }
}
