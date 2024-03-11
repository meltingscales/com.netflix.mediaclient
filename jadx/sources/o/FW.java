package o;

import java.util.List;

/* loaded from: classes2.dex */
public final class FW implements FD {
    private final List<C1012Lf> c;
    private final String d;
    private final AbstractC1014Lh e;

    public final AbstractC1014Lh c() {
        return this.e;
    }

    public final List<C1012Lf> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FW) {
            FW fw = (FW) obj;
            return C8632dsu.c((Object) this.d, (Object) fw.d) && C8632dsu.c(this.c, fw.c) && C8632dsu.c(this.e, fw.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.c.hashCode();
        AbstractC1014Lh abstractC1014Lh = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (abstractC1014Lh == null ? 0 : abstractC1014Lh.hashCode());
    }

    public String toString() {
        String str = this.d;
        List<C1012Lf> list = this.c;
        AbstractC1014Lh abstractC1014Lh = this.e;
        return "StaticList(key=" + str + ", items=" + list + ", type=" + abstractC1014Lh + ")";
    }

    public FW(String str, List<C1012Lf> list, AbstractC1014Lh abstractC1014Lh) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        this.d = str;
        this.c = list;
        this.e = abstractC1014Lh;
    }
}
