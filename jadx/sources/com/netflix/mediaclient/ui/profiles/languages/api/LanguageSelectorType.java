package com.netflix.mediaclient.ui.profiles.languages.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LanguageSelectorType {
    private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
    private static final /* synthetic */ LanguageSelectorType[] $VALUES;
    public static final LanguageSelectorType DISPLAY_LANGUAGE = new LanguageSelectorType("DISPLAY_LANGUAGE", 0);
    public static final LanguageSelectorType CONTENT_LANGUAGES = new LanguageSelectorType("CONTENT_LANGUAGES", 1);

    private static final /* synthetic */ LanguageSelectorType[] $values() {
        return new LanguageSelectorType[]{DISPLAY_LANGUAGE, CONTENT_LANGUAGES};
    }

    public static InterfaceC8598drn<LanguageSelectorType> getEntries() {
        return $ENTRIES;
    }

    public static LanguageSelectorType valueOf(String str) {
        return (LanguageSelectorType) Enum.valueOf(LanguageSelectorType.class, str);
    }

    public static LanguageSelectorType[] values() {
        return (LanguageSelectorType[]) $VALUES.clone();
    }

    private LanguageSelectorType(String str, int i) {
    }

    static {
        LanguageSelectorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C8600drp.e($values);
    }
}
