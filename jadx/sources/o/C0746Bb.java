package o;

/* renamed from: o.Bb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0746Bb implements InterfaceC9037hy {
    private final String b;
    private final String c;

    public final String b() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0746Bb) {
            C0746Bb c0746Bb = (C0746Bb) obj;
            return C8632dsu.c((Object) this.b, (Object) c0746Bb.b) && C8632dsu.c((Object) this.c, (Object) c0746Bb.c);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        return "DesignIconFragment(__typename=" + str + ", token=" + str2 + ")";
    }

    public C0746Bb(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.c = str2;
    }
}
