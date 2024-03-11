package o;

/* renamed from: o.aeQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2339aeQ implements InterfaceC9037hy {
    private final int a;
    private final String b;
    private final Boolean e;

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final Boolean d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2339aeQ) {
            C2339aeQ c2339aeQ = (C2339aeQ) obj;
            return C8632dsu.c((Object) this.b, (Object) c2339aeQ.b) && this.a == c2339aeQ.a && C8632dsu.c(this.e, c2339aeQ.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = Integer.hashCode(this.a);
        Boolean bool = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.b;
        int i = this.a;
        Boolean bool = this.e;
        return "GameInQueue(__typename=" + str + ", gameId=" + i + ", isInPlaylist=" + bool + ")";
    }

    public C2339aeQ(String str, int i, Boolean bool) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = i;
        this.e = bool;
    }
}
