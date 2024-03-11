package o;

/* renamed from: o.agn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2477agn implements InterfaceC9037hy {
    private final String b;
    private final C2454agQ e;

    public final C2454agQ b() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2477agn) {
            C2477agn c2477agn = (C2477agn) obj;
            return C8632dsu.c((Object) this.b, (Object) c2477agn.b) && C8632dsu.c(this.e, c2477agn.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.b;
        C2454agQ c2454agQ = this.e;
        return "LolomoGamesIdentityRow(__typename=" + str + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2477agn(String str, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.b = str;
        this.e = c2454agQ;
    }
}
