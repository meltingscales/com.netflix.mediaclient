package o;

import android.app.Activity;
import android.content.Intent;
import com.netflix.mediaclient.ui.search.SearchUtils;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: o.cRt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6040cRt implements InterfaceC6042cRv {
    public static final d c = new d(null);
    private final Activity a;

    /* renamed from: o.cRt$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("SearchLauncherImpl ");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final a b(String str) {
            List d;
            String e;
            boolean g;
            d = duD.d((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null);
            if (d.size() != 2) {
                return null;
            }
            try {
                int parseInt = Integer.parseInt((String) d.get(0));
                Locale locale = Locale.ROOT;
                C8632dsu.a(locale, "");
                String lowerCase = ((String) d.get(1)).toLowerCase(locale);
                C8632dsu.a(lowerCase, "");
                C8632dsu.a(locale, "");
                e = C8691duz.e(lowerCase, locale);
                g = C8691duz.g(e);
                if (g) {
                    return null;
                }
                return new a(parseInt, e);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }

    @Inject
    public C6040cRt(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.a = activity;
    }

    @Override // o.InterfaceC6042cRv
    public void b(String str, String str2) {
        SearchUtils.SearchExperience searchExperience;
        C8632dsu.c((Object) str, "");
        if (C8150deu.h()) {
            searchExperience = SearchUtils.SearchExperience.TABLET;
        } else {
            searchExperience = SearchUtils.SearchExperience.PHONE;
        }
        SearchUtils.d(searchExperience);
        a b = c.b(str);
        Intent flags = new Intent(this.a, cRR.c.c()).putExtra("EntityId", b != null ? Integer.valueOf(b.e()) : null).putExtra("SuggestionType", b != null ? b.c() : null).putExtra("query", str2).setFlags(268435456);
        C8632dsu.a(flags, "");
        this.a.startActivity(flags);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cRt$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final String c;
        private final int e;

        public final String c() {
            return this.c;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.e == aVar.e && C8632dsu.c((Object) this.c, (Object) aVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.e) * 31) + this.c.hashCode();
        }

        public String toString() {
            int i = this.e;
            String str = this.c;
            return "SearchSuggestionEntity(entityId=" + i + ", entityType=" + str + ")";
        }

        public a(int i, String str) {
            C8632dsu.c((Object) str, "");
            this.e = i;
            this.c = str;
        }
    }
}
