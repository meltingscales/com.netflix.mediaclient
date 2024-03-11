package com.netflix.mediaclient.ui.profiles.languages.impl;

import com.netflix.mediaclient.ui.profiles.languages.api.LanguageSelectorType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import o.AbstractC8918fl;
import o.C8313dhy;
import o.C8566dqi;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8927fu;
import o.C8974go;
import o.InterfaceC8554dpx;
import o.InterfaceC8962gc;
import o.InterfaceC8969gj;
import o.dpB;
import o.drO;
import o.duD;

/* loaded from: classes4.dex */
public final class LanguagesState implements InterfaceC8962gc {
    private final String initialLocales;
    private final InterfaceC8554dpx initialLocalesList$delegate;
    private final AbstractC8918fl<List<C8313dhy>> localesList;
    private final String profileLocale;
    private final InterfaceC8554dpx profileLocaleList$delegate;
    private final LanguageSelectorType type;
    private final List<C8313dhy> userSelections;

    private final String component2() {
        return this.profileLocale;
    }

    private final String component3() {
        return this.initialLocales;
    }

    public static /* synthetic */ LanguagesState copy$default(LanguagesState languagesState, LanguageSelectorType languageSelectorType, String str, String str2, List list, AbstractC8918fl abstractC8918fl, int i, Object obj) {
        if ((i & 1) != 0) {
            languageSelectorType = languagesState.type;
        }
        if ((i & 2) != 0) {
            str = languagesState.profileLocale;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = languagesState.initialLocales;
        }
        String str4 = str2;
        List<C8313dhy> list2 = list;
        if ((i & 8) != 0) {
            list2 = languagesState.userSelections;
        }
        List list3 = list2;
        AbstractC8918fl<List<C8313dhy>> abstractC8918fl2 = abstractC8918fl;
        if ((i & 16) != 0) {
            abstractC8918fl2 = languagesState.localesList;
        }
        return languagesState.copy(languageSelectorType, str3, str4, list3, abstractC8918fl2);
    }

    public final LanguageSelectorType component1() {
        return this.type;
    }

    public final List<C8313dhy> component4() {
        return this.userSelections;
    }

    public final AbstractC8918fl<List<C8313dhy>> component5() {
        return this.localesList;
    }

    public final LanguagesState copy(@InterfaceC8969gj LanguageSelectorType languageSelectorType, @InterfaceC8969gj String str, @InterfaceC8969gj String str2, List<C8313dhy> list, AbstractC8918fl<? extends List<C8313dhy>> abstractC8918fl) {
        C8632dsu.c((Object) languageSelectorType, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        return new LanguagesState(languageSelectorType, str, str2, list, abstractC8918fl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguagesState) {
            LanguagesState languagesState = (LanguagesState) obj;
            return this.type == languagesState.type && C8632dsu.c((Object) this.profileLocale, (Object) languagesState.profileLocale) && C8632dsu.c((Object) this.initialLocales, (Object) languagesState.initialLocales) && C8632dsu.c(this.userSelections, languagesState.userSelections) && C8632dsu.c(this.localesList, languagesState.localesList);
        }
        return false;
    }

    public final AbstractC8918fl<List<C8313dhy>> getLocalesList() {
        return this.localesList;
    }

    public final LanguageSelectorType getType() {
        return this.type;
    }

    public final List<C8313dhy> getUserSelections() {
        return this.userSelections;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode();
        int hashCode2 = this.profileLocale.hashCode();
        int hashCode3 = this.initialLocales.hashCode();
        List<C8313dhy> list = this.userSelections;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.localesList.hashCode();
    }

    public String toString() {
        LanguageSelectorType languageSelectorType = this.type;
        String str = this.profileLocale;
        String str2 = this.initialLocales;
        List<C8313dhy> list = this.userSelections;
        AbstractC8918fl<List<C8313dhy>> abstractC8918fl = this.localesList;
        return "LanguagesState(type=" + languageSelectorType + ", profileLocale=" + str + ", initialLocales=" + str2 + ", userSelections=" + list + ", localesList=" + abstractC8918fl + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LanguagesState(@InterfaceC8969gj LanguageSelectorType languageSelectorType, @InterfaceC8969gj String str, @InterfaceC8969gj String str2, List<C8313dhy> list, AbstractC8918fl<? extends List<C8313dhy>> abstractC8918fl) {
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) languageSelectorType, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        this.type = languageSelectorType;
        this.profileLocale = str;
        this.initialLocales = str2;
        this.userSelections = list;
        this.localesList = abstractC8918fl;
        b = dpB.b(new drO<List<? extends C8313dhy>>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesState$profileLocaleList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final List<C8313dhy> invoke() {
                String str3;
                List<C8313dhy> j;
                List<C8313dhy> e;
                str3 = LanguagesState.this.profileLocale;
                C8313dhy c8313dhy = new C8313dhy(str3);
                if (c8313dhy.a() == null) {
                    e = C8566dqi.e(c8313dhy);
                    return e;
                }
                j = C8569dql.j(c8313dhy, new C8313dhy(c8313dhy.b()));
                return j;
            }
        });
        this.profileLocaleList$delegate = b;
        b2 = dpB.b(new drO<List<? extends C8313dhy>>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesState$initialLocalesList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final List<C8313dhy> invoke() {
                String str3;
                List d;
                int d2;
                List g;
                List<C8313dhy> D;
                Set j;
                List<C8313dhy> U;
                List<C8313dhy> profileLocaleList = LanguagesState.this.getProfileLocaleList();
                str3 = LanguagesState.this.initialLocales;
                d = duD.d((CharSequence) str3, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj : d) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                d2 = C8572dqo.d(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(d2);
                for (String str4 : arrayList) {
                    arrayList2.add(new C8313dhy(str4));
                }
                g = C8576dqs.g((Collection) profileLocaleList, (Iterable) arrayList2);
                List<C8313dhy> c = LanguagesState.this.getLocalesList().c();
                if (c == null || c.isEmpty()) {
                    D = C8576dqs.D((Iterable) g);
                    return D;
                }
                j = C8576dqs.j((Iterable) g, (Iterable) c);
                U = C8576dqs.U(j);
                return U;
            }
        });
        this.initialLocalesList$delegate = b2;
    }

    public /* synthetic */ LanguagesState(LanguageSelectorType languageSelectorType, String str, String str2, List list, AbstractC8918fl abstractC8918fl, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? LanguageSelectorType.DISPLAY_LANGUAGE : languageSelectorType, str, str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? C8974go.e : abstractC8918fl);
    }

    public final List<C8313dhy> getProfileLocaleList() {
        return (List) this.profileLocaleList$delegate.getValue();
    }

    public final List<C8313dhy> getInitialLocalesList() {
        return (List) this.initialLocalesList$delegate.getValue();
    }

    public final boolean isLoading() {
        List<C8313dhy> c;
        AbstractC8918fl<List<C8313dhy>> abstractC8918fl = this.localesList;
        return !(abstractC8918fl instanceof C8927fu) && ((c = abstractC8918fl.c()) == null || c.isEmpty());
    }

    public final boolean isFailed() {
        return this.localesList instanceof C8927fu;
    }
}
