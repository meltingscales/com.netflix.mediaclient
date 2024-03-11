package com.netflix.mediaclient.acquisition.lib.screens;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SignupBackType {
    private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
    private static final /* synthetic */ SignupBackType[] $VALUES;
    public static final SignupBackType INTERRUPT_WITH_DIALOG = new SignupBackType("INTERRUPT_WITH_DIALOG", 0);
    public static final SignupBackType NORMAL_BACK = new SignupBackType("NORMAL_BACK", 1);
    public static final SignupBackType BACK_TO_PREVIOUS_MODE = new SignupBackType("BACK_TO_PREVIOUS_MODE", 2);

    private static final /* synthetic */ SignupBackType[] $values() {
        return new SignupBackType[]{INTERRUPT_WITH_DIALOG, NORMAL_BACK, BACK_TO_PREVIOUS_MODE};
    }

    public static InterfaceC8598drn<SignupBackType> getEntries() {
        return $ENTRIES;
    }

    public static SignupBackType valueOf(String str) {
        return (SignupBackType) Enum.valueOf(SignupBackType.class, str);
    }

    public static SignupBackType[] values() {
        return (SignupBackType[]) $VALUES.clone();
    }

    private SignupBackType(String str, int i) {
    }

    static {
        SignupBackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C8600drp.e($values);
    }
}
