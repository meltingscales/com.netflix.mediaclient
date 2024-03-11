package o;

import java.util.List;

/* renamed from: o.baW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4225baW {
    private final List<String> c;
    private final List<InterfaceC4290bbi> d;

    public final List<InterfaceC4290bbi> a() {
        return this.d;
    }

    public final List<String> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4225baW) {
            C4225baW c4225baW = (C4225baW) obj;
            return C8632dsu.c(this.c, c4225baW.c) && C8632dsu.c(this.d, c4225baW.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        List<String> list = this.c;
        List<InterfaceC4290bbi> list2 = this.d;
        return "ReplaceOrRedownloadRequest(replaceList=" + list + ", reDownloadList=" + list2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4225baW(List<String> list, List<? extends InterfaceC4290bbi> list2) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        this.c = list;
        this.d = list2;
    }
}
