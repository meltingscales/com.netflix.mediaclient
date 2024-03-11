package com.netflix.mediaclient.service.webclient.model.leafs;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class OneTimePasscodeLayoutTypeAb54131 {
    private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
    private static final /* synthetic */ OneTimePasscodeLayoutTypeAb54131[] $VALUES;
    public static final OneTimePasscodeLayoutTypeAb54131 NONE = new OneTimePasscodeLayoutTypeAb54131("NONE", 0);
    public static final OneTimePasscodeLayoutTypeAb54131 SHOW_OTP_HIDE_PASSWORD = new OneTimePasscodeLayoutTypeAb54131("SHOW_OTP_HIDE_PASSWORD", 1);
    public static final OneTimePasscodeLayoutTypeAb54131 SHOW_OTP_SHOW_PASSWORD = new OneTimePasscodeLayoutTypeAb54131("SHOW_OTP_SHOW_PASSWORD", 2);
    public static final OneTimePasscodeLayoutTypeAb54131 SHOW_OTP_ONLY = new OneTimePasscodeLayoutTypeAb54131("SHOW_OTP_ONLY", 3);
    public static final OneTimePasscodeLayoutTypeAb54131 SHOW_NEXT_ONLY = new OneTimePasscodeLayoutTypeAb54131("SHOW_NEXT_ONLY", 4);

    private static final /* synthetic */ OneTimePasscodeLayoutTypeAb54131[] $values() {
        return new OneTimePasscodeLayoutTypeAb54131[]{NONE, SHOW_OTP_HIDE_PASSWORD, SHOW_OTP_SHOW_PASSWORD, SHOW_OTP_ONLY, SHOW_NEXT_ONLY};
    }

    public static InterfaceC8598drn<OneTimePasscodeLayoutTypeAb54131> getEntries() {
        return $ENTRIES;
    }

    public static OneTimePasscodeLayoutTypeAb54131 valueOf(String str) {
        return (OneTimePasscodeLayoutTypeAb54131) Enum.valueOf(OneTimePasscodeLayoutTypeAb54131.class, str);
    }

    public static OneTimePasscodeLayoutTypeAb54131[] values() {
        return (OneTimePasscodeLayoutTypeAb54131[]) $VALUES.clone();
    }

    private OneTimePasscodeLayoutTypeAb54131(String str, int i) {
    }

    static {
        OneTimePasscodeLayoutTypeAb54131[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C8600drp.e($values);
    }
}
