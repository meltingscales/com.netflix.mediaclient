package androidx.compose.ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o.C8572dqo;

/* loaded from: classes.dex */
public final class LocaleListHelperMethods {
    public static final LocaleListHelperMethods INSTANCE = new LocaleListHelperMethods();

    private LocaleListHelperMethods() {
    }

    public final Object localeSpan(LocaleList localeList) {
        int d;
        d = C8572dqo.d(localeList, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void setTextLocales(AndroidTextPaint androidTextPaint, LocaleList localeList) {
        int d;
        d = C8572dqo.d(localeList, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        androidTextPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
