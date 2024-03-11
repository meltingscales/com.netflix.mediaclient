package o;

/* renamed from: o.aNr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1772aNr {
    private final String a;
    private final int c;
    private final C1255Uq d;
    private final C1777aNw e;

    public final int b() {
        return this.c;
    }

    public final C1255Uq c() {
        return this.d;
    }

    public final C1777aNw d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1772aNr) {
            C1772aNr c1772aNr = (C1772aNr) obj;
            return this.c == c1772aNr.c && C8632dsu.c(this.d, c1772aNr.d) && C8632dsu.c((Object) this.a, (Object) c1772aNr.a) && C8632dsu.c(this.e, c1772aNr.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.c);
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.a.hashCode();
        C1777aNw c1777aNw = this.e;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (c1777aNw == null ? 0 : c1777aNw.hashCode());
    }

    public String toString() {
        int i = this.c;
        C1255Uq c1255Uq = this.d;
        String str = this.a;
        C1777aNw c1777aNw = this.e;
        return "CommonMessageParams(messageId=" + i + ", target=" + c1255Uq + ", friendlyName=" + str + ", session=" + c1777aNw + ")";
    }

    public C1772aNr(int i, C1255Uq c1255Uq, String str, C1777aNw c1777aNw) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) str, "");
        this.c = i;
        this.d = c1255Uq;
        this.a = str;
        this.e = c1777aNw;
    }
}
