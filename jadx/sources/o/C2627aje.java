package o;

/* renamed from: o.aje  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2627aje implements InterfaceC9037hy {
    private final Boolean a;
    private final String c;
    private final int e;

    public final String b() {
        return this.c;
    }

    public final Boolean c() {
        return this.a;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2627aje) {
            C2627aje c2627aje = (C2627aje) obj;
            return C8632dsu.c((Object) this.c, (Object) c2627aje.c) && this.e == c2627aje.e && C8632dsu.c(this.a, c2627aje.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = Integer.hashCode(this.e);
        Boolean bool = this.a;
        return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.c;
        int i = this.e;
        Boolean bool = this.a;
        return "VideoInQueue(__typename=" + str + ", videoId=" + i + ", isInPlaylist=" + bool + ")";
    }

    public C2627aje(String str, int i, Boolean bool) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.e = i;
        this.a = bool;
    }
}
