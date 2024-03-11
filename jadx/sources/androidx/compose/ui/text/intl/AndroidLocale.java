package androidx.compose.ui.text.intl;

/* loaded from: classes.dex */
public final class AndroidLocale implements PlatformLocale {
    private final java.util.Locale javaLocale;

    public final java.util.Locale getJavaLocale() {
        return this.javaLocale;
    }

    public AndroidLocale(java.util.Locale locale) {
        this.javaLocale = locale;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    public String toLanguageTag() {
        return this.javaLocale.toLanguageTag();
    }
}
