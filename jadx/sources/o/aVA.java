package o;

import java.util.List;

/* loaded from: classes3.dex */
public final class aVA {
    private final boolean a;
    private final List<String> d;
    private final String e;

    public aVA() {
        this(null, null, false, 7, null);
    }

    public final List<String> a() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aVA) {
            aVA ava = (aVA) obj;
            return C8632dsu.c((Object) this.e, (Object) ava.e) && C8632dsu.c(this.d, ava.d) && this.a == ava.a;
        }
        return false;
    }

    public int hashCode() {
        String str = this.e;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.a);
    }

    public String toString() {
        String str = this.e;
        List<String> list = this.d;
        boolean z = this.a;
        return "DnsResolverResults(error=" + str + ", ips=" + list + ", isCname=" + z + ")";
    }

    public aVA(String str, List<String> list, boolean z) {
        C8632dsu.c((Object) list, "");
        this.e = str;
        this.d = list;
        this.a = z;
    }

    public /* synthetic */ aVA(String str, List list, boolean z, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C8569dql.i() : list, (i & 4) != 0 ? false : z);
    }
}
