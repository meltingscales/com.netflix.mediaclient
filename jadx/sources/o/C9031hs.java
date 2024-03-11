package o;

import java.util.List;

/* renamed from: o.hs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9031hs {
    private final List<Object> a;
    private final String c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9031hs) {
            C9031hs c9031hs = (C9031hs) obj;
            return C8632dsu.c(this.a, c9031hs.a) && C8632dsu.c((Object) this.c, (Object) c9031hs.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.c;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeferredFragmentIdentifier(path=" + this.a + ", label=" + this.c + ')';
    }

    public C9031hs(List<? extends Object> list, String str) {
        C8632dsu.c((Object) list, "");
        this.a = list;
        this.c = str;
    }
}
