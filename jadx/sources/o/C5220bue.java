package o;

import com.netflix.model.leafs.SearchSectionSummary;
import com.netflix.model.leafs.UpNextFeedSection;
import java.util.List;

/* renamed from: o.bue  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5220bue {
    private final boolean a;
    private final List<UpNextFeedSection> c;
    private final SearchSectionSummary d;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5220bue e(C5220bue c5220bue, SearchSectionSummary searchSectionSummary, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            searchSectionSummary = c5220bue.d;
        }
        if ((i & 2) != 0) {
            list = c5220bue.c;
        }
        if ((i & 4) != 0) {
            z = c5220bue.a;
        }
        return c5220bue.b(searchSectionSummary, list, z);
    }

    public final List<UpNextFeedSection> a() {
        return this.c;
    }

    public final SearchSectionSummary b() {
        return this.d;
    }

    public final C5220bue b(SearchSectionSummary searchSectionSummary, List<? extends UpNextFeedSection> list, boolean z) {
        C8632dsu.c((Object) searchSectionSummary, "");
        C8632dsu.c((Object) list, "");
        return new C5220bue(searchSectionSummary, list, z);
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5220bue) {
            C5220bue c5220bue = (C5220bue) obj;
            return C8632dsu.c(this.d, c5220bue.d) && C8632dsu.c(this.c, c5220bue.c) && this.a == c5220bue.a;
        }
        return false;
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.a);
    }

    public String toString() {
        SearchSectionSummary searchSectionSummary = this.d;
        List<UpNextFeedSection> list = this.c;
        boolean z = this.a;
        return "UpNextFeedResponse(summary=" + searchSectionSummary + ", sections=" + list + ", isNewSession=" + z + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5220bue(SearchSectionSummary searchSectionSummary, List<? extends UpNextFeedSection> list, boolean z) {
        C8632dsu.c((Object) searchSectionSummary, "");
        C8632dsu.c((Object) list, "");
        this.d = searchSectionSummary;
        this.c = list;
        this.a = z;
    }

    public /* synthetic */ C5220bue(SearchSectionSummary searchSectionSummary, List list, boolean z, int i, C8627dsp c8627dsp) {
        this(searchSectionSummary, list, (i & 4) != 0 ? false : z);
    }
}
