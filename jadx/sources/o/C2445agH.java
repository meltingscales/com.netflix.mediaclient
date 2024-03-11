package o;

/* renamed from: o.agH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2445agH implements InterfaceC9037hy {
    private final C2454agQ a;
    private final String b;

    public final String c() {
        return this.b;
    }

    public final C2454agQ e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2445agH) {
            C2445agH c2445agH = (C2445agH) obj;
            return C8632dsu.c((Object) this.b, (Object) c2445agH.b) && C8632dsu.c(this.a, c2445agH.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.b;
        C2454agQ c2454agQ = this.a;
        return "LolomoNotificationMarkerRow(__typename=" + str + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2445agH(String str, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.b = str;
        this.a = c2454agQ;
    }
}
