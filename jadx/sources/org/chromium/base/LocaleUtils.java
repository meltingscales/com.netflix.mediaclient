package org.chromium.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.text.TextUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public class LocaleUtils {
    private LocaleUtils() {
    }

    public static String getUpdatedLanguageForChromium(String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == 3365) {
            if (str.equals("in")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 3374) {
            if (str.equals("iw")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3391) {
            if (str.equals("ji")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 3405) {
            if (hashCode == 3704 && str.equals("tl")) {
                c = 4;
            }
            c = 65535;
        } else {
            if (str.equals("jw")) {
                c = 3;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? str : "fil" : "jv" : "yi" : "he" : SignupConstants.Field.LANG_ID;
    }

    public static Locale getUpdatedLocaleForChromium(Locale locale) {
        String language = locale.getLanguage();
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(language);
        return updatedLanguageForChromium.equals(language) ? locale : new Locale.Builder().setLocale(locale).setLanguage(updatedLanguageForChromium).build();
    }

    public static String getUpdatedLanguageForAndroid(String str) {
        str.hashCode();
        return !str.equals("fil") ? !str.equals("und") ? str : "" : "tl";
    }

    public static Locale getUpdatedLocaleForAndroid(Locale locale) {
        String language = locale.getLanguage();
        String updatedLanguageForAndroid = getUpdatedLanguageForAndroid(language);
        return updatedLanguageForAndroid.equals(language) ? locale : new Locale.Builder().setLocale(locale).setLanguage(updatedLanguageForAndroid).build();
    }

    public static Locale forLanguageTagCompat(String str) {
        String[] split = str.split("-");
        if (split.length == 0) {
            return new Locale("");
        }
        String updatedLanguageForAndroid = getUpdatedLanguageForAndroid(split[0]);
        if (updatedLanguageForAndroid.length() != 2 && updatedLanguageForAndroid.length() != 3) {
            return new Locale("");
        }
        if (split.length == 1) {
            return new Locale(updatedLanguageForAndroid);
        }
        String str2 = split[1];
        if (str2.length() != 2 && str2.length() != 3) {
            return new Locale(updatedLanguageForAndroid);
        }
        return new Locale(updatedLanguageForAndroid, str2);
    }

    public static Locale forLanguageTag(String str) {
        return getUpdatedLocaleForAndroid(Locale.forLanguageTag(str));
    }

    public static String toLanguageTag(Locale locale) {
        String updatedLanguageForChromium = getUpdatedLanguageForChromium(locale.getLanguage());
        String country = locale.getCountry();
        if (updatedLanguageForChromium.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (country.isEmpty()) {
            return updatedLanguageForChromium;
        }
        return updatedLanguageForChromium + "-" + country;
    }

    public static String toLanguageTags(LocaleList localeList) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(toLanguageTag(getUpdatedLocaleForChromium(localeList.get(i))));
        }
        return TextUtils.join(",", arrayList);
    }

    public static String toBaseLanguage(String str) {
        int indexOf = str.indexOf(45);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public static boolean isBaseLanguageEqual(String str, String str2) {
        return TextUtils.equals(toBaseLanguage(str), toBaseLanguage(str2));
    }

    @CalledByNative
    public static String getDefaultLocaleString() {
        return toLanguageTag(Locale.getDefault());
    }

    @CalledByNative
    public static String getDefaultLocaleListString() {
        return toLanguageTags(LocaleList.getDefault());
    }

    @CalledByNative
    private static String getDefaultCountryCode() {
        CommandLine commandLine = CommandLine.getInstance();
        if (commandLine.hasSwitch("default-country-code")) {
            return commandLine.getSwitchValue("default-country-code");
        }
        return Locale.getDefault().getCountry();
    }

    public static String getConfigurationLanguage(Configuration configuration) {
        Locale locale = configuration.locale;
        return locale != null ? locale.toLanguageTag() : "";
    }

    public static String getContextLanguage(Context context) {
        return getConfigurationLanguage(context.getResources().getConfiguration());
    }

    public static void updateConfig(Context context, Configuration configuration, String str) {
        ApisN.setConfigLocales(context, configuration, str);
    }

    public static void setDefaultLocalesFromConfiguration(Configuration configuration) {
        ApisN.setLocaleList(configuration);
    }

    /* loaded from: classes6.dex */
    static class ApisN {
        ApisN() {
        }

        static void setConfigLocales(Context context, Configuration configuration, String str) {
            configuration.setLocales(prependToLocaleList(str, context.getResources().getConfiguration().getLocales()));
        }

        static void setLocaleList(Configuration configuration) {
            LocaleList.setDefault(configuration.getLocales());
        }

        static LocaleList prependToLocaleList(String str, LocaleList localeList) {
            return LocaleList.forLanguageTags(String.format("%1$s,%2$s", str, localeList.toLanguageTags().replaceFirst(String.format("(^|,)%1$s$|%1$s,", str), "")));
        }
    }
}
