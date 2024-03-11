package o;

/* renamed from: o.agi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2472agi implements InterfaceC9037hy {
    private final C2454agQ a;
    private final String d;

    public final String b() {
        return this.d;
    }

    public final C2454agQ d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2472agi) {
            C2472agi c2472agi = (C2472agi) obj;
            return C8632dsu.c((Object) this.d, (Object) c2472agi.d) && C8632dsu.c(this.a, c2472agi.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.d;
        C2454agQ c2454agQ = this.a;
        return "LolomoGamesFeatureEducationBillboardRow(__typename=" + str + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2472agi(String str, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.d = str;
        this.a = c2454agQ;
    }
}
