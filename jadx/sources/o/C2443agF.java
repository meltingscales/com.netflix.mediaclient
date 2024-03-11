package o;

/* renamed from: o.agF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2443agF implements InterfaceC9037hy {
    private final C2454agQ a;
    private final String b;

    public final C2454agQ d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2443agF) {
            C2443agF c2443agF = (C2443agF) obj;
            return C8632dsu.c((Object) this.b, (Object) c2443agF.b) && C8632dsu.c(this.a, c2443agF.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.b;
        C2454agQ c2454agQ = this.a;
        return "LolomoMyProfilesMarkerRow(__typename=" + str + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2443agF(String str, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.b = str;
        this.a = c2454agQ;
    }
}
