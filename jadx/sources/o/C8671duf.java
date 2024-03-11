package o;

/* renamed from: o.duf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8671duf {
    private final C8654dtp c;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final C8654dtp c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8671duf) {
            C8671duf c8671duf = (C8671duf) obj;
            return C8632dsu.c((Object) this.e, (Object) c8671duf.e) && C8632dsu.c(this.c, c8671duf.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.e + ", range=" + this.c + ')';
    }

    public C8671duf(String str, C8654dtp c8654dtp) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c8654dtp, "");
        this.e = str;
        this.c = c8654dtp;
    }
}
