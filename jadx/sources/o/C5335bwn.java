package o;

/* renamed from: o.bwn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5335bwn {
    private C5331bwj b;
    private String d;
    private long e;

    public final long a() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final C5331bwj d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5335bwn) {
            C5335bwn c5335bwn = (C5335bwn) obj;
            return C8632dsu.c(this.b, c5335bwn.b) && this.e == c5335bwn.e && C8632dsu.c((Object) this.d, (Object) c5335bwn.d);
        }
        return false;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + Long.hashCode(this.e)) * 31) + this.d.hashCode();
    }

    public String toString() {
        C5331bwj c5331bwj = this.b;
        long j = this.e;
        String str = this.d;
        return "PersistedManifest(manifestKey=" + c5331bwj + ", expires=" + j + ", manifest=" + str + ")";
    }

    public C5335bwn(C5331bwj c5331bwj, long j, String str) {
        C8632dsu.c((Object) c5331bwj, "");
        C8632dsu.c((Object) str, "");
        this.b = c5331bwj;
        this.e = j;
        this.d = str;
    }
}
