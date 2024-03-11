package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class LanguageData {
    public static final int $stable = 0;
    private final String id;
    private final String name;
    private final boolean preferredLang;

    public static /* synthetic */ LanguageData copy$default(LanguageData languageData, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = languageData.id;
        }
        if ((i & 2) != 0) {
            str2 = languageData.name;
        }
        if ((i & 4) != 0) {
            z = languageData.preferredLang;
        }
        return languageData.copy(str, str2, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.preferredLang;
    }

    public final LanguageData copy(String str, String str2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return new LanguageData(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguageData) {
            LanguageData languageData = (LanguageData) obj;
            return C8632dsu.c((Object) this.id, (Object) languageData.id) && C8632dsu.c((Object) this.name, (Object) languageData.name) && this.preferredLang == languageData.preferredLang;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPreferredLang() {
        return this.preferredLang;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.preferredLang);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        boolean z = this.preferredLang;
        return "LanguageData(id=" + str + ", name=" + str2 + ", preferredLang=" + z + ")";
    }

    public LanguageData(String str, String str2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.id = str;
        this.name = str2;
        this.preferredLang = z;
    }

    public /* synthetic */ LanguageData(String str, String str2, boolean z, int i, C8627dsp c8627dsp) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
