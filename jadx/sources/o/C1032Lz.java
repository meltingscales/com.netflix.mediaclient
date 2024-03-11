package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import java.util.Locale;
import kotlin.text.Regex;

/* renamed from: o.Lz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1032Lz {
    private static final Regex e = new Regex("([0-9]+)|([^0-9]+)");

    private static final FontFamily a(Locale locale) {
        String language = locale.getLanguage();
        return C8632dsu.c((Object) language, (Object) new Locale("th").getLanguage()) ? C1031Ly.d(FontFamily.Companion) : C8632dsu.c((Object) language, (Object) new Locale("ar").getLanguage()) ? C1031Ly.b(FontFamily.Companion) : C1031Ly.a(FontFamily.Companion);
    }

    private static final Locale c(Context context) {
        Configuration configuration;
        LocaleList locales;
        Resources resources = context.getResources();
        Locale locale = (resources == null || (configuration = resources.getConfiguration()) == null || (locales = configuration.getLocales()) == null) ? null : locales.get(0);
        if (locale == null) {
            Locale locale2 = Locale.getDefault();
            C8632dsu.a(locale2, "");
            return locale2;
        }
        return locale;
    }

    public static final AnnotatedString b(String str, Context context) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) context, "");
        FontFamily a = a(c(context));
        if (C8632dsu.c(a, C1031Ly.a(FontFamily.Companion))) {
            return new AnnotatedString(str, null, null, 6, null);
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        for (InterfaceC8678dum interfaceC8678dum : Regex.d(e, str, 0, 2, null)) {
            int pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, null, null, null, interfaceC8678dum.e().d(1) != null ? C1031Ly.a(FontFamily.Companion) : a, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null));
            try {
                builder.append(interfaceC8678dum.c());
                dpR dpr = dpR.c;
            } finally {
                builder.pop(pushStyle);
            }
        }
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString c(AnnotatedString annotatedString, Context context) {
        C8632dsu.c((Object) annotatedString, "");
        C8632dsu.c((Object) context, "");
        FontFamily a = a(c(context));
        if (C8632dsu.c(a, C1031Ly.a(FontFamily.Companion))) {
            return annotatedString;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        for (InterfaceC8678dum interfaceC8678dum : Regex.d(e, annotatedString, 0, 2, null)) {
            int pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, null, null, null, interfaceC8678dum.e().d(1) != null ? C1031Ly.a(FontFamily.Companion) : a, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null));
            try {
                builder.append(annotatedString.m2067subSequence5zctL8(TextRangeKt.TextRange(interfaceC8678dum.d().d(), interfaceC8678dum.d().e() + 1)));
                dpR dpr = dpR.c;
            } finally {
                builder.pop(pushStyle);
            }
        }
        return builder.toAnnotatedString();
    }
}
