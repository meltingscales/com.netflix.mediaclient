package androidx.compose.ui.text.intl;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class Locale {
    public static final Companion Companion = new Companion(null);
    private final PlatformLocale platformLocale;

    public final PlatformLocale getPlatformLocale$ui_text_release() {
        return this.platformLocale;
    }

    public Locale(PlatformLocale platformLocale) {
        this.platformLocale = platformLocale;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public Locale(String str) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(str));
    }

    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Locale)) {
            if (this == obj) {
                return true;
            }
            return C8632dsu.c((Object) toLanguageTag(), (Object) ((Locale) obj).toLanguageTag());
        }
        return false;
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    public String toString() {
        return toLanguageTag();
    }
}
