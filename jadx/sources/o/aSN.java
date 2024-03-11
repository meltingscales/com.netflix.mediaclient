package o;

import com.netflix.mediaclient.service.user.UserAgent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class aSN {
    private static Locale b;

    public static Set<Locale> a(UserAgent userAgent) {
        List<? extends InterfaceC5283bvo> b2;
        HashSet hashSet = new HashSet();
        Locale locale = b;
        if (locale != null) {
            hashSet.add(locale);
        }
        if (userAgent != null && (b2 = userAgent.b()) != null) {
            for (InterfaceC5283bvo interfaceC5283bvo : new ArrayList(b2)) {
                C8313dhy c = C4984bqG.b.c(interfaceC5283bvo.getLanguages());
                if (c != null) {
                    hashSet.add(c.c());
                }
            }
        }
        return hashSet;
    }

    public static List<Locale> c(Set<Locale> set, Set<String> set2) {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : set) {
            if (!set2.contains(locale.getLanguage())) {
                arrayList.add(locale);
            }
        }
        return arrayList;
    }

    public static void e(Locale locale) {
        b = locale;
        if (locale != null) {
            C8313dhy c = C4984bqG.b.c(new String[]{new C8313dhy(locale.getLanguage(), locale.getCountry(), locale.getDisplayLanguage()).d()});
            if (c != null) {
                b = c.c();
            }
        }
    }
}
