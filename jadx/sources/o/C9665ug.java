package o;

import android.widget.SearchView;

/* renamed from: o.ug  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9665ug {
    private final boolean b;
    private final SearchView c;
    private final CharSequence e;

    public final boolean c() {
        return this.b;
    }

    public final SearchView d() {
        return this.c;
    }

    public final CharSequence e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9665ug) {
                C9665ug c9665ug = (C9665ug) obj;
                return C8632dsu.c(this.c, c9665ug.c) && C8632dsu.c(this.e, c9665ug.e) && this.b == c9665ug.b;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        SearchView searchView = this.c;
        int hashCode = searchView != null ? searchView.hashCode() : 0;
        CharSequence charSequence = this.e;
        int hashCode2 = charSequence != null ? charSequence.hashCode() : 0;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public String toString() {
        return "SearchViewQueryTextEvent(view=" + this.c + ", queryText=" + this.e + ", isSubmitted=" + this.b + ")";
    }

    public C9665ug(SearchView searchView, CharSequence charSequence, boolean z) {
        C8632dsu.d(searchView, "");
        C8632dsu.d(charSequence, "");
        this.c = searchView;
        this.e = charSequence;
        this.b = z;
    }
}
