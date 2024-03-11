package o;

/* loaded from: classes2.dex */
public final class FS {
    private final String a;
    private final String b;
    private final boolean c;

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FS) {
            FS fs = (FS) obj;
            return C8632dsu.c((Object) this.a, (Object) fs.a) && C8632dsu.c((Object) this.b, (Object) fs.b) && this.c == fs.c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        return "RdidCtaConsent(consentId=" + str + ", displayedAt=" + str2 + ", isDenied=" + z + ")";
    }

    public FS(String str, String str2, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
