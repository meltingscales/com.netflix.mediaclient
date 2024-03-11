package o;

import java.util.List;

/* loaded from: classes4.dex */
public final class cPA implements InterfaceC8888fH {
    private final List<C5987cPu> a;
    private final List<InterfaceC5278bvj> b;
    private final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ cPA copy$default(cPA cpa, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cpa.a;
        }
        if ((i & 2) != 0) {
            list2 = cpa.b;
        }
        if ((i & 4) != 0) {
            z = cpa.d;
        }
        return cpa.d(list, list2, z);
    }

    public final List<C5987cPu> a() {
        return this.a;
    }

    public final boolean c() {
        return this.d;
    }

    public final List<C5987cPu> component1() {
        return this.a;
    }

    public final List<InterfaceC5278bvj> component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.d;
    }

    public final List<InterfaceC5278bvj> d() {
        return this.b;
    }

    public final cPA d(List<C5987cPu> list, List<? extends InterfaceC5278bvj> list2, boolean z) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        return new cPA(list, list2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cPA) {
            cPA cpa = (cPA) obj;
            return C8632dsu.c(this.a, cpa.a) && C8632dsu.c(this.b, cpa.b) && this.d == cpa.d;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        List<C5987cPu> list = this.a;
        List<InterfaceC5278bvj> list2 = this.b;
        boolean z = this.d;
        return "BlockedTitlesState(blockedTitles=" + list + ", searchResults=" + list2 + ", blockTitlesChanged=" + z + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cPA(List<C5987cPu> list, List<? extends InterfaceC5278bvj> list2, boolean z) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) list2, "");
        this.a = list;
        this.b = list2;
        this.d = z;
    }
}
