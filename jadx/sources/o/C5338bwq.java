package o;

/* renamed from: o.bwq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5338bwq {
    private final String a;
    private final boolean c;
    private final String d;

    public final boolean c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5338bwq) {
            C5338bwq c5338bwq = (C5338bwq) obj;
            return C8632dsu.c((Object) this.a, (Object) c5338bwq.a) && C8632dsu.c((Object) this.d, (Object) c5338bwq.d) && this.c == c5338bwq.c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.d;
        boolean z = this.c;
        return "RdidCtaConsentStateEntity(consentId=" + str + ", displayedAt=" + str2 + ", isDenied=" + z + ")";
    }

    public C5338bwq(String str, String str2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.d = str2;
        this.c = z;
    }
}
