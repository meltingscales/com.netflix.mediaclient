package o;

import android.view.View;

/* renamed from: o.zl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9957zl {
    c d(View view);

    void d();

    void setLogoClickListener(drM<? super View, dpR> drm);

    void setLogoPaddingForGlobalNav();

    void setMainCaratClickListener(drM<? super View, dpR> drm);

    void setSelectedPrimaryGenre(String str);

    void setSubCategoryClickListener(drM<? super View, dpR> drm);

    void setSubCategoryLabel(String str, String str2);

    void setSubCategoryVisibility(int i);

    void setupHolder(int i, String str, String str2, boolean z, drM<? super View, dpR> drm);

    void setupSubGenreHolder(String str, String str2, String str3, drM<? super View, dpR> drm);

    /* renamed from: o.zl$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final boolean b;
        private final String c;
        private final String d;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final boolean d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c((Object) this.d, (Object) cVar.d) && this.b == cVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            boolean z = this.b;
            return "TagHolder(genreId=" + str + ", genreLabel=" + str2 + ", hasSubCategory=" + z + ")";
        }

        public c(String str, String str2, boolean z) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.d = str2;
            this.b = z;
        }
    }
}
