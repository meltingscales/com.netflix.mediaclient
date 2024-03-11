package o;

import com.netflix.hawkins.consumer.icons.HawkinsIcon;

/* renamed from: o.Lf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1012Lf {
    private final HawkinsIcon a;
    private final AbstractC1018Ll b;
    private final AbstractC1018Ll e;

    public final AbstractC1018Ll b() {
        return this.b;
    }

    public final HawkinsIcon c() {
        return this.a;
    }

    public final AbstractC1018Ll d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1012Lf) {
            C1012Lf c1012Lf = (C1012Lf) obj;
            return C8632dsu.c(this.a, c1012Lf.a) && C8632dsu.c(this.b, c1012Lf.b) && C8632dsu.c(this.e, c1012Lf.e);
        }
        return false;
    }

    public int hashCode() {
        HawkinsIcon hawkinsIcon = this.a;
        int hashCode = hawkinsIcon == null ? 0 : hawkinsIcon.hashCode();
        int hashCode2 = this.b.hashCode();
        AbstractC1018Ll abstractC1018Ll = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (abstractC1018Ll != null ? abstractC1018Ll.hashCode() : 0);
    }

    public String toString() {
        HawkinsIcon hawkinsIcon = this.a;
        AbstractC1018Ll abstractC1018Ll = this.b;
        AbstractC1018Ll abstractC1018Ll2 = this.e;
        return "HawkinsStaticListItem(icon=" + hawkinsIcon + ", headline=" + abstractC1018Ll + ", body=" + abstractC1018Ll2 + ")";
    }

    public C1012Lf(HawkinsIcon hawkinsIcon, AbstractC1018Ll abstractC1018Ll, AbstractC1018Ll abstractC1018Ll2) {
        C8632dsu.c((Object) abstractC1018Ll, "");
        this.a = hawkinsIcon;
        this.b = abstractC1018Ll;
        this.e = abstractC1018Ll2;
    }
}
