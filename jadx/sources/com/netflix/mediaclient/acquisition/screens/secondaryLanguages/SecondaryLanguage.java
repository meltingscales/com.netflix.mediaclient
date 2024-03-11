package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import java.util.Locale;
import o.C8627dsp;
import o.C8632dsu;
import o.C8672dug;

/* loaded from: classes3.dex */
public final class SecondaryLanguage {
    public static final int $stable = 8;
    private final String id;
    private final String language;
    private final boolean preferredLang;
    private boolean selected;

    public static /* synthetic */ SecondaryLanguage copy$default(SecondaryLanguage secondaryLanguage, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secondaryLanguage.id;
        }
        if ((i & 2) != 0) {
            str2 = secondaryLanguage.language;
        }
        if ((i & 4) != 0) {
            z = secondaryLanguage.preferredLang;
        }
        if ((i & 8) != 0) {
            z2 = secondaryLanguage.selected;
        }
        return secondaryLanguage.copy(str, str2, z, z2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.language;
    }

    public final boolean component3() {
        return this.preferredLang;
    }

    public final boolean component4() {
        return this.selected;
    }

    public final SecondaryLanguage copy(String str, String str2, boolean z, boolean z2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return new SecondaryLanguage(str, str2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SecondaryLanguage) {
            SecondaryLanguage secondaryLanguage = (SecondaryLanguage) obj;
            return C8632dsu.c((Object) this.id, (Object) secondaryLanguage.id) && C8632dsu.c((Object) this.language, (Object) secondaryLanguage.language) && this.preferredLang == secondaryLanguage.preferredLang && this.selected == secondaryLanguage.selected;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final boolean getPreferredLang() {
        return this.preferredLang;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.language.hashCode()) * 31) + Boolean.hashCode(this.preferredLang)) * 31) + Boolean.hashCode(this.selected);
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.language;
        boolean z = this.preferredLang;
        boolean z2 = this.selected;
        return "SecondaryLanguage(id=" + str + ", language=" + str2 + ", preferredLang=" + z + ", selected=" + z2 + ")";
    }

    public SecondaryLanguage(String str, String str2, boolean z, boolean z2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.id = str;
        this.language = str2;
        this.preferredLang = z;
        this.selected = z2;
    }

    public /* synthetic */ SecondaryLanguage(String str, String str2, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final String getCapitalizedLanguage() {
        String valueOf;
        String str = this.language;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                C8632dsu.a(locale, "");
                valueOf = C8672dug.d(charAt, locale);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = str.substring(1);
            C8632dsu.a(substring, "");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }
}
