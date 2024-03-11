package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes2.dex */
public final class ConfigurationCompat {
    public static LocaleListCompat getLocales(Configuration configuration) {
        return LocaleListCompat.wrap(Api24Impl.getLocales(configuration));
    }

    /* loaded from: classes2.dex */
    static class Api24Impl {
        static LocaleList getLocales(Configuration configuration) {
            return configuration.getLocales();
        }

        static void setLocales(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales((LocaleList) localeListCompat.unwrap());
        }
    }
}
