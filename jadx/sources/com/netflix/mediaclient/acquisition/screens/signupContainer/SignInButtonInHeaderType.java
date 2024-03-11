package com.netflix.mediaclient.acquisition.screens.signupContainer;

import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SignInButtonInHeaderType {
    private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
    private static final /* synthetic */ SignInButtonInHeaderType[] $VALUES;
    public static final SignInButtonInHeaderType SIGN_IN = new SignInButtonInHeaderType("SIGN_IN", 0);
    public static final SignInButtonInHeaderType SIGN_OUT = new SignInButtonInHeaderType(UmaCta.ACTION_SIGN_OUT, 1);
    public static final SignInButtonInHeaderType NO_BUTTON = new SignInButtonInHeaderType("NO_BUTTON", 2);

    private static final /* synthetic */ SignInButtonInHeaderType[] $values() {
        return new SignInButtonInHeaderType[]{SIGN_IN, SIGN_OUT, NO_BUTTON};
    }

    public static InterfaceC8598drn<SignInButtonInHeaderType> getEntries() {
        return $ENTRIES;
    }

    public static SignInButtonInHeaderType valueOf(String str) {
        return (SignInButtonInHeaderType) Enum.valueOf(SignInButtonInHeaderType.class, str);
    }

    public static SignInButtonInHeaderType[] values() {
        return (SignInButtonInHeaderType[]) $VALUES.clone();
    }

    private SignInButtonInHeaderType(String str, int i) {
    }

    static {
        SignInButtonInHeaderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C8600drp.e($values);
    }
}
