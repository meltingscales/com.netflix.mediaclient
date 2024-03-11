package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.netflix.mediaclient.util.l10n.BidiMarker;
import java.util.Locale;

/* renamed from: o.dhv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8310dhv {
    public static boolean a() {
        return e(Locale.getDefault());
    }

    public static boolean e(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1;
    }

    public static String b(String str, BidiMarker bidiMarker) {
        return e(c(str, bidiMarker), bidiMarker);
    }

    public static String c(String str, BidiMarker bidiMarker) {
        if (str == null || !a()) {
            return str;
        }
        return bidiMarker.a() + str;
    }

    public static CharSequence d(CharSequence charSequence, BidiMarker bidiMarker) {
        return (charSequence == null || !a()) ? charSequence : new SpannableStringBuilder().append(bidiMarker.a()).append(charSequence);
    }

    public static String e(String str, BidiMarker bidiMarker) {
        if (str == null || !a()) {
            return str;
        }
        return str + bidiMarker.a();
    }

    public static void c(View view) {
        if (view != null && a()) {
            view.setLayoutDirection(1);
        }
    }

    public static CharSequence d(CharSequence charSequence) {
        return (charSequence == null || !a()) ? charSequence : d(charSequence, BidiMarker.FORCED_RTL);
    }

    @TargetApi(25)
    @Deprecated
    public static ContextWrapper e(Context context, Locale locale) {
        Locale.getDefault();
        Configuration configuration = context.getResources().getConfiguration();
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        return new ContextWrapper(context.createConfigurationContext(configuration));
    }

    public static Configuration a(Configuration configuration, Locale locale) {
        if (configuration.getLocales().isEmpty() && locale != null) {
            configuration.locale = locale;
        }
        return configuration;
    }

    @SuppressLint({"NewApi"})
    public static Locale c() {
        return ((Context) C1332Xp.b(Context.class)).getResources().getConfiguration().getLocales().get(0);
    }
}
