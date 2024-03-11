package androidx.compose.ui.text.platform.extensions;

import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.PlatformLocale;
import java.util.Locale;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class LocaleExtensions_androidKt {
    public static final Locale toJavaLocale(androidx.compose.ui.text.intl.Locale locale) {
        PlatformLocale platformLocale$ui_text_release = locale.getPlatformLocale$ui_text_release();
        C8632dsu.d(platformLocale$ui_text_release);
        return ((AndroidLocale) platformLocale$ui_text_release).getJavaLocale();
    }
}
