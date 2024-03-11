package o;

/* renamed from: o.agC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2440agC implements InterfaceC9037hy {
    private final C2454agQ a;
    private final String b;

    public final String c() {
        return this.b;
    }

    public final C2454agQ d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2440agC) {
            C2440agC c2440agC = (C2440agC) obj;
            return C8632dsu.c((Object) this.b, (Object) c2440agC.b) && C8632dsu.c(this.a, c2440agC.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.b;
        C2454agQ c2454agQ = this.a;
        return "LolomoMyDownloadsMarkerRow(__typename=" + str + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2440agC(String str, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.b = str;
        this.a = c2454agQ;
    }
}
