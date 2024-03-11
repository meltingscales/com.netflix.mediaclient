package o;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.cl.model.context.UiLocale;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Localization;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.C4984bqG;
import o.C8313dhy;
import o.C8572dqo;
import o.C8632dsu;
import o.C8657dts;
import o.dqD;

/* renamed from: o.bqG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4984bqG extends C1045Mp {
    private static final C8313dhy a;
    public static final C4984bqG b;
    private static final C8313dhy c;
    private static C8313dhy d;
    private static C8313dhy e;
    private static final InterfaceC8554dpx f;
    private static String i;
    private static final List<C8313dhy> j;

    public final String d() {
        return i;
    }

    private C4984bqG() {
        super("nf_loc");
    }

    static {
        List<C8313dhy> f2;
        String d2;
        InterfaceC8554dpx b2;
        String d3;
        C4984bqG c4984bqG = new C4984bqG();
        b = c4984bqG;
        Locale locale = Locale.ENGLISH;
        C8313dhy c8313dhy = new C8313dhy(locale.getLanguage());
        a = c8313dhy;
        C8313dhy c8313dhy2 = new C8313dhy("ar", "MA", "Arabic-Hindu");
        c = c8313dhy2;
        Locale locale2 = Locale.US;
        C8313dhy c8313dhy3 = new C8313dhy(locale2.getLanguage(), locale2.getCountry(), "English-US");
        Locale locale3 = Locale.UK;
        C8313dhy c8313dhy4 = new C8313dhy(locale3.getLanguage(), locale3.getCountry(), "English-GB");
        C8313dhy c8313dhy5 = new C8313dhy(locale.getLanguage(), "IE", "English-IE");
        C8313dhy c8313dhy6 = new C8313dhy(locale.getLanguage(), "AU", "English-AU");
        C8313dhy c8313dhy7 = new C8313dhy(locale.getLanguage(), "NZ", "English-NZ");
        C8313dhy c8313dhy8 = new C8313dhy(locale.getLanguage(), "IN", "English-IN");
        Locale locale4 = Locale.FRENCH;
        C8313dhy c8313dhy9 = new C8313dhy(locale4.getLanguage(), null, "Français");
        C8313dhy c8313dhy10 = new C8313dhy(locale4.getLanguage(), Locale.CANADA.getCountry(), "Français-CA");
        C8313dhy c8313dhy11 = new C8313dhy(SignupConstants.Language.SPANISH_ES, null, "Español");
        C8313dhy c8313dhy12 = new C8313dhy(SignupConstants.Language.SPANISH_ES, "ES", "español-ES");
        C8313dhy c8313dhy13 = new C8313dhy(SignupConstants.Language.SPANISH_ES, "AD", "español-AD");
        C8313dhy c8313dhy14 = new C8313dhy("pt", null, "Português");
        C8313dhy c8313dhy15 = new C8313dhy("pt", "PT", "Português-PT");
        C8313dhy c8313dhy16 = new C8313dhy("pt", "BR", "Português-BR");
        C8313dhy c8313dhy17 = new C8313dhy(Locale.CHINESE.getLanguage(), null, "简化字");
        Locale locale5 = Locale.SIMPLIFIED_CHINESE;
        C8313dhy c8313dhy18 = new C8313dhy(locale5.getLanguage(), locale5.getCountry(), "简化字");
        Locale locale6 = Locale.TRADITIONAL_CHINESE;
        f2 = C8569dql.f(c8313dhy, c8313dhy3, c8313dhy4, c8313dhy5, c8313dhy6, c8313dhy7, c8313dhy8, c8313dhy9, c8313dhy10, c8313dhy11, c8313dhy12, c8313dhy13, c8313dhy14, c8313dhy15, c8313dhy16, c8313dhy17, c8313dhy18, new C8313dhy(locale6.getLanguage(), locale6.getCountry(), "正體字/繁體字"), new C8313dhy(locale5.getLanguage(), "SG", "简化字"), new C8313dhy(locale6.getLanguage(), "MO", "正體字/繁體字"), new C8313dhy(locale6.getLanguage(), "HK", "正體字/繁體字"), new C8313dhy(locale5.getLanguage(), "Hans", "简化字"), new C8313dhy(locale6.getLanguage(), "Hant", "正體字/繁體字"), new C8313dhy("sv", null, "Svenskt"), new C8313dhy("nb", null, "Norske"), new C8313dhy("da", null, "Dansk"), new C8313dhy("fi", null, "Suomi"), new C8313dhy(SignupConstants.Field.REGION_NL, null, "Nederlands"), new C8313dhy(Locale.GERMAN.getLanguage(), null, "Deutsch"), new C8313dhy(Locale.JAPAN.getLanguage(), null, "日本語"), new C8313dhy(Locale.ITALY.getLanguage(), null, "italiano"), new C8313dhy("ar", null, "Arabic"), c8313dhy2, new C8313dhy(Locale.KOREAN.getLanguage(), null, "한국어/조선말"), new C8313dhy("tr", null, "Türkçe"), new C8313dhy("pl", null, "polszczyzna"), new C8313dhy("th", null, "Thai"), new C8313dhy("ro", null, "limba română"), new C8313dhy("he", null, "עברית\u200e"), new C8313dhy("el", null, "ελληνικά"), new C8313dhy(SignupConstants.Field.LANG_ID, null, "bahasa Indonesia"), new C8313dhy("cs", null, "Czech"), new C8313dhy("hu", null, "Hungarian"), new C8313dhy("vi", null, "Vietnamese"), new C8313dhy("hi", null, "हिन्दी"), new C8313dhy("ms", null, "bahasa Malaysia"), new C8313dhy("hr", null, "Hrvatski"), new C8313dhy("ru", null, "русский язык"), new C8313dhy("uk", null, "українська"), new C8313dhy("fil", null, "Filipino"));
        j = f2;
        d2 = C8576dqs.d(f2, ",", null, null, 0, null, new drM<C8313dhy, CharSequence>() { // from class: com.netflix.mediaclient.service.user.UserLocaleRepository$supportedLocales$1
            @Override // o.drM
            /* renamed from: c */
            public final CharSequence invoke(C8313dhy c8313dhy19) {
                C8632dsu.c((Object) c8313dhy19, "");
                String d4 = c8313dhy19.d();
                C8632dsu.a(d4, "");
                return d4;
            }
        }, 30, null);
        i = d2;
        b2 = dpB.b(new drO<Map<String, ? extends C8313dhy>>() { // from class: com.netflix.mediaclient.service.user.UserLocaleRepository$supportedLanguagesMap$2
            @Override // o.drO
            /* renamed from: c */
            public final Map<String, C8313dhy> invoke() {
                List list;
                int d4;
                int e2;
                int b3;
                list = C4984bqG.j;
                d4 = C8572dqo.d(list, 10);
                e2 = dqD.e(d4);
                b3 = C8657dts.b(e2, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(b3);
                for (Object obj : list) {
                    linkedHashMap.put(((C8313dhy) obj).b(), obj);
                }
                return linkedHashMap;
            }
        });
        f = b2;
        c4984bqG.c();
        d3 = C8576dqs.d(f2, ",", null, null, 0, null, new drM<C8313dhy, CharSequence>() { // from class: com.netflix.mediaclient.service.user.UserLocaleRepository$1
            @Override // o.drM
            /* renamed from: d */
            public final CharSequence invoke(C8313dhy c8313dhy19) {
                C8632dsu.c((Object) c8313dhy19, "");
                String d4 = c8313dhy19.d();
                C8632dsu.a(d4, "");
                return d4;
            }
        }, 30, null);
        i = d3;
        c4984bqG.getLogTag();
    }

    private final Map<String, C8313dhy> i() {
        return (Map) f.getValue();
    }

    public final void c() {
        Config_FastProperty_Localization.d dVar = Config_FastProperty_Localization.Companion;
        if (dVar.a()) {
            getLogTag();
            if (dVar.d().size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : dVar.d()) {
                    try {
                        C8313dhy c8313dhy = new C8313dhy(str);
                        for (C8313dhy c8313dhy2 : j) {
                            if (c8313dhy.equals(c8313dhy2)) {
                                getLogTag();
                                arrayList.add(c8313dhy2);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                getLogTag();
                j.removeAll(arrayList);
                getLogTag();
                return;
            }
            getLogTag();
            return;
        }
        getLogTag();
    }

    private final void d(Context context, C8313dhy c8313dhy) {
        e = c8313dhy;
        if (c8313dhy != null) {
            C8157dfA.a(context, "app_locale_last_used", c8313dhy.d());
            Logger.INSTANCE.addContext(new UiLocale(c8313dhy.d()));
            AbstractApplicationC1040Mh.getInstance().a(c8313dhy.c());
        } else {
            C8157dfA.e(context, "app_locale_last_used");
        }
        for (ExternalCrashReporter externalCrashReporter : ExternalCrashReporter.c.b(context)) {
            externalCrashReporter.d("app_locale", String.valueOf(c8313dhy != null ? c8313dhy.c() : null));
        }
    }

    public final void c(Context context, String[] strArr) {
        C8632dsu.c((Object) context, "");
        b(context, c(strArr));
    }

    public final C8313dhy c(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            Iterator b2 = C8621dsj.b(strArr);
            while (b2.hasNext()) {
                String str = (String) b2.next();
                if (str.length() > 0) {
                    arrayList.add(new C8313dhy(str));
                }
            }
        }
        C8313dhy c8313dhy = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C8632dsu.a(next, "");
            C8313dhy c8313dhy2 = (C8313dhy) next;
            String b3 = c8313dhy2.b();
            C8313dhy c8313dhy3 = c;
            if (C8632dsu.c((Object) b3, (Object) c8313dhy3.b())) {
                return c8313dhy3;
            }
            for (C8313dhy c8313dhy4 : j) {
                getLogTag();
                if (!C8632dsu.c(c8313dhy2, c8313dhy4)) {
                    if (c8313dhy == null && c8313dhy2.d(c8313dhy4)) {
                        getLogTag();
                        c8313dhy = c8313dhy4;
                    }
                } else {
                    getLogTag();
                    return c8313dhy4;
                }
            }
        }
        getLogTag();
        return c8313dhy;
    }

    public final void b(Context context, C8313dhy c8313dhy) {
        C8632dsu.c((Object) context, "");
        C8313dhy c8313dhy2 = e;
        if (c8313dhy2 != null && C8632dsu.c(c8313dhy2, c8313dhy)) {
            getLogTag();
            return;
        }
        getLogTag();
        d(context, c8313dhy);
    }

    public final void c(Context context) {
        synchronized (this) {
            d = null;
            C8157dfA.e(context, "app_locale_last_used");
        }
    }

    public final boolean b() {
        C8313dhy e2 = e();
        for (C8313dhy c8313dhy : j) {
            if (e2.d(c8313dhy)) {
                return false;
            }
        }
        return true;
    }

    public final C8313dhy e() {
        boolean g;
        Locale locale = Locale.getDefault();
        C8632dsu.a(locale, "");
        String language = locale.getLanguage();
        if (language != null) {
            g = C8691duz.g(language);
            if (!g) {
                return new C8313dhy(language, locale.getCountry(), locale.getDisplayLanguage());
            }
        }
        return a;
    }

    public final boolean b(String str) {
        C8632dsu.c((Object) str, "");
        return i().containsKey(str);
    }

    public final C8313dhy e(Context context) {
        C8313dhy c8313dhy = e;
        if (c8313dhy != null) {
            getLogTag();
            return c8313dhy;
        } else if (d != null) {
            getLogTag();
            C8313dhy c8313dhy2 = d;
            C8632dsu.d(c8313dhy2);
            return c8313dhy2;
        } else {
            getLogTag();
            String e2 = C8157dfA.e(context, "app_locale_last_used", (String) null);
            if (e2 != null) {
                getLogTag();
                C8313dhy c8313dhy3 = new C8313dhy(e2);
                d = c8313dhy3;
                C8632dsu.d(c8313dhy3);
                return c8313dhy3;
            }
            getLogTag();
            return e();
        }
    }
}
